package com.slugterra.render.velocity;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.slugterra.lib.Strings;
import com.slugterra.model.ModelPhosphoro;
import com.slugterra.model.velocity.ModelPhosphoroVel;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class RenderPhosphoroVel extends RenderVel  implements IItemRenderer {

	public RenderPhosphoroVel(Item it, int in)
	{
		super(it, in);
	}

	public RenderPhosphoroVel(Item p_i1260_1_) {
		super(p_i1260_1_, 0);
		slugmodel = new ModelPhosphoroVel();
		smodel = new ModelPhosphoro();
		this.infernusTexture = new ResourceLocation(Strings.MODID+":textures/entity/phosphoro.png");
		this.infernusvelTexture = new ResourceLocation(Strings.MODID+":textures/entity/phosphorovel.png");
	}
}