package com.slugterra.biomes;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;

import com.slugterra.block.SlugterraBlocks;
import com.slugterra.world.WorldGenMushrooms;

public class BiomeGenHideout extends SlugterraBiomes{

	public static int deadness = 0;

	public BiomeGenHideout(int id){
		super(id);

		this.theBiomeDecorator.treesPerChunk = 3;
		this.theBiomeDecorator.bigMushroomsPerChunk = 2;
		this.theBiomeDecorator.grassPerChunk = 50;
		this.theBiomeDecorator.flowersPerChunk = 50;
		this.theBiomeDecorator.generateLakes = false;

		this.setDisableRain();
		this.heightVariation = 0.7F;
		
		if(deadness < 2){
			this.topBlock = Blocks.grass;
			this.fillerBlock = Blocks.dirt;
		}else if(deadness >= 2){
			this.topBlock = SlugterraBlocks.slugterraGrass;
			this.fillerBlock = SlugterraBlocks.slugterraDirt;
		}
	}
}
