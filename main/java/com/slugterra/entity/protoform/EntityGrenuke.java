package com.slugterra.entity.protoform;

import com.slugterra.entity.EntitySlug;
import com.slugterra.item.SlugItemRegistry;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;

public class EntityGrenuke extends EntitySlug{
	
	public EntityGrenuke(World par1World) {
		super(par1World);
		this.slugItem = SlugItemRegistry.grenuke;
	}
	
	public EntityGrenuke(World world, String name){
		super(world, name);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return new EntityInfernus(world);
	}
}