package com.slugterra.block;

import com.slugterra.creativetabs.SlugterraCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockMushroom;
import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class SlugterraBioluminescentMushroom extends BlockMushroom implements IGrowable
{
	private static float f = 0.2f;
	private static final AxisAlignedBB MUSHROOM_AABB = new AxisAlignedBB(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
	
	protected SlugterraBioluminescentMushroom()
	{
		this.setTickRandomly(true);
		this.setLightLevel(1.0F);
		setHardness(0.3F);
		setUnlocalizedName("slugterra_mushroom");
		setRegistryName(getUnlocalizedName().substring(5));
		setCreativeTab(SlugterraCreativeTabs.tabMisc);
	}
	
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return MUSHROOM_AABB;
    }

	/**
	 * is the block grass, dirt or farmland
	 */
	protected boolean canSustainBush(IBlockState state)
    {	
        Block block = state.getBlock();
		return block == Blocks.GRASS || block == Blocks.DIRT || block == BlockRegistry.slugterraDirt || block == BlockRegistry.slugterraGrass;
	}

	/**
	 * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
	 */
	@Override
	public boolean canBlockStay(World world, BlockPos pos, IBlockState state)
	{
		if (pos.getY() >= 0 && pos.getY() < 256)
		{
			Block block = world.getBlockState(pos.down()).getBlock();
			return block == Blocks.GRASS || block == Blocks.DIRT || block == BlockRegistry.slugterraDirt || block == BlockRegistry.slugterraGrass;
		}
		else
		{
			return false;
		}
	}
}