package com.slugterra.biomes;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {

	public static void mainRegistry(){
		initializeBiome();
		registerBiome();
	}
	
	private static int biomeID = 100;

	public static Biome bullseyeCavern;
	public static Biome deadWeed;
	public static Biome snowdanceCavern;
	public static Biome undertowCavern;
	public static Biome quietlawnCavern;
	public static Biome hideoutCavern;
	
	private static void initializeBiome() {
		bullseyeCavern = new BiomeBullsEye(new BiomeProperties("Bullseye Cavern").setTemperature(1.2f).setRainDisabled().setHeightVariation(-0.1f));
		deadWeed = new BiomeDeadWeed(new BiomeProperties("Deadweed Cavern").setTemperature(1.2f).setRainDisabled().setHeightVariation(0.5f));
		snowdanceCavern = new BiomeSnowDance(new BiomeProperties("Snowdance Cavern").setTemperature(0.2f).setRainfall(5f).setSnowEnabled().setHeightVariation(-0.1f));
		undertowCavern = new BiomeUnderTow(new BiomeProperties("Undertow Cavern").setTemperature(1.2f).setRainDisabled().setHeightVariation(0f).setBaseHeight(-1f));
		quietlawnCavern = new BiomeQuietLawn(new BiomeProperties("Quiet Lawn Cavern").setTemperature(0.9f).setRainDisabled().setHeightVariation(-0.1f));
		hideoutCavern = new BiomeHideout(new BiomeProperties("Shane Hideout Cavern").setTemperature(0.9f).setRainDisabled().setHeightVariation(0.7f));
	}

	private static void registerBiome() {
		BiomeDictionary.addTypes(bullseyeCavern, Type.HILLS);
		BiomeDictionary.addTypes(deadWeed, Type.NETHER);
		BiomeDictionary.addTypes(snowdanceCavern, Type.SNOWY);
		BiomeDictionary.addTypes(undertowCavern, Type.OCEAN);
		BiomeDictionary.addTypes(quietlawnCavern, Type.PLAINS);
		BiomeDictionary.addTypes(hideoutCavern, Type.FOREST);
	
		Biome[] biomes = {BiomeRegistry.undertowCavern, BiomeRegistry.snowdanceCavern, BiomeRegistry.deadWeed, BiomeRegistry.bullseyeCavern, BiomeRegistry.quietlawnCavern, BiomeRegistry.hideoutCavern};
		for (Biome biome : biomes) {
			BiomeManager.addSpawnBiome(biome);
			Biome.registerBiome(biomeID++, biome.getBiomeName(), biome);
		}
	}
	
}
