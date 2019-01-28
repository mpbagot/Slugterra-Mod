package com.slugterra.biomes;

public class BiomeDeadWeed extends SlugterraBiomes {

	public static int deadness = 0;
	
	public BiomeDeadWeed(BiomeProperties props){
		super(props);
		
		this.spawnableCreatureList.removeAll(spawnableCreatureList);

		this.theBiomeDecorator.treesPerChunk = 0;
		this.theBiomeDecorator.grassPerChunk = 0;
		this.theBiomeDecorator.generateLakes = false;
	}	
}
