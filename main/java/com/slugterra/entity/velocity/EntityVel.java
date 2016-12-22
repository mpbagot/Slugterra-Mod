package com.slugterra.entity.velocity;

import java.util.Random;

import com.slugterra.block.SlugterraElectricWallBlock;
import com.slugterra.entity.EntitySlug;
import com.slugterra.entity.particles.EntityElectricElementFX;
import com.slugterra.lib.Strings;
import com.slugterra.main.MainRegistry;

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
	public static int friendship;
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
		this.setLocationAndAngles(entity.posX, entity.posY + (double)entity.getEyeHeight(), entity.posZ, entity.rotationYaw, entity.rotationPitch);
		this.posX -= (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
		this.posZ -= (double)(MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
		this.setPosition(this.posX, this.posY, this.posZ);
		this.yOffset = 0.0F;
		this.motionX = (double)(-MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI));
		this.motionZ = (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI));
		this.motionY = (double)(-MathHelper.sin(this.rotationPitch / 180.0F * (float)Math.PI));
		if (this.rotationPitch/180.0F > 0){
			this.motionY = -(this.rotationPitch/90.0F);
		}
		this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, 1.5F * 1.5F, 1.0F);

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
		if (this.worldObj.isRemote && elementParticle != "other" && elementParticle != null){
			for (int i = 0; i < 8; ++i)
			{
				//TODO send a packet to spawn particles everywhere!!!
				//MainRegistry.packetPipeline.sendToAll(new TrailFXPacket());
				this.worldObj.spawnParticle(elementParticle, this.posX, this.posY, this.posZ, 0.2D, 0.2D, 0.2D);
				System.out.println("spawning Vanilla Particles!!!");
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