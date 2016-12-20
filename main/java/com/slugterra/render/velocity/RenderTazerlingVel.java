package com.slugterra.render.velocity;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.slugterra.lib.Strings;
import com.slugterra.model.ModelTazerling;
import com.slugterra.model.velocity.ModelTazerlingVel;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class RenderTazerlingVel extends RenderVel  implements IItemRenderer {

	public RenderTazerlingVel(Item p_i1259_1_, int p_i1259_2_)
	{
		super(p_i1259_1_, p_i1259_2_);
	}

	public RenderTazerlingVel(Item p_i1260_1_) {
		super(p_i1260_1_, 0);
		slugmodel = new ModelTazerlingVel();
		smodel = new ModelTazerling();
		infernusTexture = new ResourceLocation(Strings.MODID + ":textures/entity/tazerling.png");
		infernusvelTexture = new ResourceLocation(Strings.MODID + ":textures/entity/tazerlingvel.png");

	}
}