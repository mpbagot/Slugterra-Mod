package com.slugterra.biomes;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

import com.slugterra.block.SlugterraBlocks;
import com.slugterra.entity.protoform.EntityLariat;

public class BiomeGenChillBoreCavern extends SlugterraBiomes{

	public static int deadness = 0;

	public BiomeGenChillBoreCavern(int id){
		super(id);

		this.spawnableCreatureList.removeAll(this.spawnableCreatureList);

		this.theBiomeDecorator.treesPerChunk = 0;
		this.theBiomeDecorator.grassPerChunk = 0;
		this.theBiomeDecorator.generateLakes = true;

		this.setDisableRain();
		this.heightVariation = -0.1F;
		
		if(deadness < 2){
			this.topBlock = Blocks.grass;
			this.fillerBlock = Blocks.dirt;
		}else if(deadness >= 2){
			this.topBlock = SlugterraBlocks.slugterraGrass;
			this.fillerBlock = SlugterraBlocks.slugterraDirt;
		}
	}
}
