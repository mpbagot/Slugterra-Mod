package com.slugterra.capabilities;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class BlasterProvider implements ICapabilitySerializable<NBTBase> {

	@CapabilityInject(IBlaster.class)
	public static final Capability<IBlaster> BLASTER_CAP = null;
	
	private IBlaster instance = BLASTER_CAP.getDefaultInstance();
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		return capability == BLASTER_CAP;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		return capability == BLASTER_CAP ? BLASTER_CAP.<T> cast(this.instance) : null;
	}

	@Override
	public NBTBase serializeNBT() {
		return BLASTER_CAP.getStorage().writeNBT(BLASTER_CAP, this.instance, null);
	}

	@Override
	public void deserializeNBT(NBTBase nbt) {
		BLASTER_CAP.getStorage().readNBT(BLASTER_CAP, this.instance, null, nbt);
		
	}

	
	
}
