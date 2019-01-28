package com.slugterra.entity;

import com.slugterra.entity.velocity.EntityVel;

import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityLightBall extends EntityThrowable{

	public EntityLightBall(World world, double posx, double posy, double posz, EntityVel entity) {
		super(world, posx, posy, posz);
		this.motionX = entity.motionX;
		this.motionY = entity.motionY;
		this.motionZ = entity.motionZ;
		this.setPosition(this.posX, this.posY, this.posZ);
	}

	public EntityLightBall(World p_i1777_1_) {
		super(p_i1777_1_);
	}

	@Override
	protected void onImpact(RayTraceResult coll) {
		if (!world.isRemote)
			world.setBlockState(coll.getBlockPos().add(0, 1, 0), Blocks.FIRE.getDefaultState());
		if (coll.entityHit != null){
			coll.entityHit.attackEntityFrom(DamageSource.FALL, 0.5F);
		}
		this.setDead();
	}
}