package com.slugterra.block;

import com.slugterra.creativetabs.SlugterraCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SlugterraDirtBlock extends Block{

	protected SlugterraDirtBlock(Material mat) {
		super(mat);
		setHardness(0.2F);
		setUnlocalizedName("slugterra_dirt");
		setRegistryName(getUnlocalizedName().substring(5));
		setCreativeTab(SlugterraCreativeTabs.tabMisc);
	}
}
