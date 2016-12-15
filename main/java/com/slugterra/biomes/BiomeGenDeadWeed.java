package com.slugterra.biomes;

import net.minecraft.world.biome.BiomeGenBase;

import com.slugterra.block.SlugterraBlocks;
import com.slugterra.entity.protoform.EntityLariat;

public class BiomeGenDeadWeed extends SlugterraBiomes{

	public static int deadness = 0;
	
	public BiomeGenDeadWeed(int id){
		super(id);
		
		this.spawnableCreatureList.removeAll(spawnableCreatureList);

		this.theBiomeDecorator.treesPerChunk = 0;
		this.theBiomeDecorator.grassPerChunk = 0;
		this.theBiomeDecorator.generateLakes = false;
		
		this.setDisableRain();
		this.heightVariation = 0.5F;
	}	
}
