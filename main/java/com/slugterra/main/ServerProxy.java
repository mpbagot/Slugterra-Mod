package com.slugterra.main;

import java.util.Random;

import com.slugterra.entity.velocity.EntityVel;
import com.slugterra.model.slingers.ModelSlingerArmour;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;


public class ServerProxy
{
	private Minecraft mc;
	
	private static final ModelSlingerArmour tutChest = new ModelSlingerArmour();
	private static final ModelSlingerArmour tutLegs = new ModelSlingerArmour();

	public void registerRenderThings() {}

	public void generateBlasterPuff(Entity entity){}
	public void spawnElementalParticles(EntityVel e, World world, EntityFX entity){
		EntityFX p = entity;
		p.motionX = new Random().nextFloat()*2;
		p.motionY = new Random().nextFloat()*2;
		p.motionZ = new Random().nextFloat()*2;
		p.setPosition(e.posX, e.posY, e.posZ);
		world.spawnEntityInWorld(p);
	}
		
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
