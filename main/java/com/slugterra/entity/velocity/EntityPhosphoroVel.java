package com.slugterra.entity.velocity;

import java.util.List;
import java.util.Random;

import com.slugterra.entity.protoform.EntityPhosphoro;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EntityPhosphoroVel extends EntityVel{

	private float damage = 6.0F;
	public static int max = 3;
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

			System.out.println("Polling abilities...");
			//arcalyte ability
			if (abilint == 0){
				System.out.println("Arcalyte activated!!");
				worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 2.0F, false);
				for (int j = 0; j < 1000; ++j){
					this.worldObj.spawnParticle("reddust", this.posX, this.posY, this.posZ, 1.0D, 1.0D, 1.0D);
				}
				this.setDead();
			}

			//flashbang ability
			else if(abilint == 1){
				System.out.println("flashbang activated!!");
				List players = this.worldObj.playerEntities;
				for (int a=0;a<players.size();a++){
					if(((EntityPlayer)players.get(a)).canEntityBeSeen(this)){
						((EntityPlayer)players.get(a)).addPotionEffect(new PotionEffect(15, 75));
						((EntityPlayer)players.get(a)).addPotionEffect(new PotionEffect(16, 75));
					}
				}
			}

			//Beamblaze ability
			else if (abilint == 2){
				System.out.println("Beamblaze activated!!");
				EntityPlayerMP player = (EntityPlayerMP) this.worldObj.getClosestPlayerToEntity(this, 30.0f);
				if (player != null){
					player.addPotionEffect(new PotionEffect(15, 125));
					player.addPotionEffect(new PotionEffect(16, 125));
					player.setFire(2);
				}
			}

			//Blazerain ability
			else if (abilint == 3){
				for (int a=1;a<25;a++){
					EntityBolt toSpawn = new EntityBolt(this.worldObj, this.posX, this.posY, this.posZ, this.motionX, this.motionY, this.motionZ);
					this.worldObj.spawnEntityInWorld(toSpawn);
				}
			}
		}
	}

}
