package com.slugterra.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.dimension.TeleporterSlugterra;
import com.slugterra.lib.Strings;
import com.slugterra.main.MainRegistry;

import cpw.mods.fml.common.FMLCommonHandler;

public class TileEntityDropBlock extends BlockContainer{
	
	public TileEntityDropBlock(Material material){
		super(material);
		this.setCreativeTab(SlugterraCreativeTabs.tabMisc);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.7F, 1.0F);
	}
	
	public TileEntity createNewTileEntity(World world, int num){
		return new TileEntityDropEntity();
	}
	
	@Override
	public int getRenderType(){
		return -1;
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
    {
        if (entity.ridingEntity == null && entity.riddenByEntity == null && entity instanceof EntityPlayerMP)
        {
        	EntityPlayerMP player = (EntityPlayerMP) entity;
        	FMLCommonHandler.instance().getMinecraftServerInstance();
        	MinecraftServer server = MinecraftServer.getServer();
        	
        	if (player.timeUntilPortal > 0){
        		player.timeUntilPortal = 10;
        	}
        	else if (player.dimension != MainRegistry.dimensionIdSlugterra){
        		player.timeUntilPortal = 10;
        		player.mcServer.getConfigurationManager().transferPlayerToDimension(player, MainRegistry.dimensionIdSlugterra, new TeleporterSlugterra(server.worldServerForDimension(MainRegistry.dimensionIdSlugterra)));
        	}
        	else{

        		player.timeUntilPortal = 10;
        		player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 0, new TeleporterSlugterra(server.worldServerForDimension(0)));
        	}
        }
    }
	public boolean tryToCreatePortal(World world, int x, int y, int z){
    	return false;
    }
	
}