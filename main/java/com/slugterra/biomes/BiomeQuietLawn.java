package com.slugterra.biomes;

import com.slugterra.block.BlockRegistry;

import net.minecraft.init.Blocks;

public class BiomeQuietLawn extends SlugterraBiomes{

	public static int deadness = 0;

	public BiomeQuietLawn(BiomeProperties props){
		super(props);

		this.theBiomeDecorator.treesPerChunk = 1;
		this.theBiomeDecorator.grassPerChunk = 5;
		this.theBiomeDecorator.generateLakes = true;

		if(deadness < 2){
			this.topBlock = Blocks.GRASS.getDefaultState();
			this.fillerBlock = Blocks.DIRT.getDefaultState();
		}else if(deadness >= 2){
			this.topBlock = BlockRegistry.slugterraGrass.getDefaultState();
			this.fillerBlock = BlockRegistry.slugterraDirt.getDefaultState();
		}
	}
}
