package com.slugterra.render;

import com.slugterra.entity.EntitySlug;
import com.slugterra.render.protoform.RenderSlug;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class SlugRenderFactory implements IRenderFactory<EntitySlug> {

	private ModelBase model;
	private String slugName;
	private float shadow = 0.3f;
	
	public SlugRenderFactory(ModelBase model, String name) {
		this.model = model;
		this.slugName = name;
	}
	
	@Override
	public Render<? super EntitySlug> createRenderFor(RenderManager manager) {
		return new RenderSlug(manager, this.slugName, this.model, this.shadow);
	}

}
