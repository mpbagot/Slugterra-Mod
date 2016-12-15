package com.slugterra.entity.properties;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

import com.slugterra.entity.slingers.EnemySlinger;

public class ExtendedSlingerEnemy implements IExtendedEntityProperties {

	public final static String EXT_PROP_NAME = "ExtendedSlugs";

	//declare variables
	private boolean canLaunch;
	private int timeToFireAgain;

	public ExtendedSlingerEnemy(EnemySlinger slinger){
		canLaunch = true;
		timeToFireAgain = 0;
	}

	public static final void register(EnemySlinger slinger)
	{
		slinger.registerExtendedProperties(ExtendedSlingerEnemy.EXT_PROP_NAME, new ExtendedSlingerEnemy(slinger));
	}

	public static final ExtendedSlingerEnemy get(EnemySlinger slinger)
	{
		return (ExtendedSlingerEnemy) slinger.getExtendedProperties(EXT_PROP_NAME);
	}

	public void saveNBTData(NBTTagCompound compound)
	{
		NBTTagCompound properties = new NBTTagCompound();

		properties.setBoolean("CanBeFired", this.canLaunch);
		properties.setInteger("TimeUntilNextFire", this.timeToFireAgain);

		compound.setTag(EXT_PROP_NAME, properties);
	}

	// Load whatever data you saved
	@Override
	public void loadNBTData(NBTTagCompound compound)
	{
		// Here we fetch the unique tag compound we set for this class of Extended Properties
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);
		// Get our data from the custom tag compound
		this.canLaunch = properties.getBoolean("CanBeFired");
		this.timeToFireAgain = properties.getInteger("TimeUntilNextFire");
	}


	@Override
	public void init(Entity entity, World world)
	{
		
	}


	public boolean reCheckFiring()
	{
		if (this.timeToFireAgain != 0)
		{
			canLaunch = false;
			return false;
		}

		else if (this.timeToFireAgain == 0)
		{
			canLaunch = true;
			timeToFireAgain = 40;
			return true;
		}
		return canLaunch;
	}

	public void updateTimetoFire() {
		if (timeToFireAgain > 0)
		{
			--timeToFireAgain;
		}
		else
		{
			timeToFireAgain = 0;
		}
	}
}