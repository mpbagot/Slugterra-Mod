package com.slugterra.entity.velocity;

import java.util.Random;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.slugterra.entity.protoform.EntityPhosphoro;

public class EntityPhosphoroVel extends EntityVel{

	private float damage = 6.0F;
	public static int max = 2;
	public static int min = 0;

	public EntityPhosphoroVel(World p_i1776_1_) {
		super(p_i1776_1_);
	}
	
	public EntityPhosphoroVel(World world, EntityLivingBase entity, int friend, String name)
	{
    	this(world, entity);
    	this.name = name;
    	this.friendship = friend;
	}

	public EntityPhosphoroVel(World world, EntityLivingBase entity)
	{
		super(world, entity);
		this.elementParticle = "crit";
		if (this.name == null)
			this.protoform = new EntityPhosphoro(world);
		else
			this.protoform = new EntityPhosphoro(world, this.name);
	}

	@Override
	public void activateSlugAbility(boolean onGround){
		Random ability = new Random();
		int abilint = ability.nextInt(max);
		if (!onGround){
			//arcalyte ability
			if (abilint == 0){
				worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 2.0F, false);
				for (int j = 0; j < 1000; ++j){
					this.worldObj.spawnParticle("reddust", this.posX, this.posY, this.posZ, 1.0D, 1.0D, 1.0D);
				}
				this.setDead();
			}
			
			//flashbang ability
			else if(abilint == 1){
				
			}
		}else{
			
		}

	}

}
