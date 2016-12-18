package com.slugterra.entity.protoform;

import com.slugterra.entity.EntitySlug;
import com.slugterra.item.SlugsTube;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;

public class EntityEnigmo extends EntitySlug{

	public EntityEnigmo(World p_i1738_1_) {
		super(p_i1738_1_);
		this.slugItem = SlugsTube.enigmo;
	}

	public EntityEnigmo(World world, String name){
		super(world, name);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return new EntityEnigmo(worldObj);
	}
}
