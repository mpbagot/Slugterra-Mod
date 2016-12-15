package com.slugterra.render.blasters;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.slugterra.lib.Strings;
import com.slugterra.model.blasters.ModelShinaiBlaster;

public class RenderShinaiBlaster implements IItemRenderer {
	
	ModelShinaiBlaster launchermodel;

    public RenderShinaiBlaster() {
        launchermodel = new ModelShinaiBlaster();
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        switch (type) {

        case EQUIPPED:

        	GL11.glPushMatrix();
            
            Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Strings.MODID + ":textures/models/shinaiblaster.png"));
            
            GL11.glRotatef(100F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(-105F, 0.0F, 1.0F, 0.0F);//side on
			GL11.glRotatef(-80F, 0.0F, 0.0F, 1.0F);
			
			GL11.glTranslatef(-0.1F, -1.2F, -0.55F);
			
            launchermodel.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
            GL11.glPopMatrix();
            break;

        case EQUIPPED_FIRST_PERSON:

            GL11.glPushMatrix();
            
            Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Strings.MODID + ":textures/models/shinaiblaster.png"));
            
            GL11.glRotatef(100F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(-150F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(-80F, 0.0F, 0.0F, 1.0F);
			GL11.glEnable(GL11.GL_BLEND);
			
			GL11.glTranslatef(-6.6F, -12.9F, -5.5F);
			
			GL11.glScalef(9.0F, 9.0F, 9.0F);
			
            launchermodel.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
            
            GL11.glPopMatrix();
            break;

        case ENTITY:
        	
            GL11.glPushMatrix();
            
            float scale = 1.5F;
            
            GL11.glScalef(scale, scale, scale);
            
            Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Strings.MODID + ":textures/models/shinaiblaster.png"));
            
            GL11.glRotatef(100F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(-105F, 0.0F, 1.0F, 0.0F);//side on
			GL11.glRotatef(-80F, 0.0F, 0.0F, 1.0F);
			GL11.glEnable(GL11.GL_BLEND);
			
			GL11.glTranslatef(-0.1F, -1.2F, -0.55F);
            
            launchermodel.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
            
            GL11.glPopMatrix();
            break;
            
        case INVENTORY:
        	
            GL11.glPushMatrix();
            
            float scale2 = 1.4F;
            
            GL11.glScalef(scale2, scale2, scale2);
            
            Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Strings.MODID + ":textures/models/shinaiblaster.png"));
            
            GL11.glRotatef(60F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(-30F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(-100F, 0.0F, 0.0F, 1.0F);
			GL11.glEnable(GL11.GL_BLEND);
			
			GL11.glTranslatef(-1.1F, -0.1F, -0.5F);
            
            launchermodel.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
            
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