package com.slugterra.creativetabs;

import com.slugterra.item.ItemRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabMisc extends CreativeTabs {

	public CreativeTabMisc(String lable) {
		super(lable);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemRegistry.slugfood);
	}

}
