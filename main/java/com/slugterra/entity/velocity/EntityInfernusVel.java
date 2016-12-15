package com.slugterra.entity.velocity;

import java.util.Random;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.slugterra.entity.protoform.EntityInfernus;
import com.slugterra.world.slugability.WorldGeneratorFlameSpire;

public class EntityInfernusVel extends EntityVel{

	private float damage = 6.0F;
	public static int power = 2;
	public static int min = 0;
	public static int max = 2;

	public EntityInfernusVel(World p_i1776_1_) {
		super(p_i1776_1_);
	}

	public EntityInfernusVel(World world, EntityLivingBase entity, int friend, String name)
	{
    	this(world, entity);
    	this.name = name;
    	this.friendship = friend;
	}
	
	public EntityInfernusVel(World world, EntityLivingBase entity)
	{
		super(world, entity);
		if (this.name == null)
			this.protoform = new EntityInfernus(world);
		else
			this.protoform = new EntityInfernus(world, this.name);
		this.elementParticle = "flame";
	}
	
	@Override
	public void activateSlugAbility(boolean onGround){
		Random ability = new Random();
		int abilint = ability.nextInt(max + 1);
		if (onGround){
			//firewall ability
			if (abilint == 0){
				this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ, 3.0F, true, false);
				System.out.println("Activating explosion on server side");
				this.setDead();
			}
	
			//flamespire ability
			else if(abilint == 1){
				new WorldGeneratorFlameSpire().generateSlugterra(this.worldObj, new Random(), (int)this.posX, (int)this.posZ);
			}
		}else{
			System.out.println("Activating ability");
		}
	}
}
