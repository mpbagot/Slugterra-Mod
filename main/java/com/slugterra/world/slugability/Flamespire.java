package com.slugterra.world.slugability;
import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class Flamespire extends WorldGenerator {	
	public boolean generate(World world, Random rand, BlockPos pos) {
		new FlameSpire1().generate(world, rand, pos);
		return true;
	}
}
