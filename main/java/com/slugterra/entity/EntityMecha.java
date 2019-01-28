package com.slugterra.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EntityMecha extends EntityAnimal {

//	private int field_110285_bP;
	public boolean isMechaJumping = false;
	public boolean isMechaFlying = false;
	public boolean isAirborne = false;
	public int boostFuel = 10;

	public EntityMecha(World world) {
		super(world);
		this.setSize(1.3F, 1.5F);
		this.tasks.addTask(1, new EntityAISwimming(this));
	}

	@Override
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(100.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.1D);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return new EntityMecha(world);
	}

	@Override
	public void updatePassenger(Entity passenger) {
		if (this.isPassenger(passenger)) {
            passenger.setPosition(this.posX, this.posY + 0.3D, this.posZ);
        }
	}
	
	@Override
	public void onLivingUpdate(){
		if (isMechaFlying){
			boostFuel -= 1;
		}
		super.onLivingUpdate();
	}

	public void senseJump(){
		System.out.println(this.world.isRemote);
		if (onGround) {
			System.out.println("setting jump var to true!");
			this.motionY = 1.0;
			isMechaJumping = true;
		} else if (boostFuel > 0) {
			System.out.println("Flipping flight var");
			isMechaFlying = !isMechaFlying;
		}
	}

	@Override
	public EnumActionResult applyPlayerInteraction(EntityPlayer player, Vec3d vec, EnumHand stack)
	{
		player.startRiding(this);
		return EnumActionResult.SUCCESS;
	}

	@Override
	public void moveEntityWithHeading(float strafe, float forward)
	{
		if (this.isBeingRidden() && this.getPassengers().size() > 0 && this.getPassengers().get(0) instanceof EntityLivingBase)
		{
			Entity rider = this.getPassengers().get(0);
			
			//System.out.println(this.onGround);
			this.prevRotationYaw = this.rotationYaw = rider.rotationYaw;
			this.rotationPitch = rider.rotationPitch * 0.5F;
			this.setRotation(this.rotationYaw, this.rotationPitch);
			strafe = ((EntityLivingBase)rider).moveStrafing * 0.5F;
			forward = ((EntityLivingBase)rider).moveForward * 0.5F;

			if (forward <= 0.0F)
			{
				// Half the speed if we're going backwards
				forward *= 0.5F;
			}

			if (!world.isRemote) {
				if (this.isMechaJumping) {
					System.out.println("Jumping!");
					this.motionY = 1.0;
					this.isMechaJumping = false;
				}
				if (this.isMechaFlying){
					this.motionY = 0.2;
					--boostFuel;
				}
			}
			
			if (this.boostFuel < 1){
				this.isMechaFlying = false;
			}
			
			if (this.motionY > 0.0 && this.boostFuel > 0){
				this.isAirBorne = true;
				
				if (this.isMechaFlying && !this.world.isRemote)
				{
					//TODO This accelerates infinitely. Instead, the speed should just be 1.4x
//					forward *= 3f;
					float f2 = MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0F);
					float f3 = MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0F);
					this.motionX += (double)(-0.05F * f2);
					this.motionZ += (double)(0.05F * f3);
				}
				net.minecraftforge.common.ForgeHooks.onLivingJump(this);
			}
			
			if (this.onGround) {
				this.isAirBorne = false;
				if (this.boostFuel < 100)
					this.boostFuel++;
			}

			this.stepHeight = 1.0F;
			this.jumpMovementFactor = this.getAIMoveSpeed() * 0.1F;

			if (!this.world.isRemote)
			{
				this.setAIMoveSpeed(0.5F);
				super.moveEntityWithHeading(strafe, forward);
			}

			double dx = this.posX - this.prevPosX;
			double dz = this.posZ - this.prevPosZ;
			float f4 = MathHelper.sqrt(dx * dx + dz * dz) * 4.0F;

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
			super.moveEntityWithHeading(strafe, forward);
		}
	}
	
	@Override
	public void fall(float distance, float damageMultiplier)
    {
        int i = MathHelper.ceil((distance * 0.5F - 15.0F) * damageMultiplier);

        if (i > 0)
        {
            this.attackEntityFrom(DamageSource.FALL, (float)i);

            if (this.isBeingRidden())
            {
                for (Entity entity : this.getRecursivePassengers())
                {
                    entity.attackEntityFrom(DamageSource.FALL, (float)i);
                }
            }

        }
    }
}