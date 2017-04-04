package com.slugterra.render;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.slugterra.entity.EntityTooth;
import com.slugterra.lib.Strings;
import com.slugterra.model.ModelTooth;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderTooth extends Render{

	private ModelTooth model;
	private ResourceLocation toothTexture;

	public RenderTooth() {
		System.out.println("starting RenderTooth");
		model = new ModelTooth();
		toothTexture = new ResourceLocation(Strings.MODID + ":textures/entity/tooth.png");
	}
	
	@Override
	public void doRender(Entity entity, double f, double f1, double f2, float f3, float f4) {
		System.out.println("Rendering in doRender()");
		GL11.glPushMatrix();
		bindTexture(toothTexture);
		GL11.glTranslatef((float)f, (float)f1-0.4F, (float)f2);
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		GL11.glScalef(0.5F, 0.5F, 0.5F);
		model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		GL11.glPopMatrix();

	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {return toothTexture;}
}
