package com.slugterra.entity.velocity;

import java.util.Random;

import com.slugterra.block.SlugterraBlocks;
import com.slugterra.entity.protoform.EntityLariat;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EntityLariatVel extends EntityVel{

	private float damage = 6.0F;
	public static int min = 0;
	public static int max = 2;

	public EntityLariatVel(World p_i1776_1_) {
		super(p_i1776_1_);
	}

	public EntityLariatVel(World world, EntityLivingBase entity, int friend, String name)
	{
		this(world, entity);
		this.name = name;
		this.friendship = friend;
	}

	public EntityLariatVel(World world, EntityLivingBase entity)
	{
		super(world, entity);
		if (this.name == null)
			this.protoform = new EntityLariat(world);
		else
			this.protoform = new EntityLariat(world, this.name);
		this.elementParticle = "bubble";
	}

	@Override
	public void activateSlugAbility(boolean onGround){
		Random ability = new Random();
		int abilint = ability.nextInt(max);
		if (onGround){
			//Stringler ability
			if (abilint == 0){
				System.out.println("Stringler actvated!!!");
				int y = 0;
				while (this.worldObj.getBlock((int)this.posX, (int)this.posY-y, (int)this.posZ) == Blocks.air){
					this.worldObj.setBlock((int)this.posX, (int)this.posY-y, (int)this.posZ, SlugterraBlocks.slimeRope);
					y++;
				}
			}

			//Stinklash ability
			else if(abilint == 1){
				if (this.hitE instanceof EntityPlayer){
					((EntityPlayer)this.hitE).addPotionEffect(new PotionEffect(9, 125));
				}
			}
		} else {
			
		}
	}
}
