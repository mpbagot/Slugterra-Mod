package com.slugterra.dimension;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class TeleporterSlugterra extends Teleporter {

	private final WorldServer worldServerInstance;
	private final Random random;
	
	public TeleporterSlugterra(WorldServer world) {
		super(world);

		this.worldServerInstance = world;
		this.random = new Random(world.getSeed());
	}
	
	@Override
	public boolean makePortal(Entity ent)
	{
		return false;
	}
}
