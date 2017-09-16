package com.slugterra.capabilities;

import com.slugterra.inventory.InventorySlug;

import net.minecraft.nbt.NBTTagCompound;

public class SlugInv implements ISlugInv{
	
	public int invslot;
	public InventorySlug inventory = new InventorySlug();
	
	@Override
	public int getSlot() {
		return this.invslot;
	}
	
	@Override
	public void setSlot(int slot) {
		this.invslot = slot;
	}
	
	@Override
	public InventorySlug getInventory() {
		return this.inventory;
	}
	
	@Override
	public void loadInventory(NBTTagCompound inventory) {
		this.inventory.readFromNBT(inventory);
	}
	
	@Override
	public void setInventory(InventorySlug inventory) {
		this.inventory = inventory;
	}
	
	public void increaseSlot(){
		if (invslot < 5)
			invslot++;
		else
			invslot = 0;

		inventory.getStackInSlot(invslot);
	}

	public void decreaseSlot(){
		if (invslot > 0)
			invslot--;
		else
			invslot = 5;

		inventory.getStackInSlot(invslot);
	}
	
}
