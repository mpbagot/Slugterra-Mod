package com.slugterra.block;

import com.slugterra.item.slugs.ItemSlug;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;

public class TileEntitySlugContainerEntity extends TileEntity implements ISidedInventory, IUpdatePlayerListBox {

	private final String name = "Slug Rack";

	private final String tagName = "SlugRack";

	/** Define the inventory size here for easy reference */
	public static final int INV_SIZE = 20;
	
	/** Inventory's size must be same as number of slots you add to the Container class */
	private ItemStack[] inventory = new ItemStack[INV_SIZE];

	@Override
	public int getSizeInventory()
	{
		return inventory.length;
	}
	
	public int getFirstEmptySlot(){
		for (int a=0;a<this.inventory.length;++a){
			if (this.inventory[a] == null){
				return a;
			}
		}
		return -1;
	}
	
	public int getLastFullSlot(){
		for (int a=this.inventory.length-1; a >= 0; --a){
			if (this.inventory[a] != null)
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
		if (stack != null)
		{
			if (stack.stackSize > amount)
			{
				stack = stack.splitStack(amount);
				if (stack.stackSize == 0)
				{
					setInventorySlotContents(slot, null);
				}
			}
			else
			{
				setInventorySlotContents(slot, null);
			}

			this.markDirty();
		}
		return stack;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot)
	{
		ItemStack stack = getStackInSlot(slot);
		System.out.println(stack);
		if (stack != null)
		{
			setInventorySlotContents(slot, stack);
		}
		return stack;
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack itemstack)
	{
		this.inventory[slot] = itemstack;

		if (itemstack != null && itemstack.stackSize <= this.getInventoryStackLimit())
		{
			itemstack.stackSize = this.getInventoryStackLimit();
		}

		this.markDirty();
	}


	@Override
	public String getInventoryName() {
		return name;
	}

	@Override
	public boolean hasCustomInventoryName() {
		return name.length() > 0;
	}

	@Override
	public int getInventoryStackLimit() {
		return 1;
	}

	@Override
	public void markDirty()
	{
		for (int i = 0; i < this.getSizeInventory(); ++i)
		{
			if (this.getStackInSlot(i) != null && this.getStackInSlot(i).stackSize == 0){
				this.setInventorySlotContents(i, this.getStackInSlot(i));
			}
		}
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer)
	{
		return true;
	}

	@Override
	public void openInventory() {}

	@Override
	public void closeInventory() {}

	@Override
	public boolean isItemValidForSlot(int slot, ItemStack itemstack)
	{
		return itemstack.getItem() instanceof ItemSlug;
	}

	@Override
	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
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

	@Override
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		NBTTagList items = (NBTTagList)compound.getTag(tagName);

		for (int i = 0; i < items.tagCount(); ++i) {

			NBTTagCompound item = (NBTTagCompound) items.getCompoundTagAt(i);
			byte slot = item.getByte("Slot");

			if (slot >= 0 && slot < getSizeInventory()) {
				inventory[slot] = ItemStack.loadItemStackFromNBT(item);
			}
		}
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int side) {
		return null;
	}

	@Override
	public boolean canInsertItem(int index, ItemStack itemstack, int direction) {
		return isItemValidForSlot(index, itemstack);
	}

	@Override
	public boolean canExtractItem(int p_102008_1_, ItemStack p_102008_2_, int p_102008_3_) {
		return true;
	}

	@Override
	public void update() {}

	public int getFullSlotNum() {
		int b = 0;
		for (int a=0;a< this.INV_SIZE; ++a){
			if (this.getStackInSlot(a) != null){
				b = b+1;
			}
		}
		return b;
	}

}
