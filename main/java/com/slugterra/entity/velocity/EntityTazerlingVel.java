package com.slugterra.entity.velocity;

import java.util.List;
import java.util.Random;

import com.slugterra.block.BlockRegistry;
import com.slugterra.capabilities.BlasterProvider;
import com.slugterra.capabilities.IBlaster;
import com.slugterra.entity.EntityLightBall;
import com.slugterra.entity.particles.ElectricElementParticle;
import com.slugterra.entity.protoform.EntityTazerling;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityTazerlingVel extends EntityVel{

	private float damage = 6.0F;
	public static int power = 2;
	public static int min = 0;
	public static int max = 4;

	public EntityTazerlingVel(World world) {
		super(world);
	}

	public EntityTazerlingVel(World world, EntityLivingBase entity, int friend, String name)
	{
		this(world, entity);
		this.name = name;
		this.friendship = friend;
	}

	public EntityTazerlingVel(World world, EntityLivingBase entity)
	{
		super(world, entity);
		if (this.name == null)
			this.protoform = new EntityTazerling(world);
		else
			this.protoform = new EntityTazerling(world, this.name);
		this.elementParticle = null;
		this.customParticle = new ElectricElementParticle(world, posX, posY, posZ, motionX, motionY, motionZ);
	}

	//TODO finish the remaining abilities
	@Override
	public void activateSlugAbility(boolean onGround){
		Random ability = new Random();
		int abilint = ability.nextInt(max + 1);
		if (onGround){
			//circuit burst ability
			if (abilint == 0){
				EntityPlayer p = this.world.getClosestPlayerToEntity(this, 5.0f+this.power);
				if (p != null){
					IBlaster props = p.getCapability(BlasterProvider.BLASTER_CAP, null);
					props.disableBlaster(12.5f);
				}
			}

			//tazercoil ability
			else if (abilint == 2){
				//TODO create a sticky entity then stick it to the player.
			}

			//tazerbolt ability
			else if(abilint == 1){
				List<EntityPlayer> players = world.playerEntities;
				for (int a=0; a<players.size();++a){
					EntityPlayerMP p = ((EntityPlayerMP)players.get(a));
					if(p.getDistanceToEntity(this) < 10.0f && p != this.shooter){
						EntityLightningBolt bolt = new EntityLightningBolt(world, p.posX, p.posY, p.posZ, true);
						world.addWeatherEffect(bolt);
						((EntityPlayerMP)players.get(a)).attackEntityFrom(DamageSource.FALL, 3.0f);
					}
				}
				
				for (int a=0;a<10;++a){
					for (int b=0;b<10;++b){
						for (int c=0;c<3;++c){
							int a2 = a-5;
							int b2 = b-5;
							int c2 = c-1;
							Block block = this.world.getBlockState(new BlockPos((int)posX+a2, (int)posY+c2, (int)posZ+b2)).getBlock();
							if (block instanceof BlockRedstoneWire){
								//TODO Power the redstone wire at maximum strength
							}
						}
					}
				}
			}

			//slugshield ability
			else if (abilint == 3){
				System.out.println("Activating Slugshield!!");
				double a = this.motionX;
				double b = this.motionZ;
				if (a>b)
					this.makeWall("x");
				else
					this.makeWall("z");
			}

		}else{
			//quetzalbolt ability
			if (abilint == 0){
				System.out.println("Activating Quetzalbolt!!");
				for (int a=1; a<24;a++){
					EntityLightningBolt bolt = new EntityLightningBolt(this.world, this.posX+(10*this.motionX)+getR(a), this.posY+getR(a), this.posZ+(10*this.motionZ)+getR(a), true);
					world.addWeatherEffect(bolt);
					EntityLightBall ball = new EntityLightBall(this.world, this.posX+getR(a), this.posY+getR(a), this.posZ+getR(a), this);
					world.spawnEntity(ball);
				}
			}

			//tazerwing ability
			else if (abilint == 1){
				System.out.println("Activating Tazerwing!!");
				EntityLightningBolt bolt = new EntityLightningBolt(this.world, this.posX+(2*this.motionX), this.posY, this.posZ+(2*this.motionZ), false);
				world.addWeatherEffect(bolt);
				this.createFire(2);
				this.killColl = false;
			}
		}
	}

	private void makeWall(String xOrY){
		if (xOrY == "x"){
			for (int a=0;a<20;a++){
				for (int b=0;b<6;b++){
					if (b<3){
						this.world.setBlockState(new BlockPos((int)this.posX+1, (int)this.posY+b, (int)this.posZ+(10-a)), BlockRegistry.electricWall.getDefaultState());
						this.world.setBlockState(new BlockPos((int)this.posX+3, (int)this.posY+b, (int)this.posZ+(10-a)), BlockRegistry.electricWall.getDefaultState());
					}
					this.world.setBlockState(new BlockPos((int)this.posX+2, (int)this.posY+b, (int)this.posZ+(10-a)), BlockRegistry.electricWall.getDefaultState());
				}
			}
		} else {
			for (int a=0;a<20;a++){
				for (int b=0;b<6;b++){
					if (b<3){
						this.world.setBlockState(new BlockPos((int)this.posX+(10-a), (int)this.posY+b, (int)this.posZ+1), BlockRegistry.electricWall.getDefaultState());
						this.world.setBlockState(new BlockPos((int)this.posX+(10-a), (int)this.posY+b, (int)this.posZ+3), BlockRegistry.electricWall.getDefaultState());
					}
					this.world.setBlockState(new BlockPos((int)this.posX+(10-a), (int)this.posY+b, (int)this.posZ+2), BlockRegistry.electricWall.getDefaultState());
				}
			}
		}
	}

	private void createFire(int r){
		for (int a=0; a < 2*r+1;a++){
			for (int b=0; b < 2*r+1;b++){
				if (a*a+b*b == r*r){
					this.world.setBlockState(new BlockPos((int)this.posX+(r-a), (int)this.posY, (int)this.posZ+(r-b)), Blocks.FIRE.getDefaultState());	
				}
			}
		}
	}

	private int getR(int a){
		boolean p = new Random().nextBoolean();
		int b = new Random().nextInt(a);
		if (!p)
			b = -b;
		return b;
	}
}
