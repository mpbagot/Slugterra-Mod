package com.slugterra.block.tileentity;

import com.slugterra.item.slugs.ItemSlug;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;

public class TileEntitySlugContainerEntity extends TileEntity implements ISidedInventory {

	private final String name = "Slug Rack";

	private final String tagName = "SlugRack";

	/** Define the inventory size here for easy reference */
	public static final int INV_SIZE = 20;
	
	/** Inventory's size must be same as number of slots you add to the Container class */
	private ItemStack[] inventory = new ItemStack[]{
				ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY,
				ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, 
				ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, 
				ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, 
				ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY
			};

	private boolean hasChanged = false;

	@Override
	public int getSizeInventory()
	{
		return inventory.length;
	}
	
	public int getItemCount()
	{
		int count = 0;
		for (int a = 0; a < getSizeInventory(); a++)
		{
			if (this.getStackInSlot(a) != ItemStack.EMPTY) {
				count++;
			}
		}
		
		return count;
	}
	
	public int getFirstEmptySlot(){
		for (int a = 0;a < this.inventory.length;++a)
		{
			if (this.inventory[a] == ItemStack.EMPTY) {
				return a;
			}
		}
		return -1;
	}
	
	public int getLastFullSlot(){
		for (int a = this.inventory.length - 1; a >= 0; --a)
		{
			if (this.inventory[a] != ItemStack.EMPTY)
				return a;
		}
		return -1;
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
					this.removeStackFromSlot(slot);
				}
			}
			else
			{
				removeStackFromSlot(slot);
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
	public String getName() {
		return name;
	}

	@Override
	public boolean hasCustomName() {
		return name.length() > 0;
	}

	@Override
	public int getInventoryStackLimit() {
		return 1;
	}

	@Override
	public void markDirty()
	{
		hasChanged = true;
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

	@Override
	public boolean isItemValidForSlot(int slot, ItemStack itemstack)
	{
		return itemstack.getItem() instanceof ItemSlug;
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		NBTTagList items = new NBTTagList();

		for (int i = 0; i < getSizeInventory(); ++i)
		{
			if (getStackInSlot(i) instanceof ItemStack)
			{
				NBTTagCompound item = new NBTTagCompound();
				item.setByte("Slot", (byte) i);
				getStackInSlot(i).writeToNBT(item);
				items.appendTag(item);
			}
		}

		compound.setTag(tagName, items);

		hasChanged = false;
		
		return compound;
	}

	@Override
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		NBTTagList items = (NBTTagList)compound.getTag(tagName);

		for (int i = 0; i < items.tagCount(); ++i) {

			NBTTagCompound item = (NBTTagCompound) items.getCompoundTagAt(i);
			byte slot = item.getByte("Slot");

			if (slot >= 0 && slot < getSizeInventory()) {
				inventory[slot] = new ItemStack(item);
			}
		}
	}

	@Override
	public int[] getSlotsForFace(EnumFacing side) {
		return null;
	}

	@Override
	public boolean canInsertItem(int index, ItemStack itemstack, EnumFacing direction) {
		return isItemValidForSlot(index, itemstack);
	}

	@Override
	public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
		return true;
	}

	public int getFullSlotNum() {
		int b = 0;
		for (int a=0;a< INV_SIZE; ++a){
			if (this.getStackInSlot(a) != ItemStack.EMPTY){
				b = b+1;
			}
		}
		return b;
	}

	@Override
	public boolean isEmpty() {
		for (int i = 0; i < this.getSizeInventory(); i++) {
			if (this.getStackInSlot(i) != ItemStack.EMPTY)
				return false;
		}
		return true;
	}

	@Override
	public ItemStack removeStackFromSlot(int index) {
		ItemStack stack = getStackInSlot(index);
		this.setInventorySlotContents(index, ItemStack.EMPTY);
		return stack;
	}

	

	@Override
	public int getField(int id) {
		return 0;
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
		for (int i = 0; i < this.getSizeInventory(); i++)
		{
			this.removeStackFromSlot(i);
		}
	}

}
