package com.slugterra.main;

import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.events.SlugterraEventHandler;
import com.slugterra.events.SlugterraKeyHandler;
import com.slugterra.gui.GUIHandler;
import com.slugterra.lib.Strings;
import com.slugterra.packets.MechaAnimPacket;
import com.slugterra.packets.OpenGuiPacket;
import com.slugterra.packets.SyncPlayerPropsPacket;
import com.slugterra.packets.UpdateSlotPacket;
import com.slugterra.world.WorldGenMushrooms;
import com.slugterra.world.WorldGeneratorBullseyeGhoul;
import com.slugterra.world.WorldGeneratorGreatForge;
import com.slugterra.world.WorldGeneratorShaneHideout;
import com.slugterra.world.WorldGeneratorTheDrop;

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
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = Strings.MODID, name = Strings.name, version = Strings.version)

public class MainRegistry {

	// Define the proxies which are used for registering objects on a specific side of the Minecraft instance
	@SidedProxy(clientSide = "com.slugterra.main.ClientProxy", serverSide = "com.slugterra.main.ServerProxy")
	public static CommonProxy proxy;

	@Instance(Strings.MODID)
	public static MainRegistry modInstance = new MainRegistry();
	
	public static SimpleNetworkWrapper network;

	// Define the indices for the GUI screens
	private static int modGuiIndex = 0;
	public static final int GUI_SLUG_INV = modGuiIndex++;
	public static final int GUI_SLUG_RACK = modGuiIndex++;

	// Find an unused id for the new dimension of slugterra
	public static final int dimensionIdSlugterra = DimensionManager.getNextFreeDimId();

	/**
	 * Loads before
	 * @param PreEvent
	 */
	@EventHandler
	public void PreLoad(FMLPreInitializationEvent PreEvent){
		// Create and add the tabs for the creative inventory
		SlugterraCreativeTabs.initialiseTabs();
		
		// Run the pre-initialisation on each side (client and server), while maintaining separation using proxies 
		proxy.preInit(PreEvent);
		// Register entity renderers through the proxy (this calls an empty function on the server)
		proxy.registerRenderThings();
		
		// Dimension and Biomes
		// TODO This code was written for Minecraft 1.7.10. At present, no effort has been put into updating it.
//		DimensionType dimensionTypeSlugterra = DimensionType.register("SLUGTERRA", "_slugterra", dimensionIdSlugterra, WorldProviderSlugterra.class, true);
//		DimensionManager.registerDimension(dimensionIdSlugterra, dimensionTypeSlugterra);
//		BiomeRegistry.mainRegistry();
		
		// Packets
		// These packets are used to synchronise data between the Minecraft Server and Client.
	    network = NetworkRegistry.INSTANCE.newSimpleChannel("SlugChannelNew");
	    // Tells the server about a mecha entity starting to jump
	    network.registerMessage(MechaAnimPacket.Handler.class, MechaAnimPacket.class, 0, Side.SERVER);
	    // Tells the server about the opening of the slug inventory gui by a client
	    network.registerMessage(OpenGuiPacket.Handler.class, OpenGuiPacket.class, 1, Side.SERVER);
	    // Tells a client to open the slug inventory
	    network.registerMessage(SyncPlayerPropsPacket.Handler.class, SyncPlayerPropsPacket.class, 2, Side.CLIENT);
	    // Synchronises the slug belt selection index to the server from client
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
		// TODO TileEntities changed from 1.7.10 to current versions. They are potentially unnecessary now.
		// This tile entity was used for the slug container, which is essentially a chest which holds Slugs.
//		GameRegistry.registerTileEntity(TileEntitySlugContainerEntity.class, "tileEntitySlugContainer");
		
		//events
		MinecraftForge.EVENT_BUS.register(new SlugterraEventHandler());
		NetworkRegistry.INSTANCE.registerGuiHandler(MainRegistry.modInstance, new GUIHandler());
		MinecraftForge.EVENT_BUS.register(new SlugterraKeyHandler());
		
		//world generators
		// These are used to generate structures and plants in the overworld and in Slugterra.
		GameRegistry.registerWorldGenerator(new WorldGeneratorTheDrop(), 1);
		GameRegistry.registerWorldGenerator(new WorldGeneratorGreatForge(), 2);
		GameRegistry.registerWorldGenerator(new WorldGeneratorBullseyeGhoul(), 2);
		GameRegistry.registerWorldGenerator(new WorldGenMushrooms(), 1);
		GameRegistry.registerWorldGenerator(new WorldGeneratorShaneHideout(), 3);
		
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
