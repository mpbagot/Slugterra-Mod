package com.slugterra.block.tileentity;

import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.item.slugs.ItemSlug;
import com.slugterra.lib.Strings;
import com.slugterra.main.MainRegistry;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ChunkCache;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileEntitySlugContainerBlock extends BlockContainer {
	
	public static final IProperty<Integer> ITEM_COUNT = PropertyInteger.create("item_count", 0, 20);
	
	public TileEntitySlugContainerBlock(Material material){
		super(material);
		this.setCreativeTab(SlugterraCreativeTabs.tabMisc);
		this.setRegistryName(Strings.MODID, "slug_container");
		this.setUnlocalizedName("slug_container");
		this.setDefaultState(this.blockState.getBaseState().withProperty(ITEM_COUNT, 0));
	}

	@Override
	public TileEntity createNewTileEntity(World world, int num){
		return new TileEntitySlugContainerEntity();
	}
	
	@Override
	public BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, ITEM_COUNT);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return 0;
	}
	
	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        TileEntity tileentity = worldIn instanceof ChunkCache ? ((ChunkCache)worldIn).getTileEntity(pos, Chunk.EnumCreateEntityType.CHECK) : worldIn.getTileEntity(pos);

        if (tileentity instanceof TileEntitySlugContainerEntity) {
        	TileEntitySlugContainerEntity slugContainer = (TileEntitySlugContainerEntity) tileentity;
        	state = state.withProperty(ITEM_COUNT, slugContainer.getItemCount());
        	System.out.println(slugContainer.getItemCount());
        } else {
        	state = state.withProperty(ITEM_COUNT, 0);
        }
        
        return state;
    }
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state){
		return EnumBlockRenderType.MODEL;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state){
		return false;
	}
	
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		if (world.isRemote)
		{
			return true;
		}
		else
		{
			TileEntitySlugContainerEntity te = ((TileEntitySlugContainerEntity)world.getTileEntity(pos));

			if (player.inventory.getCurrentItem() != ItemStack.EMPTY && player.inventory.getCurrentItem().getItem() instanceof ItemSlug) {
				// Player is attempting to place a slug into the container
				if (te.getFirstEmptySlot() != -1) {
					//
					te.setInventorySlotContents(te.getFirstEmptySlot(), player.inventory.getCurrentItem());
					player.inventory.setInventorySlotContents(player.inventory.currentItem, ItemStack.EMPTY);
				}
			} else if (player.inventory.getCurrentItem() == ItemStack.EMPTY) {
				// Player is not holding any item at all
				if (te.getLastFullSlot() != -1) {
					// If any items are in the container, pull the last one out and empty the slot
					player.inventory.setInventorySlotContents(player.inventory.currentItem, te.getStackInSlot(te.getLastFullSlot()));
					te.setInventorySlotContents(te.getLastFullSlot(), ItemStack.EMPTY);
				} else {
					// If the container is empty, open the inventory gui
					player.openGui(MainRegistry.modInstance, MainRegistry.GUI_SLUG_RACK, world, pos.getX(), pos.getY(), pos.getZ());
					return true;
				}
			} else {
				// Player is holding an item that is not a slug, so open the gui
				player.openGui(MainRegistry.modInstance, MainRegistry.GUI_SLUG_RACK, world, pos.getX(), pos.getY(), pos.getZ());
				return true;
			}
			
			player.openGui(MainRegistry.modInstance, MainRegistry.GUI_SLUG_RACK, world, pos.getX(), pos.getY(), pos.getZ());
			player.closeScreen();
			return true;
		}
	}
}