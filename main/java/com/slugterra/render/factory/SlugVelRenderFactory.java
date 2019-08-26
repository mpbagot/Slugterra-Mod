package com.slugterra.render.factory;

import com.slugterra.entity.velocity.EntityVel;
import com.slugterra.render.RenderVel;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class SlugVelRenderFactory implements IRenderFactory<EntityVel> {

	private ModelBase velModel;
	private ModelBase protoModel;
	private String slugName;
	
	public SlugVelRenderFactory(ModelBase velocimorph, ModelBase protoform, String name) {
		this.velModel = velocimorph;
		this.protoModel = protoform;
		this.slugName = name;
	}
	
	@Override
	public Render<? super EntityVel> createRenderFor(RenderManager manager) {
		return new RenderVel(manager, this.slugName, this.velModel, this.protoModel);
	}

}
