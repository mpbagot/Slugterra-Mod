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
		tabBlasters = new CreativeTabBlasters("BlasterTab");
		tabMisc = new CreativeTabMisc("MiscTab");
		
	}
}
