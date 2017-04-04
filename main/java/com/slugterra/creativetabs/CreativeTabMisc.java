package com.slugterra.creativetabs;

import com.slugterra.item.SlugterraItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMisc extends CreativeTabs {

	public CreativeTabMisc(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return SlugterraItems.slugfood;
	}

}
