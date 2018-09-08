package com.slugterra.block.state;

import java.util.Collection;
import java.util.List;

import com.google.common.collect.ImmutableMap;
import com.slugterra.block.BlockRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class DropBlockState extends BlockStateBase implements IBlockState {

	@Override
	public Material getMaterial() {
		return Material.IRON;
	}

	@Override
	public boolean isFullBlock() {
		return false;
	}

	@Override
	public boolean canEntitySpawn(Entity entityIn) {
		return false;
	}

	@Override
	public int getLightOpacity() {
		return 0;
	}

	@Override
	public int getLightOpacity(IBlockAccess world, BlockPos pos) {
		return getLightOpacity();
	}

	@Override
	public int getLightValue() {
		return 0;
	}

	@Override
	public int getLightValue(IBlockAccess world, BlockPos pos) {
		return getLightValue();
	}

	@Override
	public boolean isTranslucent() {
		return false;
	}

	@Override
	public boolean useNeighborBrightness() {
		return false;
	}

	@Override
	public MapColor getMapColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBlockState withRotation(Rotation rot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBlockState withMirror(Mirror mirrorIn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFullCube() {
		return false;
	}

	@Override
	public boolean hasCustomBreakingProgress() {
		return false;
	}

	@Override
	public EnumBlockRenderType getRenderType() {
		return EnumBlockRenderType.MODEL;
	}

	@Override
	public int getPackedLightmapCoords(IBlockAccess source, BlockPos pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getAmbientOcclusionLightValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isBlockNormalCube() {
		return false;
	}

	@Override
	public boolean isNormalCube() {
		return false;
	}

	@Override
	public boolean canProvidePower() {
		return false;
	}

	@Override
	public int getWeakPower(IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
		return 0;
	}

	@Override
	public boolean hasComparatorInputOverride() {
		return false;
	}

	@Override
	public int getComparatorInputOverride(World worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public float getBlockHardness(World worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getPlayerRelativeBlockHardness(EntityPlayer player, World worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getStrongPower(IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
		return 0;
	}

	@Override
	public EnumPushReaction getMobilityFlag() {
		return EnumPushReaction.NORMAL;
	}

	@Override
	public IBlockState getActualState(IBlockAccess blockAccess, BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AxisAlignedBB getSelectedBoundingBox(World worldIn, BlockPos pos) {
		return getBoundingBox(worldIn, pos);
	}

	@Override
	public boolean shouldSideBeRendered(IBlockAccess blockAccess, BlockPos pos, EnumFacing facing) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockAccess worldIn, BlockPos pos) {
		return getBoundingBox(worldIn, pos);
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockAccess blockAccess, BlockPos pos) {
		return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 0.7F, 1.0F);
	}

	@Override
	public RayTraceResult collisionRayTrace(World worldIn, BlockPos pos, Vec3d start, Vec3d end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFullyOpaque() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean doesSideBlockRendering(IBlockAccess world, BlockPos pos, EnumFacing side) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSideSolid(IBlockAccess world, BlockPos pos, EnumFacing side) {
		return true;
	}

	@Override
	public Vec3d getOffset(IBlockAccess access, BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean causesSuffocation() {
		return true;
	}

	@Override
	public Collection<IProperty<?>> getPropertyKeys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Comparable<T>> T getValue(IProperty<T> property) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Comparable<T>, V extends T> IBlockState withProperty(IProperty<T> property, V value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Comparable<T>> IBlockState cycleProperty(IProperty<T> property) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImmutableMap<IProperty<?>, Comparable<?>> getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Block getBlock() {
		return BlockRegistry.dropSeat;
	}

	@Override
	public void addCollisionBoxToList(World worldIn, BlockPos pos, AxisAlignedBB entityBox,
			List<AxisAlignedBB> collidingBoxes, Entity entityIn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onBlockEventReceived(World worldIn, BlockPos pos, int id, int param) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void neighborChanged(World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
		// TODO Auto-generated method stub
		
	}

}
