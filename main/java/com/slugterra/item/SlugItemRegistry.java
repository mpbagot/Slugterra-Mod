package com.slugterra.item;

import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.item.slugs.ItemSlug;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SlugItemRegistry {

	public static void registerItems(){
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
	public static Item ramstone;

	public static void initialiseItem(){
		infernus = new ItemSlug().setUnlocalizedName("infernus_in").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		jellyish = new ItemSlug().setUnlocalizedName("jellyish_in").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		lariat = new ItemSlug().setUnlocalizedName("lariat_in").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		makobreaker = new ItemSlug().setUnlocalizedName("makobreaker_in").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		negashade = new ItemSlug().setUnlocalizedName("negashade_in").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		phosphoro = new ItemSlug().setUnlocalizedName("phosphoro_in").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		armashelt = new ItemSlug().setUnlocalizedName("armashelt_in").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		dirturchin = new ItemSlug().setUnlocalizedName("dirt_urchin_in").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		hexlet = new ItemSlug().setUnlocalizedName("hexlet_in").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		boondoc = new ItemSlug().setUnlocalizedName("boon_doc_in").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		tazerling = new ItemSlug().setUnlocalizedName("tazerling_in").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		flaringo = new ItemSlug().setUnlocalizedName("flaringo_in").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		grenuke = new ItemSlug().setUnlocalizedName("grenuke_in").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		slicksilver = new ItemSlug().setUnlocalizedName("slick_silver_in").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		enigmo = new ItemSlug().setUnlocalizedName("enigmo_in").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
		ramstone = new ItemSlug().setUnlocalizedName("ramstone_in").setCreativeTab(SlugterraCreativeTabs.tabSlugs);
	}
	public static void registerItem(){
		GameRegistry.register(infernus.setRegistryName(infernus.getUnlocalizedName().substring(5)));
		GameRegistry.register(jellyish.setRegistryName(jellyish.getUnlocalizedName().substring(5)));
		GameRegistry.register(lariat.setRegistryName(lariat.getUnlocalizedName().substring(5)));
		GameRegistry.register(makobreaker.setRegistryName(makobreaker.getUnlocalizedName().substring(5)));
		GameRegistry.register(negashade.setRegistryName(negashade.getUnlocalizedName().substring(5)));
		GameRegistry.register(phosphoro.setRegistryName(phosphoro.getUnlocalizedName().substring(5)));
		GameRegistry.register(armashelt.setRegistryName(armashelt.getUnlocalizedName().substring(5)));
		GameRegistry.register(dirturchin.setRegistryName(dirturchin.getUnlocalizedName().substring(5)));
		GameRegistry.register(hexlet.setRegistryName(hexlet.getUnlocalizedName().substring(5)));
		GameRegistry.register(boondoc.setRegistryName(boondoc.getUnlocalizedName().substring(5)));
		GameRegistry.register(tazerling.setRegistryName(tazerling.getUnlocalizedName().substring(5)));
		GameRegistry.register(flaringo.setRegistryName(flaringo.getUnlocalizedName().substring(5)));
		GameRegistry.register(grenuke.setRegistryName(grenuke.getUnlocalizedName().substring(5)));
		GameRegistry.register(slicksilver.setRegistryName(slicksilver.getUnlocalizedName().substring(5)));
		GameRegistry.register(enigmo.setRegistryName(enigmo.getUnlocalizedName().substring(5)));
		GameRegistry.register(ramstone.setRegistryName(ramstone.getUnlocalizedName().substring(5)));

	}
}
