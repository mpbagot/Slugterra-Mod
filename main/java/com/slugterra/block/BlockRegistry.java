package com.slugterra.block;

import com.slugterra.block.tileentity.TileEntityDropBlock;
import com.slugterra.block.tileentity.TileEntitySlugContainerBlock;
import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRegistry {

	public static void registerBlocks(){
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
//		dropSeat = new TileEntityDropBlock(Material.IRON);
//		slimeRope = new SlugterraSlimeRope(Material.LEAVES);
//		slugContainer = new TileEntitySlugContainerBlock(Material.IRON);//.setBlockTextureName(Strings.MODID + ":slugcontainer");
		slugterraGrass = new SlugterraGrassBlock(Material.GRASS);
		slugterraDirt = new SlugterraDirtBlock(Material.GROUND);
//		mushroom = new SlugterraBioluminescentMushroom();//.setBlockTextureName(Strings.MODID + ":mushroom");
//		slugterraIce = new SlugterraIceBlock().setUnlocalizedName("slug_ice");//.setBlockTextureName(Strings.MODID + ":ice");
		electricWall = new SlugterraElectricWallBlock();
	}
	public static void registerBlock(){
//		GameRegistry.register(slugContainer.setRegistryName(slugContainer.getUnlocalizedName().substring(5)));
//		GameRegistry.register(dropSeat.setRegistryName(dropSeat.getUnlocalizedName().substring(5)));
		GameRegistry.register(slugterraGrass);
		GameRegistry.register(slugterraDirt);
//		GameRegistry.register(mushroom.setRegistryName(mushroom.getUnlocalizedName().substring(5)));
//		GameRegistry.register(slugterraIce.setRegistryName(slugterraIce.getUnlocalizedName().substring(5)));
//		GameRegistry.register(slimeRope);
		GameRegistry.register(electricWall);
	}	
}