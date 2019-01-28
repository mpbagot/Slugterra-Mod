package com.slugterra.world.slugability;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGeneratorFlameSpire implements IWorldGenerator
{
	public void generate(World world, Random random, int chunkX, int chunkZ) {
		Flamespire flamespire = new Flamespire();
		flamespire.generate(world, random, new BlockPos(chunkX, world.getHeight(chunkX, chunkZ), chunkZ));	
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {}
}