package com.slugterra.world;

import java.util.Random;

import com.slugterra.block.BlockRegistry;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenMushrooms implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.getDimension())
		{
		case 73:
			generateSlugterra(world, random, chunkX*16, chunkZ*16);
			break;
		}
	}

	private void generateSlugterra(World world, Random rand, int chunkX, int chunkZ) 
	{
		for(int x = 0;x<2;x++)
		{
			int i = chunkX + rand.nextInt(16);
			int k = chunkZ + rand.nextInt(16);
			for (int m = 50;m<125;m++){
				if(world.getBlockState(new BlockPos(i, m, k)).getBlock() == BlockRegistry.slugterraGrass || world.getBlockState(new BlockPos(i, m, k)).getBlock() == Blocks.GRASS){
					world.setBlockState(new BlockPos(i, m + 1, k), BlockRegistry.mushroom.getDefaultState());
				}
			}
		}
	}
}