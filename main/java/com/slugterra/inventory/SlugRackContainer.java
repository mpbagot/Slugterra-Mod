package com.slugterra.inventory;

import com.slugterra.item.slugs.ItemSlug;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlugRackContainer extends Container{

	private final IInventory slugRack;
	private final int sizeInventory;

	public SlugRackContainer(InventoryPlayer invPlayer, IInventory iInv)
	{
		slugRack = iInv;
		sizeInventory = iInv.getSizeInventory();

		//Add slots to container from the slug rack
		for (int k=0;k<3;++k){
			for (int l=0;l<7;++l){
				if (!(k==2 && l==6)){
					addSlotToContainer(new SlotSlugInv(slugRack, l+k*7, 20+l*18, 15+k*18));
				}
			}
		}

		for (int i = 0; i<3; ++i){
			for (int j=0; j<9; ++j){
				addSlotToContainer(new Slot(invPlayer, j+i*9+9, 8+j*18, 84+i*18));
			}
		}
		for (int i=0; i<9;++i){
			addSlotToContainer(new Slot(invPlayer, i, 8+i*18, 142));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return slugRack.isUseableByPlayer(player);
	}

	/**
	 * Called when a player shift-clicks on a slot. You must override this or you will crash when someone does that.
	 * Basically the same as every other container I make, since I define the same constant indices for all of them
	 */
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int par2)
	{
		ItemStack itemstack = null;
		Slot slot = (Slot) this.inventorySlots.get(par2);

		if (slot != null && slot.getHasStack())
		{
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			// Custom item slot was clicked
			if (par2 < this.sizeInventory)
			{
				// try to place in player inventory / action bar
				if (!this.mergeItemStack(itemstack1, this.sizeInventory, this.sizeInventory + 8 + 1, true))
				{
					return null;
				}

				slot.onSlotChange(itemstack1, itemstack);
			}
			// Item is in inventory / hotbar, try to place either in custom or armor slots
			else
			{
				// if item is our custom item
				if (itemstack1.getItem() instanceof ItemSlug)
				{
					if (!this.mergeItemStack(itemstack1, 0, InventorySlug.INV_SIZE, false))
					{
						return null;
					}
				}
			}

			if (itemstack1.stackSize == 0)
			{
				slot.putStack((ItemStack) null);
			}
			else
			{
				slot.onSlotChanged();
			}

			if (itemstack1.stackSize == itemstack.stackSize)
			{
				return null;
			}

			slot.onPickupFromSlot(player, itemstack1);
		}

		return itemstack;
	}

}
