package com.slugterra.entity.velocity;

import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.slugterra.entity.EntitySlug;
import com.slugterra.lib.Strings;
import com.slugterra.main.MainRegistry;

public class EntityVel extends EntityThrowable{

	private float damage;
    public static int power;
    public static int min;
    public static int friendship;
    public static EntitySlug protoform;
    public static String name;
    public static int max;
    public static int id;
	public EntityPlayerMP shooter;
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

		p_i1777_1_.playSoundAtEntity((Entity)this, Strings.MODID + ":slugs.allSlugs.formshift", 1.0F, 1.0F);
	}

	public EntityVel(World p_i1777_1_) {
		super(p_i1777_1_);
		p_i1777_1_.playSoundAtEntity((Entity)this, Strings.MODID + ":slugs.allSlugs.formshift", 1.0F, 1.0F);
	}
	
	@Override
	protected void onImpact(MovingObjectPosition p_70184_1_) {
		int k = 0;
		if (p_70184_1_.entityHit != null)
		{
			if (p_70184_1_.entityHit instanceof EntityVel){
				int otherpower = ((EntityVel) p_70184_1_.entityHit).power;
				if (this.power > otherpower){
					p_70184_1_.entityHit.setDead();
					k = 1;
				}
				else if (this.power == otherpower){
					p_70184_1_.entityHit.setDead();
					this.setDead();
					k = 1;
				}
			}
			p_70184_1_.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), this.damage);
		}
		if (!worldObj.isRemote){
			EntitySlug entityToSpawn = this.protoform;
			entityToSpawn.name = this.name;
			entityToSpawn.friendship = this.friendship;
			entityToSpawn.setSlinger((EntityPlayerMP)this.shooter);
			entityToSpawn.setFollowSlinger(this.friendship > 30);
		    entityToSpawn.setLocationAndAngles(posX, posY, posZ, rotationYaw, 0.0F);
		    worldObj.spawnEntityInWorld(entityToSpawn);
			activateSlugAbility(true);
		}
		if (k == 0){
			this.setDead();
		}
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
		if (this.ticksExisted == 8 && !this.worldObj.isRemote){
			activateSlugAbility(false);
		}
		this.setRotation(this.rotationYaw, this.rotationPitch+60);
		if (elementParticle != "other" && elementParticle != null){
			for (int i = 0; i < 8; ++i)
			{
				this.worldObj.spawnParticle(elementParticle, this.posX, this.posY, this.posZ, 0.2D, 0.2D, 0.2D);
			}
		}
		else if (customParticle != null){
			for (int i = 0; i < 8; ++i) {
				MainRegistry.proxy.spawnElementalParticles(this.worldObj, customParticle);
			}
		}
	}
	
	/**
	 * Activates a random Slug ability based on the Slug
	 */
	public void activateSlugAbility(boolean onImpact){}
}