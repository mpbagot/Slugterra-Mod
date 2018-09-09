package com.slugterra.render;

import com.slugterra.item.ItemRegistry;
import com.slugterra.item.SlugItemRegistry;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class ItemRenderRegistry {

	public static void registerItemRenderers(FMLInitializationEvent e) {
		registerItemRenderer(ItemRegistry.slugtubeItem);
		registerItemRenderer(ItemRegistry.slugfood);
		registerItemRenderer(ItemRegistry.torpedoShell);
		
		registerItemRenderer(ItemRegistry.defenderBlaster);
		registerItemRenderer(ItemRegistry.shinaiBlaster);
		registerItemRenderer(ItemRegistry.junjieBlaster);
		registerItemRenderer(ItemRegistry.primeBlasterFemale);
		registerItemRenderer(ItemRegistry.primeBlasterMale);
		
		registerItemRenderer(ItemRegistry.chestplate);
		
		registerItemRenderer(ItemRegistry.blasterHandle);
		registerItemRenderer(ItemRegistry.fusionCore);
		registerItemRenderer(ItemRegistry.frontBarrel);
		registerItemRenderer(ItemRegistry.shanaiBlasterEnd);
		
		registerItemRenderer(SlugItemRegistry.infernus);
		registerItemRenderer(SlugItemRegistry.jellyish);
		registerItemRenderer(SlugItemRegistry.lariat);
		registerItemRenderer(SlugItemRegistry.makobreaker);
		registerItemRenderer(SlugItemRegistry.negashade);
		registerItemRenderer(SlugItemRegistry.phosphoro);
		registerItemRenderer(SlugItemRegistry.armashelt);
		registerItemRenderer(SlugItemRegistry.dirturchin);
		registerItemRenderer(SlugItemRegistry.hexlet);
		registerItemRenderer(SlugItemRegistry.boondoc);
		registerItemRenderer(SlugItemRegistry.tazerling);
		registerItemRenderer(SlugItemRegistry.flaringo);
		registerItemRenderer(SlugItemRegistry.grenuke);
		registerItemRenderer(SlugItemRegistry.slicksilver);
		registerItemRenderer(SlugItemRegistry.enigmo);
		registerItemRenderer(SlugItemRegistry.ramstone);
	}
	
	public static void registerItem/*Renderer*/(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	public static void registerItemRenderer/*Init*/(Item item) {
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		
		renderItem.getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
