package com.slugterra.entity.protoform;

import java.util.Random;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
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

public class EntityPhosphoro extends EntitySlug{

	public EntityPhosphoro(World p_i1738_1_) {
		super(p_i1738_1_);
		this.slugItem = SlugsTube.phosphoro;
	}
	
	public EntityPhosphoro(World world, String name){
		super(world, name);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return new EntityPhosphoro(worldObj);
	}
}
