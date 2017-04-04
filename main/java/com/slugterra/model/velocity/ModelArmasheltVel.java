package com.slugterra.model.velocity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelArmasheltVel extends ModelBase
{
	//fields
	ModelRenderer Body;
	ModelRenderer Shell1;
	ModelRenderer Shell3;
	ModelRenderer Shell41;
	ModelRenderer Shell42;
	ModelRenderer Shell5;
	ModelRenderer Shell6;
	ModelRenderer Shell7;
	ModelRenderer Shell8;
	ModelRenderer Tail;
	ModelRenderer Arm1;
	ModelRenderer ArmClaw11;
	ModelRenderer ArmClaw12;
	ModelRenderer ArmClaw13;
	ModelRenderer ArmClaw14;
	ModelRenderer Arm2;
	ModelRenderer ArmClaw23;
	ModelRenderer ArmClaw21;
	ModelRenderer ArmClaw22;
	ModelRenderer ArmClaw24;
	ModelRenderer Claw11;
	ModelRenderer Claw12;
	ModelRenderer Claw13;
	ModelRenderer Claw21;
	ModelRenderer Claw22;
	ModelRenderer Claw23;

	public ModelArmasheltVel()
	{
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this, 0, 0);
		Body.addBox(0F, 0F, 0F, 4, 4, 4);
		Body.setRotationPoint(0F, 12F, -3F);
		Body.setTextureSize(64, 64);
		Body.mirror = true;
		setRotation(Body, 0F, 0F, 0F);
		Shell1 = new ModelRenderer(this, 21, 0);
		Shell1.addBox(0F, 0F, 0F, 4, 2, 6);
		Shell1.setRotationPoint(0F, 10F, -3F);
		Shell1.setTextureSize(64, 64);
		Shell1.mirror = true;
		setRotation(Shell1, 0F, 0F, 0F);
		Shell3 = new ModelRenderer(this, 0, 11);
		Shell3.addBox(0F, 0F, 0F, 4, 1, 6);
		Shell3.setRotationPoint(0F, 16F, -3F);
		Shell3.setTextureSize(64, 64);
		Shell3.mirror = true;
		setRotation(Shell3, 0F, 0F, 0F);
		Shell41 = new ModelRenderer(this, 21, 9);
		Shell41.addBox(0F, 0F, 0F, 1, 2, 5);
		Shell41.setRotationPoint(4F, 10F, -3F);
		Shell41.setTextureSize(64, 64);
		Shell41.mirror = true;
		setRotation(Shell41, 0F, 0F, 0F);
		Shell42 = new ModelRenderer(this, 21, 17);
		Shell42.addBox(0F, 0F, 0F, 1, 2, 5);
		Shell42.setRotationPoint(-1F, 10F, -3F);
		Shell42.setTextureSize(64, 64);
		Shell42.mirror = true;
		setRotation(Shell42, 0F, 0F, 0F);
		Shell5 = new ModelRenderer(this, 0, 19);
		Shell5.addBox(0F, 0F, 0F, 4, 2, 1);
		Shell5.setRotationPoint(0F, 11F, -4F);
		Shell5.setTextureSize(64, 64);
		Shell5.mirror = true;
		setRotation(Shell5, 0F, 0F, 0F);
		Shell6 = new ModelRenderer(this, 0, 23);
		Shell6.addBox(0F, 0F, 0F, 2, 1, 3);
		Shell6.setRotationPoint(1F, 17F, -2F);
		Shell6.setTextureSize(64, 64);
		Shell6.mirror = true;
		setRotation(Shell6, 0F, 0F, 0F);
		Shell7 = new ModelRenderer(this, 11, 25);
		Shell7.addBox(0F, 0F, 0F, 4, 2, 4);
		Shell7.setRotationPoint(0F, 8.4F, -2F);
		Shell7.setTextureSize(64, 64);
		Shell7.mirror = true;
		setRotation(Shell7, 0F, 0F, 0F);
		Shell8 = new ModelRenderer(this, 42, 0);
		Shell8.addBox(0F, 0F, 0F, 4, 4, 3);
		Shell8.setRotationPoint(0F, 12F, 1F);
		Shell8.setTextureSize(64, 64);
		Shell8.mirror = true;
		setRotation(Shell8, 0F, 0F, 0F);
		Tail = new ModelRenderer(this, 42, 8);
		Tail.addBox(0F, 0F, 0F, 2, 2, 2);
		Tail.setRotationPoint(1F, 13F, 4F);
		Tail.setTextureSize(64, 64);
		Tail.mirror = true;
		setRotation(Tail, 0F, 0F, 0F);
		Arm1 = new ModelRenderer(this, 34, 15);
		Arm1.addBox(0F, 0F, 0F, 4, 2, 2);
		Arm1.setRotationPoint(4F, 12.86667F, -2F);
		Arm1.setTextureSize(64, 64);
		Arm1.mirror = true;
		setRotation(Arm1, 0F, 0F, 0F);
		ArmClaw11 = new ModelRenderer(this, 34, 21);
		ArmClaw11.addBox(0F, 0F, 0F, 3, 4, 2);
		ArmClaw11.setRotationPoint(8F, 12F, -1F);
		ArmClaw11.setTextureSize(64, 64);
		ArmClaw11.mirror = true;
		setRotation(ArmClaw11, 0F, 0F, 0F);
		ArmClaw12 = new ModelRenderer(this, 34, 29);
		ArmClaw12.addBox(0F, 0F, 0F, 2, 2, 1);
		ArmClaw12.setRotationPoint(8F, 13F, 1F);
		ArmClaw12.setTextureSize(64, 64);
		ArmClaw12.mirror = true;
		setRotation(ArmClaw12, 0F, 0F, 0F);
		ArmClaw13 = new ModelRenderer(this, 30, 33);
		ArmClaw13.addBox(0F, 0F, 0F, 4, 4, 3);
		ArmClaw13.setRotationPoint(8F, 12F, -4F);
		ArmClaw13.setTextureSize(64, 64);
		ArmClaw13.mirror = true;
		setRotation(ArmClaw13, 0F, 0F, 0F);
		ArmClaw14 = new ModelRenderer(this, 25, 33);
		ArmClaw14.addBox(0F, 0F, 0F, 1, 2, 1);
		ArmClaw14.setRotationPoint(8F, 13F, 2F);
		ArmClaw14.setTextureSize(64, 64);
		ArmClaw14.mirror = true;
		setRotation(ArmClaw14, 0F, 0F, 0F);
		Arm2 = new ModelRenderer(this, 34, 15);
		Arm2.addBox(-4F, 0F, 0F, 4, 2, 2);
		Arm2.setRotationPoint(-0.2F, 13F, -2F);
		Arm2.setTextureSize(64, 64);
		Arm2.mirror = true;
		setRotation(Arm2, 0F, 0F, 0F);
		ArmClaw23 = new ModelRenderer(this, 45, 33);
		ArmClaw23.addBox(0F, 0F, 0F, 4, 4, 3);
		ArmClaw23.setRotationPoint(-8F, 12F, -4F);
		ArmClaw23.setTextureSize(64, 64);
		ArmClaw23.mirror = true;
		setRotation(ArmClaw23, 0F, 0F, 0F);
		ArmClaw21 = new ModelRenderer(this, 45, 21);
		ArmClaw21.addBox(0F, 0F, 0F, 3, 4, 2);
		ArmClaw21.setRotationPoint(-7F, 12F, -1F);
		ArmClaw21.setTextureSize(64, 64);
		ArmClaw21.mirror = true;
		setRotation(ArmClaw21, 0F, 0F, 0F);
		ArmClaw22 = new ModelRenderer(this, 34, 29);
		ArmClaw22.addBox(0F, 0F, 0F, 2, 2, 1);
		ArmClaw22.setRotationPoint(-6F, 13F, 1F);
		ArmClaw22.setTextureSize(64, 64);
		ArmClaw22.mirror = true;
		setRotation(ArmClaw22, 0F, 0F, 0F);
		ArmClaw24 = new ModelRenderer(this, 25, 33);
		ArmClaw24.addBox(0F, 0F, 0F, 1, 2, 1);
		ArmClaw24.setRotationPoint(-5F, 13F, 2F);
		ArmClaw24.setTextureSize(64, 64);
		ArmClaw24.mirror = true;
		setRotation(ArmClaw24, 0F, 0F, 0F);
		Claw11 = new ModelRenderer(this, 0, 34);
		Claw11.addBox(-2F, 0F, -3F, 2, 2, 3);
		Claw11.setRotationPoint(9F, 13F, -4F);
		Claw11.setTextureSize(64, 64);
		Claw11.mirror = true;
		setRotation(Claw11, 0F, 0.4461433F, 0F);
		Claw12 = new ModelRenderer(this, 0, 40);
		Claw12.addBox(-2F, 0F, -4F, 2, 4, 4);
		Claw12.setRotationPoint(11F, 12F, -4F);
		Claw12.setTextureSize(64, 64);
		Claw12.mirror = true;
		setRotation(Claw12, 0F, 0F, 0F);
		Claw13 = new ModelRenderer(this, 13, 45);
		Claw13.addBox(0F, 0F, 0F, 1, 2, 1);
		Claw13.setRotationPoint(9F, 13F, -9F);
		Claw13.setTextureSize(64, 64);
		Claw13.mirror = true;
		setRotation(Claw13, 0F, 0F, 0F);
		Claw21 = new ModelRenderer(this, 0, 34);
		Claw21.addBox(0F, 0F, -3F, 2, 2, 3);
		Claw21.setRotationPoint(-5F, 13F, -4F);
		Claw21.setTextureSize(64, 64);
		Claw21.mirror = true;
		setRotation(Claw21, 0F, -0.3346075F, 0F);
		Claw22 = new ModelRenderer(this, 0, 40);
		Claw22.addBox(0F, 0F, 0F, 2, 4, 4);
		Claw22.setRotationPoint(-7F, 12F, -8F);
		Claw22.setTextureSize(64, 64);
		Claw22.mirror = true;
		setRotation(Claw22, 0F, 0F, 0F);
		Claw23 = new ModelRenderer(this, 13, 45);
		Claw23.addBox(0F, 0F, 0F, 1, 2, 1);
		Claw23.setRotationPoint(-6F, 13F, -9F);
		Claw23.setTextureSize(64, 64);
		Claw23.mirror = true;
		setRotation(Claw23, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Body.render(f5);
		Shell1.render(f5);
		Shell3.render(f5);
		Shell41.render(f5);
		Shell42.render(f5);
		Shell5.render(f5);
		Shell6.render(f5);
		Shell7.render(f5);
		Shell8.render(f5);
		Tail.render(f5);
		Arm1.render(f5);
		ArmClaw11.render(f5);
		ArmClaw12.render(f5);
		ArmClaw13.render(f5);
		ArmClaw14.render(f5);
		Arm2.render(f5);
		ArmClaw23.render(f5);
		ArmClaw21.render(f5);
		ArmClaw22.render(f5);
		ArmClaw24.render(f5);
		Claw11.render(f5);
		Claw12.render(f5);
		Claw13.render(f5);
		Claw21.render(f5);
		Claw22.render(f5);
		Claw23.render(f5);

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
