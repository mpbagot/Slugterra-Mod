package com.slugterra.entity.protoform;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.slugterra.entity.EntitySlug;
import com.slugterra.entity.ai.EntitySlugAIHopPanic;
import com.slugterra.entity.ai.EntitySlugAIHopWander;
import com.slugterra.item.SlugsTube;
import com.slugterra.item.SlugterraItems;
import com.slugterra.item.slugs.ItemSlug;

public class EntityTazerling extends EntitySlug{

	public EntityTazerling(World world) {
		super(world);
		this.slugItem = SlugsTube.tazerling;
	}
	
	public EntityTazerling(World world, String name) {
		super(world, name);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return new EntityTazerling(worldObj);
	}
}
