package com.slugterra.render.slingers;

import java.util.Random;

import com.slugterra.entity.slingers.AllySlinger;
import com.slugterra.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderAllySlinger extends RenderLiving
{
	private Random rand = new Random();
	String[] r = {"eli", "trixie", "pronto", "kord", "junjie", "fav", "gabe", "marcus", "eggy"};

	public RenderAllySlinger(ModelBase p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);

	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(Entity e)
	{
		return new ResourceLocation(Strings.MODID + ":textures/slingers/allies/"+r[((AllySlinger)e).texint]+"slinger.png");
	}
}