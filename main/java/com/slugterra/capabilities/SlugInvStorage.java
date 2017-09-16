package com.slugterra.capabilities;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class SlugInvStorage implements IStorage<ISlugInv> {

	@Override
	public NBTBase writeNBT(Capability<ISlugInv> capability, ISlugInv instance, EnumFacing side) {
		
		NBTTagCompound properties = new NBTTagCompound();

		properties.setInteger("InvSlot", instance.getSlot());
		instance.getInventory().writeToNBT(properties);

		return properties;
	}

	@Override
	public void readNBT(Capability<ISlugInv> capability, ISlugInv instance, EnumFacing side, NBTBase nbt) {
		NBTTagCompound properties = (NBTTagCompound) nbt;
		// Get our data from the custom tag compound
		instance.setSlot(properties.getInteger("InvSlot"));
		instance.loadInventory(properties);
	}

}
