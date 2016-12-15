package com.slugterra.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.lib.Strings;

public class TileEntitySlugContainerBlock extends BlockContainer{
	
	public TileEntitySlugContainerBlock(Material material){
		super(material);
		this.setCreativeTab(SlugterraCreativeTabs.tabMisc);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	}
	
	public TileEntity createNewTileEntity(World world, int num){
		return new TileEntitySlugContainerEntity();
	}
	
	@Override
	public int getRenderType(){
		return -1;
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	public void registerIcons(IIconRegister icon){
		this.blockIcon = icon.registerIcon(Strings.MODID + ":slugcontainer");
	}
}