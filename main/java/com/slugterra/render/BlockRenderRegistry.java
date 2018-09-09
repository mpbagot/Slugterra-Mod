package com.slugterra.render;

import com.slugterra.block.BlockRegistry;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegistry {
	public static void registerBlockRenderers() {
		register(BlockRegistry.dropSeat);
		register(BlockRegistry.electricWall);
		register(BlockRegistry.mushroom);
		register(BlockRegistry.slimeRope);
//		register(BlockRegistry.slugContainer);
		register(BlockRegistry.slugterraDirt);
		register(BlockRegistry.slugterraGrass);
		register(BlockRegistry.slugterraIce);
	}
	
	public static void register(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
