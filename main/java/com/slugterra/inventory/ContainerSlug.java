package com.slugterra.inventory;

import com.slugterra.item.slugs.ItemSlug;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerSlug extends Container
{
	private static final int INV_START = InventorySlug.INV_SIZE, INV_END = INV_START + 26,
			HOTBAR_START = INV_END + 1, HOTBAR_END = HOTBAR_START + 8;

	public ContainerSlug(EntityPlayer player, InventoryPlayer inventoryPlayer, InventorySlug inventoryCustom)
	{
		int i = HOTBAR_END;

		this.addSlotToContainer(new SlotSlugInv(inventoryCustom, 0, 13, 104));
		this.addSlotToContainer(new SlotSlugInv(inventoryCustom, 1, 88, 7));
		this.addSlotToContainer(new SlotSlugInv(inventoryCustom, 2, 88, 32));
		this.addSlotToContainer(new SlotSlugInv(inventoryCustom, 3, 88, 56));
		this.addSlotToContainer(new SlotSlugInv(inventoryCustom, 4, 88, 80));
		this.addSlotToContainer(new SlotSlugInv(inventoryCustom, 5, 88, 103));

		for (i = 0; i < 9; ++i)
		{
			this.addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 144));
		}
	}

	/**
	 * This should always return true, since custom inventory can be accessed from anywhere
	 */
	@Override
	public boolean canInteractWith(EntityPlayer player)
	{
		return true;
	}

	/**
	 * Called when a player shift-clicks on a slot. You must override this or you will crash when someone does that.
	 * Basically the same as every other container I make, since I define the same constant indices for all of them
	 */
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int par2)
	{
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.inventorySlots.get(par2);

		if (slot != null && slot.getHasStack())
		{
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			// Either armor slot or custom item slot was clicked
			if (par2 < INV_START)
			{
				// try to place in player inventory / action bar
				if (!this.mergeItemStack(itemstack1, INV_START, INV_START + 9, true))
				{
					return ItemStack.EMPTY;
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
						return ItemStack.EMPTY;
					}
				}
			}

			if (itemstack1.getCount() == 0)
			{
				slot.putStack(ItemStack.EMPTY);
			}
			else
			{
				slot.onSlotChanged();
			}

			if (itemstack1.getCount() == itemstack.getCount())
			{
				return ItemStack.EMPTY;
			}

			slot.onTake(player, itemstack1);
		}

		return itemstack;
	}
}