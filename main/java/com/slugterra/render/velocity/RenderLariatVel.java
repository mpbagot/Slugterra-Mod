package com.slugterra.render.velocity;

import com.slugterra.lib.Strings;
import com.slugterra.model.ModelLariat;
import com.slugterra.model.velocity.ModelLariatVel;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class RenderLariatVel extends RenderVel implements IItemRenderer {

	public RenderLariatVel(Item it, int in)
	{
		super(it, in);
	}

	public RenderLariatVel(Item p_i1260_1_) {
		super(p_i1260_1_, 0);
		slugmodel = new ModelLariatVel();
		smodel = new ModelLariat();
		infernusvelTexture = new ResourceLocation(Strings.MODID + ":textures/entity/lariatvel.png");
		infernusTexture = new ResourceLocation(Strings.MODID + ":textures/entity/lariat.png");
	}
}