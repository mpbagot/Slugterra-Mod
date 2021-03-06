package com.slugterra.block;

import com.slugterra.block.tileentity.TileEntitySlugContainerBlock;

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
		dropSeat = new SlugterraDropBlock(Material.IRON);
		slimeRope = new SlugterraSlimeRope(Material.LEAVES);
		slugContainer = new TileEntitySlugContainerBlock(Material.IRON);
		slugterraGrass = new SlugterraGrassBlock(Material.GRASS);
		slugterraDirt = new SlugterraDirtBlock(Material.GROUND);
		mushroom = new SlugterraGlowingMushroom();
		slugterraIce = new SlugterraIceBlock();
		electricWall = new SlugterraElectricWallBlock();
	}
	public static void registerBlock(){
		GameRegistry.register(slugContainer);
		GameRegistry.register(dropSeat);
		GameRegistry.register(slugterraGrass);
		GameRegistry.register(slugterraDirt);
		GameRegistry.register(mushroom);
		GameRegistry.register(slugterraIce);
		GameRegistry.register(slimeRope);
		GameRegistry.register(electricWall);
	}	
}