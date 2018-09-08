package com.slugterra.entity.protoform;

import com.slugterra.entity.EntitySlug;
import com.slugterra.item.SlugItemRegistry;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;

public class EntityMakoBreaker extends EntitySlug{

	public EntityMakoBreaker(World p_i1738_1_) {
		super(p_i1738_1_);
		this.slugItem = SlugItemRegistry.makobreaker;
	}
	
	public EntityMakoBreaker(World world, String name){
		super(world, name);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return new EntityMakoBreaker(world);
	}
}