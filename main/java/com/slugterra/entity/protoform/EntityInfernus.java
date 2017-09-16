package com.slugterra.entity.protoform;

import com.slugterra.entity.EntitySlug;
import com.slugterra.item.SlugItemRegistry;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;

public class EntityInfernus extends EntitySlug{
	
	public EntityInfernus(World p_i1738_1_) {
		super(p_i1738_1_);
		this.isImmuneToFire = true;
		this.slugItem = SlugItemRegistry.infernus;
	}
	
	public EntityInfernus(World world, String name){
		super(world, name);
		this.isImmuneToFire = true;
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return new EntityInfernus(worldObj);
	}
}
