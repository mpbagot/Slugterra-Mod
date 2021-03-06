package com.slugterra.entity.velocity;

import java.util.List;
import java.util.Random;

import com.slugterra.entity.EntityBolt;
import com.slugterra.entity.protoform.EntityPhosphoro;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class EntityPhosphoroVel extends EntityVel{

	private float damage = 6.0F;
	public static int max = 4;
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
		this.elementParticle = EnumParticleTypes.CRIT;
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
				this.world.createExplosion(this, this.posX, this.posY, this.posZ, 2.0F, false);
				for (int j = 0; j < 1000; ++j){
					this.world.spawnParticle(EnumParticleTypes.REDSTONE, this.posX, this.posY, this.posZ, 1.0D, 1.0D, 1.0D);
				}
			}

			//flashbang ability
			else if(abilint == 1){
				System.out.println("flashbang activated!!");
				List<EntityPlayer> players = this.world.playerEntities;
				for (int a = 0; a < players.size(); a++){
					if(((EntityPlayer)players.get(a)).canEntityBeSeen(this)){
						((EntityPlayer)players.get(a)).addPotionEffect(new PotionEffect(Potion.REGISTRY.getObjectById(15), 75));
						((EntityPlayer)players.get(a)).addPotionEffect(new PotionEffect(Potion.REGISTRY.getObjectById(16), 75));
					}
				}
			}

			//Beamblaze ability
			else if (abilint == 2){
				System.out.println("Beamblaze activated!!");
				EntityPlayerMP player = (EntityPlayerMP) this.world.getClosestPlayerToEntity(this, 30.0f);
				if (player != null){
					player.addPotionEffect(new PotionEffect(Potion.REGISTRY.getObjectById(15), 125));
					player.addPotionEffect(new PotionEffect(Potion.REGISTRY.getObjectById(16), 125));
					player.setFire(2);
				}
			}

			//Blazerain ability
			else if (abilint == 3){
				for (int a=1;a<25;a++){
					//TODO Fix the rendering of these
					EntityBolt toSpawn = new EntityBolt(this.world, this.posX + new Random().nextInt(a), this.posY + new Random().nextInt(a), this.posZ + new Random().nextInt(a), this.motionX, this.motionY, this.motionZ);
					this.world.spawnEntity(toSpawn);
				}
			}
		}
	}

}
