package com.slugterra.biomes;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

import com.slugterra.block.SlugterraBlocks;
import com.slugterra.entity.protoform.EntityPhosphoro;

public class BiomeGenSnowDance extends SlugterraBiomes{

	public static int deadness = 0;
	
	public BiomeGenSnowDance(int id){
		super(id);
		
		this.createBiomeDecorator();
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPhosphoro.class, 10, 5, 20));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityPhosphoro.class, 10, 5, 20));
		
		this.theBiomeDecorator.treesPerChunk = 0;
		this.theBiomeDecorator.grassPerChunk = 0;
		this.theBiomeDecorator.generateLakes = false;

		this.getEnableSnow();
		this.setTemperatureRainfall(0.2F, 5.0F);
		this.topBlock = SlugterraBlocks.slugterraIce;
		this.fillerBlock = Blocks.packed_ice;
		
		this.setDisableRain();
		this.heightVariation = -0.1F;
	}	
}
