package com.slugterra.main;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

import com.slugterra.model.slingers.ModelSlingerArmour;


public class ServerProxy
{
	private Minecraft mc;
	
	private static final ModelSlingerArmour tutChest = new ModelSlingerArmour();
	private static final ModelSlingerArmour tutLegs = new ModelSlingerArmour();

	public void registerRenderThings() {}

	public void generateBlasterPuff(Entity entity){}
	public void spawnElementalParticles(World world, EntityFX entity){}
		
	public ModelBiped getArmorModel(int id)
	{
		switch (id)
		{
			case 0: return tutChest;
			case 1: return tutLegs;
			default: break;
		}
		return tutChest;
	}
}
