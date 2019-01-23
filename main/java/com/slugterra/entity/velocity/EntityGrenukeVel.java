package com.slugterra.entity.velocity;

import java.util.Random;

import com.slugterra.entity.protoform.EntityGrenuke;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityGrenukeVel extends EntityVel{

	public static int max = 2;
	private boolean waiting = false;
	private int waitTime = 45;

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
		this.elementParticle = EnumParticleTypes.FLAME;
	}

	@Override
	public void activateSlugAbility(boolean onGround){
		Random ability = new Random();
		int abilint = ability.nextInt(max + 1);
		if (onGround){

			if (!waiting){
				waiting = true;
				return;
			} else if (this.waitTime > 1){
				return;
			} else {
				waiting = false;
			}

			//mushboom ability
			if (abilint == 1){
				System.out.println("Activating mushboom!!");
				for (int a=0;a<6;++a)
					this.world.newExplosion(this, this.posX, this.posY, this.posZ, 5.0f, false, true);
			}

			//nuklock ability
			else if(abilint == 0){
				System.out.println("Activating Nuklock!!!");
				this.world.newExplosion(this, this.posX, this.posY, this.posZ, 4.0f, false, true);
			}

		} else {
			//spikesploder ability
			if (abilint == 1){
				System.out.println("Activating spikesploder!!");
				for (int a=1; a < 25;++a){
					EntityFireball ball = new EntitySmallFireball(world, this.posX, this.posY, this.posZ, this.motionX*new Random().nextFloat(), this.motionY*new Random().nextFloat(), this.motionZ * new Random().nextFloat());
					world.spawnEntity(ball);
				}
				//TODO spawn some grenade objects and spray outwards, not forwards.
			}
		}
	}

	@Override
	protected void onImpact(RayTraceResult result) {
		if (!this.world.isRemote && !this.waiting){
			this.activateSlugAbility(true);
		}
	}

	@Override
	public void onUpdate(){
		super.onUpdate();
		if (waiting){
			--waitTime;
			this.motionX = 0.0f;
			this.motionY = 0.0f;
			this.motionZ = 0.0f;
		}
		if (!this.world.isRemote && waitTime < 0){
			this.activateSlugAbility(true);
			this.turnToProtoform();
			this.setDead();
		}
	}
}
