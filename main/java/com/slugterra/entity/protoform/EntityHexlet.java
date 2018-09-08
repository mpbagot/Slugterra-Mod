package com.slugterra.entity.protoform;

import com.slugterra.entity.EntitySlug;
import com.slugterra.item.SlugItemRegistry;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;

public class EntityHexlet extends EntitySlug{

	public EntityHexlet(World p_i1738_1_) {
		super(p_i1738_1_);
		this.slugItem = SlugItemRegistry.hexlet;
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return new EntityHexlet(world);
	}
}
