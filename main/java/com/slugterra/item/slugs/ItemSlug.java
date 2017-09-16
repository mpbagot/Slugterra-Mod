package com.slugterra.item.slugs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ItemSlug extends Item
{	
	private boolean inShell;
	public static int friendship = 0;
	public static int power = 0;
	public static String name =  "";
	public static int maxhealth = 20;
	public static int health;
	public static float skill;

	public ItemSlug()
	{
		super();
		setMaxStackSize(1);
		health = maxhealth;
		skill = 0.0F;
		
	}

	// Without this method, your inventory will NOT work!!!
	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		return 1;
	}
	
	public void setInTorpedoShell(boolean check){
		this.inShell = check;
	}
	
	public boolean isInTorpedoShell(){
		return inShell;	
	}

	public void setName(String name){
		this.name = name;
	}
	
	public void setHealth(int health){
		this.health = health;
	}
	
	public void updateFriendship(int newValue, boolean increase){
		if (!increase)
			this.friendship = newValue;
		else
			this.friendship += newValue;
	}
	
//	@Override
//	@SideOnly(Side.CLIENT)
//	public void registerIcons(IIconRegister iconRegister)
//	{
//		itemIcon = iconRegister.registerIcon("slugterramod:" + getUnlocalizedName().substring(5));
//	}
	
	public void writeToNBT(NBTTagCompound compound)
	{
		compound.setInteger("ItemSlugHealth", health);
		compound.setBoolean("ItemSlugInShell", inShell);
		compound.setInteger("ItemSlugFriend", friendship);
		compound.setString("ItemSlugName", name);
		compound.setFloat("ItemSlugSkill", skill);
		
	}

	public void readFromNBT(NBTTagCompound compound)
	{
		this.health = compound.getInteger("ItemSlugHealth");
		this.inShell = compound.getBoolean("ItemSlugInShell");
		this.name = compound.getString("ItemSlugName");
		this.friendship = compound.getInteger("ItemSlugFriend");
		this.skill = compound.getFloat("ItemSlugSkill");
		
	}

	public void updatePower() {
		power = (int)this.skill/10;
	}

}
