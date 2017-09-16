package com.slugterra.world;

import java.util.Random;

import com.slugterra.biomes.BiomeRegistry;
import com.slugterra.world.greatForge.GreatForgeStructure;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGeneratorGreatForge implements IWorldGenerator
{

	public static boolean hasGenned = false;

	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.getDimension())
		{
		case 73:
			if (!hasGenned){
				generateSlugterra(world, random, chunkX*16, chunkZ*16);
			}
			break;
		}
	}

	private void generateSlugterra(World world, Random rand, int chunkX, int chunkZ) 
	{
		GreatForgeStructure forge = new GreatForgeStructure();

		for(int x = 0;x<2;x++)
		{
			int i = chunkX + rand.nextInt(16);
			int k = chunkZ + rand.nextInt(16);
			for (int m = 50;m<80;m++){
				//TODO find a way to get a block
				if(world.getBlock(new BlockPos(i, m, k)) == Blocks.GRASS){
					int j = m;
					if((rand.nextInt(1000000) + 1) <= 100000){
						boolean place = world.getBiome(new BlockPos(i,j,k)) == BiomeRegistry.deadWeed;
						if(place){
							if (!hasGenned){
								hasGenned = true;
								System.out.println(i + "/" + j  + "/" + k);
								forge.generate(world, rand, i, j - 3, k);
							}
						}
					}
				}
			}
		}
	}
}