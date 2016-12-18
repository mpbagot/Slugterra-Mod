package com.slugterra.entity.velocity;

import java.util.Random;

import com.slugterra.entity.protoform.EntityInfernus;
import com.slugterra.world.slugability.WorldGeneratorFlameSpire;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class EntityInfernusVel extends EntityVel{

	private float damage = 6.0F;
	public static int power = 2;
	public static int min = 0;
	public static int max = 3;

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
				System.out.println("Activating firewall!!");
				this.generateFireWall();
				//this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ, 3.0F, true, false);
				System.out.println("Activating explosion on server side");
				this.setDead();
			}

			//spikescorch ability
			else if (abilint == 2){
				System.out.println("Activating spikescorch!!");
				this.killColl = false;
				if (this.motionX > 0){
					if (this.motionZ > 0){
						this.worldObj.setBlock(Math.round((float)this.posX+1), Math.round((float)this.posY), Math.round((float)this.posZ+1), Blocks.air);
						this.worldObj.setBlock(Math.round((float)this.posX+1), Math.round((float)this.posY), Math.round((float)this.posZ), Blocks.air);
						this.worldObj.setBlock(Math.round((float)this.posX), Math.round((float)this.posY), Math.round((float)this.posZ+1), Blocks.air);

					} else if (this.motionZ < 0){
						this.worldObj.setBlock(Math.round((float)this.posX+1), Math.round((float)this.posY), Math.round((float)this.posZ-1), Blocks.air);
						this.worldObj.setBlock(Math.round((float)this.posX+1), Math.round((float)this.posY), Math.round((float)this.posZ), Blocks.air);
						this.worldObj.setBlock(Math.round((float)this.posX), Math.round((float)this.posY), Math.round((float)this.posZ-1), Blocks.air);

					} else {
						this.worldObj.setBlock(Math.round((float)this.posX+1), Math.round((float)this.posY), Math.round((float)this.posZ), Blocks.air);

					}
				} else if (this.motionX < 0){
					if (this.motionZ > 0){
						this.worldObj.setBlock(Math.round((float)this.posX-1), Math.round((float)this.posY), Math.round((float)this.posZ+1), Blocks.air);
						this.worldObj.setBlock(Math.round((float)this.posX-1), Math.round((float)this.posY), Math.round((float)this.posZ), Blocks.air);
						this.worldObj.setBlock(Math.round((float)this.posX), Math.round((float)this.posY), Math.round((float)this.posZ+1), Blocks.air);

					} else if (this.motionZ < 0){
						this.worldObj.setBlock(Math.round((float)this.posX-1), Math.round((float)this.posY), Math.round((float)this.posZ-1), Blocks.air);
						this.worldObj.setBlock(Math.round((float)this.posX-1), Math.round((float)this.posY), Math.round((float)this.posZ), Blocks.air);
						this.worldObj.setBlock(Math.round((float)this.posX), Math.round((float)this.posY), Math.round((float)this.posZ-1), Blocks.air);

					} else {
						this.worldObj.setBlock(Math.round((float)this.posX-1), Math.round((float)this.posY), Math.round((float)this.posZ), Blocks.air);

					}
				} else {
					this.worldObj.setBlock(Math.round((float)this.posX), Math.round((float)this.posY), Math.round((float)this.posZ+1), Blocks.air);
					this.worldObj.setBlock(Math.round((float)this.posX), Math.round((float)this.posY), Math.round((float)this.posZ-1), Blocks.air);

				}
			}

			//flamespire ability
			else if(abilint == 1){
				new WorldGeneratorFlameSpire().generateSlugterra(this.worldObj, new Random(), (int)this.posX, (int)this.posZ);
			}

			else if (abilint == 3){
				this.makeTrench(true);
				System.out.println("Activating NovaClaw!!");

			}

		}else{
			//wingburst ability (OP!!)
			if (abilint == 0){
				System.out.println("Activating wingburst!!");
				for (int i=1;i<24;i++){
					boolean plus = new Random().nextBoolean();
					int plus2;
					if (plus)
						plus2 = -1;
					else
						plus2 = 1;
					double x = this.posX + new Random().nextInt(i)*plus2;
					double y = this.posY + new Random().nextInt(i)*plus2;
					double z = this.posZ + new Random().nextInt(i)*plus2;
					EntityFireball fireball = new EntitySmallFireball(this.worldObj, x, y, z, this.motionX, this.motionY-0.5f, this.motionZ);
					this.worldObj.spawnEntityInWorld(fireball);
				}
				this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ, 1.0f, false, true);
				this.setDead();
			}

			//beatwave ability
			else if (abilint == 1){
				System.out.println("Activating beatwave!!");
				this.setDead();
				EntityFireball fireball = new EntityLargeFireball(this.worldObj, this.posX, this.posY, this.posZ, this.motionX, this.motionY, this.motionZ);
				this.worldObj.spawnEntityInWorld(fireball);
			}

			//flashfire ability
			else if (abilint == 2){
				System.out.println("Activating flashfire!!");				
				EntityFireball fireball = new EntitySmallFireball(this.worldObj, this.posX, this.posY, this.posZ, this.motionX*2, this.motionY, this.motionZ*2);
				this.worldObj.spawnEntityInWorld(fireball);
			}
		}
	}

	private void makeTrench(boolean deep) {
		if (this.motionX > 0){
			if (this.motionX > this.motionZ){
				this.makeTrenchSingle(1, 0, deep);
			} else {
				this.makeTrenchSingle(0, 1, deep);
			}
		} else {
			if (this.motionX < this.motionZ){
				this.makeTrenchSingle(-1, 0, deep);
			} else {
				this.makeTrenchSingle(0, -1, deep);
			}
		}

	}

	private void makeTrenchSingle(int b, int c, boolean deep) {
		for (int a=0;a < 11; a++){
			this.makePlus((int)this.posX+a*b, (int)this.posY, (int)this.posZ+a*c, false);
			if (deep)
				this.makePlus((int)this.posX+a*b, (int)this.posY-1, (int)this.posZ+a*c, true);
		}
	}
	
	private void makePlus(int x, int y, int z, boolean trench){
		for (int a=-1;a<2;a++){
			for (int b=-1;b<2;b++){
				this.worldObj.setBlock(x+a, y, z+b, Blocks.fire);
				if (trench && a==0 && b==0){
					this.worldObj.setBlock(x, y-1, z, Blocks.fire);
				}
			}
		}
	}

	private void generateFireWall() {
		double x = this.motionX;
		this.motionX = this.motionZ;
		this.motionZ = x;
		this.makeTrench(false);
	}
}
