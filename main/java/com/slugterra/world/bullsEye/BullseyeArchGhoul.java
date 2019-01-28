package com.slugterra.world.bullsEye;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BullseyeArchGhoul extends WorldGenerator {
	public Block[] whitelist = {Blocks.DIRT, Blocks.STONE};
	public int xDim = 8;
	public int yDim = 12;
	public int zDim = 17;
	public int solids = 80;
	public int nonsolids = 60;
	
	public boolean checkSpawn(World world, int x, int y, int z) {
		int solidBlocksInPlatform = 0, freeBlocksInSpace = 0;
		for (int i = 0; i < xDim; ++i)
			for (int k = 0; k < zDim; ++k) {
				BlockPos pos = new BlockPos(x + i, y - 1, z + k);
				IBlockState testBlock = world.getBlockState(pos);
				if (testBlock.getBlock() != Blocks.AIR && !testBlock.getBlock().isReplaceable(world, pos))
					solidBlocksInPlatform++;
				for (int j = 0; j < yDim; ++j) {
					BlockPos posj = new BlockPos(x + i, y +j, z + k);
					if (world.isAirBlock(posj) || world.getBlockState(posj).getBlock().isReplaceable(world, posj));
						freeBlocksInSpace++;
				}
			}
		return Math.round((freeBlocksInSpace / (xDim * zDim * yDim)) * 100.0f) > solids && Math.round((solidBlocksInPlatform / xDim * zDim) * 100.0f) > nonsolids;
	}
	
	public boolean generate(World par1World, Random par2Random, BlockPos pos) {
		//if(checkSpawn(par1World, par3, par4, par5)) {
			new BullseyeArchGhoul1().generate(par1World, par2Random, pos);
			return true;
		//} else return false;
	}
}
