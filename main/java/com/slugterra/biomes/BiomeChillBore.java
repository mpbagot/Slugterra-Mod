package com.slugterra.biomes;

import com.slugterra.block.BlockRegistry;

import net.minecraft.init.Blocks;

public class BiomeChillBore extends SlugterraBiomes{

	public static int deadness = 0;

	public BiomeChillBore(BiomeProperties props){
		super(props);

		this.spawnableCreatureList.removeAll(this.spawnableCreatureList);

		this.theBiomeDecorator.treesPerChunk = 0;
		this.theBiomeDecorator.grassPerChunk = 0;
		this.theBiomeDecorator.generateLakes = true;

//		this.setDisableRain();
//		this.heightVariation = -0.1F;
		
		if(deadness < 2){
			this.topBlock = Blocks.GRASS.getDefaultState();
			this.fillerBlock = Blocks.DIRT.getDefaultState();
		}else if(deadness >= 2){
			this.topBlock = BlockRegistry.slugterraGrass.getDefaultState();
			this.fillerBlock = BlockRegistry.slugterraDirt.getDefaultState();
		}
	}
}
