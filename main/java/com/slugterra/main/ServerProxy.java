package com.slugterra.main;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class ServerProxy extends CommonProxy
{

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}
	
	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}
	
	
//	private Minecraft mc;
//	

	public void registerRenderThings() {}
//
//	public void generateBlasterPuff(Entity entity){}
//	public void spawnElementalParticles(EntityVel e, World world, EntityFX entity){
//		EntityFX p = entity;
//		p.motionX = new Random().nextFloat()*2;
//		p.motionY = new Random().nextFloat()*2;
//		p.motionZ = new Random().nextFloat()*2;
//		p.setPosition(e.posX, e.posY, e.posZ);
//		world.spawnEntityInWorld(p);
//	}
//		
	
}
