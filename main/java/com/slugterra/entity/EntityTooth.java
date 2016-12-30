package com.slugterra.entity;

import com.slugterra.entity.velocity.EntityVel;

import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityTooth extends EntityThrowable {

	private int initImpact = -1;

	public EntityTooth(World world, double posx, double posy, double posz, EntityVel ent) {
		super(world);
		posX = posx;
		posY = posy;
		posZ = posz;
		motionX = ent.motionX;
		motionY = ent.motionY;
		motionZ = ent.motionZ;

	}

	@Override
	protected void onImpact(MovingObjectPosition coll) {
		if (coll.entityHit != null && initImpact == -1){
			coll.entityHit.attackEntityFrom(DamageSource.generic, 0.5f);
		}
		if (initImpact == -1){
			System.out.println("calling onImpact() in EntityTooth.class");
			initImpact = this.ticksExisted;
		}
		if (this.ticksExisted - this.initImpact > 250){
			this.setDead();
		}

	}
}
