package com.slugterra.item;

import com.slugterra.block.BlockRegistry;
import com.slugterra.block.SlugterraDirtBlock;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBlockRegistry {

	public static void registerBlocks(){
		initialiseBlock();
		registerBlock();
	}

	public static ItemBlock slugContainer;
	public static ItemBlock dropSeat;
	public static ItemBlock slimeRope;
	public static ItemBlock slugterraGrass;
	public static ItemBlock slugterraDirt;
	public static ItemBlock mushroom;
	public static ItemBlock slugterraIce;
	public static ItemBlock electricWall;

	public static void initialiseBlock(){
//		dropSeat = new ItemBlock(BlockRegistry.dropSeat);
//		slimeRope = new ItemBlock(BlockRegistry.slimeRope);
//		slugContainer = new ItemBlock(BlockRegistry.slugContainer);
		slugterraDirt = new ItemBlock(BlockRegistry.slugterraDirt);
		slugterraGrass = new ItemBlock(BlockRegistry.slugterraGrass);
		mushroom = new ItemBlock(BlockRegistry.mushroom);
		slugterraIce = new ItemBlock(BlockRegistry.slugterraIce);
		electricWall = new ItemBlock(BlockRegistry.electricWall);
	}
	
	public static void registerBlock(){
//		GameRegistry.register(slugContainer.setRegistryName(slugContainer.getUnlocalizedName().substring(5)));
//		GameRegistry.register(dropSeat.setRegistryName(dropSeat.getUnlocalizedName().substring(5)));
		GameRegistry.register(slugterraGrass.setUnlocalizedName("slugterra_grass").setRegistryName("slugterra_grass"));
		GameRegistry.register(slugterraDirt.setRegistryName(slugterraDirt.getUnlocalizedName().substring(5)));
		GameRegistry.register(mushroom.setRegistryName(mushroom.getUnlocalizedName().substring(5)));
		GameRegistry.register(slugterraIce.setRegistryName(slugterraIce.getUnlocalizedName().substring(5)));
//		GameRegistry.register(slimeRope.setRegistryName(slimeRope.getUnlocalizedName().substring(5)));
		GameRegistry.register(electricWall.setUnlocalizedName("electric_wall").setRegistryName("electric_wall"));
	}	
}