package com.slugterra.render.velocity;

import com.slugterra.lib.Strings;
import com.slugterra.model.protoform.ModelArmashelt;
import com.slugterra.model.velocity.ModelArmasheltVel;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class RenderArmasheltVel extends RenderVel implements IItemRenderer {

	public RenderArmasheltVel(Item it, int in)
	{
		super(it, in);
	}

	public RenderArmasheltVel(Item p_i1260_1_) {
		super(p_i1260_1_, 0);
		slugmodel = new ModelArmasheltVel();
		smodel = new ModelArmashelt();
		infernusvelTexture = new ResourceLocation(Strings.MODID + ":textures/entity/armasheltvel.png");
		infernusTexture = new ResourceLocation(Strings.MODID+ ":textures/entity/armashelt.png");
	}
}