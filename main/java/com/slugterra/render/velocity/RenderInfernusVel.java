package com.slugterra.render.velocity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.slugterra.lib.Strings;
import com.slugterra.model.velocity.ModelInfurnusVel;

public class RenderInfernusVel extends Render  implements IItemRenderer {

	ModelInfurnusVel slugmodel;
	private static final ResourceLocation infernusTexture = new ResourceLocation(Strings.MODID + ":textures/entity/infernus.png");
	private static final ResourceLocation infernusvelTexture = new ResourceLocation(Strings.MODID + ":textures/entity/infernusvel.png");
	private Item field_94151_a;
	private int field_94150_f;
	public 	int pitch = -180;
	private int roll = 0;
	private boolean isProtoForm;
	private static final String __OBFID = "CL_00001008";

	public RenderInfernusVel(Item p_i1259_1_, int p_i1259_2_)
	{
		this.field_94151_a = p_i1259_1_;
		this.field_94150_f = p_i1259_2_;
	}

	public RenderInfernusVel(Item p_i1260_1_) {
		this(p_i1260_1_, 0);
		slugmodel = new ModelInfurnusVel();
	}



	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch (type) {

		case EQUIPPED:

			GL11.glPushMatrix();

			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Strings.MODID + ":textures/models/blaster.png"));

			GL11.glRotatef(100F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(-18F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(-80F, 0.0F, 0.0F, 1.0F);

			GL11.glTranslatef(0.095F, 0.4F, -0.5F);

			slugmodel.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
			break;

		case EQUIPPED_FIRST_PERSON:

			GL11.glPushMatrix();

			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Strings.MODID + ":textures/models/blaster.png"));

			GL11.glRotatef(100F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(-55F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(-80F, 0.0F, 0.0F, 1.0F);

			GL11.glTranslatef(-0.195F, 0.4F, -1.0F);

			GL11.glScalef(2.0F, 2.0F, 2.0F);

			slugmodel.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

			GL11.glPopMatrix();
			break;

		case ENTITY:

			GL11.glPushMatrix();

			float scale = 1.5F;

			GL11.glScalef(scale, scale, scale);

			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Strings.MODID + ":textures/models/blaster.png"));

			GL11.glRotatef(100F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(-18F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(-80F, 0.0F, 0.0F, 1.0F);

			GL11.glTranslatef(0.095F, 0.4F, -0.5F);

			slugmodel.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

			GL11.glPopMatrix();
			break;

		case INVENTORY:

			GL11.glPushMatrix();

			float scale2 = 1.7F;

			GL11.glScalef(scale2, scale2, scale2);

			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Strings.MODID + ":textures/models/blaster.png"));

			GL11.glRotatef(60F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(-30F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(-100F, 0.0F, 0.0F, 1.0F);

			GL11.glTranslatef(-1.5F, 0.65F, -0.5F);

			slugmodel.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

			GL11.glPopMatrix();
			break;

		default:
			break;
		}
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {

		switch (type) {
		case INVENTORY:
			return true;
		default:
			break;
		}
		return false;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return infernusvelTexture;
	}


	public void doRender(Entity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_)
	{
		this.isProtoForm = p_76986_1_.ticksExisted < 5;
		GL11.glPushMatrix();
		GL11.glTranslatef((float)p_76986_2_, (float)p_76986_4_-0.4F, (float)p_76986_6_);
		GL11.glRotatef(this.pitch, 1.0F, 0.0F, 0.0F);
		GL11.glRotatef(this.roll, 0.0F, 0.0F, 1.0F);
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		GL11.glScalef(0.5F, 0.5F, 0.5F);
		if (isProtoForm)
			Minecraft.getMinecraft().renderEngine.bindTexture(infernusTexture);
		else
			Minecraft.getMinecraft().renderEngine.bindTexture(infernusvelTexture);
		slugmodel.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, this.isProtoForm);
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		GL11.glPopMatrix();
		if (isProtoForm){
			this.pitch = -270;
			this.roll += 36;
		}
		else{
			this.pitch = -180;
			this.roll += 2;
		}
	}

}