package com.slugterra.entity.protoform;

import com.slugterra.entity.EntitySlug;
import com.slugterra.item.SlugItemRegistry;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;

public class EntityTazerling extends EntitySlug{

	public EntityTazerling(World world) {
		super(world);
		this.slugItem = SlugItemRegistry.tazerling;
	}
	
	public EntityTazerling(World world, String name) {
		super(world, name);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return new EntityTazerling(world);
	}
}
