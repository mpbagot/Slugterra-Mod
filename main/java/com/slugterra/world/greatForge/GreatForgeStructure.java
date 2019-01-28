package com.slugterra.world.greatForge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class GreatForgeStructure extends WorldGenerator {
	public List<Integer> whitelist = getListOnArray(0, 1, 2, 3);
	public int xDim = 48;
	public int yDim = 40;
	public int zDim = 69;
	public int solids = 80;
	public int nonsolids = 60;
	public List<Integer> getListOnArray(int... ints) {
		List<Integer> intList = new ArrayList<Integer>();
		for(int i : ints) {
			intList.add(i);
		}
		return intList;
	}
	
	public boolean checkSpawn(World world, BlockPos pos) {
		int solidBlocksInPlatform = 0, freeBlocksInSpace = 0;
		for (int i = 0; i < xDim; ++i)
			for (int k = 0; k < zDim; ++k) {
				if (world.getBlockState(pos.add(i, -1, k)).getBlock() != Blocks.AIR && whitelist.contains(world.getBlockState(pos.add(i, -1, k)).getBlock()) && !world.getBlockState(pos.add(i, -1, k)).getMaterial().isReplaceable())
					solidBlocksInPlatform++;
				for (int j = 0; j < yDim; ++j) {
					if (world.isAirBlock(pos.add(i, j, k)) || world.getBlockState(pos.add(i, j, k)).getMaterial().isReplaceable())
						freeBlocksInSpace++;
				}
			}
		return Math.round((freeBlocksInSpace / (xDim * zDim * yDim)) * 100.0f) > solids && Math.round((solidBlocksInPlatform / xDim * zDim) * 100.0f) > nonsolids;
	}
	
	@Override
	public boolean generate(World par1World, Random par2Random, BlockPos pos) {
		//if (checkSpawn(par1World, pos)) {
			new GreatWesternForgeStructure1().generate(par1World, par2Random, pos);
			new GreatWesternForgeStructure2().generate(par1World, par2Random, pos);
			new GreatWesternForgeStructure3().generate(par1World, par2Random, pos);
			new GreatWesternForgeStructure4().generate(par1World, par2Random, pos);
			new GreatWesternForgeStructure5().generate(par1World, par2Random, pos);
			new GreatWesternForgeStructure6().generate(par1World, par2Random, pos);
			new GreatWesternForgeStructure7().generate(par1World, par2Random, pos);
			new GreatWesternForgeStructure8().generate(par1World, par2Random, pos);
			new GreatWesternForgeStructure9().generate(par1World, par2Random, pos);
			new GreatWesternForgeStructure10().generate(par1World, par2Random, pos);
			new GreatWesternForgeStructure11().generate(par1World, par2Random, pos);
			new GreatWesternForgeStructure12().generate(par1World, par2Random, pos);
			return true;
		//} 
			//else return false;
	}
}
