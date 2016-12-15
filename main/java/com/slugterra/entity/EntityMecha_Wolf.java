package com.slugterra.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityMecha_Wolf extends EntityAnimal {
	
	private int field_110285_bP;
	private float jumpPower = 0.0F;
	private boolean field_110294_bI;
	public static boolean isMechaJumping = false;
	public static boolean isMechaFlying = false;
	public static boolean isAirborne = false;
	public static int boostFuel = 100;

	public EntityMecha_Wolf(World world) {
		super(world);
		this.setSize(1.3F, 1.5F);
		this.tasks.addTask(1, new EntityAISwimming(this));
	}

	public boolean isAIEnabled(){
		return true;
	}

	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return new EntityMecha_Wolf(worldObj);
	}
	
	@Override
	public void onLivingUpdate(){
		if (isMechaFlying){
			boostFuel -= 1;
		}
		super.onLivingUpdate();
	}
	
	public static void senseJump(){
		if (!isAirborne){
		isMechaJumping = true;
		}else if (boostFuel > 0)
		{
			isMechaFlying = true;
		}
	}

	public boolean interact(EntityPlayer p_70085_1_)
	{
		p_70085_1_.mountEntity(this);
		return true;
	}
	
	@Override
	public void moveEntityWithHeading(float p_70612_1_, float p_70612_2_)
	{
		if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityLivingBase)
		{
			this.prevRotationYaw = this.rotationYaw = this.riddenByEntity.rotationYaw;
			this.rotationPitch = this.riddenByEntity.rotationPitch * 0.5F;
			this.setRotation(this.rotationYaw, this.rotationPitch);
			p_70612_1_ = ((EntityLivingBase)this.riddenByEntity).moveStrafing * 0.5F;
			p_70612_2_ = ((EntityLivingBase)this.riddenByEntity).moveForward;

			if (p_70612_2_ <= 0.0F)
			{
				p_70612_2_ *= 0.25F;
				this.field_110285_bP = 0;
			}

			
			if (this.isMechaJumping)
			{
				System.out.println("Jumping!");
				this.motionY = 1.0F;
				this.isMechaJumping = false;
			}
			if (this.boostFuel < 1){
				this.isMechaFlying = false;
			}
			if (this.motionY > 0.0F && !this.isMechaFlying && this.boostFuel > 0){
				System.out.println("Here");
				this.isAirBorne = true;
				
				this.motionY -= 0.05;

				if (p_70612_2_ > 0.0F)
				{
					float f2 = MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0F);
					float f3 = MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0F);
					this.motionX += (double)(-0.4F * f2);
					this.motionZ += (double)(0.4F * f3);
				}
				net.minecraftforge.common.ForgeHooks.onLivingJump(this);
				this.setVelocity(motionX, motionY, motionZ);

			}
			if (this.onGround){
				this.isAirBorne = false;
				this.boostFuel = 100;
			}

			this.stepHeight = 1.0F;
			this.jumpMovementFactor = this.getAIMoveSpeed() * 0.1F;

			if (!this.worldObj.isRemote)
			{
				this.setAIMoveSpeed(0.5F);
				super.moveEntityWithHeading(p_70612_1_, p_70612_2_);
			}

			this.prevLimbSwingAmount = this.limbSwingAmount;
			double d1 = this.posX - this.prevPosX;
			double d0 = this.posZ - this.prevPosZ;
			float f4 = MathHelper.sqrt_double(d1 * d1 + d0 * d0) * 4.0F;

			if (f4 > 1.0F)
			{
				f4 = 1.0F;
			}

			this.limbSwingAmount += (f4 - this.limbSwingAmount) * 0.4F;
			this.limbSwing += this.limbSwingAmount;
		}
		
		else
		{
			this.stepHeight = 0.5F;
			this.jumpMovementFactor = 0.02F;
			super.moveEntityWithHeading(p_70612_1_, p_70612_2_);
		}
	}
	
	protected void fall(float f1){
		super.fall(f1);
	}
}