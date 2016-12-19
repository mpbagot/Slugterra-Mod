package com.slugterra.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class VelocitySlugItem {

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


	public static void initialiseItem(){
		infernusVel = new Item().setFull3D().setUnlocalizedName("InfernusVel");
		phosphoroVel = new Item().setFull3D().setUnlocalizedName("PhosphoroVel");
		lariatVel = new Item().setFull3D().setUnlocalizedName("LariatVel");
		makobreakerVel = new Item().setFull3D().setUnlocalizedName("MakoBreakerVel");
		armasheltVel = new Item().setFull3D().setUnlocalizedName("ArmasheltVel");
		ramstoneVel = new Item().setFull3D().setUnlocalizedName("RamstoneVel");
		tazerlingVel = new Item().setFull3D().setUnlocalizedName("TazerlingVel");

	}
	public static void registerItem(){
		GameRegistry.registerItem(infernusVel, infernusVel.getUnlocalizedName());
		GameRegistry.registerItem(phosphoroVel, phosphoroVel.getUnlocalizedName());
		GameRegistry.registerItem(lariatVel, lariatVel.getUnlocalizedName());
		GameRegistry.registerItem(makobreakerVel, makobreakerVel.getUnlocalizedName());
		GameRegistry.registerItem(armasheltVel, armasheltVel.getUnlocalizedName());
		GameRegistry.registerItem(ramstoneVel, ramstoneVel.getUnlocalizedName());
		GameRegistry.registerItem(tazerlingVel, tazerlingVel.getUnlocalizedName());

	}

}
