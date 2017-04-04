package com.slugterra.block;

import com.slugterra.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class SlugterraGrassBlock extends Block{

	protected SlugterraGrassBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
	}

	public IIcon Side0;
	public IIcon Side1;
	public IIcon Side2;
	public IIcon Side3;
	public IIcon Side4;
	public IIcon Side5;
	
	public void registerBlockIcons(IIconRegister icon){
		Side0 = icon.registerIcon(Strings.MODID + ":dirt");
		Side1 = icon.registerIcon(Strings.MODID + ":dirt_top");
		Side2 = icon.registerIcon(Strings.MODID + ":dirt_side");
		Side3 = icon.registerIcon(Strings.MODID + ":dirt_side");
		Side4 = icon.registerIcon(Strings.MODID + ":dirt_side");
		Side5 = icon.registerIcon(Strings.MODID + ":dirt_side");
	}
	
	public IIcon getIcon(int side, int meta){
		if(side == 0){
			return Side0;
		}if(side == 1){
			return Side1;
		}if(side == 2){
			return Side2;
		}if(side == 3){
			return Side3;
		}if(side == 4){
			return Side4;
		}if(side == 5){
			return Side5;
		}
		return null;
	}
}
