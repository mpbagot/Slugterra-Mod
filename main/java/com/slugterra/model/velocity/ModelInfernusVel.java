package com.slugterra.model.velocity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelInfernusVel extends ModelBase
{
	//fields
	ModelRenderer body;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer wingl;
	ModelRenderer wingr;
	ModelRenderer head;
	ModelRenderer antr;
	ModelRenderer antl;

	public ModelInfernusVel()
	{
		textureWidth = 78;
		textureHeight = 32;

		body = new ModelRenderer(this, 24, 0);
		body.addBox(0F, 0F, 0F, 3, 2, 5);
		body.setRotationPoint(0F, 0F, 0F);
		body.setTextureSize(78, 32);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 24);
		Shape2.addBox(0F, 0F, 0F, 3, 1, 1);
		Shape2.setRotationPoint(0F, 0F, 5F);
		Shape2.setTextureSize(78, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 12);
		Shape3.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape3.setRotationPoint(1F, 1F, 5F);
		Shape3.setTextureSize(78, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 14, 18);
		Shape4.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape4.setRotationPoint(1F, 0F, 6F);
		Shape4.setTextureSize(78, 32);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		wingl = new ModelRenderer(this, 48, 0);
		wingl.addBox(0F, 0F, 0F, 6, 1, 2);
		wingl.setRotationPoint(3F, 0F, 1F);
		wingl.setTextureSize(78, 32);
		wingl.mirror = true;
		setRotation(wingl, 0F, -0.4461433F, 0F);
		wingr = new ModelRenderer(this, 2, 28);
		wingr.addBox(0F, 0F, 0F, 6, 1, 2);
		wingr.setRotationPoint(-5F, 0F, 3F);
		wingr.setTextureSize(78, 32);
		wingr.mirror = true;
		setRotation(wingr, 0F, 0.3346075F, 0F);
		head = new ModelRenderer(this, 32, 22);
		head.addBox(0F, 0F, 0F, 3, 2, 2);
		head.setRotationPoint(0F, 0F, -2F);
		head.setTextureSize(78, 32);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		antr = new ModelRenderer(this, 56, 19);
		antr.addBox(0F, 0F, 0F, 1, 1, 2);
		antr.setRotationPoint(0F, 0F, -1F);
		antr.setTextureSize(78, 32);
		antr.mirror = true;
		setRotation(antr, 0.7435722F, 0F, 0F);
		antl = new ModelRenderer(this, 56, 19);
		antl.addBox(0F, 0F, 0F, 1, 1, 2);
		antl.setRotationPoint(2F, 0F, -1F);
		antl.setTextureSize(78, 32);
		antl.mirror = true;
		setRotation(antl, 0.7435722F, 0F, 0F);

	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		body.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		wingl.render(f5);
		wingr.render(f5);
		head.render(f5);
		antr.render(f5);
		antl.render(f5);
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
