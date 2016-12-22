package com.slugterra.entity.ai;

import com.slugterra.entity.EntitySlug;

import net.minecraft.block.Block;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;

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
	private static final String __OBFID = "CL_00001599";

	public EntitySlugAIMoveTowardsSlinger(EntityPlayerMP player, EntitySlug p_i1640_1_, double p_i1640_2_, float p_i1640_4_)
	{
		this.theEntity = p_i1640_1_;
		this.speed = p_i1640_2_;
		this.maxTargetDistance = p_i1640_4_;
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
			ChunkCoordinates v3 = this.targetEntity.getBedLocation(this.targetEntity.dimension);
			Vec3 vec3 = null;
			if (v3 != null){
				Vec3 v4 = Vec3.createVectorHelper(v3.posX, v3.posY, v3.posZ);
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
			Vec3 vec3 = RandomPositionGenerator.findRandomTargetBlockTowards(this.theEntity, 16, 7, Vec3.createVectorHelper(this.targetEntity.posX, this.targetEntity.posY, this.targetEntity.posZ));

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
			float f = MathHelper.sqrt_double(d0 * d0 + d1 * d1);
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