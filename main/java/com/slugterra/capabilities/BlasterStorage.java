package com.slugterra.capabilities;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class BlasterStorage implements IStorage<IBlaster> {

	@Override
	public NBTBase writeNBT(Capability<IBlaster> capability, IBlaster instance, EnumFacing side) {
		return new NBTTagInt(instance.getDelay());
	}

	@Override
	public void readNBT(Capability<IBlaster> capability, IBlaster instance, EnumFacing side, NBTBase nbt) {
		instance.setDelay(((NBTPrimitive) nbt).getInt());
		
	}

}
