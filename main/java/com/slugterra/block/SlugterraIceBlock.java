package com.slugterra.block;

import java.util.Random;

import com.slugterra.creativetabs.SlugterraCreativeTabs;

import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SlugterraIceBlock extends BlockBreakable
{
    public SlugterraIceBlock()
    {
        super(Material.ICE, false);
        this.slipperiness = 0.98F;
        this.setUnlocalizedName("slug_ice");
        this.setRegistryName(this.getUnlocalizedName().substring(5));
        this.setLightLevel(0.6F);
        this.setTickRandomly(true);
        this.setCreativeTab(SlugterraCreativeTabs.tabMisc);
    }

    /**
     * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
     */
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
    
    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random p_149745_1_)
    {
        return 0;
    }

    /**
     * Ticks the block if it's been scheduled
     */
    @Override
    public void updateTick(World world, BlockPos pos, IBlockState state, Random p_149674_5_)
    {
    	if (world.getLightFor(EnumSkyBlock.BLOCK, pos) > 11 - this.getDefaultState().getLightOpacity(world, pos))
        {
            if (!world.provider.isSurfaceWorld())
            {
                world.setBlockToAir(pos);
                return;
            }

            this.dropBlockAsItem(world, pos, state, 0);
            world.setBlockState(pos, Blocks.WATER.getDefaultState());
        }
    }

    /**
     * Returns the mobility information of the block, 0 = free, 1 = can't push but can move over, 2 = total immobility
     * and stop pistons
     */
    public EnumPushReaction getMobilityFlag(IBlockState state)
    {
        return EnumPushReaction.NORMAL;
    }
}