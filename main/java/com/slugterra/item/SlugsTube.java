package com.slugterra.item;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.item.slugs.ItemSlug;
import com.slugterra.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class SlugsTube {

	public static void mainRegistry(){
		initialiseItem();
		registerItem();
	}
	
	public static Item infernus;
	public static Item jellyish;
	public static Item lariat;
	public static Item makobreaker;
	public static Item negashade;
	public static Item phosphoro;
	public static Item armashelt;
	public static Item dirturchin;
	public static Item hexlet;
	public static Item boondoc;
	public static Item tazerling;
	public static Item flaringo;
	public static Item grenuke;
	public static Item slicksilver;
	public static Item enigmo;
	
	public static void initialiseItem(){
		infernus = new ItemSlug().setUnlocalizedName("InfernusIn").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		jellyish = new ItemSlug().setUnlocalizedName("JellyishIn").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		lariat = new ItemSlug().setUnlocalizedName("LariatIn").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		makobreaker = new ItemSlug().setUnlocalizedName("MakoBreakerIn").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		negashade = new ItemSlug().setUnlocalizedName("NegashadeIn").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		phosphoro = new ItemSlug().setUnlocalizedName("PhosphoroIn").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		armashelt = new ItemSlug().setUnlocalizedName("ArmasheltIn").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		dirturchin = new ItemSlug().setUnlocalizedName("DirtUrchinIn").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		hexlet = new ItemSlug().setUnlocalizedName("HexletIn").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		boondoc = new ItemSlug().setUnlocalizedName("BoonDocIn").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		tazerling = new ItemSlug().setUnlocalizedName("TazerlingIn").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		flaringo = new ItemSlug().setUnlocalizedName("FlaringoIn").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		grenuke = new ItemSlug().setUnlocalizedName("GrenukeIn").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		slicksilver = new ItemSlug().setUnlocalizedName("SlickSilverIn").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		enigmo = new ItemSlug().setUnlocalizedName("EnigmoIn").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
	}
	public static void registerItem(){
		GameRegistry.registerItem(infernus, infernus.getUnlocalizedName());
		GameRegistry.registerItem(jellyish, jellyish.getUnlocalizedName());
		GameRegistry.registerItem(lariat, lariat.getUnlocalizedName());
		GameRegistry.registerItem(makobreaker, makobreaker.getUnlocalizedName());
		GameRegistry.registerItem(negashade, negashade.getUnlocalizedName());
		GameRegistry.registerItem(phosphoro, phosphoro.getUnlocalizedName());
		GameRegistry.registerItem(armashelt, armashelt.getUnlocalizedName());
		GameRegistry.registerItem(dirturchin, dirturchin.getUnlocalizedName());
		GameRegistry.registerItem(hexlet, hexlet.getUnlocalizedName());
		GameRegistry.registerItem(boondoc, boondoc.getUnlocalizedName());
		GameRegistry.registerItem(tazerling, tazerling.getUnlocalizedName());
		GameRegistry.registerItem(flaringo, flaringo.getUnlocalizedName());
		GameRegistry.registerItem(grenuke, grenuke.getUnlocalizedName());
		GameRegistry.registerItem(slicksilver, slicksilver.getUnlocalizedName());
		GameRegistry.registerItem(enigmo, enigmo.getUnlocalizedName());

	}
	
}
