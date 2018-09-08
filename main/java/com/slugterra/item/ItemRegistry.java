package com.slugterra.item;

import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.lib.Strings;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemRegistry {

	public static void registerItems(){
		initialiseItem();
		registerItem();
	}
	
	public static ArmorMaterial slugArmorMaterial = EnumHelper.addArmorMaterial("slugarmor", Strings.MODID+":slugbelt", 15, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	
	public static Item slugtubeItem;
	public static Item torpedoShell;
	public static Item slugfood;
	//blasters
	public static Item defenderBlaster;
	public static Item shinaiBlaster;
	public static Item junjieBlaster;
	public static Item primeBlasterMale;
	public static Item primeBlasterFemale;
	//armour pieces
	public static Item chestplate;
	//Blaster Pieces
	public static Item blasterHandle;
	public static Item fusionCore;
	public static Item frontBarrel;
	public static Item shanaiBlasterEnd;
	
	public static void initialiseItem(){
		slugtubeItem = new Item().setFull3D().setUnlocalizedName("slug_tube")
				.setCreativeTab(SlugterraCreativeTabs.tabMisc);
		
		slugfood = new Item().setUnlocalizedName("slug_food")
				.setCreativeTab(SlugterraCreativeTabs.tabMisc);
		
		torpedoShell = new Item().setUnlocalizedName("torpedo_tube")
				.setCreativeTab(SlugterraCreativeTabs.tabMisc);
		
		defenderBlaster = new DefenderBlaster("blaster");
		
		shinaiBlaster = new DefenderBlaster("shinai_blaster");
		
		junjieBlaster = new DefenderBlaster("junjie_blaster");
		
		primeBlasterMale = new DefenderBlaster("prime_blaster_male");
		
		primeBlasterFemale = new DefenderBlaster("prime_blaster_fem");

		chestplate = new SlingerArmour("slinger_chestplate", slugArmorMaterial, 1, EntityEquipmentSlot.CHEST)
				.setCreativeTab(SlugterraCreativeTabs.tabBlasters);
		
		//blaster pieces
		blasterHandle = new Item().setUnlocalizedName("blaster_handle").setCreativeTab(SlugterraCreativeTabs.tabMisc);
		fusionCore = new Item().setUnlocalizedName("fusion_core").setCreativeTab(SlugterraCreativeTabs.tabMisc);
		frontBarrel = new Item().setUnlocalizedName("blaster_barrel").setCreativeTab(SlugterraCreativeTabs.tabMisc);
		shanaiBlasterEnd = new Item().setUnlocalizedName("shanai_blaster_end").setCreativeTab(SlugterraCreativeTabs.tabMisc);
	}
	
	public static void registerItem(){
		GameRegistry.register(slugtubeItem.setRegistryName(slugtubeItem.getUnlocalizedName().substring(5)));
		GameRegistry.register(torpedoShell.setRegistryName(torpedoShell.getUnlocalizedName().substring(5)));
		GameRegistry.register(slugfood.setRegistryName(slugfood.getUnlocalizedName().substring(5)));
		
		GameRegistry.register(defenderBlaster.setRegistryName(defenderBlaster.getUnlocalizedName().substring(5)));
		GameRegistry.register(shinaiBlaster.setRegistryName(shinaiBlaster.getUnlocalizedName().substring(5)));
		GameRegistry.register(junjieBlaster.setRegistryName(junjieBlaster.getUnlocalizedName().substring(5)));
		GameRegistry.register(primeBlasterMale.setRegistryName(primeBlasterMale.getUnlocalizedName().substring(5)));
		GameRegistry.register(primeBlasterFemale.setRegistryName(primeBlasterFemale.getUnlocalizedName().substring(5)));
		
		GameRegistry.register(chestplate.setRegistryName(chestplate.getUnlocalizedName().substring(5)));
		
		GameRegistry.register(blasterHandle.setRegistryName(blasterHandle.getUnlocalizedName().substring(5)));
		GameRegistry.register(fusionCore.setRegistryName(fusionCore.getUnlocalizedName().substring(5)));
		GameRegistry.register(frontBarrel.setRegistryName(frontBarrel.getUnlocalizedName().substring(5)));
		GameRegistry.register(shanaiBlasterEnd.setRegistryName(shanaiBlasterEnd.getUnlocalizedName().substring(5)));
	}
	
}
