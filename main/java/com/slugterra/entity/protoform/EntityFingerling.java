package com.slugterra.entity.protoform;

import com.slugterra.entity.EntitySlug;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;

public class EntityFingerling extends EntitySlug{

	public EntityFingerling(World p_i1738_1_) {
		super(p_i1738_1_);
		this.slugItem = null;
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return new EntityFingerling(world);
	}
}
