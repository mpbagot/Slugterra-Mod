package com.slugterra.render;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.slugterra.lib.Strings;
import com.slugterra.model.ModelBolt;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class RenderBolt extends Render  implements IItemRenderer {

	ModelBolt slugmodel;
	private static final ResourceLocation infernusTexture = new ResourceLocation(Strings.MODID + ":textures/item/bolt.png");
	private ModelBase field_94151_a;
	private int field_94150_f;

	public RenderBolt(ModelBase modelBolt, int p_i1259_2_)
	{
		this.field_94151_a = modelBolt;
		this.field_94150_f = p_i1259_2_;
	}

	public RenderBolt(ModelBase p_i1260_1_) {
		this(p_i1260_1_, 0);
		slugmodel = new ModelBolt();
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
		return infernusTexture;
	}


	public void doRender(Entity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float)p_76986_2_, (float)p_76986_4_-0.4F, (float)p_76986_6_);
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		GL11.glScalef(1F, 1F, 1F);
		Minecraft.getMinecraft().renderEngine.bindTexture(infernusTexture);
		slugmodel.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		GL11.glPopMatrix();
	}

}