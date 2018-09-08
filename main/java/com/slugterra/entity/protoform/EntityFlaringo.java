package com.slugterra.entity.protoform;

import com.slugterra.entity.EntitySlug;
import com.slugterra.item.SlugItemRegistry;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;

public class EntityFlaringo extends EntitySlug{

	public EntityFlaringo(World p_i1738_1_) {
		super(p_i1738_1_);
		this.slugItem = SlugItemRegistry.flaringo;
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return new EntityFlaringo(world);
	}
}
