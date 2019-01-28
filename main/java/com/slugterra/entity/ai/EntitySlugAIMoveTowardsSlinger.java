package com.slugterra.entity.ai;

import com.slugterra.entity.EntitySlug;

import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class EntitySlugAIMoveTowardsSlinger extends EntityAIBase
{
	private EntitySlug theEntity;
	private EntityPlayerMP targetEntity;
	private double movePosX;
	private double movePosY;
	private double movePosZ;
	float leapMotionY = 0.5f;
	private double speed;
	/** If the distance to the target theEntity is further than this, this AI task will not run. */
	private float maxTargetDistance;
	
	public EntitySlugAIMoveTowardsSlinger(EntityPlayerMP player, EntitySlug slug, double speed, float maxDistance)
	{
		this.theEntity = slug;
		this.speed = speed;
		this.maxTargetDistance = maxDistance;
		this.targetEntity = player;
		this.setMutexBits(1);
	}

	/**
	 * Returns whether the theEntityAIBase should begin execution.
	 */
	@Override
	public boolean shouldExecute()
	{
		if (this.targetEntity == null)
		{
			return false;
		}
		else if (this.targetEntity.getDistanceToEntity(this.theEntity) > (double)(maxTargetDistance))
		{
			BlockPos v3 = this.targetEntity.getBedLocation(this.targetEntity.dimension);
			Vec3d vec3 = null;
			if (v3 != null){
				Vec3d v4 = new Vec3d(v3.getX(), v3.getY(), v3.getZ());
				vec3 = RandomPositionGenerator.findRandomTargetBlockTowards(this.theEntity, 16, 7, v4);
			}
			if (vec3 == null)
			{
				return false;
			}
			else
			{
				this.movePosX = vec3.xCoord;
				this.movePosY = vec3.yCoord;
				this.movePosZ = vec3.zCoord;
				return true;
			}
		}
		else
		{
			Vec3d Vec3 = RandomPositionGenerator.findRandomTargetBlockTowards(this.theEntity, 16, 7, new Vec3d(this.targetEntity.posX, this.targetEntity.posY, this.targetEntity.posZ));

			if (Vec3 == null)
			{
				return false;
			}
			else
			{
				this.movePosX = Vec3.xCoord;
				this.movePosY = Vec3.yCoord;
				this.movePosZ = Vec3.zCoord;
				return true;
			}
		}
	}

	/**
	 * Returns whether an in-progress theEntityAIBase should continue executing
	 */
	@Override
	public boolean continueExecuting()
	{
		return this.theEntity.getDistanceToEntity(this.targetEntity) > 5.0f;
	}

	/**
	 * Resets the task
	 */
	@Override
	public void resetTask() {}

	/**
	 * Execute a one shot task or start executing a continuous task
	 */
	@Override
	public void startExecuting()
	{
		if (theEntity.onGround && this.continueExecuting()){
			//TODO rotate slug to look towards target
			//theEntity.setPositionAndRotation(theEntity.posX, theEntity.posY, theEntity.posZ, theEntity.rotationYaw, theEntity.rotationPitch);
			double d0 = this.movePosX - this.theEntity.posX;
			double d1 = this.movePosZ - this.theEntity.posZ;
			float f = MathHelper.sqrt(d0 * d0 + d1 * d1);
			this.theEntity.motionX += (d0 / (double)f * 0.5D * 0.800000011920929D + this.theEntity.motionX * 0.20000000298023224D)/2;
			this.theEntity.motionZ += (d1 / (double)f * 0.5D * 0.800000011920929D + this.theEntity.motionZ * 0.20000000298023224D)/2;
			this.theEntity.motionY = (double)this.leapMotionY;
		}
	}

	@Override
	public boolean isInterruptible()
	{
		return false;
	}

	@Override
	public void updateTask(){
		if (theEntity.onGround && this.continueExecuting()){
			this.shouldExecute();
			this.startExecuting();
		}
	}
}