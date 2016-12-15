package com.slugterra.entity.protoform;

import java.util.Random;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.slugterra.entity.EntitySlug;
import com.slugterra.item.SlugsTube;
import com.slugterra.item.SlugterraItems;
import com.slugterra.item.slugs.ItemSlug;

public class EntityBoonDoc extends EntitySlug{

	public EntityBoonDoc(World p_i1738_1_) {
		super(p_i1738_1_);
		this.slugItem = SlugsTube.boondoc;
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return new EntityBoonDoc(worldObj);
	}
}
