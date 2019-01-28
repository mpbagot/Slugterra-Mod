package com.slugterra.world.hideout;
import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
public class ShaneHideout extends WorldGenerator {

	public boolean generate(World world, Random rand, BlockPos pos) {
		new ShaneHideout1().generate(world, rand, pos);
		new ShaneHideout2().generate(world, rand, pos);
		new ShaneHideout3().generate(world, rand, pos);
		new ShaneHideout4().generate(world, rand, pos);
		new ShaneHideout5().generate(world, rand, pos);
		new ShaneHideout6().generate(world, rand, pos);
		new ShaneHideout7().generate(world, rand, pos);
		new ShaneHideout8().generate(world, rand, pos);
		new ShaneHideout9().generate(world, rand, pos);
		new ShaneHideout10().generate(world, rand, pos);
		new ShaneHideout11().generate(world, rand, pos);
		new ShaneHideout12().generate(world, rand, pos);
		new ShaneHideout13().generate(world, rand, pos);
		new ShaneHideout14().generate(world, rand, pos);
		new ShaneHideout15().generate(world, rand, pos);
		new ShaneHideout16().generate(world, rand, pos);
		new ShaneHideout17().generate(world, rand, pos);
		new ShaneHideout18().generate(world, rand, pos);
		new ShaneHideout19().generate(world, rand, pos);
		new ShaneHideout20().generate(world, rand, pos);
		new ShaneHideout21().generate(world, rand, pos);
		new ShaneHideout22().generate(world, rand, pos);
		new ShaneHideout23().generate(world, rand, pos);
		new ShaneHideout24().generate(world, rand, pos);
		new ShaneHideout25().generate(world, rand, pos);
		new ShaneHideout26().generate(world, rand, pos);
		new ShaneHideout27().generate(world, rand, pos);
		new ShaneHideout28().generate(world, rand, pos);
		return true;
	}
}
