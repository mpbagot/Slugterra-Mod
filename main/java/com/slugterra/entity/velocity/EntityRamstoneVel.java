package com.slugterra.entity.velocity;

import java.util.Random;

import com.slugterra.entity.protoform.EntityRamstone;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityRamstoneVel extends EntityVel{

	private float damage = 6.0F;
	public int power = 2;
	public int min = 0;
	public int max = 4;

	public EntityRamstoneVel(World p_i1776_1_) {
		super(p_i1776_1_);
	}

	public EntityRamstoneVel(World world, EntityLivingBase entity, int friend, String name)
	{
		this(world, entity);
		this.name = name;
		this.friendship = friend;
	}

	public EntityRamstoneVel(World world, EntityLivingBase entity)
	{
		super(world, entity);
		if (this.name == null)
			this.protoform = new EntityRamstone(world);
		else
			this.protoform = new EntityRamstone(world, this.name);
		this.elementParticle = EnumParticleTypes.BLOCK_CRACK;
	}

	@Override
	public void activateSlugAbility(boolean onGround) {
		Random ability = new Random();
		int abilint = ability.nextInt(max + 1);
		if (onGround) {
			//rockhorn ability
			if (abilint == 0) {
				System.out.println("Activating rockhorn");
				if (this.hitE != null) {
					this.hitE.attackEntityFrom(DamageSource.FALL, this.power*1.5f);
				}
			}

			//hammerstone ability
			else if(abilint == 1) {
				if (this.hitE instanceof EntityPlayer) {
					for (int a =0;a< 5; a++)
					{
						((EntityPlayer)this.hitE).attackEntityFrom(DamageSource.FALL, this.power/3.0f);
					}
				}
			}

			//sandscorn ability
			else if (abilint == 2) {
				this.makeTrench();
			}

			//slabhenge ability
			else if (abilint == 3){
				double a = Math.abs(this.motionX);
				double b = Math.abs(this.motionZ);
				if (a>b) {
					this.makeWall("x");
				} else {
					this.makeWall("z");
				}
			}
		}else{
			System.out.println("Activating rockstorm");
			if (abilint == 1) {
				for (int a=1;a< 13;a++)
				{
					//TODO replace these with rocks
					EntityFireball b = new EntitySmallFireball(world, posX+getR(a), posY+getR(a), posZ+getR(a), motionX, motionY, motionZ);
					this.world.spawnEntity(b);
				}
			}
		}
	}

	private void makeTrench() {
		if (this.motionX > 0) {
			if (this.motionX > this.motionZ) {
				this.makeTrenchSingle(1, 0);
			} else {
				this.makeTrenchSingle(0, 1);
			}
		} else {
			if (this.motionX < this.motionZ) {
				this.makeTrenchSingle(-1, 0);
			} else {
				this.makeTrenchSingle(0, -1);
			}
		}

	}

	private void makeTrenchSingle(int b, int c) {
		for (int a=0;a < 11; a++)
		{
			this.makePlus((int)this.posX+a*c, (int)this.posY, (int)this.posZ+a*b);
		}
	}

	private void makePlus(int x, int y, int z){
		for (int a=-1;a<2;a++)
		{
			for (int b=-1;b<2;b++)
			{
				this.world.setBlockToAir(new BlockPos(x+a, y, z+b));
				if (a==0 && b==0)
					this.world.setBlockToAir(new BlockPos(x, y-1, z));
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

	private void makeWall(String xOrY){
		for (int a=0;a<20;a++)
		{
			for (int b=0;b<6;b++)
			{
				if (xOrY == "x") {
					if (b<3) {
						this.world.setBlockState(new BlockPos((int)this.posX+1, (int)this.posY+b, (int)this.posZ+(10-a)), Blocks.STONE.getDefaultState());
						this.world.setBlockState(new BlockPos((int)this.posX+3, (int)this.posY+b, (int)this.posZ+(10-a)), Blocks.STONE.getDefaultState());	
					}
					this.world.setBlockState(new BlockPos((int)this.posX+2, (int)this.posY+b, (int)this.posZ+(10-a)), Blocks.STONE.getDefaultState());					
				} else {
					if (b<3) {
						this.world.setBlockState(new BlockPos((int)this.posX+(10-a), (int)this.posY+b, (int)this.posZ+1), Blocks.STONE.getDefaultState());
						this.world.setBlockState(new BlockPos((int)this.posX+(10-a), (int)this.posY+b, (int)this.posZ+3), Blocks.STONE.getDefaultState());
					}
					this.world.setBlockState(new BlockPos((int)this.posX+(10-a), (int)this.posY+b, (int)this.posZ+2), Blocks.STONE.getDefaultState());
				}
			}
		}
	}
}
