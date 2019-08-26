package com.slugterra.dimension;

import java.util.ArrayList;
import java.util.List;

import com.slugterra.biomes.BiomeRegistry;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeProviderSlugterra extends BiomeProvider
{
	private GenLayer myGenBiomes;
	private GenLayer myBiomeIndexLayer;
	private BiomeCache myBiomeCache;
	private List<Biome> myBiomesToSpawnIn;

	protected BiomeProviderSlugterra()
	{
		this.myBiomeCache = new BiomeCache(this);
		this.myBiomesToSpawnIn = new ArrayList<Biome>();
		this.myBiomesToSpawnIn.add(BiomeRegistry.bullseyeCavern);
		this.myBiomesToSpawnIn.add(BiomeRegistry.deadWeed);
		this.myBiomesToSpawnIn.add(BiomeRegistry.snowdanceCavern);
		this.myBiomesToSpawnIn.add(BiomeRegistry.undertowCavern);
		this.myBiomesToSpawnIn.add(BiomeRegistry.hideoutCavern);
		this.myBiomesToSpawnIn.add(BiomeRegistry.quietlawnCavern);
	}

	public BiomeProviderSlugterra(long seed, WorldType worldtype)
	{
		this();
		GenLayer[] agenlayer = GenLayerSlugterra.makeTheWorld(seed);
		agenlayer = getModdedBiomeGenerators(worldtype, seed, agenlayer);
		this.myGenBiomes = agenlayer[0];
		this.myBiomeIndexLayer = agenlayer[1];
	}

	public BiomeProviderSlugterra(World world)
	{
		this(world.getSeed(), world.getWorldInfo().getTerrainType());
	}

	/**
	 * Gets the list of valid biomes for the player to spawn in.
	 */
	@Override
	public List<Biome> getBiomesToSpawnIn()
	{
		return this.myBiomesToSpawnIn;
	}

	/**
	 * Returns the Biome related to the x, z position on the world.
	 */
	@Override
	public Biome getBiome(BlockPos pos)
	{
		if (pos.getX() == 0 && pos.getZ() == 0)
			return BiomeRegistry.hideoutCavern;
		Biome biome = this.myBiomeCache.getBiome(pos.getX(), pos.getY(), BiomeRegistry.hideoutCavern);
		return biome;
	}

	/**
	 * Return an adjusted version of a given temperature based on the y height
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public float getTemperatureAtHeight(float par1, int par2)
	{
		return par1;
	}

	/**
	 * Returns a list of temperatures to use for the specified blocks. Args:
	 * listToReuse, x, y, width, length
	 */
	
	/**
	 * Returns an array of biomes for the location input.
	 */
	@Override
	public Biome[] getBiomesForGeneration(Biome[] par1ArrayOfBiome, int par2, int par3, int par4, int par5) {
		IntCache.resetIntCache();

		if (par1ArrayOfBiome == null || par1ArrayOfBiome.length < par4 * par5) {
			par1ArrayOfBiome = new Biome[par4 * par5];
		}

		int[] aint = this.myGenBiomes.getInts(par2, par3, par4, par5);

		for (int i = 0; i < par4 * par5; ++i) {
			if (aint[i] >= 0) {
				par1ArrayOfBiome[i] = Biome.getBiome(aint[i]);
			} else {
				par1ArrayOfBiome[i] = BiomeRegistry.bullseyeCavern;
			}
		}

		return par1ArrayOfBiome;
	}

	/**
	 * Return a list of biomes for the specified blocks. Args: listToReuse, x,
	 * y, width, length, cacheFlag (if false, don't check biomeCache to avoid
	 * infinite loop in BiomeCacheBlock)
	 */
	@Override
	public Biome[] getBiomes(Biome[] biomes, int x, int y, int width, int length, boolean cacheFlag) {
		IntCache.resetIntCache();

		if (biomes == null || biomes.length < width * length) {
			biomes = new Biome[width * length];
		}

		if (cacheFlag && width == 16 && length == 16 && (x & 15) == 0 && (y & 15) == 0) {
			Biome[] aBiome1 = this.myBiomeCache.getCachedBiomes(x, y);
			System.arraycopy(aBiome1, 0, biomes, 0, width * length);
			return biomes;
		} else {
			int[] aint = this.myBiomeIndexLayer.getInts(x, y, width, length);

			for (int i = 0; i < width * length; ++i) {
				biomes[i] = Biome.getBiome(aint[i], BiomeRegistry.bullseyeCavern);
			}

			return biomes;
		}
	}

	/**
	 * checks given Chunk's Biomes against List of allowed ones
	 */
	@Override
	public boolean areBiomesViable(int par1, int par2, int par3, List<Biome> par4List) {
		IntCache.resetIntCache();
		int l = par1 - par3 >> 2;
		int i1 = par2 - par3 >> 2;
		int j1 = par1 + par3 >> 2;
		int k1 = par2 + par3 >> 2;
		int l1 = j1 - l + 1;
		int i2 = k1 - i1 + 1;
		int[] aint = this.myGenBiomes.getInts(l, i1, l1, i2);

		for (int j2 = 0; j2 < l1 * i2; ++j2) {
			Biome biome = Biome.getBiome(aint[j2]);

			if (!par4List.contains(biome)) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Calls the WorldChunkManager's biomeCache.cleanupCache()
	 */
	@Override
	public void cleanupCache()
	{
		this.myBiomeCache.cleanupCache();
	}
}