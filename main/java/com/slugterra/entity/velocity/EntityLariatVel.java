package com.slugterra.entity.velocity;

import java.util.Random;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.slugterra.entity.protoform.EntityLariat;

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
			//ability 1
			if (abilint == 0){
				
				this.setDead();
			}
	
			//ability 2
			else if(abilint == 1){
				
			}
		}else{
			
		}
	}
}
