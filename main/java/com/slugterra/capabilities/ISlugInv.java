package com.slugterra.capabilities;

import com.slugterra.inventory.InventorySlug;

import net.minecraft.nbt.NBTTagCompound;

public interface ISlugInv {

	public int getSlot();
	public void setSlot(int slot);
	
	public InventorySlug getInventory();
	public void setInventory(InventorySlug inventory);
	public void loadInventory(NBTTagCompound inventory);
	public void saveInventoryToNBT(NBTTagCompound inventory);
	
	public void increaseSlot();

	public void decreaseSlot();
	
}
