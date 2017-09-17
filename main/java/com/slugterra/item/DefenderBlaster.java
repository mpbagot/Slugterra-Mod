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
import com.slugterra.main.MainRegistry;
import com.slugterra.packets.SyncPlayerPropsPacket;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class DefenderBlaster extends Item{

	public static final boolean aimedBlaster = true;
	private int damage;
	private static int health = 20;
	private float slugskill;
	public boolean hasAccelerator = false;
	public boolean hasExtendBarrel = false;
	public boolean hasDoubleBarrel = false;

	public DefenderBlaster(String name) {
		super();
		setFull3D();
		setUnlocalizedName(name);
		setCreativeTab(SlugterraCreativeTabs.tabBlasters);
		setMaxStackSize(1);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand)
	{
		if (!world.isRemote){
			IBlaster blasterProps = player.getHeldItemMainhand().getCapability(BlasterProvider.BLASTER_CAP, null);
			ISlugInv invProps = player.getCapability(SlugInventoryProvider.INV_CAP, null);
			
			if (blasterProps.reCheckFiring() == true) {
				ItemStack selectslug = invProps.getInventory().getStackInSlot(invProps.getSlot());
				if (selectslug != ItemStack.EMPTY) {
					((ItemSlug)selectslug.getItem()).skill += 0.5F;
					this.slugskill = ((ItemSlug)selectslug.getItem()).skill;
					((ItemSlug)selectslug.getItem()).updateFriendship(1, true);
					((ItemSlug)selectslug.getItem()).updatePower();
					int tempFriend = ((ItemSlug)selectslug.getItem()).friendship;
					String name = ((ItemSlug)selectslug.getItem()).name;
					EntityVel velocimorphEntity = null;
					player.playSound(SlugterraSoundEvents.blasterShot, 1.0F, 1.0F);

					if (!player.isInWater()){
//						world.spawnParticle("smoke", player.posX, player.posY+1, player.posZ, 1.2D, 1.2D, 1.2D);
						if (selectslug.getItem() == SlugItemRegistry.infernus)
							velocimorphEntity = new EntityInfernusVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectslug.getItem() == SlugItemRegistry.lariat)
							velocimorphEntity = new EntityLariatVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectslug.getItem() == SlugItemRegistry.grenuke)
							velocimorphEntity = new EntityGrenukeVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectslug.getItem() == SlugItemRegistry.makobreaker)
							velocimorphEntity = new EntityMakoBreakerVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectslug.getItem() == SlugItemRegistry.phosphoro)
							velocimorphEntity = new EntityPhosphoroVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectslug.getItem() == SlugItemRegistry.armashelt)
							velocimorphEntity = new EntityArmasheltVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectslug.getItem() == SlugItemRegistry.ramstone)
							velocimorphEntity = new EntityRamstoneVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectslug.getItem() == SlugItemRegistry.tazerling)
							velocimorphEntity = new EntityTazerlingVel(world, player, tempFriend, name).setPower(this.slugskill);

						if (velocimorphEntity != null){
							velocimorphEntity.name = name;
							world.spawnEntity(velocimorphEntity);
						}
					}

					else{
						if (selectslug.getItem() == SlugItemRegistry.lariat)
							world.spawnEntity(new EntityLariatVel(world, player, tempFriend, name).setPower(this.slugskill));

						else if (selectslug.getItem() == SlugItemRegistry.makobreaker)
							world.spawnEntity(new EntityMakoBreakerVel(world, player, tempFriend, name).setPower(this.slugskill));

						else if (selectslug.getItem() == SlugItemRegistry.jellyish)
							//spawn jellyish
							System.out.println("Firing Jellyish");

						else if (((ItemSlug) selectslug.getItem()).isInTorpedoShell() == true){
							if (selectslug.getItem() == SlugItemRegistry.infernus)
								world.spawnEntity(new EntityInfernusVel(world, player, tempFriend, name).setPower(this.slugskill));

							else if (selectslug.getItem() == SlugItemRegistry.phosphoro)
								world.spawnEntity(new EntityPhosphoroVel(world, player, tempFriend, name).setPower(this.slugskill));

							else if (selectslug.getItem() == SlugItemRegistry.tazerling)
								world.spawnEntity(new EntityTazerlingVel(world, player, tempFriend, name).setPower(this.slugskill));

							else if (selectslug.getItem() == SlugItemRegistry.armashelt)
								world.spawnEntity(new EntityArmasheltVel(world, player, tempFriend, name).setPower(this.slugskill));

							else if (selectslug.getItem() == SlugItemRegistry.ramstone)
								world.spawnEntity(new EntityRamstoneVel(world, player, tempFriend, name).setPower(this.slugskill));

							else if (selectslug.getItem() == SlugItemRegistry.grenuke)
								world.spawnEntity(new EntityGrenukeVel(world, player, tempFriend, name).setPower(this.slugskill));



						}
					}
					if (((ItemSlug)invProps.getInventory().getStackInSlot(invProps.getSlot()).getItem()).power > 30)this.health--;
					
					InventorySlug inventory = invProps.getInventory();
					inventory.decrStackSize(invProps.getSlot(), 1);
					invProps.setInventory(inventory);
					
					player.addExperience(2);
					player.inventory.setInventorySlotContents(player.inventory.getFirstEmptyStack(), new ItemStack(ItemRegistry.slugtubeItem));
					MainRegistry.network.sendTo(new SyncPlayerPropsPacket(player), (EntityPlayerMP) player);
				}
			}
		}
		return new ActionResult(EnumActionResult.SUCCESS, new ItemStack(this));
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
