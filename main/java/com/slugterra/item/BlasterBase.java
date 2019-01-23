package com.slugterra.item;

import com.slugterra.capabilities.BlasterProvider;
import com.slugterra.capabilities.IBlaster;
import com.slugterra.capabilities.ISlugInv;
import com.slugterra.capabilities.SlugInventoryProvider;
import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.entity.velocity.EntityArmasheltVel;
import com.slugterra.entity.velocity.EntityGrenukeVel;
import com.slugterra.entity.velocity.EntityInfernusVel;
import com.slugterra.entity.velocity.EntityLariatVel;
import com.slugterra.entity.velocity.EntityMakoBreakerVel;
import com.slugterra.entity.velocity.EntityPhosphoroVel;
import com.slugterra.entity.velocity.EntityRamstoneVel;
import com.slugterra.entity.velocity.EntityTazerlingVel;
import com.slugterra.entity.velocity.EntityVel;
import com.slugterra.events.SlugterraSoundEvents;
import com.slugterra.inventory.InventorySlug;
import com.slugterra.item.slugs.ItemSlug;
import com.slugterra.lib.Strings;
import com.slugterra.main.MainRegistry;
import com.slugterra.packets.SyncPlayerPropsPacket;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class BlasterBase extends Item{

	private int damage;
	private int health = 20;
	private float slugskill;
	public boolean hasAccelerator = false;
	public boolean hasExtendBarrel = false;
	public boolean hasDoubleBarrel = false;

	public BlasterBase(String name) {
		super();
		setUnlocalizedName(name);
		setRegistryName(Strings.MODID, name);
		setCreativeTab(SlugterraCreativeTabs.tabBlasters);
		setMaxStackSize(1);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand)
	{
		if (!world.isRemote){
			IBlaster blasterProps = player.getHeldItemMainhand().getCapability(BlasterProvider.BLASTER_CAP, null);
			ISlugInv invProps = player.getCapability(SlugInventoryProvider.INV_CAP, null);
			
			if (blasterProps.isReadyToFire()) {
				InventorySlug inventory = invProps.getInventory();
				ItemStack selectedStack = inventory.getStackInSlot(invProps.getSlot());
				
				if (selectedStack != ItemStack.EMPTY) {
					ItemSlug selectedSlug = (ItemSlug) selectedStack.getItem();
					
					selectedSlug.skill += 0.5F;
					this.slugskill = selectedSlug.skill;
					selectedSlug.updateFriendship(1, true);
					selectedSlug.updatePower();
					
					int tempFriend = selectedSlug.friendship;
					String name = selectedSlug.name;
					EntityVel velocimorphEntity = null;
					player.playSound(SlugterraSoundEvents.blasterShot, 1.0F, 1.0F);

					// Fire a normal slug if not in water, or it is in a torpedo shell
					if (!player.isInWater() || selectedSlug.isInTorpedoShell()){
						world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, player.posX, player.posY+1, player.posZ, 1.2D, 1.2D, 1.2D);
						
						if (selectedSlug == SlugItemRegistry.infernus)
							velocimorphEntity = new EntityInfernusVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectedSlug == SlugItemRegistry.lariat)
							velocimorphEntity = new EntityLariatVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectedSlug == SlugItemRegistry.grenuke)
							velocimorphEntity = new EntityGrenukeVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectedSlug == SlugItemRegistry.makobreaker)
							velocimorphEntity = new EntityMakoBreakerVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectedSlug == SlugItemRegistry.phosphoro)
							velocimorphEntity = new EntityPhosphoroVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectedSlug == SlugItemRegistry.armashelt)
							velocimorphEntity = new EntityArmasheltVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectedSlug == SlugItemRegistry.ramstone)
							velocimorphEntity = new EntityRamstoneVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectedSlug == SlugItemRegistry.tazerling)
							velocimorphEntity = new EntityTazerlingVel(world, player, tempFriend, name).setPower(this.slugskill);

					} else {
						// Or, fire an aquatic slug if in the water.
						if (selectedSlug == SlugItemRegistry.lariat)
							velocimorphEntity = new EntityLariatVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectedSlug == SlugItemRegistry.makobreaker)
							velocimorphEntity = new EntityMakoBreakerVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectedSlug == SlugItemRegistry.jellyish)
							//spawn jellyish
							System.out.println("Firing Jellyish");

					}
					
					if (velocimorphEntity != null) {
						// Disable the blaster for 2 seconds
						blasterProps.setDelay(2f);

						velocimorphEntity.name = name;
						world.spawnEntity(velocimorphEntity);


						if (selectedSlug.power > 30)
							this.health--;

						inventory.decrStackSize(invProps.getSlot(), 1);
						invProps.setInventory(inventory);

						player.addExperience(2);
						player.inventory.addItemStackToInventory(new ItemStack(ItemRegistry.slugtubeItem));
						MainRegistry.network.sendTo(new SyncPlayerPropsPacket(player), (EntityPlayerMP) player);
					}
				}
			}
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, new ItemStack(this));
	}

	public void updateUpgrades(boolean[] upgradeList){
		this.hasAccelerator = upgradeList[0];
		this.hasExtendBarrel = upgradeList[1];
		this.hasDoubleBarrel = upgradeList[2];
	}

	public boolean[] getUpgrades(){
		boolean[] a = {this.hasAccelerator, this.hasExtendBarrel, this.hasDoubleBarrel};
		return a;
	}
}
