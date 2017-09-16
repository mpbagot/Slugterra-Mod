package com.slugterra.world;

import java.util.List;
import java.util.Random;

import com.slugterra.world.theDrop.TheDropStructure;

import net.minecraft.entity.player.EntityPlayer;
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

		for(int x = 0;x<2;x++)
		{
			int i = chunkX + rand.nextInt(16);
			int k = chunkZ + rand.nextInt(16);
			int j = world.getHeight(i, k);
			if(!hasGenned){
				genmess = ("The Drop Is Spawning At: " + i + "/" + j + "/" + k);
				//tell players the generation message here
				List players = world.playerEntities;
				for (int a = 0; a< players.size();a++){
					EntityPlayer player = (EntityPlayer) players.get(a);
					//TODO FIX THIS!!!
					//player.addChatMessage(new ChatComponentText(genmess));
				}
				hasGenned = true;
				drops.generate(world, rand, i, j-20, k);
			}
		}

	}
}