package com.slugterra.world;

import java.util.Random;

import com.slugterra.biomes.BiomeRegistry;
import com.slugterra.block.BlockRegistry;
import com.slugterra.world.bullsEye.BullseyeArchGhoul;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGeneratorBullseyeGhoul implements IWorldGenerator
{

	public static boolean hasGenned = false;

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.getDimension())
		{
		case 73:
			if (!hasGenned){ generateSlugterra(world, random, chunkX*16, chunkZ*16); }
			break;
		}
	}

	private void generateSlugterra(World world, Random rand, int chunkX, int chunkZ) 
	{
		BullseyeArchGhoul bullseye = new BullseyeArchGhoul();

		int i = chunkX + rand.nextInt(16);
		int k = chunkZ + rand.nextInt(16);
		
		for (int m = 50;m < 80;m++)
		{
			if (world.getBlockState(new BlockPos(i, m, k)).getBlock() == BlockRegistry.slugterraGrass) {
				if ((rand.nextInt(1000) + 1) <= 100) {
					boolean place = world.getBiomeForCoordsBody(new BlockPos(i, m, k)) == BiomeRegistry.bullseyeCavern;
					if (place && !hasGenned){
						hasGenned = true;
						System.out.println(i + "/" + (m + 1) + "/" + k);
						bullseye.generate(world, rand, new BlockPos(i, m + 1, k));
					}
				}
			}
		}
	}
}