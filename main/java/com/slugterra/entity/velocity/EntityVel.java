package com.slugterra.entity.velocity;

import java.util.Random;

import com.slugterra.entity.EntitySlug;
import com.slugterra.item.DefenderBlaster;
import com.slugterra.lib.Strings;
import com.slugterra.main.MainRegistry;
import com.slugterra.packets.ParticleSpawnPacket;

import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityVel extends EntityThrowable{

	private float damage;
	public static int power;
	public static int min;
	public static Entity hitE;
	public static boolean impactAbility = false;
	public static boolean killColl = true;
	public static int friendship = 0;
	public static EntitySlug protoform;
	public static String name;
	public static int max;
	public static int id;
	public EntityPlayerMP shooter;
	public EntityPlayerMP target = null;
	public String elementParticle;
	public EntityFX customParticle = null;

	public EntityVel(World p_i1777_1_, EntityLivingBase entity) {
		super(p_i1777_1_, entity);
		this.shooter = (EntityPlayerMP) entity;
		
		if (!((DefenderBlaster)this.shooter.getCurrentEquippedItem().getItem()).hasExtendBarrel){
			float r = new Random().nextFloat()/50;
			this.motionX = motionX + (new Random().nextBoolean() ? r : -r);
			this.motionY = motionY + (new Random().nextBoolean() ? r : -r);
			this.motionZ = motionZ + (new Random().nextBoolean() ? r : -r);
		}

		this.impactAbility = false;
		this.killColl = true;

		p_i1777_1_.playSoundAtEntity((Entity)this, Strings.MODID + ":slugs.allSlugs.formshift", 1.0F, 1.0F);
	}

	public EntityVel(World p_i1777_1_) {
		super(p_i1777_1_);
		p_i1777_1_.playSoundAtEntity((Entity)this, Strings.MODID + ":slugs.allSlugs.formshift", 1.0F, 1.0F);
	}

	@Override
	protected void onImpact(MovingObjectPosition p_70184_1_) {
		int k = 0;
		if (!this.worldObj.isRemote && this.killColl){
			activateSlugAbility(true);
		}

		if (p_70184_1_.entityHit != null)
		{
			this.hitE = p_70184_1_.entityHit;
			if (p_70184_1_.entityHit instanceof EntityVel){
				int otherpower = ((EntityVel) p_70184_1_.entityHit).power;
				if (this.power > otherpower){
					((EntityVel) p_70184_1_.entityHit).setDead();
					k = 1;
				}
				else if (this.power == otherpower){
					((EntityVel) p_70184_1_.entityHit).setDead();
					this.setDead();
					k = 1;
				}
			}
			p_70184_1_.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), this.damage);
		}
		if (this.killColl){
			if (!worldObj.isRemote){
				this.setDead();
				//this.turnToProtoform();
			}
			if (k == 0){
				this.setDead();
			}
		}
	}

	public void turnToProtoform() {
		EntitySlug entityToSpawn = this.protoform;
		if (this.name != null)
			entityToSpawn.setName(this.name);
		entityToSpawn.friendship = this.friendship;
		if (shooter != null){
			entityToSpawn.setSlinger(this.shooter);
			entityToSpawn.setFollowSlinger(this.friendship > 30);
		}
		entityToSpawn.setLocationAndAngles(posX, posY, posZ, rotationYaw, 0.0F);
		worldObj.spawnEntityInWorld(entityToSpawn);
	}

	public EntityVel setPower(float skill){
		this.power = (int)(2+skill/10);
		return this;
	}

	public void setDamage(double p_70239_1_)
	{
		this.damage = (float)p_70239_1_;
	}

	public double getDamage()
	{
		return (double)this.damage;
	}

	@Override
	public void onUpdate(){
		super.onUpdate();
		if (this.ticksExisted > 1500){
			this.setDead();
		}
		this.motionY += this.getGravityVelocity();
		this.killColl = true;
		if (this.target != null){
			this.posX += (this.posX-target.posX)/60;
			this.posY += (this.posY-target.posY)/60;
			this.posZ += (this.posZ-target.posZ)/60;
		}
		if (this.ticksExisted == 4 && !this.worldObj.isRemote && new Random().nextInt(2) == 0){
			this.impactAbility = true;
			activateSlugAbility(false);
		}
		this.setRotation(this.rotationYaw, this.rotationPitch+60);
		if (elementParticle != "other" && elementParticle != null){
			for (int i = 0; i < 8; ++i)
			{
				MainRegistry.network.sendToServer(new ParticleSpawnPacket(posX, posY, posZ, elementParticle));
//				System.out.println("spawning Vanilla Particles!!!");
			}
		}
		else if (this.worldObj.isRemote && customParticle != null){
			for (int i = 0; i < 8; ++i) {
				//TODO send a packet to spawn particles everywhere!!!
				MainRegistry.proxy.spawnElementalParticles(this, this.worldObj, customParticle);
				System.out.println("Spawning Custom Particles");
			}
		}
	}

	/**
	 * Activates a random Slug ability based on the Slug
	 */
	public void activateSlugAbility(boolean onImpact){}
}