package com.slugterra.entity.slingers;

import com.slugterra.entity.velocity.EntityVel;
import com.slugterra.events.SlugterraSoundEvents;
import com.slugterra.item.BlasterBase;
import com.slugterra.item.ItemRegistry;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIRestrictSun;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.inventory.EntityEquipmentSlot.Type;
import net.minecraft.item.ItemStack;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntitySlinger extends EntityMob implements IRangedAttackMob
{
	private EntityAIAttackRanged aiArrowAttack = new EntityAIAttackRanged(this, 1.0D, 20, 60, 15.0F);
	public EntityVel[] usableSlugs = new EntityVel[1];

	public EntitySlinger(World world)
	{
		super(world);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIRestrictSun(this));
		this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(6, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	protected void entityInit()
	{
		super.entityInit();
	}

	/**
	 * Drop 0-2 items of this living's type.
	 * @param par1 - Whether this entity has recently been hit by a player.
	 * @param par2 - Level of Looting used to kill this mob.
	 */
	@Override
	protected void dropFewItems(boolean recentlyHit, int lootingLevel)
	{
		int j = this.rand.nextInt(3 + lootingLevel);

		for (int k = 0; k < j; ++k)
		{
			this.dropItem(ItemRegistry.fusionCore, 1);
		}
		if (getHeldItemMainhand().getItem() instanceof BlasterBase) {
			this.dropItem(this.getHeldItemMainhand().getItem(), 1);
		}
	}

	/**
	 * Makes entity wear random armor based on difficulty
	 */
	protected void addRandomArmor()
	{
		this.setItemStackToSlot(EntityEquipmentSlot.CHEST, new ItemStack(ItemRegistry.chestplate));
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingData)
	{
		livingData = super.onInitialSpawn(difficulty, livingData);
		
		this.addRandomArmor();

		return livingData;
	}

	/**
	 * sets this entity's combat AI.
	 */
	public void setCombatTask()
	{
		this.tasks.removeTask(this.aiArrowAttack);
		ItemStack itemstack = this.getHeldItemMainhand();

		if (itemstack != null && itemstack.getItem() instanceof BlasterBase)
		{
			this.tasks.addTask(4, this.aiArrowAttack);
		}
	}

	/**
	 * Attack the specified entity using a ranged attack.
	 */
	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase entity, float damage)
	{
		EntityVel slugProjectile = usableSlugs[this.rand.nextInt(usableSlugs.length)];
		slugProjectile.setDamage((double)(damage * 2.0F) + this.rand.nextGaussian() * 0.25D + (double)(this.world.getDifficulty().getDifficultyId() * 0.11F));

		double dx, dy, dz;
		
		dx = entity.posX - slugProjectile.posX;
		dy = entity.posY - slugProjectile.posY;
		dz = entity.posZ - slugProjectile.posZ;
		
		slugProjectile.setThrowableHeading(dx, dy, dz, 0.1f, 0.01f);
		
		this.playSound(SlugterraSoundEvents.blasterShot, 1.0f, 1.0f);
		this.world.spawnEntity(slugProjectile);
	}

	/**
	 * Sets the held item, or an armor slot. Slot 0 is held item. Slot 1-4 is armor. Params: Item, slot
	 */
	@Override
	public void setItemStackToSlot(EntityEquipmentSlot slot, ItemStack stack)
	{
		super.setItemStackToSlot(slot, stack);
		if (!this.world.isRemote && slot.getSlotType() == Type.HAND)
		{
			this.setCombatTask();
		}
	}

	/**
	 * Returns the Y Offset of this entity.
	 */
	@Override
	public double getYOffset()
	{
		return super.getYOffset() - 0.5D;
	}


}