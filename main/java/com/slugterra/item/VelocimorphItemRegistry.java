package com.slugterra.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VelocimorphItemRegistry {

	public static void mainRegistry(){
		initialiseItem();
		registerItem();
	}

	public static Item infernusVel;
	public static Item phosphoroVel;
	public static Item makobreakerVel;
	public static Item lariatVel;
	public static Item armasheltVel;
	public static Item ramstoneVel;
	public static Item tazerlingVel;
	public static Item grenukeVel;
	
	public static Item bolt;
	public static Item lightBall;


	public static void initialiseItem(){
		infernusVel = new Item().setFull3D().setUnlocalizedName("infernus_vel");
		phosphoroVel = new Item().setFull3D().setUnlocalizedName("phosphoro_vel");
		lariatVel = new Item().setFull3D().setUnlocalizedName("lariat_vel");
		makobreakerVel = new Item().setFull3D().setUnlocalizedName("makobreaker_vel");
		armasheltVel = new Item().setFull3D().setUnlocalizedName("armashelt_vel");
		ramstoneVel = new Item().setFull3D().setUnlocalizedName("ramstone_vel");
		tazerlingVel = new Item().setFull3D().setUnlocalizedName("tazerling_vel");
		grenukeVel = new Item().setFull3D().setUnlocalizedName("grenuke_vel");
		
		bolt = new Item().setFull3D().setUnlocalizedName("light_bolt");
		lightBall = new Item().setFull3D().setUnlocalizedName("light_ball");

	}
	public static void registerItem(){
		GameRegistry.register(infernusVel.setRegistryName(infernusVel.getUnlocalizedName().substring(5)));
		GameRegistry.register(phosphoroVel.setRegistryName(phosphoroVel.getUnlocalizedName().substring(5)));
		GameRegistry.register(lariatVel.setRegistryName(lariatVel.getUnlocalizedName().substring(5)));
		GameRegistry.register(makobreakerVel.setRegistryName(makobreakerVel.getUnlocalizedName().substring(5)));
		GameRegistry.register(armasheltVel.setRegistryName(armasheltVel.getUnlocalizedName().substring(5)));
		GameRegistry.register(ramstoneVel.setRegistryName(ramstoneVel.getUnlocalizedName().substring(5)));
		GameRegistry.register(tazerlingVel.setRegistryName(tazerlingVel.getUnlocalizedName().substring(5)));
		GameRegistry.register(grenukeVel.setRegistryName(grenukeVel.getUnlocalizedName().substring(5)));
		
		GameRegistry.register(bolt.setRegistryName(bolt.getUnlocalizedName().substring(5)));
		GameRegistry.register(lightBall.setRegistryName(lightBall.getUnlocalizedName().substring(5)));

	}

}
