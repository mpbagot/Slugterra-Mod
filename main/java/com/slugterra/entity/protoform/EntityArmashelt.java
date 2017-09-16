package com.slugterra.entity.protoform;

import java.util.Random;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.slugterra.entity.EntitySlug;
import com.slugterra.item.SlugItemRegistry;
import com.slugterra.item.ItemRegistry;
import com.slugterra.item.slugs.ItemSlug;

public class EntityArmashelt extends EntitySlug{

	public EntityArmashelt(World p_i1738_1_) {
		super(p_i1738_1_);
		this.slugItem = SlugItemRegistry.armashelt;
	}
	
	public EntityArmashelt(World world, String name){
		super(world, name);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return new EntityArmashelt(worldObj);
	}
}
