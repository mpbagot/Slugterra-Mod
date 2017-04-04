package com.slugterra.biomes;

import com.slugterra.biomes.BiomeRegistry;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class SlugterraGenLayerBiome extends GenLayer {

	protected BiomeGenBase[] allowedBiomes = {BiomeRegistry.undertowCavern, BiomeRegistry.snowdanceCavern, BiomeRegistry.deadWeed, BiomeRegistry.bullseyeCavern, BiomeRegistry.quietlawnCavern, BiomeRegistry.hideoutCavern};

	public SlugterraGenLayerBiome(long seed, GenLayer genlayer) {
		super(seed);
		this.parent = genlayer;
	}

	public SlugterraGenLayerBiome(long seed) {
		super(seed);
	}

	@Override
	public int[] getInts(int x, int z, int width, int depth)
	{
		int[] dest = IntCache.getIntCache(width*depth);

		for (int dz=0; dz<depth; dz++)
		{
			for (int dx=0; dx<width; dx++)
			{
				this.initChunkSeed(dx+x, dz+z);
				dest[(dx+dz*width)] = this.allowedBiomes[nextInt(this.allowedBiomes.length)].biomeID;
			}
		}
		return dest;
	}
}