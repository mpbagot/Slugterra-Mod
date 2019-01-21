package com.slugterra.main;

import com.slugterra.block.BlockRegistry;
import com.slugterra.capabilities.Blaster;
import com.slugterra.capabilities.BlasterStorage;
import com.slugterra.capabilities.IBlaster;
import com.slugterra.capabilities.ISlugInv;
import com.slugterra.capabilities.SlugInv;
import com.slugterra.capabilities.SlugInvStorage;
import com.slugterra.item.ItemBlockRegistry;
import com.slugterra.item.ItemRegistry;
import com.slugterra.item.SlugItemRegistry;
import com.slugterra.model.slingers.ModelSlingerArmour;

import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	private static final ModelSlingerArmour slingerBelt = new ModelSlingerArmour();
	
	public void preInit(FMLPreInitializationEvent e) {
		ItemRegistry.registerItems();
		SlugItemRegistry.registerItems();
		BlockRegistry.registerBlocks();
		ItemBlockRegistry.registerBlocks();
	}
	
	public void init(FMLInitializationEvent e) {
		CraftingManager.registerCrafting();
		CapabilityManager.INSTANCE.register(IBlaster.class, new BlasterStorage(), Blaster.class);
		CapabilityManager.INSTANCE.register(ISlugInv.class, new SlugInvStorage(), SlugInv.class);
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}

	public void registerRenderThings() {}
	
	public ModelBiped getArmorModel() {
		return slingerBelt;
	}
}
