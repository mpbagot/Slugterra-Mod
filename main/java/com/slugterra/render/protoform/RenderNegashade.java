package com.slugterra.render.protoform;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.slugterra.entity.protoform.EntityNegashade;
import com.slugterra.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderNegashade extends RenderLiving
{
    private static final ResourceLocation negashadeTextures = new ResourceLocation(Strings.MODID + ":textures/entity/negashade.png");
    private static final String __OBFID = "CL_00000984";

    public RenderNegashade(ModelBase p_i1253_1_, float p_i1253_2_)
    {
        super(p_i1253_1_, p_i1253_2_);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityNegashade p_110775_1_)
    {
        return negashadeTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((EntityNegashade)p_110775_1_);
    }
}