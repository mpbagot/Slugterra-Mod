package com.slugterra.entity.particles;

import java.util.Random;

import net.minecraft.client.particle.ParticleCrit;
import net.minecraft.world.World;

public class EntityElectricElementFX extends ParticleCrit {

	public EntityElectricElementFX(World world, double posx, double posy, double posz, double motx, double moty, double motz) {
		super(world, posx, posy, posz, motx, moty, motz);
		this.particleBlue = 0.0F;
		this.particleGreen = this.particleRed = new Random().nextFloat();
		
	}

}
