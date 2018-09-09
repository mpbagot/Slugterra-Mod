package com.slugterra.block;

import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SlugterraGrassBlock extends Block{

	protected SlugterraGrassBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		setHardness(0.2F);
		setUnlocalizedName("slugterra_grass");
		setRegistryName(Strings.MODID, "slugterra_grass");
		setCreativeTab(SlugterraCreativeTabs.tabMisc);
	}
}
