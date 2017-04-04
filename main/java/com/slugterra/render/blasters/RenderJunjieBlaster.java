package com.slugterra.render.blasters;

import org.lwjgl.opengl.GL11;

import com.slugterra.lib.Strings;
import com.slugterra.model.blasters.ModelJunjieBlaster;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class RenderJunjieBlaster implements IItemRenderer {

	ModelJunjieBlaster launchermodel;
	ModelJunjieBlaster lModelFPS;
	public static boolean reloading = false;

	public RenderJunjieBlaster() {
		launchermodel = new ModelJunjieBlaster();
		lModelFPS = new ModelJunjieBlaster();
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch (type) {

		case EQUIPPED:

			GL11.glPushMatrix();

			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Strings.MODID + ":textures/models/armblaster.png"));

			GL11.glRotatef(-90F, 1.0F, 0.0F, 0.0F);//top rotate
			GL11.glRotatef(55F, 0.0F, 1.0F, 0.0F);//side rotate
			GL11.glRotatef(-180F, 0.0F, 0.0F, 1.0F);//front rotate

			GL11.glTranslatef(-0.25F, -0.55F, 0.3F);
			//move key: for+/bac- left-/righ+ up/down

			launchermodel.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, false);
			GL11.glPopMatrix();
			break;

		case EQUIPPED_FIRST_PERSON:

			GL11.glPushMatrix();

			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Strings.MODID + ":textures/models/armblaster.png"));

			GL11.glRotatef(260F, 1.0F, 0.0F, 0.0F);//was at 80
			GL11.glRotatef(50, 0.0F, 1.0F, 0.0F);//increasing..., originally -55
			GL11.glRotatef(-80F, 0.0F, 0.0F, 1.0F);

			GL11.glTranslatef(0.0F, -0.7F, 0.5F);

			GL11.glScalef(2.0F, 2.0F, 2.0F);

			lModelFPS.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, reloading);

			GL11.glPopMatrix();
			break;

		case ENTITY:

			GL11.glPushMatrix();

			float scale = 1.5F;

			GL11.glScalef(scale, scale, scale);

			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Strings.MODID + ":textures/models/armblaster.png"));

			GL11.glRotatef(100F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(-18F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(-80F, 0.0F, 0.0F, 1.0F);

			GL11.glTranslatef(0.095F, 0.4F, -0.5F);

			launchermodel.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, false);

			GL11.glPopMatrix();
			break;

		case INVENTORY:

			GL11.glPushMatrix();

			float scale2 = 1.7F;

			GL11.glScalef(scale2, scale2, scale2);

			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Strings.MODID + ":textures/models/armblaster.png"));

			GL11.glRotatef(160F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(20F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(-100F, 0.0F, 0.0F, 1.0F);

			GL11.glTranslatef(0.0F, 0.0F, -0.5F);

			launchermodel.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, false);

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
}