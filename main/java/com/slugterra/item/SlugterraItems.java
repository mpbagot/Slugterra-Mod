package com.slugterra.item;

import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class SlugterraItems {

	public static void mainRegistry(){
		initialiseItem();
		registerItem();
	}
	
	public static Item slugtubeItem;
	public static Item torpedoShell;
	public static Item slugfood;
	//blasters
	public static Item defenderBlaster;
	public static Item shinaiblaster;
	public static Item junjieBlaster;
	public static Item primeBlasterMale;
	public static Item primeBlasterFemale;
	//armour pieces
	public static Item chestplate;
	//Blaster Pieces
	public static Item blasterHandle;
	public static Item fusionCore;
	public static Item frontBarrel;
	public static Item shanaiblasterend;
	
	public static void initialiseItem(){
		slugtubeItem = new Item().setFull3D().setUnlocalizedName("SlugTube").setCreativeTab(SlugterraCreativeTabs.tabMisc).setTextureName(Strings.MODID + ":slugtube");
		slugfood = new Item().setUnlocalizedName("SlugFood").setCreativeTab(SlugterraCreativeTabs.tabMisc).setTextureName(Strings.MODID + ":slugfood");
		torpedoShell = new Item().setUnlocalizedName("TorpedoTube").setCreativeTab(SlugterraCreativeTabs.tabMisc).setTextureName(Strings.MODID + ":torpedo");
		defenderBlaster = new DefenderBlaster().setFull3D().setUnlocalizedName("Blaster").setCreativeTab(SlugterraCreativeTabs.tabBlasters).setMaxStackSize(1);
		shinaiblaster = new DefenderBlaster().setFull3D().setUnlocalizedName("ShinaiBlaster").setCreativeTab(SlugterraCreativeTabs.tabBlasters).setMaxStackSize(1);
		junjieBlaster = new DefenderBlaster().setFull3D().setUnlocalizedName("JunjieBlaster").setCreativeTab(SlugterraCreativeTabs.tabBlasters).setMaxStackSize(1);
		primeBlasterMale = new DefenderBlaster().setFull3D().setUnlocalizedName("PrimeBlasterMale").setCreativeTab(SlugterraCreativeTabs.tabBlasters).setMaxStackSize(1);
		primeBlasterFemale = new DefenderBlaster().setFull3D().setUnlocalizedName("PrimeBlasterFem").setCreativeTab(SlugterraCreativeTabs.tabBlasters).setMaxStackSize(1);
		
		chestplate = new SlingerArmour(ArmorMaterial.IRON, 4, 1).setUnlocalizedName("slingerChestplate").setTextureName(Strings.MODID + ":slingerChestplate").setCreativeTab(SlugterraCreativeTabs.tabBlasters);
		//blaster pieces
		blasterHandle = new Item().setUnlocalizedName("BlasterHandle").setTextureName(Strings.MODID + ":blasterhandle").setCreativeTab(SlugterraCreativeTabs.tabMisc);
		fusionCore = new Item().setUnlocalizedName("BlasterFusionCore").setTextureName(Strings.MODID + ":fusioncore").setCreativeTab(SlugterraCreativeTabs.tabMisc);
		frontBarrel = new Item().setUnlocalizedName("BlasterBarrel").setTextureName(Strings.MODID + ":frontbarrel").setCreativeTab(SlugterraCreativeTabs.tabMisc);
		shanaiblasterend = new Item().setUnlocalizedName("ShanaiBlasterEnd").setTextureName(Strings.MODID + ":shanblasterend").setCreativeTab(SlugterraCreativeTabs.tabMisc);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(slugtubeItem, slugtubeItem.getUnlocalizedName());
		GameRegistry.registerItem(slugfood, slugfood.getUnlocalizedName());
		GameRegistry.registerItem(torpedoShell, torpedoShell.getUnlocalizedName());
		
		GameRegistry.registerItem(defenderBlaster, defenderBlaster.getUnlocalizedName());
		GameRegistry.registerItem(shinaiblaster, shinaiblaster.getUnlocalizedName());
		GameRegistry.registerItem(junjieBlaster, junjieBlaster.getUnlocalizedName());
		GameRegistry.registerItem(primeBlasterFemale, primeBlasterFemale.getUnlocalizedName());
		GameRegistry.registerItem(primeBlasterMale, primeBlasterMale.getUnlocalizedName());
		
		GameRegistry.registerItem(chestplate, chestplate.getUnlocalizedName());
		
		GameRegistry.registerItem(blasterHandle, blasterHandle.getUnlocalizedName());
		GameRegistry.registerItem(fusionCore, fusionCore.getUnlocalizedName());
		GameRegistry.registerItem(frontBarrel, frontBarrel.getUnlocalizedName());
		GameRegistry.registerItem(shanaiblasterend, shanaiblasterend.getUnlocalizedName());
	}
	
}
