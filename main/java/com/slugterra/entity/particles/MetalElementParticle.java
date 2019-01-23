package com.slugterra.entity.particles;

import net.minecraft.client.particle.ParticleCloud;
import net.minecraft.world.World;

public class MetalElementParticle extends ParticleCloud {

	public MetalElementParticle(World world, double posx, double posy, double posz, double motx, double moty, double motz) {
		super(world, posx, posy, posz, motx, moty, motz);
		this.particleBlue = this.particleGreen = this.particleRed = 0.6F;
	}

}
