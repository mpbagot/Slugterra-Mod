package com.slugterra.item;

import com.slugterra.creativetabs.SlugterraCreativeTabs;
import com.slugterra.lib.Strings;
import com.slugterra.main.ClientProxy;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SlingerArmour extends ItemArmor {

	public SlingerArmour(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot) {
		super(material, renderIndex, equipmentSlot);
		this.setUnlocalizedName("slinger_slugbelt");
		setRegistryName(Strings.MODID, "slinger_slugbelt");
		setCreativeTab(SlugterraCreativeTabs.tabBlasters);
	}

	@Override
	@SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default)
    {
		ModelBiped armourModel = _default;
		if(itemStack == null) {
			return armourModel;
		}
		
		if(itemStack.getItem() instanceof SlingerArmour)
		{
			armourModel = ClientProxy.getArmorModel();  
		}
		
		if(armourModel != null)
		{
			armourModel.setInvisible(false);

			return armourModel; 
		}
		return null;
	}

}