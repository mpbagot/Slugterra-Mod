package com.slugterra.creativetabs;

import com.slugterra.item.SlugsTube;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabSlugs extends CreativeTabs {

	public CreativeTabSlugs(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return SlugsTube.infernus;
	}

}
