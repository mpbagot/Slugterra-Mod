package com.slugterra.render.velocity;

import com.slugterra.lib.Strings;
import com.slugterra.model.protoform.ModelGrenuke;
import com.slugterra.model.velocity.ModelGrenukeVel;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class RenderGrenukeVel extends RenderVel implements IItemRenderer{

	public RenderGrenukeVel(Item it, int in)
	{
		super(it, in);
	}

	public RenderGrenukeVel(Item p_i1260_1_) {
		this(p_i1260_1_, 0);
		slugmodel = new ModelGrenukeVel();
		smodel = new ModelGrenuke();
		infernusTexture = new ResourceLocation(Strings.MODID + ":textures/entity/grenuke.png");
		infernusvelTexture = new ResourceLocation(Strings.MODID + ":textures/entity/grenukevel.png");
	}
}
