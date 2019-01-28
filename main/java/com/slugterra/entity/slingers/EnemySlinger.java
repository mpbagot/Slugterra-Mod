package com.slugterra.entity.slingers;

import com.slugterra.entity.velocity.EntityTazerlingVel;
import com.slugterra.item.ItemRegistry;

import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIRestrictSun;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EnemySlinger extends EntitySlinger
{
	public EnemySlinger(World world)
	{
		super(world);
		this.tasks.addTask(2, new EntityAIRestrictSun(this));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityPlayer>(this, EntityPlayer.class, true, true));

		this.usableSlugs[0] = new EntityTazerlingVel(world, this);
	}

	/**
	 * Makes entity wear random armor based on difficulty
	 */
	protected void addRandomArmor()
	{
		super.addRandomArmor();
		//TODO: change to ghouled blaster
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(ItemRegistry.defenderBlaster));
	}	
}