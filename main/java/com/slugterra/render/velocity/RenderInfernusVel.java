package com.slugterra.render.velocity;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.slugterra.lib.Strings;
import com.slugterra.model.protoform.ModelInfernus;
import com.slugterra.model.velocity.ModelInfurnusVel;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class RenderInfernusVel extends RenderVel  implements IItemRenderer {

	public RenderInfernusVel(Item it, int in)
	{
		super(it, in);
	}

	public RenderInfernusVel(Item p_i1260_1_) {
		super(p_i1260_1_, 0);
		slugmodel = new ModelInfurnusVel();
		smodel = new ModelInfernus();
		infernusTexture = new ResourceLocation(Strings.MODID + ":textures/entity/infernus.png");
		infernusvelTexture = new ResourceLocation(Strings.MODID + ":textures/entity/infernusvel.png");
		
	}
}