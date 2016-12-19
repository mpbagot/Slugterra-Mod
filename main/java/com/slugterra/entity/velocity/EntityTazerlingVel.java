package com.slugterra.entity.velocity;

import java.util.Random;

import com.slugterra.entity.properties.ExtendedPlayer;
import com.slugterra.entity.protoform.EntityTazerling;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityTazerlingVel extends EntityVel{

	private float damage = 6.0F;
	public static int power = 2;
	public static int min = 0;
	public static int max = 3;

	public EntityTazerlingVel(World world) {
		super(world);
	}

	public EntityTazerlingVel(World world, EntityLivingBase entity, int friend, String name)
	{
		this(world, entity);
		this.name = name;
		this.friendship = friend;
	}

	public EntityTazerlingVel(World world, EntityLivingBase entity)
	{
		super(world, entity);
		if (this.name == null)
			this.protoform = new EntityTazerling(world);
		else
			this.protoform = new EntityTazerling(world, this.name);
		this.elementParticle = "other";
	}

	@Override
	public void activateSlugAbility(boolean onGround){
		Random ability = new Random();
		int abilint = ability.nextInt(max + 1);
		if (onGround){
			//circuit burst ability
			if (abilint == 0){
				EntityPlayer p = this.worldObj.getClosestPlayerToEntity(this, 5.0f+this.power);
				if (p != null){
					ExtendedPlayer props = ExtendedPlayer.get(p);
					props.disableBlaster();
				}
			}

			//spikescorch ability
			else if (abilint == 2){
				
			}

			//flamespire ability
			else if(abilint == 1){

			}

			else if (abilint == 3){
				System.out.println("Activating NovaClaw!!");
			}

		}else{
			//wingburst ability (OP!!)
			if (abilint == 0){
				System.out.println("Activating wingburst!!");
			}

			//beatwave ability
			else if (abilint == 1){
				System.out.println("Activating beatwave!!");
			}

			//flashfire ability
			else if (abilint == 2){
				System.out.println("Activating flashfire!!");
			}
		}
	}
}
