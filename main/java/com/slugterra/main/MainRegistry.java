package com.slugterra.main;

//test comment for changes

import java.util.List;

import com.slugterra.biomes.BiomeRegistry;
import com.slugterra.block.SlugterraBlocks;
import com.slugterra.block.TileEntitySlugContainerEntity;
import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.dimension.WorldProviderSlugterra;
import com.slugterra.entity.SlugterraEntityRegistry;
import com.slugterra.entity.slingers.EntitySlingers;
import com.slugterra.events.SlugterraEventHandler;
import com.slugterra.events.SlugterraKeyHandler;
import com.slugterra.gui.GUIHandler;
import com.slugterra.gui.GuiSlugBeltOverlay;
import com.slugterra.item.SlugsTube;
import com.slugterra.item.SlugterraItems;
import com.slugterra.lib.Strings;
import com.slugterra.packets.MechaAnimPacket;
import com.slugterra.packets.PacketPipeline;
import com.slugterra.packets.ParticleSpawnPacket;
import com.slugterra.packets.RendPartPacket;
import com.slugterra.world.WorldGenMushrooms;
import com.slugterra.world.WorldGeneratorBullseyeGhoul;
import com.slugterra.world.WorldGeneratorGreatForge;
import com.slugterra.world.WorldGeneratorShaneHideout;
import com.slugterra.world.WorldGeneratorTheDrop;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Strings.MODID, name = Strings.name, version = Strings.version)

public class MainRegistry {

	@SidedProxy(clientSide = "com.slugterra.main.ClientProxy", serverSide = "com.slugterra.main.ServerProxy")
	public static ServerProxy proxy;

	@Instance(Strings.MODID)
	public static MainRegistry modInstance;
	
	public static boolean mcainstalled = false;

	public static final PacketPipeline packetPipeline = new PacketPipeline();
	public static SimpleNetworkWrapper network;

	private static int modGuiIndex = 0;
	public static final int GUI_SLUG_INV = modGuiIndex++;
	public static final int GUI_SLUG_RACK = modGuiIndex++;

	public static final int dimensionIdSlugterra = 73;

	/**
	 * Loads before
	 * @param PreEvent
	 */
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		SlugterraCreativeTabs.initialiseTabs();
		SlugterraItems.mainRegistry();
		SlugterraBlocks.mainRegistry();
		SlugsTube.mainRegistry();
		SlugterraEntityRegistry.mainRegistry();
		CraftingManager.mainRegistry();
		proxy.registerRenderThings();
		EntitySlingers.mainRegistry();
		//dimension stuff
		DimensionManager.registerProviderType(dimensionIdSlugterra, WorldProviderSlugterra.class, true);
		DimensionManager.registerDimension(dimensionIdSlugterra, dimensionIdSlugterra);
		BiomeRegistry.mainRegistry();
		//new packets
	    network = NetworkRegistry.INSTANCE.newSimpleChannel("SlugChannelNew");
	    network.registerMessage(MechaAnimPacket.Handler.class, MechaAnimPacket.class, 0, Side.SERVER);
	    network.registerMessage(ParticleSpawnPacket.Handler.class, ParticleSpawnPacket.class, 0, Side.SERVER);
	    network.registerMessage(RendPartPacket.Handler.class, RendPartPacket.class, 0, Side.CLIENT);
	}

	/**
	 * Loads during
	 * @param event
	 */
	@EventHandler
	public static void load(FMLInitializationEvent event){
		proxy.registerRenderThings();
		
		//tile entitys
		GameRegistry.registerTileEntity(TileEntitySlugContainerEntity.class, "tileEntitySlugContainer");
		
		//events
		MinecraftForge.EVENT_BUS.register(new SlugterraEventHandler());
		NetworkRegistry.INSTANCE.registerGuiHandler(MainRegistry.modInstance, new GUIHandler());
		FMLCommonHandler.instance().bus().register(new SlugterraKeyHandler());
		
		//world generators
		GameRegistry.registerWorldGenerator(new WorldGeneratorTheDrop(), 1);
		GameRegistry.registerWorldGenerator(new WorldGeneratorGreatForge(), 2);
		GameRegistry.registerWorldGenerator(new WorldGeneratorBullseyeGhoul(), 2);
		GameRegistry.registerWorldGenerator(new WorldGenMushrooms(), 1);
		GameRegistry.registerWorldGenerator(new WorldGeneratorShaneHideout(), 3);
		
		//packet pipeline initialisation
		packetPipeline.initialise();
	}

	/**
	 * Loads after
	 * @param PostEvent
	 */
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		packetPipeline.postInitialise();
		MinecraftForge.EVENT_BUS.register(new GuiSlugBeltOverlay(Minecraft.getMinecraft()));
		mcainstalled = Loader.isModLoaded("mca");
		List<ModContainer> modlist = Loader.instance().getActiveModList();
		System.out.println(modlist);
	}
}
