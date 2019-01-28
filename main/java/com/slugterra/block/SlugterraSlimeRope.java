package com.slugterra.block;

import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class SlugterraSlimeRope extends Block {
	
	private final AxisAlignedBB AABB = new AxisAlignedBB(0.3F, 0.0F, 0.3F, 0.7F, 1.0F, 0.7F);
	
	public SlugterraSlimeRope(Material material){
		super(material);
		this.setCreativeTab(SlugterraCreativeTabs.tabMisc);
		this.setUnlocalizedName("slime_rope");
		this.setRegistryName(Strings.MODID, "slime_rope");
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return AABB;
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