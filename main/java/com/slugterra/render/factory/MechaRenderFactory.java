package com.slugterra.render.factory;

import com.slugterra.entity.EntityMecha;
import com.slugterra.render.RenderMecha;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class MechaRenderFactory implements IRenderFactory<EntityMecha> {

	private ModelBase model;
	private String mechaName;
	private float shadow;
	
	public MechaRenderFactory(ModelBase model, String name, float shadowSize) {
		this.model = model;
		this.mechaName = name;
		this.shadow = shadowSize;
	}
	
	@Override
	public Render<? super EntityMecha> createRenderFor(RenderManager manager) {
		return new RenderMecha(manager, this.model, this.mechaName, this.shadow);
	}

}
