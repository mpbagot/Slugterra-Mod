package com.slugterra.gui;

import com.slugterra.entity.properties.ExtendedPlayer;
import com.slugterra.inventory.ContainerSlug;
import com.slugterra.inventory.GUISlugInventory;
import com.slugterra.inventory.SlugRackContainer;
import com.slugterra.main.MainRegistry;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GUIHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity te = world.getTileEntity(x, y, z);
		if (guiId == MainRegistry.GUI_SLUG_INV)
			return new ContainerSlug(player, player.inventory, ExtendedPlayer.get(player).inventory);
		else if (guiId == MainRegistry.GUI_SLUG_RACK)
			return new SlugRackContainer(player.inventory, (IInventory)te);
		else
			return null;
	}

	@Override
	public Object getClientGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity te = world.getTileEntity(x, y, z);
		if (guiId == MainRegistry.GUI_SLUG_INV)
			return new GUISlugInventory(player, player.inventory, ExtendedPlayer.get(player).inventory);
		else if (guiId == MainRegistry.GUI_SLUG_RACK)
			return new GuiSlugRack(player.inventory, (IInventory)te);
		else
			return null;

	}

}
