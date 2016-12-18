package com.slugterra.entity.velocity;

import java.util.Random;

import com.slugterra.entity.protoform.EntityRamstone;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

public class EntityRamstoneVel extends EntityVel{

	private float damage = 6.0F;
	public static int power = 2;
	public static int min = 0;
	public static int max = 2;

	public EntityRamstoneVel(World p_i1776_1_) {
		super(p_i1776_1_);
	}

	public EntityRamstoneVel(World world, EntityLivingBase entity, int friend, String name)
	{
    	this(world, entity);
    	this.name = name;
    	this.friendship = friend;
	}
	
	public EntityRamstoneVel(World world, EntityLivingBase entity)
	{
		super(world, entity);
		if (this.name == null)
			this.protoform = new EntityRamstone(world);
		else
			this.protoform = new EntityRamstone(world, this.name);
		this.elementParticle = "blockcrack";
	}
	
	@Override
	public void activateSlugAbility(boolean onGround){
		Random ability = new Random();
		int abilint = ability.nextInt(max + 1);
		if (onGround){
			//firewall ability
			if (!this.worldObj.isRemote && abilint == 0){
				//this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ, 3.0F, true, false);
				System.out.println("Activating explosion on server side");
				this.setDead();
			}
	
			//flamespire ability
			else if(abilint == 1){
				//new WorldGeneratorFlameSpire().generateSlugterra(this.worldObj, new Random(), (int)this.posX, (int)this.posZ);
			}
		}else{
			System.out.println("Activating ability");
		}
	}
}
