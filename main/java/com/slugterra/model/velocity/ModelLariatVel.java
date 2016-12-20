package com.slugterra.model.velocity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLariatVel extends ModelBase
{
	//fields
	ModelRenderer body;
	ModelRenderer head;
	ModelRenderer spine1;
	ModelRenderer spine2;
	ModelRenderer spine3;
	ModelRenderer shoulderl;
	ModelRenderer shoulderr;
	ModelRenderer snout;
	ModelRenderer bicepr;
	ModelRenderer bidepl;
	ModelRenderer forearml;
	ModelRenderer forearmr;
	ModelRenderer topfingr;
	ModelRenderer handr;
	ModelRenderer botfingr;
	ModelRenderer handl;
	ModelRenderer topfingl;
	ModelRenderer botfingl;

	public ModelLariatVel()
	{
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this, 0, 17);
		body.addBox(0F, 0F, 0F, 4, 4, 5);
		body.setRotationPoint(0F, 0F, 0F);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		head = new ModelRenderer(this, 41, 0);
		head.addBox(0F, 0F, 0F, 4, 3, 2);
		head.setRotationPoint(0F, 2F, -2F);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0.3346075F, 0F, 0F);
		spine1 = new ModelRenderer(this, 25, 0);
		spine1.addBox(0F, 0F, 0F, 1, 1, 2);
		spine1.setRotationPoint(1.5F, 0F, 0F);
		spine1.setTextureSize(64, 32);
		spine1.mirror = true;
		setRotation(spine1, 0.5948578F, 0F, 0F);
		spine2 = new ModelRenderer(this, 34, 17);
		spine2.addBox(0F, 0F, 0F, 1, 1, 2);
		spine2.setRotationPoint(1.5F, 0F, 2F);
		spine2.setTextureSize(64, 32);
		spine2.mirror = true;
		setRotation(spine2, 0.5948578F, 0F, 0F);
		spine3 = new ModelRenderer(this, 25, 9);
		spine3.addBox(0F, 0F, 0F, 1, 1, 2);
		spine3.setRotationPoint(1.5F, 0F, 4F);
		spine3.setTextureSize(64, 32);
		spine3.mirror = true;
		setRotation(spine3, 0.5948578F, 0F, 0F);
		shoulderl = new ModelRenderer(this, 12, 9);
		shoulderl.addBox(0F, 0F, 0F, 2, 2, 2);
		shoulderl.setRotationPoint(3F, 2F, 0F);
		shoulderl.setTextureSize(64, 32);
		shoulderl.mirror = true;
		setRotation(shoulderl, 0F, 0F, 0F);
		shoulderr = new ModelRenderer(this, 22, 19);
		shoulderr.addBox(0F, 0F, 0F, 2, 2, 2);
		shoulderr.setRotationPoint(-1F, 2F, 0F);
		shoulderr.setTextureSize(64, 32);
		shoulderr.mirror = true;
		setRotation(shoulderr, 0F, 0F, 0F);
		snout = new ModelRenderer(this, 51, 19);
		snout.addBox(0F, 0F, 0F, 2, 2, 2);
		snout.setRotationPoint(1F, 4F, -3F);
		snout.setTextureSize(64, 32);
		snout.mirror = true;
		setRotation(snout, 0.7435722F, 0F, 0F);
		bicepr = new ModelRenderer(this, 40, 11);
		bicepr.addBox(0F, 0F, 0F, 1, 2, 1);
		bicepr.setRotationPoint(-1F, 3F, 1F);
		bicepr.setTextureSize(64, 32);
		bicepr.mirror = true;
		setRotation(bicepr, -0.0371786F, 0F, 0F);
		bidepl = new ModelRenderer(this, 53, 11);
		bidepl.addBox(0F, 0F, 0F, 1, 2, 1);
		bidepl.setRotationPoint(4F, 3F, 1F);
		bidepl.setTextureSize(64, 32);
		bidepl.mirror = true;
		setRotation(bidepl, -0.3346075F, 0F, 0F);
		forearml = new ModelRenderer(this, 46, 11);
		forearml.addBox(0F, 0F, 0F, 1, 2, 1);
		forearml.setRotationPoint(4F, 4.5F, 0.5F);
		forearml.setTextureSize(64, 32);
		forearml.mirror = true;
		setRotation(forearml, -0.669215F, 0F, 0F);
		forearmr = new ModelRenderer(this, 50, 25);
		forearmr.addBox(0F, 0F, 0F, 1, 2, 1);
		forearmr.setRotationPoint(-1F, 4.5F, 1F);
		forearmr.setTextureSize(64, 32);
		forearmr.mirror = true;
		setRotation(forearmr, -0.3717861F, 0F, 0F);
		topfingr = new ModelRenderer(this, 5, 10);
		topfingr.addBox(0F, 0F, 0F, 1, 1, 1);
		topfingr.setRotationPoint(-1F, 6F, -1F);
		topfingr.setTextureSize(64, 32);
		topfingr.mirror = true;
		setRotation(topfingr, 0F, 0F, 0F);
		handr = new ModelRenderer(this, 10, 2);
		handr.addBox(0F, 0F, 0F, 1, 2, 2);
		handr.setRotationPoint(-1F, 5F, 1F);
		handr.setTextureSize(64, 32);
		handr.mirror = true;
		setRotation(handr, -0.9666439F, 0F, 0F);
		botfingr = new ModelRenderer(this, 0, 13);
		botfingr.addBox(0F, 0F, 0F, 1, 1, 1);
		botfingr.setRotationPoint(-1F, 7F, 0F);
		botfingr.setTextureSize(64, 32);
		botfingr.mirror = true;
		setRotation(botfingr, -0.6320364F, 0F, 0F);
		handl = new ModelRenderer(this, 2, 2);
		handl.addBox(0F, 0F, 0F, 1, 2, 2);
		handl.setRotationPoint(4F, 5F, 0F);
		handl.setTextureSize(64, 32);
		handl.mirror = true;
		setRotation(handl, -0.9666439F, 0F, 0F);
		topfingl = new ModelRenderer(this, 9, 28);
		topfingl.addBox(0F, 0F, 0F, 1, 1, 1);
		topfingl.setRotationPoint(4F, 6.133333F, -2F);
		topfingl.setTextureSize(64, 32);
		topfingl.mirror = true;
		setRotation(topfingl, 0F, 0F, 0F);
		botfingl = new ModelRenderer(this, 25, 26);
		botfingl.addBox(0F, 0F, 0F, 1, 1, 1);
		botfingl.setRotationPoint(4F, 7F, 0F);
		botfingl.setTextureSize(64, 32);
		botfingl.mirror = true;
		setRotation(botfingl, -1.784573F, 0F, 0F);

	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		body.render(f5);
		head.render(f5);
		spine1.render(f5);
		spine2.render(f5);
		spine3.render(f5);
		shoulderl.render(f5);
		shoulderr.render(f5);
		snout.render(f5);
		bicepr.render(f5);
		bidepl.render(f5);
		forearml.render(f5);
		forearmr.render(f5);
		topfingr.render(f5);
		handr.render(f5);
		botfingr.render(f5);
		handl.render(f5);
		topfingl.render(f5);
		botfingl.render(f5);
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
