package com.slugterra.entity.velocity;

import java.util.Random;

import com.slugterra.entity.protoform.EntityGrenuke;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.world.World;

public class EntityGrenukeVel extends EntityVel{

	public static int max = 2;

	public EntityGrenukeVel(World p_i1776_1_) {
		super(p_i1776_1_);
	}

	public EntityGrenukeVel(World world, EntityLivingBase entity, int friend, String name)
	{
		this(world, entity);
		this.name = name;
		this.friendship = friend;
	}

	public EntityGrenukeVel(World world, EntityLivingBase entity)
	{
		super(world, entity);
		if (this.name == null)
			this.protoform = new EntityGrenuke(world);
		else
			this.protoform = new EntityGrenuke(world, this.name);
		this.elementParticle = "flame";
	}

	@Override
	public void activateSlugAbility(boolean onGround){
		Random ability = new Random();
		int abilint = ability.nextInt(max + 1);
		if (onGround){

			this.killColl = false;
			this.motionX = 0.0f;
			this.motionY = 0.0f;
			this.motionZ = 0.0f;

			//mushboom ability
			if (abilint == 1){
				System.out.println("Activating mushboom!!");
				if (this.waitTime != 0){
					this.waitTime = 75;
				} else {
					this.setDead();
					this.waitTime = -1;
					for (int a=0;a<6;++a)
						this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ, 5.0f, false, true);
				}
			}

			//nuklock ability
			else if(abilint == 0){
				System.out.println("Activating Nuklock!!!");
				if (this.waitTime != 0){
					this.waitTime = 75;
				} else {
					this.setDead();
					this.waitTime = -1;
					this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ, 4.0f, false, true);
				}
			}

		} else {
			//spikesploder ability
			if (abilint == 1){
				System.out.println("Activating spikesploder!!");
				for (int a=1; a < 25;++a){
					EntityFireball ball = new EntitySmallFireball(worldObj, this.posX, this.posY, this.posZ, this.motionX*new Random().nextFloat(), this.motionY*new Random().nextFloat(), this.motionZ * new Random().nextFloat());
					worldObj.spawnEntityInWorld(ball);
				}
				//TODO spawn some grenade objects and spray outwards, not forwards.
			}
		}
	}
}
