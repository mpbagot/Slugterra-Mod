package com.slugterra.inventory;

import com.slugterra.item.slugs.ItemSlug;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.text.ITextComponent;

public class SlugRackInventory implements IInventory
{
	private final String name = "Slug Rack";

	private final String tagName = "SlugRack";

	/** Define the inventory size here for easy reference */
	public static final int INV_SIZE = 20;

	/** Inventory's size must be same as number of slots you add to the Container class */
	private ItemStack[] inventory = new ItemStack[INV_SIZE];

	public SlugRackInventory()
	{

	}

	@Override
	public int getSizeInventory()
	{
		return inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int slot)
	{
		return inventory[slot];
	}

	@Override
	public ItemStack decrStackSize(int slot, int amount)
	{
		ItemStack stack = getStackInSlot(slot);
		if (stack != ItemStack.EMPTY)
		{
			if (stack.getCount() > amount)
			{
				stack = stack.splitStack(amount);
				if (stack.getCount() == 0)
				{
					setInventorySlotContents(slot, ItemStack.EMPTY);
				}
			}
			else
			{
				setInventorySlotContents(slot, ItemStack.EMPTY);
			}

			this.markDirty();
		}
		return stack;
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack itemstack)
	{
		this.inventory[slot] = itemstack;
		
		if (itemstack != ItemStack.EMPTY && itemstack.getCount() <= this.getInventoryStackLimit())
		{
			itemstack.setCount(this.getInventoryStackLimit());
		}

		this.markDirty();
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public boolean hasCustomName()
	{
		return name.length() > 0;
	}

	@Override
	public int getInventoryStackLimit()
	{
		return 1;
	}

	@Override
	public void markDirty()
	{
		for (int i = 0; i < this.getSizeInventory(); ++i)
		{
			if (this.getStackInSlot(i) != ItemStack.EMPTY && this.getStackInSlot(i).getCount() == 0){
				this.setInventorySlotContents(i, ItemStack.EMPTY);
			}
		}
	}

	@Override
	public boolean isUsableByPlayer(EntityPlayer entityplayer)
	{
		return true;
	}

	@Override
	public void openInventory(EntityPlayer player) {}

	@Override
	public void closeInventory(EntityPlayer player) {}

	/**
	 * This method doesn't seem to do what it claims to do, as
	 * items can still be left-clicked and placed in the inventory
	 * even when this returns false
	 */
	@Override
	public boolean isItemValidForSlot(int slot, ItemStack itemstack)
	{
		return itemstack.getItem() instanceof ItemSlug;
	}

	public void writeToNBT(NBTTagCompound compound)
	{
		NBTTagList items = new NBTTagList();

		for (int i = 0; i < getSizeInventory(); ++i)
		{
			if (getStackInSlot(i) != null)
			{
				NBTTagCompound item = new NBTTagCompound();
				item.setByte("Slot", (byte) i);
				getStackInSlot(i).writeToNBT(item);
				items.appendTag(item);
			}
		}

		compound.setTag(tagName, items);

	}

	public void readFromNBT(NBTTagCompound compound)
	{
		NBTTagList items = compound.getTagList(tagName, 10);
		this.inventory = new ItemStack[INV_SIZE];
		
		for (int i = 0; i < items.tagCount(); ++i) {
			
			NBTTagCompound item = (NBTTagCompound) items.getCompoundTagAt(i);
			byte slot = item.getByte("Slot");
			
			if (slot >= 0 && slot < getSizeInventory()) {
				inventory[slot] = new ItemStack(item);
			}
		}
	}

	@Override
	public ITextComponent getDisplayName() {
		return null;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public ItemStack removeStackFromSlot(int index) {
		inventory[index] = ItemStack.EMPTY;
		return ItemStack.EMPTY;
	}

	@Override
	public int getField(int id) {
		return id;
	}

	@Override
	public void setField(int id, int value) {
		
	}

	@Override
	public int getFieldCount() {
		return 0;
	}

	@Override
	public void clear() {
		
	}
}