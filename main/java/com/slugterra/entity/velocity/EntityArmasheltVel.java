package com.slugterra.entity.velocity;

import java.util.Random;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.slugterra.entity.protoform.EntityArmashelt;

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
		this.elementParticle = "blockcrack";
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
			//ability 1
			if (abilint == 0){
				this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ, 3.0F, true, false);
				this.setDead();
			}
	
			//ability 2
			else if(abilint == 1){
				
			}
		}else{
			
		}
	}
}
