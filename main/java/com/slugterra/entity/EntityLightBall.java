package com.slugterra.entity;

import com.slugterra.entity.velocity.EntityVel;

import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityLightBall extends EntityThrowable{

	public EntityLightBall(World p_i1777_1_, double posx, double posy, double posz, EntityVel entity) {
		super(p_i1777_1_, posx, posy, posz);
		this.motionX = entity.motionX;
		this.motionY = entity.motionY;
		this.motionZ = entity.motionZ;
		this.setPosition(this.posX, this.posY, this.posZ);
	}

	public EntityLightBall(World p_i1777_1_) {
		super(p_i1777_1_);
	}

	@Override
	protected void onImpact(MovingObjectPosition coll) {
		if (!worldObj.isRemote)
			worldObj.setBlock(coll.blockX, coll.blockY+1, coll.blockZ, Blocks.fire);
		if (coll.entityHit != null){
			coll.entityHit.attackEntityFrom(DamageSource.fall, 0.5F);
		}
		this.setDead();
	}
}