package com.slugterra.render;

import com.slugterra.entity.velocity.EntityVel;
import com.slugterra.lib.Strings;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVel extends Render<EntityVel> {

	ModelBase velModel;
	ModelBase protoModel;
	public ResourceLocation velTexture;
	public ResourceLocation texture;
	public int pitch = -180;
	private int roll = 0;
	private boolean isProtoForm;

	public RenderVel(RenderManager renderMan, String name, ModelBase velocimorph, ModelBase protoform) {
		super(renderMan);
		texture = new ResourceLocation(Strings.MODID, "textures/entity/" + name + ".png");
		velTexture = new ResourceLocation(Strings.MODID, "textures/entity/" + name + "vel.png");
		velModel = velocimorph;
		protoModel = protoform;
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityVel entity) {
		return velTexture;
	}

	@Override
	public void doRender(EntityVel entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		this.isProtoForm = entity.ticksExisted < 5;
		
		System.out.println("Rendering a velocimorph entity in RenderVel");
		
		GlStateManager.pushMatrix();
		GlStateManager.translate(x, y-0.4d, z);
		GlStateManager.rotate(this.pitch, 1f, 0f, 0f);
		GlStateManager.rotate(this.roll, 0f, 0f, 1f);
		GlStateManager.enableRescaleNormal();
		GlStateManager.scale(0.5f, 0.5f, 0.5f);
		
		if (isProtoForm) {
			Minecraft.getMinecraft().renderEngine.bindTexture(texture);
			protoModel.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
		}
		else {
			Minecraft.getMinecraft().renderEngine.bindTexture(velTexture);
			velModel.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		}
		GlStateManager.disableRescaleNormal();
		GlStateManager.popMatrix();
		
		if (isProtoForm){
			this.pitch = -270;
			this.roll += 36;
		}
		else{
			this.pitch = -180;
			this.roll = 0;
		}
		
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}
}