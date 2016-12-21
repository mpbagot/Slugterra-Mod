package com.slugterra.entity.velocity;

import java.util.Random;

import com.slugterra.entity.EntityBolt;
import com.slugterra.entity.protoform.EntityMakoBreaker;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

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
			//finsmash
			if (abilint == 0){
				if (this.hitE instanceof EntityPlayer){
					((EntityPlayer)this.hitE).attackEntityFrom(DamageSource.fall, this.power);
					((EntityPlayer)this.hitE).attackEntityFrom(DamageSource.fall, this.power);
				}
			}

			//Bruteeth
			else if(abilint == 1){
				System.out.println("Bruteeth activated!!");
				this.worldObj.newExplosion(this, posX, posY, posZ, 1.0F, false, true);
			}
		}else{
			if (abilint == 0){
				System.out.println("Razorstorm activated!!");
				for (int a=1;a<19;a++){
					//TODO replace these with teeth objects
					EntityBolt e = new EntityBolt(worldObj, posX+ability.nextInt(a), posY+ability.nextInt(a), posZ+ability.nextInt(a), this.motionX, this.motionY, this.motionZ);
					e.motionX = this.motionX;
					e.motionY = this.motionY;
					e.motionZ = this.motionZ;
					this.worldObj.spawnEntityInWorld(e);
				}
			}
		}
	}
}
