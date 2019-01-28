package com.slugterra.biomes;

import java.util.Random;

import net.minecraft.block.BlockTallGrass;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;

public class SlugterraBiomes extends Biome {
	
	public SlugterraBiomes(BiomeProperties biomeProps) {
		super(biomeProps);
	}

	@Override
	public WorldGenerator getRandomWorldGenForGrass(Random random)
	{
		if (random.nextInt(4) == 0)
			return new WorldGenTallGrass(BlockTallGrass.EnumType.FERN);
		else
			return new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
	}
}
