package com.slugterra.block;

import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SlugterraBlocks {

	public static void mainRegistry(){
		initialiseBlock();
		registerBlock();
	}

	public static Block slugContainer;
	public static Block dropSeat;
	public static Block slimeRope;
	public static Block slugterraGrass;
	public static Block slugterraDirt;
	public static Block mushroom;
	public static Block slugterraIce;
	public static Block electricWall;

	public static void initialiseBlock(){
		dropSeat = new TileEntityDropBlock(Material.IRON).setRegistryName("DropSeat").setCreativeTab(SlugterraCreativeTabs.tabMisc);
		slimeRope = new SlugterraSlimeRope(Material.GRASS).setRegistryName("SlimeRope").setCreativeTab(SlugterraCreativeTabs.tabMisc);
		slugContainer = new TileEntitySlugContainerBlock(Material.IRON).setRegistryName("SlugContainer").setCreativeTab(SlugterraCreativeTabs.tabMisc).setBlockTextureName(Strings.MODID + ":slugcontainer");
		slugterraGrass = new SlugterraGrassBlock(Material.GROUND).setHardness(0.2F).setRegistryName("SlugterraGrass").setCreativeTab(SlugterraCreativeTabs.tabMisc);
		slugterraDirt = new SlugterraDirtBlock(Material.GROUND).setHardness(0.2F).setRegistryName("SlugterraDirt").setCreativeTab(SlugterraCreativeTabs.tabMisc).setBlockTextureName(Strings.MODID + ":dirt");
		mushroom = new SlugterraBioluminescentMushroom().setHardness(0.3F).setRegistryName("MushroomSlugterra").setCreativeTab(SlugterraCreativeTabs.tabMisc).setBlockTextureName(Strings.MODID + ":mushroom");
		slugterraIce = new SlugterraIceBlock().setRegistryName("SlugIce").setBlockTextureName(Strings.MODID + ":ice");
		electricWall = new SlugterraElectricWallBlock().setRegistryName("ElectricWall").setBlockTextureName(Strings.MODID+":ewall");
	}
	public static void registerBlock(){
		GameRegistry.registerBlock(slugContainer, slugContainer.getRegistryName());
		GameRegistry.registerBlock(dropSeat, dropSeat.getRegistryName());
		GameRegistry.registerBlock(slugterraGrass, slugterraGrass.getRegistryName());
		GameRegistry.registerBlock(slugterraDirt, slugterraDirt.getRegistryName());
		GameRegistry.registerBlock(mushroom, mushroom.getRegistryName());
		GameRegistry.registerBlock(slugterraIce, slugterraIce.getRegistryName());
		GameRegistry.registerBlock(slimeRope, slimeRope.getRegistryName());
		GameRegistry.registerBlock(electricWall, electricWall.getRegistryName());
	}	
}