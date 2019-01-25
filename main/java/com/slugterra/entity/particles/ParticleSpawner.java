package com.slugterra.entity.particles;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;


public class ParticleSpawner
{
	private static Minecraft mc = Minecraft.getMinecraft();
	
	public static Particle spawnParticle(Particle particle, double par2, double par4, double par6, double par8, double par10, double par12)
	{
		if (mc != null && mc.getRenderViewEntity() != null && mc.effectRenderer != null)
		{
			int var14 = mc.gameSettings.particleSetting;

			if (var14 == 1 && mc.world.rand.nextInt(3) == 0)
			{
				var14 = 2;
			}

			double var15 = mc.getRenderViewEntity().posX - par2;
			double var17 = mc.getRenderViewEntity().posY - par4;
			double var19 = mc.getRenderViewEntity().posZ - par6;
			Particle var21 = null;
			double var22 = 16.0D;

			if (var15 * var15 + var17 * var17 + var19 * var19 > var22 * var22)
			{
				return null;
			}
			else if (var14 > 1)
			{
				return null;
			}
			else
			{
				Object[] args = new Object[] { mc.world, par2, par4, par6, par8, par10, par12 };
				try {
					var21 = particle.getClass()
							.getConstructor(World.class, double.class, double.class, double.class, double.class, double.class, double.class)
							.newInstance(args);
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				}

				mc.effectRenderer.addEffect(var21);
				return var21;
			}
		}
		return null;
	}
	
	public static Particle spawnParticleAtEntity(Particle particle, Entity ent, Random rand) {
		return ParticleSpawner.spawnParticle(particle, ent.posX, ent.posY, ent.posZ, rand.nextDouble(), rand.nextDouble(), rand.nextDouble());
	}
}
