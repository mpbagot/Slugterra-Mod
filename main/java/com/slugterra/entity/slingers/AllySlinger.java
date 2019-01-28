package com.slugterra.entity.slingers;

import com.slugterra.entity.velocity.EntityInfernusVel;
import com.slugterra.item.ItemRegistry;

import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class AllySlinger extends EntitySlinger
{
	public AllySlinger(World world)
	{
		super(world);
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget<EnemySlinger>(this, EnemySlinger.class, true, true));

		this.usableSlugs[0] = new EntityInfernusVel(world, this);
	}

	/**
	 * Makes entity wear random armor based on difficulty
	 */
	protected void addRandomArmor()
	{
		super.addRandomArmor();
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(ItemRegistry.defenderBlaster));
	}
}