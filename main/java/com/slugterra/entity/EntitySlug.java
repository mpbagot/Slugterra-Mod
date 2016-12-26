package com.slugterra.entity;

import java.util.Random;

import com.slugterra.entity.ai.EntitySlugAIHopPanic;
import com.slugterra.entity.ai.EntitySlugAIHopWander;
import com.slugterra.entity.ai.EntitySlugAIMoveTowardsSlinger;
import com.slugterra.entity.properties.ExtendedPlayer;
import com.slugterra.item.SlugterraItems;
import com.slugterra.item.slugs.ItemSlug;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntitySlug extends EntityTameable{

	public boolean shouldFollow = false;
	public static int friendship = 0;
	public static Item slugItem;
	public static String name = "";
	private EntityPlayerMP slinger;

	public EntitySlug(World world, String nameSlug){
		this(world);
		if (nameSlug != null && nameSlug != "")
			this.setName(nameSlug);
	}

	public EntitySlug(World p_i1738_1_) {
		super(p_i1738_1_);
		this.setSize(0.2F, 0.5F);
		this.tasks.addTask(0, new EntitySlugAIHopWander(this, 0.5F));
		this.tasks.addTask(5, new EntitySlugAIHopPanic(this, 0.5D));
		this.tasks.addTask(4, new EntityAILookIdle(this));
		this.tasks.addTask(3, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 12.0F));
		this.tasks.addTask(1, new EntityAITempt(this, 0.9D, SlugterraItems.slugfood, false));
	}

	@Override
	public boolean isAIEnabled(){
		return true;
	}

	public void setFollowSlinger(boolean shouldF){
		this.shouldFollow = shouldF;
		if (shouldF){
			System.out.println(String.format("Setting target owner to %s", this.slinger));
			this.tasks.addTask(0, new EntitySlugAIMoveTowardsSlinger(this.slinger, this, 1.0D, 100.0F));
		}
	}

	@Override
	public void writeToNBT(NBTTagCompound compound){
		super.writeToNBT(compound);
		compound.setInteger("EntitySlugFriendship", friendship);
		System.out.println(this.slinger);
		compound.setString("Slinger", this.slinger != null ? this.slinger.getCommandSenderName() : "");
		if(name != null)
			compound.setString("EntitySlugName", name);
	}

	@Override
	public void readFromNBT(NBTTagCompound compound){
		super.readFromNBT(compound);
		this.friendship = compound.getInteger("EntitySlugFriendship");
		if (compound.getString("EntitySlugName") != "")
			this.name = compound.getString("EntitySlugName");
		this.slinger = (EntityPlayerMP) this.worldObj.getPlayerEntityByName(compound.getString("Slinger"));
	}

	public void setSlinger(EntityPlayerMP player){
		this.slinger = player;
	}

	@Override
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.2D);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return new EntitySlug(worldObj);
	}

	@Override
	public boolean interact(EntityPlayer player)
	{
		ItemSlug caughtslug = (ItemSlug) slugItem;
		ItemStack itemstack = null;
		boolean inslugbelt = false;
		if (slugItem != null){
			caughtslug.setInTorpedoShell(false);
			caughtslug.updateFriendship(this.friendship, false);
			itemstack = player.inventory.getCurrentItem();
		}
		ExtendedPlayer props = ExtendedPlayer.get(player);
		if ((new Random().nextInt(20) == 1 || this.friendship > 30) && !this.worldObj.isRemote){
			if (itemstack != null && slugItem != null){
				caughtslug.setName(this.name);
				if (itemstack.getItem() == SlugterraItems.slugtubeItem)
				{
					if (!player.capabilities.isCreativeMode && itemstack.stackSize <= 0)
						player.inventory.setInventorySlotContents(player.inventory.currentItem, null);

					else if (!player.capabilities.isCreativeMode)
						--itemstack.stackSize;

					for (int m = 0;m < props.inventory.getSizeInventory();m++){
						if (props.inventory.getStackInSlot(m) == null){
							inslugbelt = true;
							System.out.println(this.name);
							System.out.println(((ItemSlug)new ItemStack(caughtslug).getItem()).name);
							props.inventory.setInventorySlotContents(m, new ItemStack(caughtslug));
							break;
						}
					}
					if (inslugbelt == false)
						player.inventory.addItemStackToInventory(new ItemStack(caughtslug));
					this.setDead();
					return isDead;
				}
				else if (itemstack.getItem() == SlugterraItems.torpedoShell)
				{					
					if (!player.capabilities.isCreativeMode && itemstack.stackSize <= 0)
						player.inventory.setInventorySlotContents(player.inventory.currentItem, null);

					else if (!player.capabilities.isCreativeMode)
						--itemstack.stackSize;

					caughtslug.setInTorpedoShell(true);
					for (int m = 0;m < props.inventory.getSizeInventory();m++)
					{
						if (props.inventory.getStackInSlot(m) == null){
							inslugbelt = true;
							props.inventory.setInventorySlotContents(m, new ItemStack(caughtslug));
							break;
						}
					}
					if (inslugbelt == false)
						player.inventory.addItemStackToInventory(new ItemStack(caughtslug));
					this.setDead();
					return isDead;
				}
			}
		}
		else if (itemstack != null && itemstack.getItem() == SlugterraItems.slugfood)
		{
			this.friendship += 1;
			if (!player.capabilities.isCreativeMode && itemstack.stackSize <= 0)
				player.inventory.setInventorySlotContents(player.inventory.currentItem, null);

			else if (!player.capabilities.isCreativeMode)
				--itemstack.stackSize;

			this.playTameEffect(true);
		}
		return false;
	}

	public void setName(String a){
		this.name = a;
		this.setCustomNameTag(a);
		this.setAlwaysRenderNameTag(true);
	}


}
