package com.slugterra.render.blasters;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.slugterra.lib.Strings;
import com.slugterra.model.blasters.ModelDefenderBlaster;

public class RenderBlaster implements IItemRenderer {
	
    ModelDefenderBlaster launchermodel;
    ModelDefenderBlaster lModelFPS;
    public static boolean reloading = false;

    public RenderBlaster() {
        launchermodel = new ModelDefenderBlaster();
        lModelFPS = new ModelDefenderBlaster();
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
			
            launchermodel.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, true, false);
            GL11.glPopMatrix();
            break;

        case EQUIPPED_FIRST_PERSON:

            GL11.glPushMatrix();
            
            Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Strings.MODID + ":textures/models/blaster.png"));
            
            GL11.glRotatef(100F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(-55F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(-80F, 0.0F, 0.0F, 1.0F);
			GL11.glEnable(GL11.GL_BLEND);
			
			GL11.glTranslatef(-0.195F, 0.4F, -1.0F);
			
			GL11.glScalef(2.0F, 2.0F, 2.0F);
			
			//this case always calls when viewing in first person.
            lModelFPS.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, false, reloading);
            
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
			//GL11.glEnable(GL11.GL_BLEND);
			
			GL11.glTranslatef(0.095F, 0.4F, -0.5F);
            launchermodel.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, true, false);
            
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
			GL11.glEnable(GL11.GL_BLEND);
			
			GL11.glTranslatef(-1.5F, 0.65F, -0.5F);
            
            launchermodel.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, true, false);
            
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