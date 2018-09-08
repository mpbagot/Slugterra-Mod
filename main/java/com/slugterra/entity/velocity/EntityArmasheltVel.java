package com.slugterra.entity.velocity;

import java.util.Random;

import com.slugterra.capabilities.ISlugInv;
import com.slugterra.capabilities.SlugInventoryProvider;
import com.slugterra.entity.protoform.EntityArmashelt;
import com.slugterra.inventory.InventorySlug;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class EntityArmasheltVel extends EntityVel{

	private float damage = 6.0F;
	public static int power = 5;
	public static int min = 0;
	public static int max = 2;

	public EntityArmasheltVel(World p_i1776_1_) {
		super(p_i1776_1_);
	}

	public EntityArmasheltVel(World world, EntityLivingBase entity, int friend, String name)
	{
		this(world, entity);
		this.name = name;
		this.friendship = friend;
	}

	public EntityArmasheltVel(World world, EntityLivingBase entity)
	{
		super(world, entity);
		this.elementParticle = EnumParticleTypes.BLOCK_CRACK;
		if (this.name != null)
			this.protoform = new EntityArmashelt(world, this.name);
		else
			this.protoform = new EntityArmashelt(world);
	}

	@Override
	public void activateSlugAbility(boolean onGround){
		Random ability = new Random();
		int abilint = ability.nextInt(max + 1);
		if (onGround){
			//canonbolt ability
			if (abilint == 0){
				System.out.println("CanonBolt Activated!");
				this.world.newExplosion(this, this.posX, this.posY, this.posZ, 1.0F, false, true);
			}

			//afterburner
			else if(abilint == 1){
				System.out.println("Afterburner Activated!");
				this.hitE.startRiding(this);
				//this.riddenByEntity = this.hitE;
				this.motionY = 2.0f;
				this.killColl = false;
			}

			//sluglift
			else if(abilint == 2){
				System.out.println("SlugLift Activated!");
				EntityPlayerMP p = (EntityPlayerMP)this.world.getClosestPlayerToEntity(this, 2.0F);
				if (p != this.shooter && p != null){
					ISlugInv props = p.getCapability(SlugInventoryProvider.INV_CAP, null);
					InventorySlug inventory = props.getInventory();
					inventory.setInventorySlotContents(new Random().nextInt(5), ItemStack.EMPTY);
					props.setInventory(inventory);
				}
			}
		}
		//bruise missile
		else{
			System.out.println("Bruise Missile Activated!");
			EntityPlayerMP enemy = (EntityPlayerMP)this.world.getClosestPlayerToEntity(this, 20.0f);
			if (enemy != this.shooter){
				this.target = enemy;
				this.impactAbility = false;
			}
		}
	}
}
