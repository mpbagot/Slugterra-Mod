package com.slugterra.gui;

import com.slugterra.capabilities.SlugInventoryProvider;
import com.slugterra.inventory.ContainerSlug;
import com.slugterra.inventory.SlugRackContainer;
import com.slugterra.main.MainRegistry;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity te = world.getTileEntity(new BlockPos(x,y,z));
		if (guiId == MainRegistry.GUI_SLUG_INV)
			return new ContainerSlug(player, player.inventory, player.getCapability(SlugInventoryProvider.INV_CAP, null).getInventory());
		else if (guiId == MainRegistry.GUI_SLUG_RACK)
			return new SlugRackContainer(player.inventory, (IInventory)te);
		else
			return null;
	}

	@Override
	public Object getClientGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity te = world.getTileEntity(new BlockPos(x, y, z));
		if (guiId == MainRegistry.GUI_SLUG_INV)
			return new GUISlugInventory(player, player.inventory, player.getCapability(SlugInventoryProvider.INV_CAP, null).getInventory());
		else if (guiId == MainRegistry.GUI_SLUG_RACK)
			return new GuiSlugRack(player.inventory, (IInventory)te);
		else
			return null;

	}

}
