package com.slugterra.block;

import com.slugterra.block.tileentity.TileEntitySlimeRopeEntity;
import com.slugterra.creativetabs.SlugterraCreativeTabs;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class SlugterraSlimeRope extends BlockContainer{
	
	private final AxisAlignedBB AABB = new AxisAlignedBB(0.3F, 0.0F, 0.3F, 0.7F, 1.0F, 0.7F);
	
	public SlugterraSlimeRope(Material material){
		super(material);
		this.setCreativeTab(SlugterraCreativeTabs.tabMisc);
		this.setUnlocalizedName("slime_rope");
		this.setRegistryName(getUnlocalizedName().substring(5));
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return AABB;
    }
	
	@Override
	public TileEntity createNewTileEntity(World world, int num){
		return new TileEntitySlimeRopeEntity();
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state){
		return false;
	}
	
	@Override
    public boolean isLadder(IBlockState state, IBlockAccess world, BlockPos pos, EntityLivingBase entity)
    {
        return true;
    }
	
}