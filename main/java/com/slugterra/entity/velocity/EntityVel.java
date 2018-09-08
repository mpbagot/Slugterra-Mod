package com.slugterra.entity.velocity;

import java.util.Random;

import com.slugterra.entity.EntitySlug;
import com.slugterra.events.SlugterraSoundEvents;

import net.minecraft.client.particle.Particle;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityVel extends EntityThrowable{

	private float damage;
	public int power;
	public int min;
	public Entity hitE;
	public boolean impactAbility = false;
	public boolean killColl = true;
	public int friendship;
	public EntitySlug protoform;
	public String name;
	public int max;
	public int id;
	public EntityPlayerMP shooter;
	public EntityPlayerMP target = null;
	public EnumParticleTypes elementParticle;
	public Particle customParticle = null;

	public EntityVel(World world, EntityLivingBase entity) {
		super(world, entity);
		this.shooter = (EntityPlayerMP) entity;
		this.setLocationAndAngles(entity.posX, entity.posY + (double)entity.getEyeHeight(), entity.posZ, entity.rotationYaw, entity.rotationPitch);
		this.posX -= (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
		this.posZ -= (double)(MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
		this.setPosition(this.posX, this.posY, this.posZ);
		this.motionX = (double)(-MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI));
		this.motionZ = (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI));
		this.motionY = (double)(-MathHelper.sin(this.rotationPitch / 180.0F * (float)Math.PI));
		if (this.rotationPitch/180.0F > 0){
			this.motionY = -(this.rotationPitch/90.0F);
		}
		this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, 1.5F * 1.5F, 1.0F);

		this.impactAbility = false;
		this.killColl = true;

		this.playSound(SlugterraSoundEvents.slugFormshift, 1.0f, 1.0f);
	}

	public EntityVel(World world) {
		super(world);
		this.playSound(SlugterraSoundEvents.slugFormshift, 1.0f, 1.0f);
	}

	@Override
	protected void onImpact(RayTraceResult result) {
		int k = 0;
		if (!this.world.isRemote && this.killColl){
			activateSlugAbility(true);
		}

		if (result.entityHit != null)
		{
			this.hitE = result.entityHit;
			if (result.entityHit instanceof EntityVel){
				int otherpower = ((EntityVel) result.entityHit).power;
				if (this.power > otherpower){
					((EntityVel) result.entityHit).setDead();
					k = 1;
				}
				else if (this.power == otherpower){
					((EntityVel) result.entityHit).setDead();
					this.setDead();
					k = 1;
				}
			}
			result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), this.damage);
		}
		if (this.killColl){
			if (!world.isRemote){
				this.turnToProtoform();
			}
			if (k == 0){
				this.setDead();
			}
		}
	}

	public void turnToProtoform() {
		System.out.println(this.protoform);
		EntitySlug entityToSpawn = this.protoform;
		if (this.name != null)
			entityToSpawn.setName(this.name);
		entityToSpawn.friendship = this.friendship;
		if (this.shooter != null){
			entityToSpawn.setSlinger((EntityPlayerMP)this.shooter);
			entityToSpawn.setFollowSlinger(this.friendship > 30);
		}
		entityToSpawn.setLocationAndAngles(posX, posY, posZ, rotationYaw, 0.0F);
		world.spawnEntity(entityToSpawn);
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
		this.killColl = true;
		if (this.target != null){
			this.posX += (this.posX-target.posX)/60;
			this.posY += (this.posY-target.posY)/60;
			this.posZ += (this.posZ-target.posZ)/60;
		}
		if (this.ticksExisted == 4 && !this.world.isRemote && new Random().nextInt(2) == 0){
			this.impactAbility = true;
			activateSlugAbility(false);
		}
		this.setRotation(this.rotationYaw, this.rotationPitch+60);
		if (this.world.isRemote && elementParticle != null){
			for (int i = 0; i < 8; ++i)
			{
				//TODO send a packet to spawn particles everywhere!!!
				//MainRegistry.packetPipeline.sendToAll(new TrailFXPacket());
				this.world.spawnParticle(elementParticle, this.posX, this.posY, this.posZ, rand.nextDouble(), rand.nextDouble(), rand.nextDouble());
				System.out.println("spawning Vanilla Particles!!!");
			}
		}
		else if (this.world.isRemote && customParticle != null){
			for (int i = 0; i < 8; ++i) {
				//TODO send a packet to spawn particles everywhere!!!
//				MainRegistry.proxy.spawnElementalParticles(this, this.world, customParticle);
				System.out.println("Spawning Custom Particles");
			}
		}
	}

	/**
	 * Activates a random Slug ability based on the Slug
	 */
	public void activateSlugAbility(boolean onImpact){}

}