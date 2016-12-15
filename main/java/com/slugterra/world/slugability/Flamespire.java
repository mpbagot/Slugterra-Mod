package com.slugterra.world.slugability;
import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.slugterra.world.bullsEye.BullseyeArchGhoul1;
public class Flamespire extends WorldGenerator {	
	public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5) {
		new FlameSpire1().generate(par1World, par2Random, par3, par4, par5);
		return true;
	}
}
