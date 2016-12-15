package com.slugterra.item;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.slugterra.main.MainRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SlingerArmour extends ItemArmor{

	public SlingerArmour(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		switch(slot){ 
		case 2: 
			return "slugterramod:textures/items/slugbelt.png"; //rest of texture for armour
		default: 
			return "slugterramod:textures/items/slugbelt.png"; //rest of texture for armour
		} 
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot)
	{
		ModelBiped armourModel = new ModelBiped();
		if(itemStack != null)
		{
			if(itemStack.getItem() instanceof SlingerArmour)
			{
				int type = ((ItemArmor)itemStack.getItem()).armorType;
				if(type == 1 || type == 3)
				{ 
					armourModel = MainRegistry.proxy.getArmorModel(0);
				}
				else
				{
					armourModel = MainRegistry.proxy.getArmorModel(1); 
				} 
			}
		} 
		int type = ((ItemArmor)itemStack.getItem()).armorType;
		if(type == 1 || type == 3)
		{
			armourModel = MainRegistry.proxy.getArmorModel(0);
		}
		else
		{ 
			armourModel = MainRegistry.proxy.getArmorModel(1); 
		}

		if(armourModel != null)
		{
			armourModel.bipedHead.showModel = armorSlot == 0;
			armourModel.bipedHeadwear.showModel = armorSlot == 0;
			armourModel.bipedBody.showModel = armorSlot == 1 || armorSlot == 2;
			armourModel.bipedRightArm.showModel = armorSlot == 1;
			armourModel.bipedLeftArm.showModel = armorSlot == 1;
			armourModel.bipedRightLeg.showModel = armorSlot == 2 || armorSlot == 3;
			armourModel.bipedLeftLeg.showModel = armorSlot == 2 || armorSlot == 3;
			armourModel.isSneak = entityLiving.isSneaking();
			armourModel.isRiding = entityLiving.isRiding();
			armourModel.isChild = entityLiving.isChild();
			armourModel.heldItemRight = entityLiving.getEquipmentInSlot(0) != null ? 1 :0;
			if(entityLiving instanceof EntityPlayer)
			{
				armourModel.aimedBow =((EntityPlayer)entityLiving).getItemInUseDuration() > 2;
			}
			return armourModel; 
		}
		return null;
	}

}