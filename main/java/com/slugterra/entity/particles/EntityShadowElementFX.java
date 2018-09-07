package com.slugterra.entity.particles;

import net.minecraft.client.particle.ParticleExplosion;
import net.minecraft.world.World;

public class EntityShadowElementFX extends ParticleExplosion{

	public EntityShadowElementFX(World world, double posx, double posy, double posz, double motx, double moty, double motz) {
		super(world, posx, posy, posz, motx, moty, motz);
		this.particleBlue = this.particleGreen = this.particleRed = 0.1F;
	}

}
