package com.slugterra.world;

import java.util.Random;

import com.slugterra.block.SlugterraBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenMushrooms implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.dimensionId)
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
				if(world.getBlock(i, m, k) == SlugterraBlocks.slugterraGrass || world.getBlock(i, m, k) == Blocks.grass){
					int j = m+1;
					world.setBlock(i, j, k, SlugterraBlocks.mushroom, 0, 2);
				}
			}
		}
	}
}