package com.slugterra.render.factory;

import com.slugterra.entity.slingers.EntitySlinger;
import com.slugterra.lib.Strings;
import com.slugterra.render.RenderSlinger;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class SlingerRenderFactory implements IRenderFactory<EntitySlinger> {

	private float shadow = 0.7f;
	private ResourceLocation[] enemyTextures = {
				new ResourceLocation(Strings.MODID + ":textures/slingers/enemies/billyslinger.png")
			};
	private ResourceLocation[] allyTextures = {
			new ResourceLocation(Strings.MODID + ":textures/slingers/enemies/favslinger.png"),
			new ResourceLocation(Strings.MODID + ":textures/slingers/enemies/gabeslinger.png"),
			new ResourceLocation(Strings.MODID + ":textures/slingers/enemies/marcusslinger.png")
		};
	
	private ResourceLocation[] textures;
	
	public SlingerRenderFactory(int type) {
		if (type == 0) {
			textures = enemyTextures;
		} else {
			textures = allyTextures;
		}
	}
	
	@Override
	public Render<? super EntitySlinger> createRenderFor(RenderManager manager) {
		return new RenderSlinger(manager, this.shadow, this.textures);
	}

}
