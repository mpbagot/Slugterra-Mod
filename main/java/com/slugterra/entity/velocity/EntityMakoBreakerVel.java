package com.slugterra.entity.velocity;

import java.util.Random;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.slugterra.entity.protoform.EntityMakoBreaker;

public class EntityMakoBreakerVel extends EntityVel{

    private float damage = 6.0F;
    public static int min = 0;
    public static int max = 2;
	
	public EntityMakoBreakerVel(World p_i1776_1_) {
		super(p_i1776_1_);
	}
	
	public EntityMakoBreakerVel(World world, EntityLivingBase entity, int friend, String name)
	{
    	this(world, entity);
    	this.name = name;
    	this.friendship = friend;
	}
	
	public EntityMakoBreakerVel(World world, EntityLivingBase entity)
	{
		super(world, entity);
		this.elementParticle = "bubble";
		if (this.name == null)
			this.protoform = new EntityMakoBreaker(world);
		else
			this.protoform = new EntityMakoBreaker(world, this.name);
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
				this.setDead();
			}
		}else{
			
		}
	}
}
