package com.slugterra.main;

import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.entity.SlugterraEntityRegistry;
import com.slugterra.entity.slingers.EntitySlingers;
import com.slugterra.events.SlugterraEventHandler;
import com.slugterra.events.SlugterraKeyHandler;
import com.slugterra.gui.GUIHandler;
import com.slugterra.lib.Strings;
import com.slugterra.packets.MechaAnimPacket;
import com.slugterra.packets.OpenGuiPacket;
import com.slugterra.packets.SyncPlayerPropsPacket;
import com.slugterra.packets.UpdateSlotPacket;

import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = Strings.MODID, name = Strings.name, version = Strings.version)

public class MainRegistry {

	@SidedProxy(clientSide = "com.slugterra.main.ClientProxy", serverSide = "com.slugterra.main.ServerProxy")
	public static CommonProxy proxy;

	@Instance(Strings.MODID)
	public static MainRegistry modInstance = new MainRegistry();
	
	public static boolean mcainstalled = false;

	public static SimpleNetworkWrapper network;

	private static int modGuiIndex = 0;
	public static final int GUI_SLUG_INV = modGuiIndex++;
	public static final int GUI_SLUG_RACK = modGuiIndex++;

	public static final int dimensionIdSlugterra = DimensionManager.getNextFreeDimId();

	/**
	 * Loads before
	 * @param PreEvent
	 */
	@EventHandler
	public void PreLoad(FMLPreInitializationEvent PreEvent){
		SlugterraCreativeTabs.initialiseTabs();
		proxy.preInit(PreEvent);
//		SlugterraBlocks.mainRegistry();
		SlugterraEntityRegistry.mainRegistry();
		proxy.registerRenderThings();
		EntitySlingers.mainRegistry();
		//dimension stuff
//		DimensionType dimensionTypeSlugterra = DimensionType.register("SLUGTERRA", "_slugterra", dimensionIdSlugterra, WorldProviderSlugterra.class, true);
//		DimensionManager.registerDimension(dimensionIdSlugterra, dimensionTypeSlugterra);
//		BiomeRegistry.mainRegistry();
		//new packets
	    network = NetworkRegistry.INSTANCE.newSimpleChannel("SlugChannelNew");
	    network.registerMessage(MechaAnimPacket.Handler.class, MechaAnimPacket.class, 0, Side.SERVER);
	    network.registerMessage(OpenGuiPacket.Handler.class, OpenGuiPacket.class, 1, Side.SERVER);
	    network.registerMessage(SyncPlayerPropsPacket.Handler.class, SyncPlayerPropsPacket.class, 2, Side.CLIENT);
	    network.registerMessage(UpdateSlotPacket.Handler.class, UpdateSlotPacket.class, 3, Side.SERVER);
	}

	/**
	 * Loads during
	 * @param event
	 */
	@EventHandler
	public void load(FMLInitializationEvent event){
		proxy.init(event);
		proxy.registerRenderThings();
		
		//tile entities
//		GameRegistry.registerTileEntity(TileEntitySlugContainerEntity.class, "tileEntitySlugContainer");
		
		//events
		MinecraftForge.EVENT_BUS.register(new SlugterraEventHandler());
		NetworkRegistry.INSTANCE.registerGuiHandler(MainRegistry.modInstance, new GUIHandler());
		MinecraftForge.EVENT_BUS.register(new SlugterraKeyHandler());
		
		//world generators
//		GameRegistry.registerWorldGenerator(new WorldGeneratorTheDrop(), 1);
//		GameRegistry.registerWorldGenerator(new WorldGeneratorGreatForge(), 2);
//		GameRegistry.registerWorldGenerator(new WorldGeneratorBullseyeGhoul(), 2);
//		GameRegistry.registerWorldGenerator(new WorldGenMushrooms(), 1);
//		GameRegistry.registerWorldGenerator(new WorldGeneratorShaneHideout(), 3);
		
	}

	/**
	 * Loads after
	 * @param PostEvent
	 */
	@EventHandler
	public void PostLoad(FMLPostInitializationEvent PostEvent){
		proxy.postInit(PostEvent);
	}
}
