package com.slugterra.render;

import com.slugterra.entity.EntityMecha;
import com.slugterra.lib.Strings;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderMecha extends RenderLiving<EntityMecha>
{
    private static ResourceLocation mechaTextures;

    public RenderMecha(RenderManager renderMan, ModelBase model, String name, float shadow)
    {
        super(renderMan, model, shadow);
        mechaTextures = new ResourceLocation(Strings.MODID, "textures/entity/mecha_" + name + ".png");
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityMecha p_110775_1_)
    {
        return mechaTextures;
    }

}