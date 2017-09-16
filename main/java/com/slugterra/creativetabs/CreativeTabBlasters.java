package com.slugterra.creativetabs;

import com.slugterra.item.ItemRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabBlasters extends CreativeTabs {

	public CreativeTabBlasters(String lable) {
		super(lable);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemRegistry.defenderBlaster);
	}

}
