package com.slugterra.main;

import com.slugterra.item.SlugterraItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	
	public static void mainRegistry(){
		addCraftingRecipes();
		addSmeltingRecipes();
	}
	
	public static void addCraftingRecipes(){
		
		//Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(SlugterraItems.fusionCore, 4), new Object[]{"I#I", "#I#", "I#I", 'I', Items.iron_ingot, '#', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(SlugterraItems.slugtubeItem, 10), new Object[]{" I ", " # ", " I ", '#', Items.diamond, 'I', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(SlugterraItems.chestplate, 1), new Object[]{" ST", "STS", "TS ", 'S', Items.string, 'T', SlugterraItems.slugtubeItem});
		GameRegistry.addRecipe(new ItemStack(SlugterraItems.defenderBlaster, 1), new Object[]{"F  ", "TIC", "F H", 'F', SlugterraItems.frontBarrel, 'T', SlugterraItems.slugtubeItem, 'I', Items.iron_ingot, 'C', SlugterraItems.fusionCore, 'H', SlugterraItems.blasterHandle});
		GameRegistry.addRecipe(new ItemStack(SlugterraItems.shanaiblasterend, 2), new Object[]{"FT "," C ", " S ", 'F', SlugterraItems.frontBarrel, 'C', SlugterraItems.fusionCore, 'T', SlugterraItems.slugtubeItem, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(SlugterraItems.shinaiblaster, 1), new Object[]{"  T"," S ","T  ",'S', Items.stick, 'T', SlugterraItems.shanaiblasterend});
		GameRegistry.addRecipe(new ItemStack(SlugterraItems.frontBarrel, 4), new Object[]{" LI","IIL","   ", 'L', Items.lava_bucket, 'I', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(SlugterraItems.blasterHandle, 2), new Object[]{"II ","S S"," II", 'I', Items.iron_ingot, 'S', Items.stick});
		
		//Shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(SlugterraItems.slugfood, 5), new Object[]{Items.wheat, Items.sugar, Items.potato, Items.carrot});
	}
	public static void addSmeltingRecipes(){
		
	}
}
