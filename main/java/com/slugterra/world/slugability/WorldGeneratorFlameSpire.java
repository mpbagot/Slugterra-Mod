package com.slugterra.world.slugability;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import com.slugterra.biomes.BiomeRegistry;
import com.slugterra.world.bullsEye.BullseyeArchGhoul;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorFlameSpire implements IWorldGenerator
{
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		generateSlugterra(world, random, chunkX, chunkZ);
	}

	public void generateSlugterra(World world, Random rand, int chunkX, int chunkZ) 
	{
		Flamespire flamespire = new Flamespire();
		int i = chunkX;
		int k = chunkZ;
		int j = world.getHeightValue(i, k);
		flamespire.generate(world, rand, i, j, k);
	}
}