package com.slugterra.model.velocity;

import com.slugterra.model.ModelTazerling;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTazerlingVel extends ModelBase
{
	//fields
	ModelRenderer Middle_Body;
	ModelRenderer Face;
	ModelRenderer Tooth1;
	ModelRenderer Tooth2;
	ModelRenderer Tail1;
	ModelRenderer Tail2;
	ModelRenderer Tail3;
	ModelRenderer Tail4;
	ModelRenderer Tail5;
	ModelRenderer Tail6;
	ModelRenderer Tail7;
	ModelRenderer Tail8;
	ModelRenderer Tail9;
	ModelRenderer Tail10;
	ModelRenderer Side1;
	ModelRenderer Side2;
	ModelRenderer Side3;
	ModelRenderer Side6;
	ModelRenderer Side5;
	ModelRenderer Side4;
	ModelRenderer Arm1;
	ModelRenderer Arm2;
	ModelRenderer Shoulder1;
	ModelRenderer Shoulder2;
	ModelRenderer Claw11;
	ModelRenderer Claw21;
	ModelRenderer Claw31;
	ModelRenderer Claw41;
	ModelRenderer Claw51;
	ModelRenderer Claw61;
	ModelRenderer Claw12;
	ModelRenderer Claw22;
	ModelRenderer Claw32;
	ModelRenderer Claw71;
	ModelRenderer Claw62;
	ModelRenderer Claw63;
	ModelRenderer Bolt1;
	ModelRenderer Bolt2;
	ModelRenderer Bolt3;
	ModelRenderer Bolt4;
	ModelRenderer Bolt5;
	ModelRenderer Bolt6;
	ModelRenderer Bolt7;
	ModelRenderer Bolt8;
	ModelRenderer Bolt9;
	ModelRenderer Bolt10;
	ModelRenderer Bolt11;
	ModelRenderer Bolt12;
	ModelRenderer Shape1;
	ModelRenderer Bolt13;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape9;
	ModelRenderer Shape7;
	ModelRenderer Shape8;

	public ModelTazerlingVel()
	{
		textureWidth = 64;
		textureHeight = 64;

		Middle_Body = new ModelRenderer(this, 0, 0);
		Middle_Body.addBox(0F, 0F, 0F, 6, 8, 7);
		Middle_Body.setRotationPoint(0F, 0F, 0F);
		Middle_Body.setTextureSize(64, 64);
		Middle_Body.mirror = true;
		setRotation(Middle_Body, 0F, 0F, 0F);
		Face = new ModelRenderer(this, 0, 16);
		Face.addBox(0F, 0F, 0F, 6, 5, 1);
		Face.setRotationPoint(0F, 1F, -1F);
		Face.setTextureSize(64, 64);
		Face.mirror = true;
		setRotation(Face, 0F, 0F, 0F);
		Tooth1 = new ModelRenderer(this, 0, 23);
		Tooth1.addBox(0F, 0F, 0F, 2, 1, 1);
		Tooth1.setRotationPoint(0F, 6F, -1F);
		Tooth1.setTextureSize(64, 64);
		Tooth1.mirror = true;
		setRotation(Tooth1, 0F, 0F, 0F);
		Tooth2 = new ModelRenderer(this, 0, 26);
		Tooth2.addBox(0F, 0F, 0F, 2, 1, 1);
		Tooth2.setRotationPoint(4F, 6F, -1F);
		Tooth2.setTextureSize(64, 64);
		Tooth2.mirror = true;
		setRotation(Tooth2, 0F, 0F, 0F);
		Tail1 = new ModelRenderer(this, 27, 6);
		Tail1.addBox(0F, 0F, 0F, 6, 6, 1);
		Tail1.setRotationPoint(0F, 1F, 7F);
		Tail1.setTextureSize(64, 64);
		Tail1.mirror = true;
		setRotation(Tail1, 0F, 0F, 0F);
		Tail2 = new ModelRenderer(this, 42, 0);
		Tail2.addBox(0F, 0F, 0F, 6, 5, 1);
		Tail2.setRotationPoint(0F, 2F, 8F);
		Tail2.setTextureSize(64, 64);
		Tail2.mirror = true;
		setRotation(Tail2, 0F, 0F, 0F);
		Tail3 = new ModelRenderer(this, 42, 7);
		Tail3.addBox(0F, 0F, 0F, 6, 4, 1);
		Tail3.setRotationPoint(0F, 3F, 9F);
		Tail3.setTextureSize(64, 64);
		Tail3.mirror = true;
		setRotation(Tail3, 0F, 0F, 0F);
		Tail4 = new ModelRenderer(this, 27, 0);
		Tail4.addBox(0F, 0F, 0F, 4, 3, 1);
		Tail4.setRotationPoint(1F, 4F, 10F);
		Tail4.setTextureSize(64, 64);
		Tail4.mirror = true;
		setRotation(Tail4, 0F, 0F, 0F);
		Tail5 = new ModelRenderer(this, 27, 0);
		Tail5.addBox(0F, 0F, 0F, 2, 3, 1);
		Tail5.setRotationPoint(2F, 4F, 11F);
		Tail5.setTextureSize(64, 64);
		Tail5.mirror = true;
		setRotation(Tail5, 0F, 0F, 0F);
		Tail6 = new ModelRenderer(this, 27, 0);
		Tail6.addBox(0F, 0F, 0F, 2, 2, 2);
		Tail6.setRotationPoint(2F, 5F, 12F);
		Tail6.setTextureSize(64, 64);
		Tail6.mirror = true;
		setRotation(Tail6, 0F, 0F, 0F);
		Tail7 = new ModelRenderer(this, 27, 0);
		Tail7.addBox(0F, 0F, 0F, 2, 1, 3);
		Tail7.setRotationPoint(2F, 7F, 13F);
		Tail7.setTextureSize(64, 64);
		Tail7.mirror = true;
		setRotation(Tail7, 0F, 0F, 0F);
		Tail8 = new ModelRenderer(this, 27, 0);
		Tail8.addBox(0F, 0F, 0F, 2, 1, 3);
		Tail8.setRotationPoint(2F, 4F, 13F);
		Tail8.setTextureSize(64, 64);
		Tail8.mirror = true;
		setRotation(Tail8, 0F, 0F, 0F);
		Tail9 = new ModelRenderer(this, 27, 0);
		Tail9.addBox(0F, 0F, 0F, 2, 1, 3);
		Tail9.setRotationPoint(2F, 3F, 15F);
		Tail9.setTextureSize(64, 64);
		Tail9.mirror = true;
		setRotation(Tail9, 0F, 0F, 0F);
		Tail10 = new ModelRenderer(this, 27, 0);
		Tail10.addBox(0F, 0F, 0F, 2, 1, 4);
		Tail10.setRotationPoint(2F, 2F, 17F);
		Tail10.setTextureSize(64, 64);
		Tail10.mirror = true;
		setRotation(Tail10, 0F, 0F, 0F);
		Side1 = new ModelRenderer(this, 15, 16);
		Side1.addBox(0F, 0F, 0F, 1, 4, 8);
		Side1.setRotationPoint(6F, 2F, 0F);
		Side1.setTextureSize(64, 64);
		Side1.mirror = true;
		setRotation(Side1, 0F, 0F, 0F);
		Side2 = new ModelRenderer(this, 15, 16);
		Side2.addBox(0F, 0F, 0F, 1, 1, 6);
		Side2.setRotationPoint(6F, 1F, 1F);
		Side2.setTextureSize(64, 64);
		Side2.mirror = true;
		setRotation(Side2, 0F, 0F, 0F);
		Side3 = new ModelRenderer(this, 15, 16);
		Side3.addBox(0F, 0F, 0F, 1, 1, 6);
		Side3.setRotationPoint(6F, 6F, 1F);
		Side3.setTextureSize(64, 64);
		Side3.mirror = true;
		setRotation(Side3, 0F, 0F, 0F);
		Side6 = new ModelRenderer(this, 15, 16);
		Side6.addBox(0F, 0F, 0F, 1, 1, 6);
		Side6.setRotationPoint(-1F, 1F, 1F);
		Side6.setTextureSize(64, 64);
		Side6.mirror = true;
		setRotation(Side6, 0F, 0F, 0F);
		Side5 = new ModelRenderer(this, 15, 16);
		Side5.addBox(0F, 0F, 0F, 1, 1, 6);
		Side5.setRotationPoint(-1F, 6F, 1F);
		Side5.setTextureSize(64, 64);
		Side5.mirror = true;
		setRotation(Side5, 0F, 0F, 0F);
		Side4 = new ModelRenderer(this, 15, 16);
		Side4.addBox(0F, 0F, 0F, 1, 4, 8);
		Side4.setRotationPoint(-1F, 2F, 0F);
		Side4.setTextureSize(64, 64);
		Side4.mirror = true;
		setRotation(Side4, 0F, 0F, 0F);
		Arm1 = new ModelRenderer(this, 34, 14);
		Arm1.addBox(0F, 0F, 0F, 11, 2, 3);
		Arm1.setRotationPoint(7F, 3F, 2F);
		Arm1.setTextureSize(64, 64);
		Arm1.mirror = true;
		setRotation(Arm1, 0F, 0F, 0F);
		Arm2 = new ModelRenderer(this, 34, 20);
		Arm2.addBox(-11F, 0F, 0F, 11, 2, 3);
		Arm2.setRotationPoint(0F, 3F, 2F);
		Arm2.setTextureSize(64, 64);
		Arm2.mirror = true;
		setRotation(Arm2, 0F, 0F, 0F);
		Shoulder1 = new ModelRenderer(this, 15, 16);
		Shoulder1.addBox(0F, 0F, 0F, 1, 1, 3);
		Shoulder1.setRotationPoint(-2F, 2F, 2F);
		Shoulder1.setTextureSize(64, 64);
		Shoulder1.mirror = true;
		setRotation(Shoulder1, 0F, 0F, 0F);
		Shoulder2 = new ModelRenderer(this, 15, 16);
		Shoulder2.addBox(0F, 0F, 0F, 1, 1, 3);
		Shoulder2.setRotationPoint(7F, 2F, 2F);
		Shoulder2.setTextureSize(64, 64);
		Shoulder2.mirror = true;
		setRotation(Shoulder2, 0F, 0F, 0F);
		Claw11 = new ModelRenderer(this, 27, 0);
		Claw11.addBox(0F, 0F, 0F, 4, 1, 1);
		Claw11.setRotationPoint(17F, 2F, 4F);
		Claw11.setTextureSize(64, 64);
		Claw11.mirror = true;
		setRotation(Claw11, 0F, 0F, 0F);
		Claw21 = new ModelRenderer(this, 27, 0);
		Claw21.addBox(0F, 0F, 0F, 4, 1, 1);
		Claw21.setRotationPoint(17F, 2F, 2F);
		Claw21.setTextureSize(64, 64);
		Claw21.mirror = true;
		setRotation(Claw21, 0F, 0F, 0F);
		Claw31 = new ModelRenderer(this, 27, 0);
		Claw31.addBox(0F, 0F, 0F, 4, 1, 1);
		Claw31.setRotationPoint(18F, 6F, 3F);
		Claw31.setTextureSize(64, 64);
		Claw31.mirror = true;
		setRotation(Claw31, 0F, 0F, 0F);
		Claw41 = new ModelRenderer(this, 27, 0);
		Claw41.addBox(-4F, 0F, 0F, 4, 1, 1);
		Claw41.setRotationPoint(-10F, 2F, 4F);
		Claw41.setTextureSize(64, 64);
		Claw41.mirror = true;
		setRotation(Claw41, 0F, 0F, 0F);
		Claw51 = new ModelRenderer(this, 27, 0);
		Claw51.addBox(-4F, 0F, 0F, 4, 1, 1);
		Claw51.setRotationPoint(-10F, 2F, 2F);
		Claw51.setTextureSize(64, 64);
		Claw51.mirror = true;
		setRotation(Claw51, 0F, 0F, 0F);
		Claw61 = new ModelRenderer(this, 27, 0);
		Claw61.addBox(-4F, 0F, 0F, 4, 1, 1);
		Claw61.setRotationPoint(-11F, 6F, 3F);
		Claw61.setTextureSize(64, 64);
		Claw61.mirror = true;
		setRotation(Claw61, 0F, 0F, 0F);
		Claw12 = new ModelRenderer(this, 27, 0);
		Claw12.addBox(0F, 0F, 0F, 3, 1, 1);
		Claw12.setRotationPoint(20F, 1F, 4F);
		Claw12.setTextureSize(64, 64);
		Claw12.mirror = true;
		setRotation(Claw12, 0F, 0F, 0F);
		Claw22 = new ModelRenderer(this, 27, 0);
		Claw22.addBox(0F, 0F, 0F, 3, 1, 1);
		Claw22.setRotationPoint(17F, 5F, 3F);
		Claw22.setTextureSize(64, 64);
		Claw22.mirror = true;
		setRotation(Claw22, 0F, 0F, 0F);
		Claw32 = new ModelRenderer(this, 27, 0);
		Claw32.addBox(0F, 0F, 0F, 3, 1, 1);
		Claw32.setRotationPoint(20F, 1F, 2F);
		Claw32.setTextureSize(64, 64);
		Claw32.mirror = true;
		setRotation(Claw32, 0F, 0F, 0F);
		Claw71 = new ModelRenderer(this, 27, 0);
		Claw71.addBox(-3F, 0F, 0F, 3, 1, 1);
		Claw71.setRotationPoint(-13F, 1F, 2F);
		Claw71.setTextureSize(64, 64);
		Claw71.mirror = true;
		setRotation(Claw71, 0F, 0F, 0F);
		Claw62 = new ModelRenderer(this, 27, 0);
		Claw62.addBox(-3F, 0F, 0F, 3, 1, 1);
		Claw62.setRotationPoint(-13F, 1F, 4F);
		Claw62.setTextureSize(64, 64);
		Claw62.mirror = true;
		setRotation(Claw62, 0F, 0F, 0F);
		Claw63 = new ModelRenderer(this, 27, 0);
		Claw63.addBox(0F, 0F, 0F, 3, 1, 1);
		Claw63.setRotationPoint(-13F, 5F, 3F);
		Claw63.setTextureSize(64, 64);
		Claw63.mirror = true;
		setRotation(Claw63, 0F, 0F, 0F);
		Bolt1 = new ModelRenderer(this, 27, 0);
		Bolt1.addBox(0F, 0F, 0F, 1, 2, 1);
		Bolt1.setRotationPoint(5F, -2F, 1F);
		Bolt1.setTextureSize(64, 64);
		Bolt1.mirror = true;
		setRotation(Bolt1, 0F, 0F, 0F);
		Bolt2 = new ModelRenderer(this, 27, 0);
		Bolt2.addBox(0F, 0F, 0F, 1, 2, 1);
		Bolt2.setRotationPoint(5F, -3F, 2F);
		Bolt2.setTextureSize(64, 64);
		Bolt2.mirror = true;
		setRotation(Bolt2, 0F, 0F, 0F);
		Bolt3 = new ModelRenderer(this, 27, 0);
		Bolt3.addBox(0F, 0F, 0F, 1, 2, 1);
		Bolt3.setRotationPoint(5F, -4F, 5F);
		Bolt3.setTextureSize(64, 64);
		Bolt3.mirror = true;
		setRotation(Bolt3, 0F, 0F, 0F);
		Bolt4 = new ModelRenderer(this, 27, 0);
		Bolt4.addBox(0F, 0F, 0F, 1, 2, 1);
		Bolt4.setRotationPoint(5F, -5F, 6F);
		Bolt4.setTextureSize(64, 64);
		Bolt4.mirror = true;
		setRotation(Bolt4, 0F, 0F, 0F);
		Bolt5 = new ModelRenderer(this, 27, 0);
		Bolt5.addBox(0F, 0F, 0F, 1, 2, 1);
		Bolt5.setRotationPoint(0F, -2F, 1F);
		Bolt5.setTextureSize(64, 64);
		Bolt5.mirror = true;
		setRotation(Bolt5, 0F, 0F, 0F);
		Bolt6 = new ModelRenderer(this, 27, 0);
		Bolt6.addBox(0F, 0F, 0F, 1, 2, 1);
		Bolt6.setRotationPoint(0F, -3F, 2F);
		Bolt6.setTextureSize(64, 64);
		Bolt6.mirror = true;
		setRotation(Bolt6, 0F, 0F, 0F);
		Bolt7 = new ModelRenderer(this, 27, 0);
		Bolt7.addBox(0F, 0F, 0F, 1, 2, 1);
		Bolt7.setRotationPoint(0F, -4F, 5F);
		Bolt7.setTextureSize(64, 64);
		Bolt7.mirror = true;
		setRotation(Bolt7, 0F, 0F, 0F);
		Bolt8 = new ModelRenderer(this, 27, 0);
		Bolt8.addBox(0F, 0F, 0F, 1, 2, 1);
		Bolt8.setRotationPoint(0F, -5F, 6F);
		Bolt8.setTextureSize(64, 64);
		Bolt8.mirror = true;
		setRotation(Bolt8, 0F, 0F, 0F);
		Bolt9 = new ModelRenderer(this, 27, 0);
		Bolt9.addBox(0F, 0F, 0F, 1, 1, 2);
		Bolt9.setRotationPoint(0F, -3F, 3F);
		Bolt9.setTextureSize(64, 64);
		Bolt9.mirror = true;
		setRotation(Bolt9, 0F, 0F, 0F);
		Bolt10 = new ModelRenderer(this, 27, 0);
		Bolt10.addBox(0F, 0F, 0F, 1, 1, 2);
		Bolt10.setRotationPoint(0F, -5F, 7F);
		Bolt10.setTextureSize(64, 64);
		Bolt10.mirror = true;
		setRotation(Bolt10, 0F, 0F, 0F);
		Bolt11 = new ModelRenderer(this, 27, 0);
		Bolt11.addBox(0F, 0F, 0F, 1, 1, 2);
		Bolt11.setRotationPoint(5F, -5F, 7F);
		Bolt11.setTextureSize(64, 64);
		Bolt11.mirror = true;
		setRotation(Bolt11, 0F, 0F, 0F);
		Bolt12 = new ModelRenderer(this, 27, 0);
		Bolt12.addBox(0F, 0F, 0F, 1, 1, 2);
		Bolt12.setRotationPoint(5F, -3F, 3F);
		Bolt12.setTextureSize(64, 64);
		Bolt12.mirror = true;
		setRotation(Bolt12, 0F, 0F, 0F);
		Shape1 = new ModelRenderer(this, 27, 0);
		Shape1.addBox(0F, 0F, 0F, 2, 4, 1);
		Shape1.setRotationPoint(2F, -4F, 2F);
		Shape1.setTextureSize(64, 64);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Bolt13 = new ModelRenderer(this, 27, 0);
		Bolt13.addBox(0F, 0F, 0F, 2, 2, 1);
		Bolt13.setRotationPoint(2F, -5F, 3F);
		Bolt13.setTextureSize(64, 64);
		Bolt13.mirror = true;
		setRotation(Bolt13, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 27, 0);
		Shape2.addBox(0F, 0F, 0F, 2, 1, 2);
		Shape2.setRotationPoint(2F, -5F, 4F);
		Shape2.setTextureSize(64, 64);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 27, 0);
		Shape3.addBox(0F, 0F, 0F, 2, 1, 4);
		Shape3.setRotationPoint(2F, -1F, 3F);
		Shape3.setTextureSize(64, 64);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 27, 0);
		Shape4.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape4.setRotationPoint(2F, 0F, 7F);
		Shape4.setTextureSize(64, 64);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 27, 0);
		Shape5.addBox(0F, 0F, 0F, 2, 1, 2);
		Shape5.setRotationPoint(2F, -2F, 4F);
		Shape5.setTextureSize(64, 64);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 27, 0);
		Shape6.addBox(0F, 0F, 0F, 2, 1, 2);
		Shape6.setRotationPoint(2F, -3F, 5F);
		Shape6.setTextureSize(64, 64);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 27, 0);
		Shape9.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape9.setRotationPoint(2F, -2F, 10F);
		Shape9.setTextureSize(64, 64);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 27, 0);
		Shape7.addBox(0F, 0F, 0F, 2, 2, 1);
		Shape7.setRotationPoint(2F, -1F, 9F);
		Shape7.setTextureSize(64, 64);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 27, 0);
		Shape8.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape8.setRotationPoint(2F, -2F, 12F);
		Shape8.setTextureSize(64, 64);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Middle_Body.render(f5);
		Face.render(f5);
		Tooth1.render(f5);
		Tooth2.render(f5);
		Tail1.render(f5);
		Tail2.render(f5);
		Tail3.render(f5);
		Tail4.render(f5);
		Tail5.render(f5);
		Tail6.render(f5);
		Tail7.render(f5);
		Tail8.render(f5);
		Tail9.render(f5);
		Tail10.render(f5);
		Side1.render(f5);
		Side2.render(f5);
		Side3.render(f5);
		Side6.render(f5);
		Side5.render(f5);
		Side4.render(f5);
		Arm1.render(f5);
		Arm2.render(f5);
		Shoulder1.render(f5);
		Shoulder2.render(f5);
		Claw11.render(f5);
		Claw21.render(f5);
		Claw31.render(f5);
		Claw41.render(f5);
		Claw51.render(f5);
		Claw61.render(f5);
		Claw12.render(f5);
		Claw22.render(f5);
		Claw32.render(f5);
		Claw71.render(f5);
		Claw62.render(f5);
		Claw63.render(f5);
		Bolt1.render(f5);
		Bolt2.render(f5);
		Bolt3.render(f5);
		Bolt4.render(f5);
		Bolt5.render(f5);
		Bolt6.render(f5);
		Bolt7.render(f5);
		Bolt8.render(f5);
		Bolt9.render(f5);
		Bolt10.render(f5);
		Bolt11.render(f5);
		Bolt12.render(f5);
		Shape1.render(f5);
		Bolt13.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape9.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
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
