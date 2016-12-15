package com.slugterra.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

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
	
	
	public static void initialiseItem(){
		infernusVel = new Item().setFull3D().setUnlocalizedName("InfernusVel");
		phosphoroVel = new Item().setFull3D().setUnlocalizedName("PhosphoroVel");
		lariatVel = new Item().setFull3D().setUnlocalizedName("LariatVel");
		makobreakerVel = new Item().setFull3D().setUnlocalizedName("MakoBreakerVel");
		armasheltVel = new Item().setFull3D().setUnlocalizedName("ArmasheltVel");
		
	}
	public static void registerItem(){
		GameRegistry.registerItem(infernusVel, infernusVel.getUnlocalizedName());
		GameRegistry.registerItem(phosphoroVel, phosphoroVel.getUnlocalizedName());
		GameRegistry.registerItem(lariatVel, lariatVel.getUnlocalizedName());
		GameRegistry.registerItem(makobreakerVel, makobreakerVel.getUnlocalizedName());
		GameRegistry.registerItem(armasheltVel, armasheltVel.getUnlocalizedName());

	}
	
}
