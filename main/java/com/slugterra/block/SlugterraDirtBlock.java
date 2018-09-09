package com.slugterra.block;

import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SlugterraDirtBlock extends Block{

	protected SlugterraDirtBlock(Material mat) {
		super(mat);
		setHardness(0.2F);
		setUnlocalizedName("slugterra_dirt");
		setRegistryName(Strings.MODID, "slugterra_dirt");
		setCreativeTab(SlugterraCreativeTabs.tabMisc);
	}
}
