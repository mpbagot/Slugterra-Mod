package com.slugterra.world;

import java.util.List;
import java.util.Random;

import com.slugterra.world.theDrop.TheDropStructure;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGeneratorTheDrop implements IWorldGenerator
{

	private boolean hasGenned;
	public static String genmess;

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.getDimension())
		{
		case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		}
	}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ)
	{
		TheDropStructure drops = new TheDropStructure();

		int i = chunkX + rand.nextInt(16);
		int k = chunkZ + rand.nextInt(16);
		int j = world.getHeight(i, k);
		
		if(!hasGenned) {
			// Attempt to generate. If successful, send out a message. If not, wait and try again later
			hasGenned = drops.generate(world, rand, new BlockPos(i, j - 20, k));
			if (hasGenned) {
				genmess = ("The Drop has spawned at: " + (i + 2) + "/" + j + "/" + (k + 9));
				// Alert players about the drop's location.
				List<EntityPlayer> players = world.playerEntities;
				for (int a = 0; a < players.size();a++)
				{
					EntityPlayer player = (EntityPlayer) players.get(a);
					player.sendMessage(new TextComponentString(genmess));
				}
			}
		}
	}
}