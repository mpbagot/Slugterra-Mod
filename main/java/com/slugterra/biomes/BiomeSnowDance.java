package com.slugterra.biomes;

import com.slugterra.block.BlockRegistry;
import com.slugterra.entity.protoform.EntityPhosphoro;

import net.minecraft.init.Blocks;

public class BiomeSnowDance extends SlugterraBiomes{

	public static int deadness = 0;
	
	public BiomeSnowDance(BiomeProperties props){
		super(props);
		
		this.createBiomeDecorator();
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPhosphoro.class, 10, 5, 20));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityPhosphoro.class, 10, 5, 20));
		
		this.theBiomeDecorator.treesPerChunk = 0;
		this.theBiomeDecorator.grassPerChunk = 0;
		this.theBiomeDecorator.generateLakes = false;

		this.topBlock = BlockRegistry.slugterraIce.getDefaultState();
		this.fillerBlock = Blocks.PACKED_ICE.getDefaultState();
	}	
}
