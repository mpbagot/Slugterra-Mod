package com.slugterra.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGrenuke extends ModelBase
{

	ModelRenderer body;
	ModelRenderer arml;
	ModelRenderer armr;
	ModelRenderer footl;
	ModelRenderer footr;
	ModelRenderer earl;
	ModelRenderer earr;

	public ModelGrenuke()
	{
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this, 0, 0);
		body.mirror = false;
		body.addBox(0.0F, 0.0F, 0.0F, 5, 10, 5);
		body.setRotationPoint(0.0F, 14F, 0.0F);
		body.setTextureSize(32, 32);

		arml = new ModelRenderer(this, 0, 2);
		arml.mirror = false;
		arml.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		arml.setRotationPoint(-1.0F, 18F, 1F);
		arml.setTextureSize(32, 32);

		armr = new ModelRenderer(this, 0, 2);
		armr.mirror = false;
		armr.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		armr.setRotationPoint(5.0F, 18F, 1F);
		armr.setTextureSize(32, 32);

		footl = new ModelRenderer(this, 0, 0);
		footl.mirror = false;
		footl.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		footl.setRotationPoint(4.0F, 23F, -1.0F);
		footl.setTextureSize(32, 32);

		footr = new ModelRenderer(this, 0, 0);
		footr.mirror = false;
		footr.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		footr.setRotationPoint(0.0F, 23F, -1.0F);
		footr.setTextureSize(32, 32);

		earl = new ModelRenderer(this, 15, 0);
		earl.mirror = false;
		earl.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		earl.setRotationPoint(0.5F, 13F, 1.5F);
		earl.setTextureSize(32, 32);

		earr = new ModelRenderer(this, 15, 0);
		earr.mirror = false;
		earr.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		earr.setRotationPoint(3.5F, 13F, 1.5F);
		earr.setTextureSize(32, 32);

	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		body.render(f5);
		arml.render(f5);
		armr.render(f5);
		footl.render(f5);
		footr.render(f5);
		earl.render(f5);
		earr.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}