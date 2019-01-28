package com.slugterra.entity.ai;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class EntitySlugAIHopPanic extends EntityAIBase
{
	private EntityCreature entity;
	private double xPosition;
	private double yPosition;
	private double zPosition;
    Vec3d leapTarget;
    double leapMotionY;

	public EntitySlugAIHopPanic(EntityCreature p_i1648_1_, double p_i1648_2_)
	{
		this.entity = p_i1648_1_;
		this.leapMotionY = p_i1648_2_;
		this.setMutexBits(1);
	}

	/**
	 * Returns whether the EntityAIBase should begin execution.
	 */
	public boolean shouldExecute()
	{
		if (this.entity.getAITarget() == null && !this.entity.isBurning())
        {
            return false;
        }
		else
		{
			Vec3d vec3 = RandomPositionGenerator.findRandomTarget(this.entity, 5, 4);

			if (vec3 == null)
			{
				return false;
			}
			else
			{
				this.xPosition = vec3.xCoord;
				this.yPosition = vec3.yCoord;
				this.zPosition = vec3.zCoord;
				this.leapTarget = vec3;
				return true;
			}
		}
	}

	/**
	 * Returns whether an in-progress EntityAIBase should continue executing
	 */
	public boolean continueExecuting()
	{
		return this.entity.posX != this.xPosition && this.yPosition != this.entity.posY && this.entity.posZ != this.zPosition;
	}

	/**
	 * Execute a one shot task or start executing a continuous task
	 */
	public void startExecuting()
	{
		double d0 = this.leapTarget.xCoord - this.entity.posX;
		double d1 = this.leapTarget.zCoord - this.entity.posZ;
		float f = MathHelper.sqrt(d0 * d0 + d1 * d1);
		this.entity.motionX += d0 / (double)f * 0.5D * 0.800000011920929D + this.entity.motionX * 0.20000000298023224D;
		this.entity.motionZ += d1 / (double)f * 0.5D * 0.800000011920929D + this.entity.motionZ * 0.20000000298023224D;
		this.entity.motionY = this.leapMotionY;
	}
}