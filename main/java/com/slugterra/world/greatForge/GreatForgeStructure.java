package com.slugterra.world.greatForge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.init.Blocks;
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
	public boolean checkSpawn(World world, int x, int y, int z) {
		int solidBlocksInPlatform = 0, freeBlocksInSpace = 0;
		for (int i = 0; i < xDim; ++i)
			for (int k = 0; k < zDim; ++k) {
				if (world.getBlock(x + i, y - 1, z + k) != Blocks.air && whitelist.contains(world.getBlock(x + i, y - 1, z + k)) && !world.getBlock(x + i, y - 1, z + k).getMaterial().isReplaceable())
					solidBlocksInPlatform++;
				for (int j = 0; j < yDim; ++j) {
					if (world.isAirBlock(x + i, y + j, z + k) || world.getBlock(x + i, y + j, z + k).getMaterial().isReplaceable())
						freeBlocksInSpace++;
				}
			}
		return Math.round((freeBlocksInSpace / (xDim * zDim * yDim)) * 100.0f) > solids && Math.round((solidBlocksInPlatform / xDim * zDim) * 100.0f) > nonsolids;
	}
	public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5) {
		//if(checkSpawn(par1World, par3, par4, par5)) {
			new GreatWesternForgeStructure1().generate(par1World, par2Random, par3, par4, par5);
			new GreatWesternForgeStructure2().generate(par1World, par2Random, par3, par4, par5);
			new GreatWesternForgeStructure3().generate(par1World, par2Random, par3, par4, par5);
			new GreatWesternForgeStructure4().generate(par1World, par2Random, par3, par4, par5);
			new GreatWesternForgeStructure5().generate(par1World, par2Random, par3, par4, par5);
			new GreatWesternForgeStructure6().generate(par1World, par2Random, par3, par4, par5);
			new GreatWesternForgeStructure7().generate(par1World, par2Random, par3, par4, par5);
			new GreatWesternForgeStructure8().generate(par1World, par2Random, par3, par4, par5);
			new GreatWesternForgeStructure9().generate(par1World, par2Random, par3, par4, par5);
			new GreatWesternForgeStructure10().generate(par1World, par2Random, par3, par4, par5);
			new GreatWesternForgeStructure11().generate(par1World, par2Random, par3, par4, par5);
			new GreatWesternForgeStructure12().generate(par1World, par2Random, par3, par4, par5);
			return true;
		//} 
			//else return false;
	}
}
