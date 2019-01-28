package com.slugterra.biomes;

import com.slugterra.block.BlockRegistry;

import net.minecraft.init.Blocks;

public class BiomeBullsEye extends SlugterraBiomes{

	public static int deadness = 0;

	public BiomeBullsEye(BiomeProperties props){
		super(props);
		
		this.spawnableCreatureList.removeAll(this.spawnableCreatureList);

		this.theBiomeDecorator.treesPerChunk = 0;
		this.theBiomeDecorator.grassPerChunk = 0;
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
