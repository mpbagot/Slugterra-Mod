package com.slugterra.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SlugterraElectricWallBlock extends Block
{
    public SlugterraElectricWallBlock()
    {
        super(Material.GLASS);
        this.slipperiness = 0.98F;
        this.setLightLevel(0.7F);
        this.setTickRandomly(true);
        this.fullBlock = false;
        this.setUnlocalizedName("electric_wall");
        this.setRegistryName(getUnlocalizedName().substring(5));
    }

    /**
     * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
     */
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }

        
    @Override
    public void updateTick(World world, BlockPos pos, IBlockState state, Random p_149674_5_)
    {
    	if (new Random().nextInt(10) == 7 || world.getLight(pos) > 11 - this.getLightOpacity(state, world, pos)){
    		world.setBlockToAir(pos);
    	}
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random p_149745_1_)
    {
        return 0;
    }

    /**
     * Returns the mobility information of the block, 0 = free, 1 = can't push but can move over, 2 = total immobility
     * and stop pistons
     */
    public int getMobilityFlag()
    {
        return 2;
    }
}