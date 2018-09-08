package com.slugterra.render;

import com.slugterra.item.ItemRegistry;
import com.slugterra.item.SlugItemRegistry;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ItemRenderRegistry {

	public static void registerItemRenderers(FMLPreInitializationEvent e) {
		registerItemRenderer(e, ItemRegistry.slugtubeItem);
		registerItemRenderer(e, ItemRegistry.slugfood);
		registerItemRenderer(e, ItemRegistry.torpedoShell);
		
		registerItemRenderer(e, ItemRegistry.defenderBlaster);
		registerItemRenderer(e, ItemRegistry.shinaiBlaster);
		registerItemRenderer(e, ItemRegistry.junjieBlaster);
		registerItemRenderer(e, ItemRegistry.primeBlasterFemale);
		registerItemRenderer(e, ItemRegistry.primeBlasterMale);
		
		registerItemRenderer(e, ItemRegistry.chestplate);
		
		registerItemRenderer(e, ItemRegistry.blasterHandle);
		registerItemRenderer(e, ItemRegistry.fusionCore);
		registerItemRenderer(e, ItemRegistry.frontBarrel);
		registerItemRenderer(e, ItemRegistry.shanaiBlasterEnd);
		
		registerItemRenderer(e, SlugItemRegistry.infernus);
		registerItemRenderer(e, SlugItemRegistry.jellyish);
		registerItemRenderer(e, SlugItemRegistry.lariat);
		registerItemRenderer(e, SlugItemRegistry.makobreaker);
		registerItemRenderer(e, SlugItemRegistry.negashade);
		registerItemRenderer(e, SlugItemRegistry.phosphoro);
		registerItemRenderer(e, SlugItemRegistry.armashelt);
		registerItemRenderer(e, SlugItemRegistry.dirturchin);
		registerItemRenderer(e, SlugItemRegistry.hexlet);
		registerItemRenderer(e, SlugItemRegistry.boondoc);
		registerItemRenderer(e, SlugItemRegistry.tazerling);
		registerItemRenderer(e, SlugItemRegistry.flaringo);
		registerItemRenderer(e, SlugItemRegistry.grenuke);
		registerItemRenderer(e, SlugItemRegistry.slicksilver);
		registerItemRenderer(e, SlugItemRegistry.enigmo);
		registerItemRenderer(e, SlugItemRegistry.ramstone);
	}
	
	public static void registerItemRenderer(FMLPreInitializationEvent e, Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
