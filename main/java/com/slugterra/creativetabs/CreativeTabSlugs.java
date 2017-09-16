package com.slugterra.creativetabs;

import com.slugterra.item.SlugItemRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabSlugs extends CreativeTabs {

	public CreativeTabSlugs(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(SlugItemRegistry.infernus);
	}

}
