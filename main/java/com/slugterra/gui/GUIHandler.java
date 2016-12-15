package com.slugterra.gui;

import com.slugterra.entity.properties.ExtendedPlayer;
import com.slugterra.inventory.ContainerSlug;
import com.slugterra.inventory.GUISlugInventory;
import com.slugterra.main.MainRegistry;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z)
	{
		if (guiId == MainRegistry.GUI_SLUG_INV)
			return new ContainerSlug(player, player.inventory, ExtendedPlayer.get(player).inventory);
		else
			return null;
	}

	@Override
	public Object getClientGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z)
	{
		if (guiId == MainRegistry.GUI_SLUG_INV)
			return new GUISlugInventory(player, player.inventory, ExtendedPlayer.get(player).inventory);
		else
			return null;

	}

}
