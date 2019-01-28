package com.slugterra.world.hideout;
import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
public class ShaneHideout28 {
public boolean generate(World world, Random par2Random, BlockPos pos) {
      world.setBlockState(pos.add(23, 57, 67), Blocks.GRASS.getDefaultState());
      world.setBlockState(pos.add(24, 57, 67), Blocks.GRASS.getDefaultState());
      world.setBlockState(pos.add(25, 57, 67), Blocks.GRASS.getDefaultState());
      world.setBlockState(pos.add(26, 57, 67), Blocks.GRASS.getDefaultState());
      world.setBlockState(pos.add(27, 57, 67), Blocks.GRASS.getDefaultState());
      world.setBlockState(pos.add(24, 57, 68), Blocks.GRASS.getDefaultState());
      world.setBlockState(pos.add(25, 57, 68), Blocks.GRASS.getDefaultState());
      world.setBlockState(pos.add(26, 57, 68), Blocks.GRASS.getDefaultState());
return true;
  }
}
