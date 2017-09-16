package com.slugterra.item;

import com.slugterra.main.MainRegistry;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SlingerArmour extends ItemArmor {

	public SlingerArmour(String unlocalizedName, ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot) {
		super(material, renderIndex, equipmentSlot);
		this.setUnlocalizedName(unlocalizedName);
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
				int type = ((ItemArmor)itemStack.getItem()).armorType.getIndex();
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
		int type = ((ItemArmor)itemStack.getItem()).armorType.getIndex();
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
				armourModel.aimedBow =((EntityPlayer)entityLiving).getItemInUseCount() > 2;
			}
			return armourModel; 
		}
		return null;
	}

}