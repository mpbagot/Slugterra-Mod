package com.slugterra.entity.velocity;

import java.util.List;
import java.util.Random;

import com.slugterra.block.SlugterraBlocks;
import com.slugterra.entity.EntityLightBall;
import com.slugterra.entity.properties.ExtendedPlayer;
import com.slugterra.entity.protoform.EntityTazerling;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
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
		this.elementParticle = "other";
	}

	//TODO finish the remaining abilities
	@Override
	public void activateSlugAbility(boolean onGround){
		Random ability = new Random();
		int abilint = ability.nextInt(max + 1);
		if (onGround){
			//circuit burst ability
			if (abilint == 0){
				EntityPlayer p = this.worldObj.getClosestPlayerToEntity(this, 5.0f+this.power);
				if (p != null){
					ExtendedPlayer props = ExtendedPlayer.get(p);
					props.disableBlaster();
				}
			}

			//tazercoil ability
			else if (abilint == 2){
				//TODO create a sticky entity then stick it to the player.
			}

			//tazerbolt ability
			else if(abilint == 1){
				List players = worldObj.playerEntities;
				for (int a=0; a<players.size();++a){
					if(((EntityPlayerMP) players.get(a)).getDistanceToEntity(this) < 10.0f){
						((EntityPlayerMP)players.get(a)).attackEntityFrom(DamageSource.fall, 3.0f);
					}
				}
				
				//TODO trigger all redstone in 5 block radius
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
				for (int a=1; a< 24;a++){
					EntityLightningBolt bolt = new EntityLightningBolt(this.worldObj, this.posX+(10*this.motionX)+getR(a), this.posY+getR(a), this.posZ+(10*this.motionZ)+getR(a));
					worldObj.addWeatherEffect(bolt);
					EntityLightBall ball = new EntityLightBall(this.worldObj, this.posX+getR(a), this.posY+getR(a), this.posZ+getR(a), this);
					worldObj.spawnEntityInWorld(ball);
				}
			}

			//tazerwing ability
			else if (abilint == 1){
				System.out.println("Activating Tazerwing!!");
				EntityLightningBolt bolt = new EntityLightningBolt(this.worldObj, this.posX+(10*this.motionX), this.posY, this.posZ+(10*this.motionZ));
				worldObj.addWeatherEffect(bolt);
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
						this.worldObj.setBlock((int)this.posX+1, (int)this.posY+b, (int)this.posZ+(10-a), SlugterraBlocks.electricWall);
						this.worldObj.setBlock((int)this.posX+3, (int)this.posY+b, (int)this.posZ+(10-a), SlugterraBlocks.electricWall);
					}
					this.worldObj.setBlock((int)this.posX+2, (int)this.posY+b, (int)this.posZ+(10-a), SlugterraBlocks.electricWall);
				}
			}
		} else {
			for (int a=0;a<20;a++){
				for (int b=0;b<6;b++){
					if (b<3){
						this.worldObj.setBlock((int)this.posX+(10-a), (int)this.posY+b, (int)this.posZ+1, SlugterraBlocks.electricWall);
						this.worldObj.setBlock((int)this.posX+(10-a), (int)this.posY+b, (int)this.posZ+3, SlugterraBlocks.electricWall);
					}
					this.worldObj.setBlock((int)this.posX+(10-a), (int)this.posY+b, (int)this.posZ+2, SlugterraBlocks.electricWall);
				}
			}
		}
	}
	
	private void createFire(int r){
		for (int a=0; a < 2*r+1;a++){
			for (int b=0; b < 2*r+1;b++){
				if (a*a+b*b == r*r){
					this.worldObj.setBlock((int)this.posX+(r-a), (int)this.posY, (int)this.posZ+(r-b), Blocks.fire);
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
