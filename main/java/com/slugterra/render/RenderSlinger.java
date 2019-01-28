package com.slugterra.render;

import java.util.Random;

import com.slugterra.entity.slingers.EntitySlinger;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderSlinger extends RenderLiving<EntitySlinger>
{
	public static ResourceLocation slingerTexture;
	private static Random rand = new Random();
	
	public RenderSlinger(RenderManager renderMan, float shadowSize, ResourceLocation[] textures) {
		super(renderMan, new ModelBiped(0.5f), shadowSize);
		slingerTexture = textures[rand.nextInt(textures.length)];
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(EntitySlinger entity)
	{
		return slingerTexture;
	}
}