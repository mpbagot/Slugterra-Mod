package com.slugterra.entity.properties;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

import com.slugterra.inventory.InventorySlug;

public class ExtendedPlayer implements IExtendedEntityProperties {

	public final static String EXT_PROP_NAME = "ExtendedSlugs";

	//declare variables
	private boolean canLaunch;
	private int timeToFireAgain;
	public final InventorySlug inventory = new InventorySlug();
	public int invslot;

	public ExtendedPlayer(EntityPlayer entity){
		canLaunch = true;
		timeToFireAgain = 0;
		invslot = 0;
	}

	public static final void register(EntityPlayer player)
	{
		player.registerExtendedProperties(ExtendedPlayer.EXT_PROP_NAME, new ExtendedPlayer(player));
	}

	public static final ExtendedPlayer get(EntityPlayer player)
	{
		return (ExtendedPlayer) player.getExtendedProperties(EXT_PROP_NAME);
	}

	public void saveNBTData(NBTTagCompound compound)
	{
		NBTTagCompound properties = new NBTTagCompound();

		properties.setBoolean("CanBeFired", this.canLaunch);
		properties.setInteger("TimeUntilNextFire", this.timeToFireAgain);
		properties.setInteger("InvSlot", this.invslot);
		this.inventory.writeToNBT(properties);

		compound.setTag(EXT_PROP_NAME, properties);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound)
	{
		// Here we fetch the unique tag compound we set for this class of Extended Properties
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);
		// Get our data from the custom tag compound
		this.canLaunch = properties.getBoolean("CanBeFired");
		this.timeToFireAgain = properties.getInteger("TimeUntilNextFire");
		this.invslot = properties.getInteger("InvSlot");
		this.inventory.readFromNBT(properties);
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
		}
		else
		{
			canLaunch = true;
			timeToFireAgain = 40;
		}
		return canLaunch;
	}

	public void updateTimetoFire() {
		if (timeToFireAgain > 0)
			--timeToFireAgain;
		else
			timeToFireAgain = 0;
	}

	public void increaseSlot(){
		if (invslot < 5)
			invslot++;
		else
			invslot = 0;

		inventory.getStackInSlot(invslot);
	}

	public void decreaseSlot(){
		if (invslot > 0)
			invslot--;
		else
			invslot = 5;

		inventory.getStackInSlot(invslot);
	}
}