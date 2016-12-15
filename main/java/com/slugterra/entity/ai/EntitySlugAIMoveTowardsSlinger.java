package com.slugterra.entity.ai;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.Vec3;

public class EntitySlugAIMoveTowardsSlinger extends EntityAIBase
{
    private EntityCreature theEntity;
    private EntityPlayerMP targetEntity;
    private double movePosX;
    private double movePosY;
    private double movePosZ;
    private double speed;
    /** If the distance to the target entity is further than this, this AI task will not run. */
    private float maxTargetDistance;
    private static final String __OBFID = "CL_00001599";

    public EntitySlugAIMoveTowardsSlinger(EntityPlayerMP player, EntityCreature p_i1640_1_, double p_i1640_2_, float p_i1640_4_)
    {
        this.theEntity = p_i1640_1_;
        this.speed = p_i1640_2_;
        this.maxTargetDistance = p_i1640_4_;
        this.targetEntity = player;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
    	System.out.println(this.targetEntity);
        if (this.targetEntity == null)
        {
            return false;
        }
        else if (this.targetEntity.getDistanceSqToEntity(this.theEntity) > (double)(this.maxTargetDistance * this.maxTargetDistance))
        {
        	ChunkCoordinates vec3 = this.targetEntity.getBedLocation(this.targetEntity.dimension);
            if (vec3 == null)
            {
                return false;
            }
            else
            {
                this.movePosX = vec3.posX;
                this.movePosY = vec3.posY;
                this.movePosZ = vec3.posZ;
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
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean continueExecuting()
    {
        return !this.theEntity.getNavigator().noPath() && this.targetEntity.isEntityAlive() && this.targetEntity.getDistanceSqToEntity(this.theEntity) < (double)(this.maxTargetDistance * this.maxTargetDistance);
    }

    /**
     * Resets the task
     */
    public void resetTask() {}

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.theEntity.getNavigator().tryMoveToXYZ(this.movePosX, this.movePosY, this.movePosZ, this.speed);
    }
}