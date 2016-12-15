package com.slugterra.world.slugability;
import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
public class FlameSpire1 {
	public boolean generate(World world, Random par2Random, int x, int y, int z) {
		world.setBlock(x - 2, y + 0, z + 2, Blocks.fire, 0, 3);
		world.setBlock(x - 1, y + 0, z + 2, Blocks.fire, 0, 3);
		world.setBlock(x - 0, y + 0, z + 2, Blocks.fire, 0, 3);
		world.setBlock(x + 1, y + 0, z + 2, Blocks.fire, 0, 3);
		world.setBlock(x + 2, y + 0, z + 2, Blocks.fire, 0, 3);
		
		world.setBlock(x + 1, y + 0, z + 3, Blocks.fire, 0, 3);
		world.setBlock(x - 0, y + 0, z + 3, Blocks.fire, 0, 3);
		world.setBlock(x - 1, y + 0, z + 3, Blocks.fire, 0, 3);
		
		world.setBlock(x - 1, y + 0, z - 3, Blocks.fire, 0, 3);
		world.setBlock(x - 0, y + 0, z - 3, Blocks.fire, 0, 3);
		world.setBlock(x + 1, y + 0, z - 3, Blocks.fire, 0, 3);
		
		world.setBlock(x - 2, y + 0, z - 2, Blocks.fire, 0, 3);
		world.setBlock(x - 1, y + 0, z - 2, Blocks.fire, 0, 3);
		world.setBlock(x - 0, y + 0, z - 2, Blocks.fire, 0, 3);
		world.setBlock(x + 1, y + 0, z - 2, Blocks.fire, 0, 3);
		world.setBlock(x + 2, y + 0, z - 2, Blocks.fire, 0, 3);
		
		world.setBlock(x - 3, y + 0, z + 1, Blocks.fire, 0, 3);
		world.setBlock(x - 3, y + 0, z + 0, Blocks.fire, 0, 3);
		world.setBlock(x - 3, y + 0, z - 1, Blocks.fire, 0, 3);
		
		world.setBlock(x - 2, y + 0, z + 1, Blocks.fire, 0, 3);
		world.setBlock(x - 2, y + 0, z + 0, Blocks.fire, 0, 3);
		world.setBlock(x - 2, y + 0, z - 1, Blocks.fire, 0, 3);
		
		world.setBlock(x + 3, y + 0, z + 1, Blocks.fire, 0, 3);
		world.setBlock(x + 3, y + 0, z + 0, Blocks.fire, 0, 3);
		world.setBlock(x + 3, y + 0, z - 1, Blocks.fire, 0, 3);
		
		world.setBlock(x + 2, y + 0, z + 1, Blocks.fire, 0, 3);
		world.setBlock(x + 2, y + 0, z + 0, Blocks.fire, 0, 3);
		world.setBlock(x + 2, y + 0, z - 1, Blocks.fire, 0, 3);
		return true;
	}
}
