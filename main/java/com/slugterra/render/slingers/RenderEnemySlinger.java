package com.slugterra.render.slingers;

import java.util.Random;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.slugterra.entity.slingers.AllySlinger;
import com.slugterra.entity.slingers.EnemySlinger;
import com.slugterra.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderEnemySlinger extends RenderLiving
{
	public static ResourceLocation slingerTexture = new ResourceLocation(Strings.MODID + ":textures/slingers/enemies/billyslinger.png");
	String[] r = {"billy", };
	
	public RenderEnemySlinger(ModelBase p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);
		
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(EnemySlinger e)
	{
		return new ResourceLocation(Strings.MODID + ":textures/slingers/enemies/"+r[e.texint]+"slinger.png");
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(Entity p_110775_1_)
	{
		return this.getEntityTexture((EnemySlinger)p_110775_1_);
	}
}