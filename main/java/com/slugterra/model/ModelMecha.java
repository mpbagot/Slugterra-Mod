package com.slugterra.model;

import java.util.HashMap;

import com.slugterra.entity.EntityMecha;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelMecha extends ModelBase
{

	HashMap<String, Float> angles = new HashMap<String, Float>();

	//fields
	ModelRenderer FusionCore;
	ModelRenderer FusionCore2;
	ModelRenderer FusionCore3;
	ModelRenderer BehindFusionCore;
	ModelRenderer Tail;
	ModelRenderer BackRestRest;
	ModelRenderer BackRest;
	ModelRenderer UnderFusionCore;
	ModelRenderer Seat;
	ModelRenderer FrontBulk;
	ModelRenderer Tyre;
	ModelRenderer Handle1;
	ModelRenderer Handle2;
	ModelRenderer Neck;
	ModelRenderer Head;
	ModelRenderer Ear1;
	ModelRenderer Ear2;
	ModelRenderer Snout;
	ModelRenderer FatHead;
	ModelRenderer TopTopBackRightLeg;
	ModelRenderer TopTopBackLeftLeg;
	ModelRenderer BottomTopBackLeftLeg;
	ModelRenderer BottomTopBackRightLeg;
	ModelRenderer MiddleBackLeftLeg;
	ModelRenderer MiddleBackRightLeg;
	ModelRenderer BottomBackLeftLeg;
	ModelRenderer BottomBackRightLeg;
	ModelRenderer FootFrontRightLeg;
	ModelRenderer FootBackRightLeg;
	ModelRenderer TopFrontLeftLeg;
	ModelRenderer TopFrontRightLeg;
	ModelRenderer BottomTopFrontRightLeg;
	ModelRenderer BottomTopFrontLeftLeg;
	ModelRenderer MiddleFrontLeftLeg;
	ModelRenderer MiddleFrontRightLeg;
	ModelRenderer FootBackLeftLeg;
	ModelRenderer FootFrontLeftLeg;
	ModelRenderer FootholdL;
	ModelRenderer FootholdR;
	ModelRenderer BackLeftToe3;
	ModelRenderer BackLeftToe2;
	ModelRenderer BackLeftToe1;
	ModelRenderer FrontLeftToe1;
	ModelRenderer FrontLeftToe2;
	ModelRenderer FrontLeftToe3;
	ModelRenderer BackRightToe3;
	ModelRenderer BackRightToe2;
	ModelRenderer BackRightToe1;
	ModelRenderer FrontRightToe3;
	ModelRenderer FrontRightToe2;
	ModelRenderer FrontRightToe1;

	public ModelMecha()
	{
		textureWidth = 128;
		textureHeight = 128;

		FusionCore = new ModelRenderer(this, 0, 23);
		FusionCore.addBox(-4.5F, 0.5F, 0F, 9, 4, 7);
		FusionCore.setRotationPoint(0F, 11F, 0F);
		FusionCore.setTextureSize(128, 128);
		FusionCore.mirror = true;
		setRotation(FusionCore, 0F, 0F, 0F);
		FusionCore2 = new ModelRenderer(this, 0, 12);
		FusionCore2.addBox(-4.5F, 0F, 0.5F, 9, 7, 4);
		FusionCore2.setRotationPoint(0F, 10F, 1F);
		FusionCore2.setTextureSize(128, 128);
		FusionCore2.mirror = true;
		setRotation(FusionCore2, 0F, 0F, 0F);
		FusionCore3 = new ModelRenderer(this, 0, 34);
		FusionCore3.addBox(-4.5F, 0F, 0F, 10, 6, 6);
		FusionCore3.setRotationPoint(-0.5F, 10.5F, 0.5F);
		FusionCore3.setTextureSize(128, 128);
		FusionCore3.mirror = true;
		setRotation(FusionCore3, 0F, 0F, 0F);
		BehindFusionCore = new ModelRenderer(this, 0, 46);
		BehindFusionCore.addBox(-4.5F, 0F, 0F, 9, 5, 6);
		BehindFusionCore.setRotationPoint(0F, 10F, 7F);
		BehindFusionCore.setTextureSize(128, 128);
		BehindFusionCore.mirror = true;
		setRotation(BehindFusionCore, 0F, 0F, 0F);
		Tail = new ModelRenderer(this, 0, 57);
		Tail.addBox(-1F, 0F, 0F, 2, 5, 1);
		Tail.setRotationPoint(0F, 11F, 12F);
		Tail.setTextureSize(128, 128);
		Tail.mirror = true;
		setRotation(Tail, 0.3717861F, 0F, 0F);
		BackRestRest = new ModelRenderer(this, 6, 57);
		BackRestRest.addBox(-4.5F, -4F, 0F, 9, 4, 1);
		BackRestRest.setRotationPoint(0F, 11F, 6F);
		BackRestRest.setTextureSize(128, 128);
		BackRestRest.mirror = true;
		setRotation(BackRestRest, 0.1487144F, 0F, 0F);
		BackRest = new ModelRenderer(this, 0, 2);
		BackRest.addBox(-4.5F, -4F, 0F, 9, 8, 2);
		BackRest.setRotationPoint(0F, 6F, 4F);
		BackRest.setTextureSize(128, 128);
		BackRest.mirror = true;
		setRotation(BackRest, -0.4089647F, 0F, 0F);
		UnderFusionCore = new ModelRenderer(this, 24, 53);
		UnderFusionCore.addBox(-4.5F, -1F, 0F, 7, 1, 9);
		UnderFusionCore.setRotationPoint(1F, 17F, -5F);
		UnderFusionCore.setTextureSize(128, 128);
		UnderFusionCore.mirror = true;
		setRotation(UnderFusionCore, 0F, 0F, 0F);
		Seat = new ModelRenderer(this, 38, 41);
		Seat.addBox(-4F, 0F, 0F, 8, 7, 5);
		Seat.setRotationPoint(0F, 10F, -3F);
		Seat.setTextureSize(128, 128);
		Seat.mirror = true;
		setRotation(Seat, 0F, 0F, 0F);
		FrontBulk = new ModelRenderer(this, 0, 64);
		FrontBulk.addBox(-5.5F, 0F, 0F, 9, 10, 13);
		FrontBulk.setRotationPoint(1F, 6F, -16F);
		FrontBulk.setTextureSize(128, 128);
		FrontBulk.mirror = true;
		setRotation(FrontBulk, 0F, 0F, 0F);
		Tyre = new ModelRenderer(this, 0, 87);
		Tyre.addBox(-1.5F, 0F, -5F, 3, 2, 9);
		Tyre.setRotationPoint(0F, 16F, -10F);
		Tyre.setTextureSize(128, 128);
		Tyre.mirror = true;
		setRotation(Tyre, 0F, 0F, 0F);
		Handle1 = new ModelRenderer(this, 0, 99);
		Handle1.addBox(-3F, -0.5F, -0.5F, 3, 1, 1);
		Handle1.setRotationPoint(-4F, 7F, -9F);
		Handle1.setTextureSize(128, 128);
		Handle1.mirror = true;
		setRotation(Handle1, 0F, 0F, 0F);
		Handle2 = new ModelRenderer(this, 0, 99);
		Handle2.addBox(0F, -0.5F, -0.5F, 3, 1, 1);
		Handle2.setRotationPoint(4F, 7F, -9F);
		Handle2.setTextureSize(128, 128);
		Handle2.mirror = true;
		setRotation(Handle2, 0F, 0F, 0F);
		Neck = new ModelRenderer(this, 0, 101);
		Neck.addBox(-1F, -3F, -1F, 2, 3, 2);
		Neck.setRotationPoint(0F, 7F, -15F);
		Neck.setTextureSize(128, 128);
		Neck.mirror = true;
		setRotation(Neck, 0.7853982F, 0F, 0F);
		Head = new ModelRenderer(this, 8, 101);
		Head.addBox(-3.5F, -5F, -3F, 7, 5, 4);
		Head.setRotationPoint(0F, 5.5F, -16.5F);
		Head.setTextureSize(128, 128);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		Ear1 = new ModelRenderer(this, 0, 106);
		Ear1.addBox(-0.5F, -2F, -0.5F, 1, 2, 1);
		Ear1.setRotationPoint(-3F, 0.5F, -17F);
		Ear1.setTextureSize(128, 128);
		Ear1.mirror = true;
		setRotation(Ear1, 0F, 0F, 0F);
		Ear2 = new ModelRenderer(this, 0, 106);
		Ear2.addBox(-0.5F, -2F, -0.5F, 1, 2, 1);
		Ear2.setRotationPoint(3F, 0.5F, -17F);
		Ear2.setTextureSize(128, 128);
		Ear2.mirror = true;
		setRotation(Ear2, 0F, 0F, 0F);
		Snout = new ModelRenderer(this, 0, 110);
		Snout.addBox(-1F, -1F, -3F, 2, 3, 3);
		Snout.setRotationPoint(0F, 4F, -19F);
		Snout.setTextureSize(128, 128);
		Snout.mirror = true;
		setRotation(Snout, 0F, 0F, 0F);
		FatHead = new ModelRenderer(this, 10, 110);
		FatHead.addBox(-4.5F, 0F, -2F, 9, 3, 4);
		FatHead.setRotationPoint(0F, 2.5F, -17F);
		FatHead.setTextureSize(128, 128);
		FatHead.mirror = true;
		setRotation(FatHead, 0F, 0F, 0F);
		TopTopBackRightLeg = new ModelRenderer(this, 67, 0);
		TopTopBackRightLeg.addBox(-2F, -2F, -2F, 2, 5, 4);
		TopTopBackRightLeg.setRotationPoint(-4F, 12.5F, 10F);
		TopTopBackRightLeg.setTextureSize(128, 128);
		TopTopBackRightLeg.mirror = true;
		setRotation(TopTopBackRightLeg, 0F, 0F, 0F);
		TopTopBackLeftLeg = new ModelRenderer(this, 67, 0);
		TopTopBackLeftLeg.addBox(0F, -2F, -2F, 2, 5, 4);
		TopTopBackLeftLeg.setRotationPoint(4F, 12.5F, 10F);
		TopTopBackLeftLeg.setTextureSize(128, 128);
		TopTopBackLeftLeg.mirror = true;
		setRotation(TopTopBackLeftLeg, 0F, 0F, 0F);
//		TopTopBackLeftLeg.mirror = false;
		BottomTopBackLeftLeg = new ModelRenderer(this, 84, 0);
		BottomTopBackLeftLeg.addBox(-0.5F, 2F, -1.5F, 1, 3, 3);
		BottomTopBackLeftLeg.setRotationPoint(5F, 13.5F, 10F);
		BottomTopBackLeftLeg.setTextureSize(128, 128);
		BottomTopBackLeftLeg.mirror = true;
		setRotation(BottomTopBackLeftLeg, 0F, 0F, 0F);
		BottomTopBackLeftLeg.mirror = false;
		BottomTopBackRightLeg = new ModelRenderer(this, 84, 0);
		BottomTopBackRightLeg.addBox(-0.5F, 3F, -1.5F, 1, 3, 3);
		BottomTopBackRightLeg.setRotationPoint(-5F, 12.5F, 10F);
		BottomTopBackRightLeg.setTextureSize(128, 128);
		BottomTopBackRightLeg.mirror = true;
		setRotation(BottomTopBackRightLeg, 0F, 0F, 0F);
		MiddleBackLeftLeg = new ModelRenderer(this, 71, 3);
		MiddleBackLeftLeg.addBox(-0.5F, 4F, -3.5F, 1, 4, 2);
		MiddleBackLeftLeg.setRotationPoint(5F, 13F, 10F);
		MiddleBackLeftLeg.setTextureSize(128, 128);
		MiddleBackLeftLeg.mirror = true;
		setRotation(MiddleBackLeftLeg, 0.4363323F, 0F, 0F);
		MiddleBackLeftLeg.mirror = false;
		MiddleBackRightLeg = new ModelRenderer(this, 71, 3);
		MiddleBackRightLeg.addBox(-0.5F, 5F, -3.5F, 1, 4, 2);
		MiddleBackRightLeg.setRotationPoint(-5F, 12F, 10F);
		MiddleBackRightLeg.setTextureSize(128, 128);
		MiddleBackRightLeg.mirror = true;
		setRotation(MiddleBackRightLeg, 0.4363323F, 0F, 0F);
		BottomBackLeftLeg = new ModelRenderer(this, 80, 6);
		BottomBackLeftLeg.addBox(-0.5F, 4F, 6.5F, 1, 4, 1);
		BottomBackLeftLeg.setRotationPoint(5F, 12F, 10F);
		BottomBackLeftLeg.setTextureSize(128, 128);
		BottomBackLeftLeg.mirror = true;
		setRotation(BottomBackLeftLeg, -1.047198F, 0F, 0F);
		BottomBackRightLeg = new ModelRenderer(this, 80, 6);
		BottomBackRightLeg.addBox(-0.5F, 4F, 6.5F, 1, 4, 1);
		BottomBackRightLeg.setRotationPoint(-5F, 12F, 11F);
		BottomBackRightLeg.setTextureSize(128, 128);
		BottomBackRightLeg.mirror = true;
		setRotation(BottomBackRightLeg, -1.047198F, 0F, 0F);
		FootFrontRightLeg = new ModelRenderer(this, 34, 82);
		FootFrontRightLeg.addBox(-1.5F, 7.5F, -1F, 3, 2, 2);
		FootFrontRightLeg.setRotationPoint(-6.5F, 13.5F, -11F);
		FootFrontRightLeg.setTextureSize(128, 128);
		FootFrontRightLeg.mirror = true;
		setRotation(FootFrontRightLeg, 0F, 0F, 0F);
		FootBackRightLeg = new ModelRenderer(this, 34, 82);
		FootBackRightLeg.addBox(-1.5F, 8.5F, -4F, 3, 2, 2);
		FootBackRightLeg.setRotationPoint(-5F, 13F, 10F);
		FootBackRightLeg.setTextureSize(128, 128);
		FootBackRightLeg.mirror = true;
		setRotation(FootBackRightLeg, 0F, 0F, 0F);
		TopFrontLeftLeg = new ModelRenderer(this, 44, 0);
		TopFrontLeftLeg.addBox(0F, -2.5F, -2.5F, 4, 5, 5);
		TopFrontLeftLeg.setRotationPoint(4F, 12F, -11F);
		TopFrontLeftLeg.setTextureSize(128, 128);
		TopFrontLeftLeg.mirror = true;
		setRotation(TopFrontLeftLeg, 0.6108652F, 0F, 0F);
		TopFrontLeftLeg.mirror = false;
		TopFrontRightLeg = new ModelRenderer(this, 44, 0);
		TopFrontRightLeg.addBox(-4F, -2.5F, -2.5F, 4, 5, 5);
		TopFrontRightLeg.setRotationPoint(-4F, 12F, -11F);
		TopFrontRightLeg.setTextureSize(128, 128);
		TopFrontRightLeg.mirror = true;
		setRotation(TopFrontRightLeg, 0.6108652F, 0F, 0F);
		BottomTopFrontRightLeg = new ModelRenderer(this, 28, 0);
		BottomTopFrontRightLeg.addBox(-1F, 0F, -1F, 2, 4, 2);
		BottomTopFrontRightLeg.setRotationPoint(-6.5F, 14F, -10F);
		BottomTopFrontRightLeg.setTextureSize(128, 128);
		BottomTopFrontRightLeg.mirror = true;
		setRotation(BottomTopFrontRightLeg, 0.6108652F, 0F, 0F);
		BottomTopFrontLeftLeg = new ModelRenderer(this, 28, 0);
		BottomTopFrontLeftLeg.addBox(-1F, 2F, -1F, 2, 4, 2);
		BottomTopFrontLeftLeg.setRotationPoint(6.5F, 12F, -11F);
		BottomTopFrontLeftLeg.setTextureSize(128, 128);
		BottomTopFrontLeftLeg.mirror = true;
		setRotation(BottomTopFrontLeftLeg, 0.6108652F, 0F, 0F);
		MiddleFrontLeftLeg = new ModelRenderer(this, 38, 78);
		MiddleFrontLeftLeg.addBox(-0.5F, 2F, 3.5F, 1, 5, 1);
		MiddleFrontLeftLeg.setRotationPoint(6.5F, 13F, -10.5F);
		MiddleFrontLeftLeg.setTextureSize(128, 128);
		MiddleFrontLeftLeg.mirror = true;
		setRotation(MiddleFrontLeftLeg, -0.5137878F, 0F, 0F);
		MiddleFrontRightLeg = new ModelRenderer(this, 38, 78);
		MiddleFrontRightLeg.addBox(-0.5F, 3F, 4.5F, 1, 5, 1);
		MiddleFrontRightLeg.setRotationPoint(-6.5F, 12F, -11F);
		MiddleFrontRightLeg.setTextureSize(128, 128);
		MiddleFrontRightLeg.mirror = true;
		setRotation(MiddleFrontRightLeg, -0.5137878F, 0F, 0F);
		FootBackLeftLeg = new ModelRenderer(this, 34, 82);
		FootBackLeftLeg.addBox(-1.5F, 8.5F, -4F, 3, 2, 2);
		FootBackLeftLeg.setRotationPoint(5F, 13F, 10F);
		FootBackLeftLeg.setTextureSize(128, 128);
		FootBackLeftLeg.mirror = true;
		setRotation(FootBackLeftLeg, 0F, 0F, 0F);
		FootFrontLeftLeg = new ModelRenderer(this, 34, 82);
		FootFrontLeftLeg.addBox(-1.5F, 8.5F, -1F, 3, 2, 2);
		FootFrontLeftLeg.setRotationPoint(6.5F, 12.5F, -11F);
		FootFrontLeftLeg.setTextureSize(128, 128);
		FootFrontLeftLeg.mirror = true;
		setRotation(FootFrontLeftLeg, 0F, 0F, 0F);
		FootholdL = new ModelRenderer(this, 28, 2);
		FootholdL.addBox(0F, -0.5F, -0.5F, 3, 1, 1);
		FootholdL.setRotationPoint(4F, 15F, -2F);
		FootholdL.setTextureSize(128, 128);
		FootholdL.mirror = true;
		setRotation(FootholdL, 0F, 0F, 0F);
		FootholdR = new ModelRenderer(this, 28, 2);
		FootholdR.addBox(-3F, -0.5F, -0.5F, 3, 1, 1);
		FootholdR.setRotationPoint(-4F, 15F, -2F);
		FootholdR.setTextureSize(128, 128);
		FootholdR.mirror = true;
		setRotation(FootholdR, 0F, 0F, 0F);
		BackLeftToe3 = new ModelRenderer(this, 43, 57);
		BackLeftToe3.addBox(0F, 10F, -6F, 0, 1, 2);
		BackLeftToe3.setRotationPoint(6F, 12.5F, 10.5F);
		BackLeftToe3.setTextureSize(128, 128);
		BackLeftToe3.mirror = true;
		setRotation(BackLeftToe3, 0F, 0F, 0F);
		BackLeftToe2 = new ModelRenderer(this, 43, 57);
		BackLeftToe2.addBox(0F, 10F, -6F, 0, 1, 2);
		BackLeftToe2.setRotationPoint(5F, 12.5F, 10.5F);
		BackLeftToe2.setTextureSize(128, 128);
		BackLeftToe2.mirror = true;
		setRotation(BackLeftToe2, 0F, 0F, 0F);
		BackLeftToe1 = new ModelRenderer(this, 43, 57);
		BackLeftToe1.addBox(0F, 10F, -6F, 0, 1, 2);
		BackLeftToe1.setRotationPoint(4F, 12.5F, 10.5F);
		BackLeftToe1.setTextureSize(128, 128);
		BackLeftToe1.mirror = true;
		setRotation(BackLeftToe1, 0F, 0F, 0F);
		FrontLeftToe1 = new ModelRenderer(this, 43, 57);
		FrontLeftToe1.addBox(0F, 10F, -2F, 0, 1, 2);
		FrontLeftToe1.setRotationPoint(5.5F, 12F, -11.5F);
		FrontLeftToe1.setTextureSize(128, 128);
		FrontLeftToe1.mirror = true;
		setRotation(FrontLeftToe1, 0F, 0F, 0F);
		FrontLeftToe2 = new ModelRenderer(this, 43, 57);
		FrontLeftToe2.addBox(0F, 10F, -2F, 0, 1, 2);
		FrontLeftToe2.setRotationPoint(6.5F, 12F, -11.5F);
		FrontLeftToe2.setTextureSize(128, 128);
		FrontLeftToe2.mirror = true;
		setRotation(FrontLeftToe2, 0F, 0F, 0F);
		FrontLeftToe3 = new ModelRenderer(this, 43, 57);
		FrontLeftToe3.addBox(0F, 10F, -2F, 0, 1, 2);
		FrontLeftToe3.setRotationPoint(7.5F, 12F, -11.5F);
		FrontLeftToe3.setTextureSize(128, 128);
		FrontLeftToe3.mirror = true;
		setRotation(FrontLeftToe3, 0F, 0F, 0F);
		BackRightToe3 = new ModelRenderer(this, 43, 57);
		BackRightToe3.addBox(0F, 10F, -6F, 0, 1, 2);
		BackRightToe3.setRotationPoint(-5F, 12.5F, 10.5F);
		BackRightToe3.setTextureSize(128, 128);
		BackRightToe3.mirror = true;
		setRotation(BackRightToe3, 0F, 0F, 0F);
		BackRightToe2 = new ModelRenderer(this, 43, 57);
		BackRightToe2.addBox(0F, 10F, -6F, 0, 1, 2);
		BackRightToe2.setRotationPoint(-4F, 12.5F, 10.5F);
		BackRightToe2.setTextureSize(128, 128);
		BackRightToe2.mirror = true;
		setRotation(BackRightToe2, 0F, 0F, 0F);
		BackRightToe1 = new ModelRenderer(this, 43, 57);
		BackRightToe1.addBox(0F, 10F, -6F, 0, 1, 2);
		BackRightToe1.setRotationPoint(-6F, 12.5F, 10.5F);
		BackRightToe1.setTextureSize(128, 128);
		BackRightToe1.mirror = true;
		setRotation(BackRightToe1, 0F, 0F, 0F);
		FrontRightToe3 = new ModelRenderer(this, 43, 57);
		FrontRightToe3.addBox(0F, 9F, -2F, 0, 1, 2);
		FrontRightToe3.setRotationPoint(-5.5F, 13F, -11.5F);
		FrontRightToe3.setTextureSize(128, 128);
		FrontRightToe3.mirror = true;
		setRotation(FrontRightToe3, 0F, 0F, 0F);
		FrontRightToe2 = new ModelRenderer(this, 43, 57);
		FrontRightToe2.addBox(0F, 9F, -2F, 0, 1, 2);
		FrontRightToe2.setRotationPoint(-6.5F, 13F, -11.5F);
		FrontRightToe2.setTextureSize(128, 128);
		FrontRightToe2.mirror = true;
		setRotation(FrontRightToe2, 0F, 0F, 0F);
		FrontRightToe1 = new ModelRenderer(this, 43, 57);
		FrontRightToe1.addBox(0F, 9F, -2F, 0, 1, 2);
		FrontRightToe1.setRotationPoint(-7.5F, 13F, -11.5F);
		FrontRightToe1.setTextureSize(128, 128);
		FrontRightToe1.mirror = true;
		setRotation(FrontRightToe1, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
		FusionCore.render(scale);
		FusionCore2.render(scale);
		FusionCore3.render(scale);
		BehindFusionCore.render(scale);
		Tail.render(scale);
		BackRestRest.render(scale);
		BackRest.render(scale);
		UnderFusionCore.render(scale);
		Seat.render(scale);
		FrontBulk.render(scale);
		Tyre.render(scale);
		Handle1.render(scale);
		Handle2.render(scale);
		Neck.render(scale);
		Head.render(scale);
		Ear1.render(scale);
		Ear2.render(scale);
		Snout.render(scale);
		FatHead.render(scale);
		TopTopBackRightLeg.render(scale);
		TopTopBackLeftLeg.render(scale);
		BottomTopBackLeftLeg.render(scale);
		BottomTopBackRightLeg.render(scale);
		MiddleBackLeftLeg.render(scale);
		MiddleBackRightLeg.render(scale);
		BottomBackLeftLeg.render(scale);
		BottomBackRightLeg.render(scale);
		FootFrontRightLeg.render(scale);
		FootBackRightLeg.render(scale);
		TopFrontLeftLeg.render(scale);
		TopFrontRightLeg.render(scale);
		BottomTopFrontRightLeg.render(scale);
		BottomTopFrontLeftLeg.render(scale);
		MiddleFrontLeftLeg.render(scale);
		MiddleFrontRightLeg.render(scale);
		FootBackLeftLeg.render(scale);
		FootFrontLeftLeg.render(scale);
		FootholdL.render(scale);
		FootholdR.render(scale);
		BackLeftToe3.render(scale);
		BackLeftToe2.render(scale);
		BackLeftToe1.render(scale);
		FrontLeftToe1.render(scale);
		FrontLeftToe2.render(scale);
		FrontLeftToe3.render(scale);
		BackRightToe3.render(scale);
		BackRightToe2.render(scale);
		BackRightToe1.render(scale);
		FrontRightToe3.render(scale);
		FrontRightToe2.render(scale);
		FrontRightToe1.render(scale);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		angles.put(model.toString(), x);
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float limbSwingTick, float limbSwingAmplitude, float ageInTicks, float newHeadYaw, float headPitch, float scale, Entity entity)
	{
		if (entity instanceof EntityMecha && ((EntityMecha)entity).isMechaFlying) {
			return;
		}
		
		float speed = (float) (entity.motionX * entity.motionX + entity.motionZ * entity.motionZ);
		float swingMult = 1f;
		limbSwingAmplitude = 4f * speed;

		//front right leg
		ModelRenderer[] frontRightModels = {
				FootFrontRightLeg, MiddleFrontRightLeg, FrontRightToe3, FrontRightToe2,
				FrontRightToe1, TopFrontRightLeg, BottomTopFrontRightLeg
		};
		float calcAngle = -MathHelper.sin(limbSwingTick * swingMult) * limbSwingAmplitude;
		for (ModelRenderer model : frontRightModels) {
			model.rotateAngleX = angles.get(model.toString()) + calcAngle;
		}

		//back right leg
		ModelRenderer[] backRightModels = {
				FootBackRightLeg, MiddleBackRightLeg, BackRightToe3, BackRightToe2,
				BackRightToe1, TopTopBackRightLeg, BottomTopBackRightLeg, BottomBackRightLeg
		};
		calcAngle = -MathHelper.cos(limbSwingTick * swingMult) * limbSwingAmplitude;
		for (ModelRenderer model : backRightModels) {
			model.rotateAngleX = angles.get(model.toString()) + calcAngle;
		}

		//front left leg
		ModelRenderer[] frontLeftModels = {
				FootFrontLeftLeg, MiddleFrontLeftLeg, FrontLeftToe3, FrontLeftToe2,
				FrontLeftToe1, TopFrontLeftLeg, BottomTopFrontLeftLeg
		};
		calcAngle = MathHelper.sin(limbSwingTick * swingMult) * limbSwingAmplitude;
		for (ModelRenderer model : frontLeftModels) {
			model.rotateAngleX = angles.get(model.toString()) + calcAngle;
		}

		//back left leg
		ModelRenderer[] backLeftModels = {
				BackLeftToe1, BackLeftToe2, BackLeftToe3, BottomBackLeftLeg,
				MiddleBackLeftLeg, TopTopBackLeftLeg, BottomTopBackLeftLeg, FootBackLeftLeg
		};
		calcAngle = MathHelper.cos(limbSwingTick * swingMult) * limbSwingAmplitude;
		for (ModelRenderer model : backLeftModels) {
			model.rotateAngleX = angles.get(model.toString()) + calcAngle;
		}
	}
}
