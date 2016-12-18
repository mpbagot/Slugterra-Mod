package com.slugterra.item;

import com.slugterra.entity.properties.ExtendedPlayer;
import com.slugterra.entity.velocity.EntityArmasheltVel;
import com.slugterra.entity.velocity.EntityInfernusVel;
import com.slugterra.entity.velocity.EntityLariatVel;
import com.slugterra.entity.velocity.EntityMakoBreakerVel;
import com.slugterra.entity.velocity.EntityPhosphoroVel;
import com.slugterra.entity.velocity.EntityRamstoneVel;
import com.slugterra.entity.velocity.EntityVel;
import com.slugterra.item.slugs.ItemSlug;
import com.slugterra.lib.Strings;
import com.slugterra.main.MainRegistry;
import com.slugterra.packets.SyncPlayerPropsPacket;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class DefenderBlaster extends Item{

	public static final boolean aimedBlaster = true;
	private int damage;
	private static int health = 20;
	private float slugskill;
	public boolean hasAccelerator = false;
	public boolean hasExtendBarrel = false;
	public boolean hasDoubleBarrel = false;

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	{
		if (!world.isRemote){
			ExtendedPlayer props = ExtendedPlayer.get(player);
			if (props.reCheckFiring() == true) {
				ItemStack selectslug = props.inventory.getStackInSlot(props.invslot);
				if (selectslug != null) {
					((ItemSlug)selectslug.getItem()).skill += 0.5F;
					this.slugskill = ((ItemSlug)selectslug.getItem()).skill;
					((ItemSlug)selectslug.getItem()).updateFriendship(1, true);
					((ItemSlug)selectslug.getItem()).updatePower();
					int tempFriend = ((ItemSlug)selectslug.getItem()).friendship;
					String name = ((ItemSlug)selectslug.getItem()).name;
					EntityVel velocimorphEntity = null;
					world.playSoundAtEntity((Entity)player, Strings.MODID + ":blasters.defender.shoot", 1.0F, 1.0F);

					if (!player.isInWater()){
						world.spawnParticle("smoke", player.posX, player.posY+1, player.posZ, 1.2D, 1.2D, 1.2D);
						if (selectslug.getItem() == SlugsTube.infernus)
							velocimorphEntity = new EntityInfernusVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectslug.getItem() == SlugsTube.lariat)
							velocimorphEntity = new EntityLariatVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectslug.getItem() == SlugsTube.makobreaker)
							velocimorphEntity = new EntityMakoBreakerVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectslug.getItem() == SlugsTube.phosphoro)
							velocimorphEntity = new EntityPhosphoroVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectslug.getItem() == SlugsTube.armashelt)
							velocimorphEntity = new EntityArmasheltVel(world, player, tempFriend, name).setPower(this.slugskill);

						else if (selectslug.getItem() == SlugsTube.ramstone)
							velocimorphEntity = new EntityRamstoneVel(world, player, tempFriend, name).setPower(this.slugskill);

						if (velocimorphEntity != null){
							velocimorphEntity.name = name;
							world.spawnEntityInWorld(velocimorphEntity);
						}
					}

					else{
						if (selectslug.getItem() == SlugsTube.lariat)
							world.spawnEntityInWorld(new EntityLariatVel(world, player, tempFriend, name).setPower(this.slugskill));

						else if (selectslug.getItem() == SlugsTube.jellyish)
							//spawn jellyish
							System.out.println("Firing Jellyish");

						else if (((ItemSlug) selectslug.getItem()).isInTorpedoShell() == true){
							if (selectslug.getItem() == SlugsTube.infernus)
								world.spawnEntityInWorld(new EntityInfernusVel(world, player, tempFriend, name).setPower(this.slugskill));

							else if (selectslug.getItem() == SlugsTube.makobreaker)
								world.spawnEntityInWorld(new EntityMakoBreakerVel(world, player, tempFriend, name).setPower(this.slugskill));

							else if (selectslug.getItem() == SlugsTube.phosphoro)
								world.spawnEntityInWorld(new EntityPhosphoroVel(world, player, tempFriend, name).setPower(this.slugskill));
						}
					}
					if (((ItemSlug)props.inventory.getStackInSlot(props.invslot).getItem()).power > 30)this.health--;
					props.inventory.decrStackSize(props.invslot, 1);
					player.addExperience(2);
					player.inventory.setInventorySlotContents(player.inventory.getFirstEmptyStack(), new ItemStack(SlugterraItems.slugtubeItem));
					MainRegistry.packetPipeline.sendTo(new SyncPlayerPropsPacket(player), (EntityPlayerMP) player);
				}
			}
			if (this.health <= 0)itemstack.stackSize--;
		}
		return itemstack;
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
