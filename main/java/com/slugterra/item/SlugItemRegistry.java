package com.slugterra.item;

import com.slugterra.item.slugs.ItemSlug;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class SlugItemRegistry {

	public static void registerItems(){
		initialiseItem();
		registerItem();
	}

	public static ItemSlug infernus;
	public static ItemSlug jellyish;
	public static ItemSlug lariat;
	public static ItemSlug makobreaker;
	public static ItemSlug negashade;
	public static ItemSlug phosphoro;
	public static ItemSlug armashelt;
	public static ItemSlug dirturchin;
	public static ItemSlug hexlet;
	public static ItemSlug boondoc;
	public static ItemSlug tazerling;
	public static ItemSlug flaringo;
	public static ItemSlug grenuke;
	public static ItemSlug slicksilver;
	public static ItemSlug enigmo;
	public static ItemSlug ramstone;

	public static void initialiseItem(){
		infernus = new ItemSlug("infernus");
		jellyish = new ItemSlug("jellyish");
		lariat = new ItemSlug("lariat");
		makobreaker = new ItemSlug("makobreaker");
		negashade = new ItemSlug("negashade");
		phosphoro = new ItemSlug("phosphoro");
		armashelt = new ItemSlug("armashelt");
		dirturchin = new ItemSlug("dirt_urchin");
		hexlet = new ItemSlug("hexlet");
		boondoc = new ItemSlug("boon_doc");
		tazerling = new ItemSlug("tazerling");
		flaringo = new ItemSlug("flaringo");
		grenuke = new ItemSlug("grenuke");
		slicksilver = new ItemSlug("slick_silver");
		enigmo = new ItemSlug("enigmo");
		ramstone = new ItemSlug("ramstone");
	}
	public static void registerItem(){
		GameRegistry.register(infernus);
		GameRegistry.register(jellyish);
		GameRegistry.register(lariat);
		GameRegistry.register(makobreaker);
		GameRegistry.register(negashade);
		GameRegistry.register(phosphoro);
		GameRegistry.register(armashelt);
		GameRegistry.register(dirturchin);
		GameRegistry.register(hexlet);
		GameRegistry.register(boondoc);
		GameRegistry.register(tazerling);
		GameRegistry.register(flaringo);
		GameRegistry.register(grenuke);
		GameRegistry.register(slicksilver);
		GameRegistry.register(enigmo);
		GameRegistry.register(ramstone);

	}
}
