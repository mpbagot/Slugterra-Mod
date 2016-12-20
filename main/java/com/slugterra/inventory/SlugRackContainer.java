package com.slugterra.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;

public class SlugRackContainer extends Container{
	
	private final IInventory slugRack;
	private final int sizeInventory;
	
	public SlugRackContainer(InventoryPlayer invPlayer, IInventory iInv)
	{
		slugRack = iInv;
		sizeInventory = iInv.getSizeInventory();
		
		for (int i = 0; i<3; ++i){
			for (int j=0; j<9; ++j){
				addSlotToContainer(new SlotSlugInv(invPlayer, j+i*9+9, 8+j*18, 84+i*18));
			}
		}
		for (int i=0; i<9;++i){
			addSlotToContainer(new SlotSlugInv(invPlayer, i, 8+i*18, 142));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer p_75145_1_) {
		// TODO Auto-generated method stub
		return false;
	}

}
