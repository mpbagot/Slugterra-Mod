package com.slugterra.world.slugability;
import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
public class FlameSpire1 {
	public boolean generate(World world, Random par2Random, BlockPos pos) {
		world.setBlockState(pos.add(-2, 0, 2), Blocks.FIRE.getDefaultState());
		world.setBlockState(pos.add(-1, 0, 2), Blocks.FIRE.getDefaultState());
		world.setBlockState(pos.add(0, 0, 2), Blocks.FIRE.getDefaultState());
		world.setBlockState(pos.add(1, 0, 2), Blocks.FIRE.getDefaultState());
		world.setBlockState(pos.add(2, 0, 2), Blocks.FIRE.getDefaultState());
		
		world.setBlockState(pos.add(1, 0, 3), Blocks.FIRE.getDefaultState());
		world.setBlockState(pos.add(0, 0, 3), Blocks.FIRE.getDefaultState());
		world.setBlockState(pos.add(-1, 0, 3), Blocks.FIRE.getDefaultState());
		
		world.setBlockState(pos.add(-1, 0, -3), Blocks.FIRE.getDefaultState());
		world.setBlockState(pos.add(0, 0, -3), Blocks.FIRE.getDefaultState());
		world.setBlockState(pos.add(1, 0, -3), Blocks.FIRE.getDefaultState());
		
		world.setBlockState(pos.add(-2, 0, -2), Blocks.FIRE.getDefaultState());
		world.setBlockState(pos.add(-1, 0, -2), Blocks.FIRE.getDefaultState());
		world.setBlockState(pos.add(0, 0, -2), Blocks.FIRE.getDefaultState());
		world.setBlockState(pos.add(1, 0, -2), Blocks.FIRE.getDefaultState());
		world.setBlockState(pos.add(2, 0, -2), Blocks.FIRE.getDefaultState());
		
		world.setBlockState(pos.add(-3, 0, 1), Blocks.FIRE.getDefaultState());
		world.setBlockState(pos.add(-3, 0, 0), Blocks.FIRE.getDefaultState());
		world.setBlockState(pos.add(-3, 0, -1), Blocks.FIRE.getDefaultState());
		
		world.setBlockState(pos.add(-2, 0, 1), Blocks.FIRE.getDefaultState());
		world.setBlockState(pos.add(-2, 0, 0), Blocks.FIRE.getDefaultState());
		world.setBlockState(pos.add(-2, 0, -1), Blocks.FIRE.getDefaultState());
		
		world.setBlockState(pos.add(3, 0, 1), Blocks.FIRE.getDefaultState());
		world.setBlockState(pos.add(3, 0, 0), Blocks.FIRE.getDefaultState());
		world.setBlockState(pos.add(3, 0, -1), Blocks.FIRE.getDefaultState());
		
		world.setBlockState(pos.add(2, 0, 1), Blocks.FIRE.getDefaultState());
		world.setBlockState(pos.add(2, 0, 0), Blocks.FIRE.getDefaultState());
		world.setBlockState(pos.add(2, 0, -1), Blocks.FIRE.getDefaultState());
		return true;
	}
}
