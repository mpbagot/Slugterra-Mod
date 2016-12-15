package com.slugterra.biomes;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

import com.slugterra.block.SlugterraBlocks;
import com.slugterra.entity.protoform.EntityLariat;

public class BiomeGenUnderTow extends SlugterraBiomes{

	public static int deadness = 0;
	
	public BiomeGenUnderTow(int id){
		super(id);
		
		
		this.theBiomeDecorator.treesPerChunk = 0;
		this.theBiomeDecorator.grassPerChunk = 0;
		this.theBiomeDecorator.sandPerChunk = 100;
		this.theBiomeDecorator.waterlilyPerChunk = 1;
		
		this.topBlock = Blocks.water;
		this.fillerBlock = Blocks.water;		
		
		this.setDisableRain();
		this.heightVariation = 0.0F;
		this.rootHeight = -1.0F;
	}	
}
