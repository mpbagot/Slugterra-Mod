package com.slugterra.block;

import java.util.Random;

import com.slugterra.creativetabs.SlugterraCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SlugterraBioluminescentMushroom extends BlockBush implements IGrowable
{
	protected SlugterraBioluminescentMushroom()
	{
		float f = 0.2F;
		this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
		this.setTickRandomly(true);
		this.setLightLevel(1.0F);
		setHardness(0.3F);
		setRegistryName("MushroomSlugterra");
		setCreativeTab(SlugterraCreativeTabs.tabMisc);
	}

	/**
	 * Ticks the block if it's been scheduled
	 */
	@Override
	public void updateTick(World world, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random rand)
	{
		if (rand.nextInt(25) == 0)
		{
			byte b0 = 4;
			int l = 5;
			int i1;
			int j1;
			int k1;

			for (i1 = p_149674_2_ - b0; i1 <= p_149674_2_ + b0; ++i1)
			{
				for (j1 = p_149674_4_ - b0; j1 <= p_149674_4_ + b0; ++j1)
				{
					for (k1 = p_149674_3_ - 1; k1 <= p_149674_3_ + 1; ++k1)
					{
						if (world.getBlock(i1, k1, j1) == this)
						{
							--l;

							if (l <= 0)
							{
								return;
							}
						}
					}
				}
			}

			i1 = p_149674_2_ + rand.nextInt(3) - 1;
			j1 = p_149674_3_ + rand.nextInt(2) - rand.nextInt(2);
			k1 = p_149674_4_ + rand.nextInt(3) - 1;

			for (int l1 = 0; l1 < 4; ++l1)
			{
				if (world.isAirBlock(new BlockPos(i1, j1, k1)) && this.canBlockStay(world, i1, j1, k1))
				{
					p_149674_2_ = i1;
					p_149674_3_ = j1;
					p_149674_4_ = k1;
				}

				i1 = p_149674_2_ + rand.nextInt(3) - 1;
				j1 = p_149674_3_ + rand.nextInt(2) - rand.nextInt(2);
				k1 = p_149674_4_ + rand.nextInt(3) - 1;
			}

			if (world.isAirBlock(new BlockPos(i1, j1, k1)) && this.canBlockStay(world, i1, j1, k1))
			{
				world.setBlock(i1, j1, k1, this, 0, 2);
			}
		}
	}

	/**
	 * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
	 */
	@Override
	public boolean canPlaceBlockAt(World world, int posX, int posY, int posZ)
	{
		return super.canPlaceBlockAt(world, posX, posY, posZ) && this.canBlockStay(world, posX, posY, posZ);
	}

	/**
	 * is the block grass, dirt or farmland
	 */
	@Override
	protected boolean canPlaceBlockOn(Block block)
	{
		return block == Blocks.grass || block == Blocks.dirt || block == SlugterraBlocks.slugterraDirt || block == SlugterraBlocks.slugterraGrass;
	}

	/**
	 * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
	 */
	@Override
	public boolean canBlockStay(World world, int posX, int posY, int posZ)
	{
		if (posY >= 0 && posY < 256)
		{
			Block block = world.getBlock(posX, posY - 1, posZ);
			return block == Blocks.grass || block == Blocks.dirt || block == SlugterraBlocks.slugterraDirt || block == SlugterraBlocks.slugterraGrass;
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean func_149851_a(World p_149851_1_, int p_149851_2_,
			int p_149851_3_, int p_149851_4_, boolean p_149851_5_) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean func_149852_a(World p_149852_1_, Random p_149852_2_,
			int p_149852_3_, int p_149852_4_, int p_149852_5_) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void func_149853_b(World p_149853_1_, Random p_149853_2_,
			int p_149853_3_, int p_149853_4_, int p_149853_5_) {
		// TODO Auto-generated method stub
		
	}
}