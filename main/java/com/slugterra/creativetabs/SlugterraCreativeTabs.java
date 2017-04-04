package com.slugterra.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

public class SlugterraCreativeTabs {
	
	public static CreativeTabs tabSlugs;
	public static CreativeTabs tabSpawnEggs;
	public static CreativeTabs tabMisc;
	public static CreativeTabs tabBlasters;

	/**
	 * Registration of new Creative tabs.
	 */
	public static void initialiseTabs()
	{
		tabSlugs = new CreativeTabSlugs("SlugTab");
		tabMisc = new CreativeTabMisc("MiscTab");
		tabBlasters = new CreativeTabBlasters("BlasterTab");
	}
}
