package com.slugterra.entity;

import java.util.Random;

import com.slugterra.capabilities.ISlugInv;
import com.slugterra.capabilities.SlugInventoryProvider;
import com.slugterra.entity.ai.EntitySlugAIHopPanic;
import com.slugterra.entity.ai.EntitySlugAIHopWander;
import com.slugterra.entity.ai.EntitySlugAIMoveTowardsSlinger;
import com.slugterra.inventory.InventorySlug;
import com.slugterra.item.ItemRegistry;
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
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EntitySlug extends EntityTameable{

	public boolean shouldFollow = false;
	public int friendship = 0;
	public ItemSlug slugItem;
	public String name = "";
	private EntityPlayerMP slinger;
	private Random rand = new Random();

	public EntitySlug(World world, String nameSlug){
		this(world);
		if (nameSlug != null && nameSlug != "")
			this.setName(nameSlug);
	}

	public EntitySlug(World world) {
		super(world);
		this.setSize(0.2F, 0.5F);
		this.tasks.addTask(0, new EntitySlugAIHopWander(this, 0.5F));
		this.tasks.addTask(5, new EntitySlugAIHopPanic(this, 0.5D));
		this.tasks.addTask(4, new EntityAILookIdle(this));
		this.tasks.addTask(3, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 12.0F));
		this.tasks.addTask(1, new EntityAITempt(this, 0.9D, ItemRegistry.slugfood, false));
	}

	public void setFollowSlinger(boolean shouldF){
		this.shouldFollow = shouldF;
		if (shouldF){
			System.out.println(String.format("Setting target owner to %s", this.slinger));
			this.tasks.addTask(0, new EntitySlugAIMoveTowardsSlinger(this.slinger, this, 1.0D, 100.0F));
		}
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound compound){
//		super.writeToNBT(compound);
		compound.setInteger("EntitySlugFriendship", friendship);
		if (this.slinger != null)
			compound.setString("Slinger", this.slinger.getName());
		if(this.name != null)
			compound.setString("EntitySlugName", name);
	}

	@Override
	public void readFromNBT(NBTTagCompound compound){
		super.readFromNBT(compound);
		this.friendship = compound.getInteger("EntitySlugFriendship");
		if (compound.getString("EntitySlugName") != "")
			this.name = compound.getString("EntitySlugName");
		if (compound.getString("Slinger") != "")
			this.slinger = (EntityPlayerMP) this.world.getPlayerEntityByName(compound.getString("Slinger"));
	}

	public void setSlinger(EntityPlayerMP player){
		this.slinger = player;
	}

	@Override
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2D);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return new EntitySlug(world);
	}

	@Override
	public EnumActionResult applyPlayerInteraction(EntityPlayer player, Vec3d vec, EnumHand stack) {
		ItemStack itemstack = player.inventory.getCurrentItem();
		if (this.slugItem != null){
			this.slugItem.setInTorpedoShell(false);
			this.slugItem.updateFriendship(this.friendship, false);
			this.slugItem.setName(this.name);
		}
		
		if (itemstack == ItemStack.EMPTY) {
			return EnumActionResult.FAIL;
		}
		
		// Raise friendship by feeding the slug
		if (itemstack.getItem() == ItemRegistry.slugfood) {
			this.friendship += 1;
			this.playTameEffect(true);
			
			// Deiterate the food stack.
			if (!player.capabilities.isCreativeMode) {
				if (itemstack.getCount() <= 1) {
					player.inventory.setInventorySlotContents(player.inventory.currentItem, ItemStack.EMPTY);
				} else {
					itemstack.setCount(itemstack.getCount()-1);
				}
			}
		}
		
		// Catch the slug using various slug tube types if lucky
		else if ((rand.nextInt(20) == 7 || this.friendship > 30) && this.slugItem != null && !this.world.isRemote) {
			
			if (itemstack.getItem() == ItemRegistry.slugtubeItem) {
			} else if (itemstack.getItem() == ItemRegistry.torpedoShell) {	
				this.slugItem.setInTorpedoShell(true);
			} else {
				return EnumActionResult.FAIL;
			}
				
			return this.catchSlug(player);
		}
		
		return EnumActionResult.SUCCESS;
	}
	
	private EnumActionResult catchSlug(EntityPlayer player) {
		ItemStack itemstack = player.inventory.getCurrentItem();
		ISlugInv props = player.getCapability(SlugInventoryProvider.INV_CAP, null);
		InventorySlug inventory = props.getInventory();
		ItemStack caughtSlugStack = new ItemStack(this.slugItem);
		
		// Add the slug to either the slug belt inventory, or to the main inventory.
		if (!inventory.addItemStackToInventory(caughtSlugStack)) {
			if (!player.inventory.addItemStackToInventory(caughtSlugStack)) {
				//If both fail, return an interaction failure.
				return EnumActionResult.FAIL;
			}
		}
		
		// Deiterate the slugtube stack if the slug has been collected correctly.
		if (!player.capabilities.isCreativeMode) {
			if (itemstack.getCount() <= 1) {
				player.inventory.setInventorySlotContents(player.inventory.currentItem, ItemStack.EMPTY);
			} else {
				itemstack.setCount(itemstack.getCount()-1);
			}
		}
		
		//Save the inventory, and destroy the entity.
		props.setInventory(inventory);
		this.setDead();
		return EnumActionResult.SUCCESS;
	}

	public void setName(String a){
		this.name = a;
		this.setCustomNameTag(a);
		this.setAlwaysRenderNameTag(true);
	}


}
