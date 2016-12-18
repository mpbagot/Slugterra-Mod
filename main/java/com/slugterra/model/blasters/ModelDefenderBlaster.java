package com.slugterra.model.blasters;

import com.slugterra.render.blasters.RenderBlaster;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDefenderBlaster extends ModelBase
{
	
	public static boolean reload;
	public static boolean[] upgrades;
	private int frame = 0;
	
	//fields
	ModelRenderer Handle;
	ModelRenderer Baseofhandle;
	ModelRenderer frontofhandle;
	ModelRenderer FusionCore;
	ModelRenderer topofhandle;
	ModelRenderer backofgun;
	ModelRenderer backclip;
	ModelRenderer Underfusioncore;
	ModelRenderer behindcanister;
	ModelRenderer Topofbarrel;
	ModelRenderer topoftop;
	ModelRenderer bottomofbarrel;
	ModelRenderer frontcanister;
	ModelRenderer side1;
	ModelRenderer side2;
	ModelRenderer Slugtube1;
	ModelRenderer Slugtube2;

	public ModelDefenderBlaster()
	{
		textureWidth = 64;
		textureHeight = 32;

		Handle = new ModelRenderer(this, 0, 13);
		Handle.addBox(0F, 0F, 0F, 1, 2, 4);
		Handle.setRotationPoint(0.5F, -1F, 0F);
		Handle.setTextureSize(64, 32);
		Handle.mirror = true;
		setRotation(Handle, -0.8726646F, 0F, 0F);
		Baseofhandle = new ModelRenderer(this, 26, 0);
		Baseofhandle.addBox(0F, 0F, 0F, 2, 4, 1);
		Baseofhandle.setRotationPoint(0F, 2F, 2F);
		Baseofhandle.setTextureSize(64, 32);
		Baseofhandle.mirror = true;
		setRotation(Baseofhandle, -0.8726646F, 0F, 0F);
		frontofhandle = new ModelRenderer(this, 26, 0);
		frontofhandle.addBox(0F, 0F, 0F, 1, 1, 5);
		frontofhandle.setRotationPoint(0.5F, 1F, -3F);
		frontofhandle.setTextureSize(64, 32);
		frontofhandle.mirror = true;
		setRotation(frontofhandle, -0.8726646F, 0F, 0F);
		FusionCore = new ModelRenderer(this, 0, 7);
		FusionCore.addBox(0F, 0F, 0F, 3, 3, 3);
		FusionCore.setRotationPoint(-0.5F, -3F, -5F);
		FusionCore.setTextureSize(64, 32);
		FusionCore.mirror = true;
		setRotation(FusionCore, 0F, 0F, 0F);
		topofhandle = new ModelRenderer(this, 31, 0);
		topofhandle.addBox(0F, 0F, 0F, 1, 5, 1);
		topofhandle.setRotationPoint(0F, -1F, 0F);
		topofhandle.setTextureSize(64, 32);
		topofhandle.mirror = true;
		setRotation(topofhandle, -1.132915F, 0F, 0F);
		backofgun = new ModelRenderer(this, 26, 0);
		backofgun.addBox(0F, 0F, 0F, 2, 3, 4);
		backofgun.setRotationPoint(0F, -4F, -4F);
		backofgun.setTextureSize(64, 32);
		backofgun.mirror = true;
		setRotation(backofgun, 0F, 0F, 0F);
		backclip = new ModelRenderer(this, 26, 0);
		backclip.addBox(0F, 0F, 0F, 2, 1, 3);
		backclip.setRotationPoint(0F, -1F, -2F);
		backclip.setTextureSize(64, 32);
		backclip.mirror = true;
		setRotation(backclip, 0.2685122F, 0F, 0F);
		Underfusioncore = new ModelRenderer(this, 18, 0);
		Underfusioncore.addBox(0F, 0F, 0F, 2, 3, 2);
		Underfusioncore.setRotationPoint(0F, -1F, -5F);
		Underfusioncore.setTextureSize(64, 32);
		Underfusioncore.mirror = true;
		setRotation(Underfusioncore, 0F, 0F, 0F);
		behindcanister = new ModelRenderer(this, 18, 5);
		behindcanister.addBox(0F, 0F, 0F, 2, 2, 2);
		behindcanister.setRotationPoint(0F, -2F, -7F);
		behindcanister.setTextureSize(64, 32);
		behindcanister.mirror = true;
		setRotation(behindcanister, 0F, 0F, 0F);
		Topofbarrel = new ModelRenderer(this, 22, 20);
		Topofbarrel.addBox(0F, 0F, 0F, 2, 2, 10);
		Topofbarrel.setRotationPoint(0F, -4F, -15F);
		Topofbarrel.setTextureSize(64, 32);
		Topofbarrel.mirror = true;
		setRotation(Topofbarrel, 0F, 0F, 0F);
		topoftop = new ModelRenderer(this, 12, 12);
		topoftop.addBox(0F, 0F, 0F, 2, 1, 8);
		topoftop.setRotationPoint(0F, -5F, -13F);
		topoftop.setTextureSize(64, 32);
		topoftop.mirror = true;
		setRotation(topoftop, 0F, 0F, 0F);
		bottomofbarrel = new ModelRenderer(this, 0, 21);
		bottomofbarrel.addBox(0F, 0F, 0F, 2, 2, 9);
		bottomofbarrel.setRotationPoint(0F, 0F, -14F);
		bottomofbarrel.setTextureSize(64, 32);
		bottomofbarrel.mirror = true;
		setRotation(bottomofbarrel, 0F, 0F, 0F);
		frontcanister = new ModelRenderer(this, 0, 19);
		frontcanister.addBox(0F, 0F, 0F, 2, 2, 1);
		frontcanister.setRotationPoint(0F, -2F, -11F);
		frontcanister.setTextureSize(64, 32);
		frontcanister.mirror = true;
		setRotation(frontcanister, 0F, 0F, 0F);
		side1 = new ModelRenderer(this, 0, 0);
		side1.addBox(0F, 0F, 0F, 1, 1, 2);
		side1.setRotationPoint(-1F, -2F, -14F);
		side1.setTextureSize(64, 32);
		side1.mirror = true;
		setRotation(side1, 0F, 0F, 0F);
		side2 = new ModelRenderer(this, 0, 0);
		side2.addBox(0F, 0F, 0F, 1, 1, 2);
		side2.setRotationPoint(2F, -2F, -14F);
		side2.setTextureSize(64, 32);
		side2.mirror = true;
		setRotation(side2, 0F, 0F, 0F);
		Slugtube1 = new ModelRenderer(this, 38, 0);
		Slugtube1.addBox(-1F, -10F, -1F, 2, 2, 3);
		Slugtube1.setRotationPoint(1F, 8F, -9F);
		Slugtube1.setTextureSize(64, 32);
		Slugtube1.mirror = true;
		setRotation(Slugtube1, 0F, 0F, 0F);
		Slugtube2 = new ModelRenderer(this, 38, 0);
		Slugtube2.addBox(-1F, 8F, -1F, 2, 2, 3);
		Slugtube2.setRotationPoint(1F, 8F, -9F);
		Slugtube2.setTextureSize(64, 32);
		Slugtube2.mirror = true;
		setRotation(Slugtube2, 0F, 0F, 0F);
		Slugtube2.rotateAngleZ = Slugtube1.rotateAngleZ = (float)Math.PI;
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5, boolean isFirstPerson, boolean reloading)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.reload = reloading;
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Handle.render(f5);
		Baseofhandle.render(f5);
		frontofhandle.render(f5);
		FusionCore.render(f5);
		topofhandle.render(f5);
		backofgun.render(f5);
		backclip.render(f5);
		Underfusioncore.render(f5);
		behindcanister.render(f5);
		Topofbarrel.render(f5);
		topoftop.render(f5);
		bottomofbarrel.render(f5);
		frontcanister.render(f5);
		side1.render(f5);
		side2.render(f5);
		Slugtube2.render(f5);
		if (isFirstPerson == false){
			Slugtube1.render(f5);
		}
		//this.reload = false;
	}
	//TODO This breaks things!!!
	/*public void renderInventory(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
		float slprx2 = this.Slugtube2.rotateAngleZ;
		this.Slugtube2.rotateAngleZ = (float) Math.PI;
		this.render(entity, f, f1, f2, f3, f4, f5, true);
		this.Slugtube2.rotateAngleZ = slprx2;
		
	}*/
	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		if (reload){
			frame += 1;
			if (frame < 11){
				this.Slugtube1.rotateAngleZ -= Math.PI/10;
			}
			if (frame >= 9 && frame < 19){
				this.Slugtube2.rotateAngleZ -= Math.PI/10;
			}
			if (frame >= 20){
				reload = false;
				RenderBlaster.reloading = false;
				frame = 0;
				this.Slugtube1.rotateAngleZ = this.Slugtube2.rotateAngleZ = (float) Math.PI;
				//System.out.println(this.Slugtube2.rotateAngleZ);
			}
		}
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
