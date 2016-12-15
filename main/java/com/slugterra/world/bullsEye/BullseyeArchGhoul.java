package com.slugterra.world.bullsEye;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
public class BullseyeArchGhoul extends WorldGenerator {
	public Block[] whitelist = {Blocks.dirt, Blocks.stone};
	public int xDim = 8;
	public int yDim = 12;
	public int zDim = 17;
	public int solids = 80;
	public int nonsolids = 60;
	public List<Integer> getListOnArray(int... ints) {
		List<Integer> intList = new ArrayList<Integer>();
		for(int i : ints) {
			intList.add(i);
		}
		return intList;
	}
	public boolean checkSpawn(World world, int x, int y, int z) {
		int solidBlocksInPlatform = 0, freeBlocksInSpace = 0;
		for (int i = 0; i < xDim; ++i)
			for (int k = 0; k < zDim; ++k) {
				if (world.getBlock(x + i, y - 1, z + k) != Blocks.air  && !world.getBlock(x + i, y - 1, z + k).isReplaceable(world, x + i, y - 1, z + k))
					solidBlocksInPlatform++;
				for (int j = 0; j < yDim; ++j) {
					if (world.isAirBlock(x + i, y + j, z + k) || world.getBlock(x + i, y + j, z + k).isReplaceable(world, x+i, y+j, z+k));
						freeBlocksInSpace++;
				}
			}
		return Math.round((freeBlocksInSpace / (xDim * zDim * yDim)) * 100.0f) > solids && Math.round((solidBlocksInPlatform / xDim * zDim) * 100.0f) > nonsolids;
	}
	public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5) {
		//if(checkSpawn(par1World, par3, par4, par5)) {
			new BullseyeArchGhoul1().generate(par1World, par2Random, par3, par4, par5);
			return true;
		//} else return false;
	}
}
