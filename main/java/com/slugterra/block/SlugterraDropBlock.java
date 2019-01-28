package com.slugterra.block;

import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.dimension.TeleporterSlugterra;
import com.slugterra.lib.Strings;
import com.slugterra.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SlugterraDropBlock extends Block {

	public SlugterraDropBlock(Material material) {
		super(material);
		this.setCreativeTab(SlugterraCreativeTabs.tabMisc);
		this.setRegistryName(Strings.MODID, "drop_seat");
		this.setUnlocalizedName("drop_seat");
	}

	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	public boolean isOpaqueCube(IBlockState iBlockState) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState iBlockState) {
		return false;
	}

	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity) {
		System.out.println("Entity collided with a drop seat block at " + pos.toString());
		System.out.println(world.isRemote);

		if (entity.getRidingEntity() == null && entity.getRecursivePassengers().isEmpty() && entity instanceof EntityPlayerMP)
		{
			System.out.println("riding checks passed for drop seat collision");
			EntityPlayerMP player = (EntityPlayerMP) entity;
			MinecraftServer server = Minecraft.getMinecraft().getIntegratedServer().getServer();

			player.timeUntilPortal = 10;
			if (player.dimension != MainRegistry.dimensionIdSlugterra) {
				System.out.println("Transferring to Slugterra.");
				player.mcServer.getPlayerList().transferPlayerToDimension(player, MainRegistry.dimensionIdSlugterra, new TeleporterSlugterra(server.worldServerForDimension(MainRegistry.dimensionIdSlugterra)));
			} else {
				player.mcServer.getPlayerList().transferPlayerToDimension(player, 0, new TeleporterSlugterra(server.worldServerForDimension(0)));
			}
		}
	}	
}