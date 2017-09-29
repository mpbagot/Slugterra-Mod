package com.slugterra.block;

import com.slugterra.creativetabs.SlugterraCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SlugterraGrassBlock extends Block{

	protected SlugterraGrassBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		setHardness(0.2F);
		setUnlocalizedName("slugterra_grass");
		setRegistryName(getUnlocalizedName().substring(5));
		setCreativeTab(SlugterraCreativeTabs.tabMisc);
	}
}
