package com.slugterra.render.protoform;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.slugterra.entity.protoform.EntityBoonDoc;
import com.slugterra.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBoonDoc extends RenderLiving
{
    private static final ResourceLocation infernusTextures = new ResourceLocation(Strings.MODID + ":textures/entity/boondoc.png");
    private static final String __OBFID = "CL_00000984";

    public RenderBoonDoc(ModelBase p_i1253_1_, float p_i1253_2_)
    {
        super(p_i1253_1_, p_i1253_2_);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityBoonDoc p_110775_1_)
    {
        return infernusTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((EntityBoonDoc)p_110775_1_);
    }
}