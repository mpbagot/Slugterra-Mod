package com.slugterra.render.protoform;

import org.lwjgl.opengl.GL11;

import com.slugterra.entity.protoform.EntityEnigmo;
import com.slugterra.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderEnigmo extends RenderLiving
{
	private static final ResourceLocation infernusTextures = new ResourceLocation(Strings.MODID + ":textures/entity/enigmo.png");
	private static final String __OBFID = "CL_00000984";

	public RenderEnigmo(ModelBase p_i1253_1_, float p_i1253_2_)
	{
		super(p_i1253_1_, p_i1253_2_);
	}

	protected void preRenderCallback(EntityLivingBase entity, float f){
		GL11.glScalef(0.3F, 0.3F, 0.7F);
	}
	
	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(EntityEnigmo p_110775_1_)
	{
		return infernusTextures;
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(Entity p_110775_1_)
	{
		return this.getEntityTexture((EntityEnigmo)p_110775_1_);
	}
}