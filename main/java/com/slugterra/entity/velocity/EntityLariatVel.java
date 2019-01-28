package com.slugterra.entity.velocity;

import java.util.Random;

import com.slugterra.block.BlockRegistry;
import com.slugterra.entity.protoform.EntityLariat;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityLariatVel extends EntityVel{

	private float damage = 6.0F;
	public int min = 0;
	public int max = 2;

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
		this.elementParticle = EnumParticleTypes.WATER_BUBBLE;
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
				while (this.world.getBlockState(new BlockPos((int)posX, (int)posY-y, (int)posZ)).getBlock() == Blocks.AIR){
					this.world.setBlockState(new BlockPos((int)posX, (int)posY-y, (int)posZ), BlockRegistry.slimeRope.getDefaultState());
					y++;
				}
			}

			//Stinklash ability
			else if(abilint == 1){
				if (this.hitE instanceof EntityPlayer){
					// Nauseate the player
					((EntityPlayer)this.hitE).addPotionEffect(new PotionEffect(Potion.REGISTRY.getObjectById(9), 125));
				}
			}
		} else {
			
		}
	}
}
