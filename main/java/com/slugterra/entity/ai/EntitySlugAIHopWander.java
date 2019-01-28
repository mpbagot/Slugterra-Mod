package com.slugterra.entity.ai;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class EntitySlugAIHopWander extends EntityAIBase
{
	private EntityCreature entity;
	private double xPosition;
	private double yPosition;
	private double zPosition;
    /** The entity that the leaper is leaping towards. */
    Vec3d leapTarget;
    /** The entity's motionY after leaping. */
    float leapMotionY;

	public EntitySlugAIHopWander(EntityCreature p_i1648_1_, float p_i1648_2_)
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
		if (this.entity.getAge() >= 100)
		{
			return false;
		}
		else if (this.entity.getRNG().nextInt(120) != 0)
		{
			return false;
		}
		else
		{
			Vec3d Vec3d = RandomPositionGenerator.findRandomTarget(this.entity, 10, 7);

			if (Vec3d == null)
			{
				return false;
			}
			else
			{
				this.xPosition = Vec3d.xCoord;
				this.yPosition = Vec3d.yCoord;
				this.zPosition = Vec3d.zCoord;
				this.leapTarget = Vec3d;
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
		this.entity.motionX += (d0 / (double)f * 0.5D * 0.800000011920929D + this.entity.motionX * 0.20000000298023224D)/2;
		this.entity.motionZ += (d1 / (double)f * 0.5D * 0.800000011920929D + this.entity.motionZ * 0.20000000298023224D)/2;
		this.entity.motionY = (double)this.leapMotionY;
	}
}