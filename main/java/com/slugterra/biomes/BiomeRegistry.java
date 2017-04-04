package com.slugterra.biomes;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {

	public static void mainRegistry(){
		initializeBiome();
		registerBiome();
	}

	public static BiomeGenBase bullseyeCavern;
	public static BiomeGenBase deadWeed;
	public static BiomeGenBase snowdanceCavern;
	public static BiomeGenBase undertowCavern;
	public static BiomeGenBase quietlawnCavern;
	public static BiomeGenBase hideoutCavern;
	
	private static void initializeBiome() {
		bullseyeCavern = new BiomeGenBullsEye(101).setBiomeName("Bullseye Cavern").setTemperatureRainfall(1.2F, 0.9F);
		deadWeed = new BiomeGenDeadWeed(102).setBiomeName("DeadWeed Cavern").setTemperatureRainfall(1.2F, 0.9F);
		snowdanceCavern = new BiomeGenSnowDance(103).setBiomeName("Snowdance Cavern").setTemperatureRainfall(1.2F, 0.9F);
		undertowCavern = new BiomeGenUnderTow(104).setBiomeName("Undertow Cavern").setTemperatureRainfall(1.2F, 0.9F);
		quietlawnCavern = new BiomeGenQuietLawn(105).setBiomeName("Quiet Lawn Cavern").setTemperatureRainfall(0.9F, 0.9F);
		hideoutCavern = new BiomeGenHideout(106).setBiomeName("Shane Hideout Cavern").setTemperatureRainfall(0.9F, 0.9F);
	}

	private static void registerBiome() {
		
		BiomeDictionary.registerBiomeType(bullseyeCavern, Type.NETHER);
		BiomeManager.addSpawnBiome(bullseyeCavern);
		BiomeDictionary.registerBiomeType(deadWeed, Type.NETHER);
		BiomeManager.addSpawnBiome(deadWeed);
	}
	
}
