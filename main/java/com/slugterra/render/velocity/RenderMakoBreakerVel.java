package com.slugterra.render.velocity;

import com.slugterra.lib.Strings;
import com.slugterra.model.protoform.ModelMakoBreaker;
import com.slugterra.model.velocity.ModelMakoBreakerVel;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class RenderMakoBreakerVel extends RenderVel implements IItemRenderer {

	public RenderMakoBreakerVel(Item p_i1259_1_, int p_i1259_2_)
	{
		super(p_i1259_1_, p_i1259_2_);
	}

	public RenderMakoBreakerVel(Item p_i1260_1_) {
		super(p_i1260_1_, 0);
		slugmodel = new ModelMakoBreakerVel();
		smodel = new ModelMakoBreaker();
		infernusvelTexture = new ResourceLocation(Strings.MODID + ":textures/entity/makobreakervel.png");
		infernusTexture = new ResourceLocation(Strings.MODID + ":textures/entity/makobreaker.png");

	}
}