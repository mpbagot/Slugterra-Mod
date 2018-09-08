package com.slugterra.block.tileentity;

import com.slugterra.block.state.DropBlockState;
import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.dimension.TeleporterSlugterra;
import com.slugterra.main.MainRegistry;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class TileEntityDropBlock extends BlockContainer {
	
	public TileEntityDropBlock(Material material) {
		super(material);
		this.setCreativeTab(SlugterraCreativeTabs.tabMisc);
		this.setRegistryName("drop_seat");
		this.setDefaultState(new DropBlockState());
		this.getDefaultState().isOpaqueCube();
	}
	
	public TileEntity createNewTileEntity(World world, int num) {
		return new TileEntityDropEntity();
	}
	
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        if (entity.getRidingEntity() == null && entity.getRecursivePassengers().isEmpty() && entity instanceof EntityPlayerMP)
        {
        	EntityPlayerMP player = (EntityPlayerMP) entity;
        	FMLCommonHandler.instance().getMinecraftServerInstance();
        	MinecraftServer server = Minecraft.getMinecraft().getIntegratedServer().getServer();
        	
        	if (player.timeUntilPortal > 0) {
        		player.timeUntilPortal = 10;
        	} else if (player.dimension != MainRegistry.dimensionIdSlugterra) {
        		player.timeUntilPortal = 10;
        		player.mcServer.getPlayerList().transferPlayerToDimension(player, MainRegistry.dimensionIdSlugterra, new TeleporterSlugterra(server.worldServerForDimension(MainRegistry.dimensionIdSlugterra)));
        	} else {
        		player.timeUntilPortal = 10;
        		player.mcServer.getPlayerList().transferPlayerToDimension(player, 0, new TeleporterSlugterra(server.worldServerForDimension(0)));
        	}
        }
    }

	public boolean tryToCreatePortal(World world, int x, int y, int z){
    	return false;
    }
	
}