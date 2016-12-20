package com.slugterra.block;

import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

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
		dropSeat = new TileEntityDropBlock(Material.iron).setBlockName("DropSeat").setCreativeTab(SlugterraCreativeTabs.tabMisc);
		slimeRope = new SlugterraSlimeRope(Material.grass).setBlockName("SlimeRope").setCreativeTab(SlugterraCreativeTabs.tabMisc);
		slugContainer = new TileEntitySlugContainerBlock(Material.iron).setBlockName("SlugContainer").setCreativeTab(SlugterraCreativeTabs.tabMisc).setBlockTextureName(Strings.MODID + ":slugcontainer");
		slugterraGrass = new SlugterraGrassBlock(Material.ground).setHardness(0.2F).setBlockName("SlugterraGrass").setCreativeTab(SlugterraCreativeTabs.tabMisc);
		slugterraDirt = new SlugterraDirtBlock(Material.ground).setHardness(0.2F).setBlockName("SlugterraDirt").setCreativeTab(SlugterraCreativeTabs.tabMisc).setBlockTextureName(Strings.MODID + ":dirt");
		mushroom = new SlugterraBioluminescentMushroom().setHardness(0.3F).setBlockName("MushroomSlugterra").setCreativeTab(SlugterraCreativeTabs.tabMisc).setBlockTextureName(Strings.MODID + ":mushroom");
		slugterraIce = new SlugterraIceBlock().setBlockName("SlugIce").setBlockTextureName(Strings.MODID + ":ice");
		electricWall = new SlugterraElectricWallBlock().setBlockName("ElectricWall").setBlockTextureName(Strings.MODID+":ewall");
	}
	public static void registerBlock(){
		GameRegistry.registerBlock(slugContainer, slugContainer.getUnlocalizedName());
		GameRegistry.registerBlock(dropSeat, dropSeat.getUnlocalizedName());
		GameRegistry.registerBlock(slugterraGrass, slugterraGrass.getUnlocalizedName());
		GameRegistry.registerBlock(slugterraDirt, slugterraDirt.getUnlocalizedName());
		GameRegistry.registerBlock(mushroom, mushroom.getUnlocalizedName());
		GameRegistry.registerBlock(slugterraIce, slugterraIce.getUnlocalizedName());
		GameRegistry.registerBlock(slimeRope, slimeRope.getUnlocalizedName());
		GameRegistry.registerBlock(electricWall, electricWall.getUnlocalizedName());
	}	
}