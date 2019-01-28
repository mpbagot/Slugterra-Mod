package com.slugterra.biomes;

import net.minecraft.init.Blocks;

public class BiomeUnderTow extends SlugterraBiomes{

	public static int deadness = 0;
	
	public BiomeUnderTow(BiomeProperties props){
		super(props);
		
		this.theBiomeDecorator.treesPerChunk = 0;
		this.theBiomeDecorator.grassPerChunk = 0;
		this.theBiomeDecorator.sandPerChunk = 100;
		this.theBiomeDecorator.waterlilyPerChunk = 1;
		
		this.topBlock = Blocks.WATER.getDefaultState();
		this.fillerBlock = Blocks.WATER.getDefaultState();
	}	
}
