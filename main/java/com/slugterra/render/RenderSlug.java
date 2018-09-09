package com.slugterra.render;

import com.slugterra.entity.EntitySlug;
import com.slugterra.lib.Strings;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderSlug extends RenderLiving<EntitySlug>
{
    private final ResourceLocation slugTextures;

    public RenderSlug(RenderManager renderMan, String name, ModelBase model, float shadowSize)
    {
        super(renderMan, model, shadowSize);
        this.slugTextures = new ResourceLocation(Strings.MODID, "textures/entity/" + name + ".png");
    }

    @Override
    protected void preRenderCallback(EntitySlug entity, float partialTickTime) {
    	super.preRenderCallback(entity, partialTickTime);
    }
    
    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntitySlug p_110775_1_)
    {
        return slugTextures;
    }

}