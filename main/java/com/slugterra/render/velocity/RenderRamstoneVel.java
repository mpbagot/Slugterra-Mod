package com.slugterra.render.velocity;

import com.slugterra.lib.Strings;
import com.slugterra.model.ModelRamstone;
import com.slugterra.model.velocity.ModelRamstoneVel;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class RenderRamstoneVel extends RenderVel implements IItemRenderer {

	public RenderRamstoneVel(Item it, int in)
	{
		super(it, in);
	}

	public RenderRamstoneVel(Item p_i1260_1_) {
		this(p_i1260_1_, 0);
		slugmodel = new ModelRamstoneVel();
		smodel = new ModelRamstone();
		infernusTexture = new ResourceLocation(Strings.MODID + ":textures/entity/ramstone.png");
		infernusvelTexture = new ResourceLocation(Strings.MODID + ":textures/entity/ramstonevel.png");
	}
}