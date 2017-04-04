package com.slugterra.render;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.slugterra.lib.Strings;
import com.slugterra.model.ModelSlugTube;

public class SlugTubeRender implements IItemRenderer {

	protected ModelSlugTube launcherModel;
	
	public SlugTubeRender()
	{
		launcherModel = new ModelSlugTube();
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch(type)
		{
		case EQUIPPED: return true;
		default: return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
	{
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data)
	{
		switch(type)
		{
			case EQUIPPED:
			{
				GL11.glPushMatrix();
				
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Strings.MODID + ":textures/models/slugtube.png"));
				
				GL11.glRotatef(100F, 1.0F, 0.0F, 0.0F);
				GL11.glRotatef(40F, 0.0F, 1.0F, 0.0F);
				GL11.glRotatef(-80F, 0.0F, 0.0F, 1.0F);
						
				GL11.glTranslatef(0.095F, 0.8F, 0.2F);
								
				GL11.glScalef(1.2F, 1.2F, 1.6F);
				
				launcherModel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
				
				GL11.glPopMatrix();
			}
			default:
				break;
		}
	}

}
