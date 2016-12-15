package com.slugterra.biomes;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;

public class SlugterraBiomes extends BiomeGenBase {

	/** The biome height */
	public static final BiomeGenBase.Height biomeHeight = new BiomeGenBase.Height(0.3F, 0.6F);

	public static BiomeGenBase bullseyeCavern;
	public static BiomeGenBase deadWeed;
	public static BiomeGenBase snowdanceCavern;
	public static BiomeGenBase undertowCavern;
	public static BiomeGenBase quietlawnCavern;
	public static BiomeGenBase hideoutCavern;
	private static BiomeGenBase biom;
	
	public SlugterraBiomes(int biomeId) {
		super(biomeId);
	}

	static {
		bullseyeCavern = new BiomeGenBullsEye(101).setBiomeName("Bullseye Cavern").setTemperatureRainfall(1.2F, 0.9F);
		deadWeed = new BiomeGenDeadWeed(102).setBiomeName("DeadWeed Cavern").setTemperatureRainfall(1.2F, 0.9F);
		snowdanceCavern = new BiomeGenSnowDance(103).setBiomeName("Snowdance Cavern").setTemperatureRainfall(1.2F, 0.9F);
		undertowCavern = new BiomeGenUnderTow(104).setBiomeName("Undertow Cavern").setTemperatureRainfall(1.2F, 0.9F);
		quietlawnCavern = new BiomeGenQuietLawn(105).setBiomeName("Quiet Lawn Cavern").setTemperatureRainfall(0.9F, 0.9F);
		hideoutCavern = new BiomeGenHideout(106).setBiomeName("Shane Hideout Cavern").setTemperatureRainfall(0.9F, 0.9F);
	}

	public WorldGenerator getRandomWorldGenForGrass(Random random)
	{
		if (random.nextInt(4) == 0)
			return new WorldGenTallGrass(Blocks.tallgrass, 2);
		else
			return new WorldGenTallGrass(Blocks.tallgrass, 1);
	}

	public static void registerWithBiomeDictionary()
	{
		BiomeDictionary.registerBiomeType(deadWeed, Type.NETHER);
		BiomeDictionary.registerBiomeType(snowdanceCavern, Type.SNOWY);
		BiomeDictionary.registerBiomeType(bullseyeCavern, Type.HILLS);
		BiomeDictionary.registerBiomeType(undertowCavern, Type.OCEAN);
		BiomeDictionary.registerBiomeType(quietlawnCavern, Type.PLAINS);
		BiomeDictionary.registerBiomeType(hideoutCavern, Type.FOREST);
		BiomeDictionary.registerAllBiomes();
	}

	@Override
	public void genTerrainBlocks(World p_150573_1_, Random p_150573_2_, Block[] p_150573_3_, byte[] p_150573_4_, int p_150573_5_, int p_150573_6_, double p_150573_7_) {
		genBiomeModdedTerrain(p_150573_1_, p_150573_2_, p_150573_3_, p_150573_4_, p_150573_5_, p_150573_6_, p_150573_7_);
	}

	/**
	 * Replaces custom Stone to allow top/filler blocks to work in dimension.
	 * 
	 * @param world
	 * @param random
	 * @param replacableBlock
	 * @param aByte
	 * @param x
	 * @param y
	 * @param z
	 */
	public void genBiomeModdedTerrain(World world, Random random, Block[] replacableBlock, byte[] aByte, int x, int y, double z)
	{
		Block block = this.topBlock;
		byte b0 = (byte) (this.field_150604_aj & 255);
		Block block1 = this.fillerBlock;
		int k = -1;
		int l = (int) (z / 3.0D + 3.0D + random.nextDouble() * 0.25D);
		int i1 = x & 15;
		int j1 = y & 15;
		BiomeGenBase oldbiome = SlugterraBiomes.bullseyeCavern;
		BiomeGenBase newbiome;
		int i3 = 0;
		int k1 = replacableBlock.length / 256;
		for (int l1 = 255; l1 >= 0; --l1)
		{
			int i2 = (j1 * 16 + i1) * k1 + l1;

			if (l1 <= 0 + random.nextInt(5))
			{
				replacableBlock[i2] = Blocks.bedrock;
			}

			else if (l1 > 125){
				if (l1 >= 133 - random.nextInt(5)){
					replacableBlock[i2] = Blocks.bedrock;
				}
				if(replacableBlock[i2] != Blocks.bedrock){
					if (world.getBiomeGenForCoords(x, (int)z) == SlugterraBiomes.snowdanceCavern){
						replacableBlock[i2] = Blocks.ice;
					}
					else{
						replacableBlock[i2] = Blocks.dirt;
					}
				}
			}

			else
			{
				Block block2 = replacableBlock[i2];

				if (block2 != null && block2.getMaterial() != Material.air)
				{
					if (block2 == Blocks.stone)
					{
						if (k == -1)
						{
							if (l <= 0)
							{
								block = Blocks.water;//TODO:changed from null
								b0 = 0;
								block1 = Blocks.stone;
							}
							else if (l1 >= 59 && l1 <= 64)
							{
								block = this.topBlock;
								b0 = (byte) (this.field_150604_aj & 255);
								block1 = this.fillerBlock;
							}

							if (l1 < 63 && (block == null || block.getMaterial() == Material.air))
							{
								if (this.getFloatTemperature(x, l1, y) < 0.15F)
								{
									block = Blocks.ice;
									b0 = 0;
								}
								else
								{
									block = Blocks.water;
									b0 = 0;
								}
							}

							k = l;

							/*if (l1 >= 56 && l1 <= 128){
								for (int a = -1; a < 2; a++){
									for (int b = -1; b < 2; b++){
										Block origblock = world.getBlock(x, y, (int)z);
										Block newblock = world.getBlock(x+a, y, (int)z+b);
										BiomeGenBase origbiome = world.getBiomeGenForCoords(x, (int)z);
										BiomeGenBase newbiome = world.getBiomeGenForCoords(x+a, (int)z+b);
										if (origblock != null && origblock == origbiome.topBlock){
											if (origbiome != newbiome){
												replacableBlock[i2] = Blocks.stone;
											}
										}
									}
								}
							}*/

							if (l1 >= 62)
							{
								replacableBlock[i2] = block;
								aByte[i2] = b0;
							}
							else if (l1 < 56 - l)
							{
								block = null;
								block1 = Blocks.stone;
								replacableBlock[i2] = Blocks.gravel;
							}

							else
							{
								replacableBlock[i2] = block1;
							}
						}
						else if (k > 0)
						{
							--k;
							replacableBlock[i2] = block1;

							if (k == 0 && block1 == Blocks.sand)
							{
								k = random.nextInt(4) + Math.max(0, l1 - 63);
								block1 = Blocks.sandstone;
							}
						}
					}
				}
				else
				{
					k = -1;
				}
			}


		}
	}

}
