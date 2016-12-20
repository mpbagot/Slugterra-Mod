package com.slugterra.model.velocity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMakoBreakerVel extends ModelBase
{
	//fields
	ModelRenderer Body;
	ModelRenderer Head;
	ModelRenderer Mouth;
	ModelRenderer Dorsal;
	ModelRenderer rfin;
	ModelRenderer lfin;
	ModelRenderer back;
	ModelRenderer toptail;
	ModelRenderer bottail;

	public ModelMakoBreakerVel()
	{
		textureWidth = 64;
		textureHeight = 32;

		Body = new ModelRenderer(this, 6, 20);
		Body.addBox(0F, 0F, 0F, 3, 3, 5);
		Body.setRotationPoint(2F, -1F, -3F);
		Body.setTextureSize(64, 32);
		Body.mirror = true;
		setRotation(Body, 0F, 0F, 0F);
		Head = new ModelRenderer(this, 24, 0);
		Head.addBox(0F, 0F, 0F, 3, 2, 3);
		Head.setRotationPoint(2F, -1F, -6F);
		Head.setTextureSize(64, 32);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		Mouth = new ModelRenderer(this, 0, 12);
		Mouth.addBox(0F, 0F, 0F, 3, 1, 2);
		Mouth.setRotationPoint(2F, 1F, -5F);
		Mouth.setTextureSize(64, 32);
		Mouth.mirror = true;
		setRotation(Mouth, 0F, 0F, 0F);
		Dorsal = new ModelRenderer(this, 36, 28);
		Dorsal.addBox(0F, 0F, 0F, 1, 3, 2);
		Dorsal.setRotationPoint(3F, -3F, -2F);
		Dorsal.setTextureSize(64, 32);
		Dorsal.mirror = true;
		setRotation(Dorsal, -0.3346075F, 0F, 0F);
		rfin = new ModelRenderer(this, 0, 29);
		rfin.addBox(0F, 0F, 0F, 1, 2, 1);
		rfin.setRotationPoint(2F, 0F, -2F);
		rfin.setTextureSize(64, 32);
		rfin.mirror = true;
		setRotation(rfin, 0.0371786F, 0F, 1.115358F);
		lfin = new ModelRenderer(this, 10, 29);
		lfin.addBox(0F, 0F, 0F, 1, 3, 1);
		lfin.setRotationPoint(7F, 1F, -2F);
		lfin.setTextureSize(64, 32);
		lfin.mirror = true;
		setRotation(lfin, 0.0371786F, 0F, 1.953013F);
		back = new ModelRenderer(this, 0, 2);
		back.addBox(0F, 0F, 0F, 1, 4, 3);
		back.setRotationPoint(3F, -2F, 2F);
		back.setTextureSize(64, 32);
		back.mirror = true;
		setRotation(back, -0.3346075F, 0F, 0F);
		toptail = new ModelRenderer(this, 22, 8);
		toptail.addBox(0F, 0F, 0F, 1, 1, 2);
		toptail.setRotationPoint(3F, -1F, 4F);
		toptail.setTextureSize(64, 32);
		toptail.mirror = true;
		setRotation(toptail, 0F, 0F, 0F);
		bottail = new ModelRenderer(this, 14, 8);
		bottail.addBox(0F, 0F, 0F, 1, 1, 1);
		bottail.setRotationPoint(3F, 0F, 4F);
		bottail.setTextureSize(64, 32);
		bottail.mirror = true;
		setRotation(bottail, 0F, 0F, 0F);


	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Body.render(f5);
		Head.render(f5);
		Mouth.render(f5);
		Dorsal.render(f5);
		rfin.render(f5);
		lfin.render(f5);
		back.render(f5);
		toptail.render(f5);
		bottail.render(f5);
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
