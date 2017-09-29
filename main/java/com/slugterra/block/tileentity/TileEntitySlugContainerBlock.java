package com.slugterra.block.tileentity;

import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.item.slugs.ItemSlug;
import com.slugterra.lib.Strings;
import com.slugterra.main.MainRegistry;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntitySlugContainerBlock extends BlockContainer{
	
	public TileEntitySlugContainerBlock(Material material){
		super(material);
		this.setCreativeTab(SlugterraCreativeTabs.tabMisc);
		this.setRegistryName("SlugContainer");
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	}

	public TileEntity createNewTileEntity(World world, int num){
		return new TileEntitySlugContainerEntity();
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

	public void registerIcons(IIconRegister icon){
		this.blockIcon = icon.registerIcon(Strings.MODID + ":slugcontainer");
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
	{
		if (world.isRemote)
		{
			return true;
		}
		else
		{
			TileEntitySlugContainerEntity te = ((TileEntitySlugContainerEntity)world.getTileEntity(x, y, z));

			if (player.inventory.getCurrentItem() != null && player.inventory.getCurrentItem().getItem() instanceof ItemSlug){
				if (te.getFirstEmptySlot() != -1){
					te.setInventorySlotContents(te.getFirstEmptySlot(), player.inventory.getCurrentItem());
					player.inventory.setInventorySlotContents(player.inventory.currentItem, null);
				}
			} else if (player.inventory.getCurrentItem() == null){
				if (te.getLastFullSlot() != -1){
					player.inventory.setInventorySlotContents(player.inventory.currentItem, te.getStackInSlot(te.getLastFullSlot()));
					te.setInventorySlotContents(te.getLastFullSlot(), null);
				} else {
					player.openGui(MainRegistry.modInstance, MainRegistry.GUI_SLUG_RACK, world, x, y, z);;
					return true;
				}
			} else {
				player.openGui(MainRegistry.modInstance, MainRegistry.GUI_SLUG_RACK, world, x, y, z);;
				return true;
			}
			player.openGui(MainRegistry.modInstance, MainRegistry.GUI_SLUG_RACK, world, x, y, z);;
			player.closeScreen();
			return true;
		}
	}
}