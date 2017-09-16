package com.slugterra.capabilities;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class SlugInventoryProvider implements ICapabilitySerializable<NBTBase> {

	@CapabilityInject(ISlugInv.class)
	public static final Capability<ISlugInv> INV_CAP = null;
	
	private ISlugInv instance = INV_CAP.getDefaultInstance();
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		return capability == INV_CAP;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		return capability == INV_CAP ? INV_CAP.<T> cast(this.instance) : null;
	}

	@Override
	public NBTBase serializeNBT() {
		return INV_CAP.getStorage().writeNBT(INV_CAP, this.instance, null);
	}

	@Override
	public void deserializeNBT(NBTBase nbt) {
		INV_CAP.getStorage().readNBT(INV_CAP, this.instance, null, nbt);
		
	}

	
	
}
