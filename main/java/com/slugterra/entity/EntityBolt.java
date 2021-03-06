package com.slugterra.entity;

import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityBolt extends EntityFireball {

	public EntityBolt(World world, double posx, double posy, double posz, double motionx,
			double motiony, double motionz) {
		super(world, posx, posy, posz, motionx, motiony, motionz);
		this.setPosition(posx, posy, posz);
		this.motionX = motionx;
		this.motionY = motiony;
		this.motionZ = motionz;
	}

	@Override
	protected void onImpact(RayTraceResult coll) {
		this.world.setBlockState(coll.getBlockPos(), Blocks.FIRE.getDefaultState());
	}

}
