package com.slugterra.biomes;

import com.slugterra.block.BlockRegistry;

import net.minecraft.init.Blocks;

public class BiomeHideout extends SlugterraBiomes{

	public static int deadness = 0;

	public BiomeHideout(BiomeProperties props){
		super(props);

		this.theBiomeDecorator.treesPerChunk = 3;
		this.theBiomeDecorator.bigMushroomsPerChunk = 2;
		this.theBiomeDecorator.grassPerChunk = 50;
		this.theBiomeDecorator.flowersPerChunk = 50;
		this.theBiomeDecorator.generateLakes = false;
		
		if(deadness < 2){
			this.topBlock = Blocks.GRASS.getDefaultState();
			this.fillerBlock = Blocks.DIRT.getDefaultState();
		}else if(deadness >= 2){
			this.topBlock = BlockRegistry.slugterraGrass.getDefaultState();
			this.fillerBlock = BlockRegistry.slugterraDirt.getDefaultState();
		}
	}
}
