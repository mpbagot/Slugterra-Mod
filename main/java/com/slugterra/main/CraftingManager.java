package com.slugterra.main;


import com.slugterra.item.ItemRegistry;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingManager {
	
	public static void registerCrafting(){
		addCraftingRecipes();
		addSmeltingRecipes();
	}
	
	public static void addCraftingRecipes(){
		
		//Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.fusionCore, 4), new Object[]{"I#I", "#I#", "I#I", 'I', Items.IRON_INGOT, '#', Items.DIAMOND});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.slugtubeItem, 10), new Object[]{" I ", " # ", " I ", '#', Items.DIAMOND, 'I', Items.IRON_INGOT});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.chestplate, 1), new Object[]{" ST", "STS", "TS ", 'S', Items.STRING, 'T', ItemRegistry.slugtubeItem});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.defenderBlaster, 1), new Object[]{"F  ", "TIC", "F H", 'F', ItemRegistry.frontBarrel, 'T', ItemRegistry.slugtubeItem, 'I', Items.IRON_INGOT, 'C', ItemRegistry.fusionCore, 'H', ItemRegistry.blasterHandle});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.shanaiBlasterEnd, 2), new Object[]{"FT "," C ", " S ", 'F', ItemRegistry.frontBarrel, 'C', ItemRegistry.fusionCore, 'T', ItemRegistry.slugtubeItem, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.boonx2Blaster, 1), new Object[]{"  T"," S ","T  ",'S', Items.STICK, 'T', ItemRegistry.shanaiBlasterEnd});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.frontBarrel, 4), new Object[]{" LI","IIL","   ", 'L', Items.LAVA_BUCKET, 'I', Items.IRON_INGOT});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.blasterHandle, 2), new Object[]{"II ","S S"," II", 'I', Items.IRON_INGOT, 'S', Items.STICK});
		
		//Shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.slugfood, 5), new Object[]{Items.WHEAT, Items.SUGAR, Items.POTATO, Items.CARROT});
	}
	public static void addSmeltingRecipes(){
		
	}
}
