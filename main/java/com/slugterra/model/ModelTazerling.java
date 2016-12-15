package com.slugterra.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTazerling extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Head;
    ModelRenderer Tailmain;
    ModelRenderer Tail_Sub;
    ModelRenderer Right_Leg;
    ModelRenderer Left_Leg;
    ModelRenderer Right_Arm;
    ModelRenderer Left_Arm;
    ModelRenderer Antena_1_Long;
    ModelRenderer Antena_2_Long;
    ModelRenderer Antena_1_Short;
    ModelRenderer Antena_2_Short;
  
  public ModelTazerling()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(-2F, 0F, -2F, 4, 6, 4);
      Body.setRotationPoint(0F, 18F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 18, 0);
      Head.addBox(-2.5F, -5F, -2.5F, 5, 5, 5);
      Head.setRotationPoint(0F, 18F, 0F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Tailmain = new ModelRenderer(this, 40, 6);
      Tailmain.addBox(-1.5F, 0F, 0F, 3, 1, 2);
      Tailmain.setRotationPoint(0F, 23F, 2F);
      Tailmain.setTextureSize(64, 32);
      Tailmain.mirror = true;
      setRotation(Tailmain, 0F, 0F, 0F);
      Tail_Sub = new ModelRenderer(this, 40, 0);
      Tail_Sub.addBox(-0.54F, 0F, 1F, 1, 1, 1);
      Tail_Sub.setRotationPoint(0F, 22F, 1F);
      Tail_Sub.setTextureSize(64, 32);
      Tail_Sub.mirror = true;
      setRotation(Tail_Sub, 0F, 0F, 0F);
      Right_Leg = new ModelRenderer(this, 1, 11);
      Right_Leg.addBox(0F, 0F, -2F, 1, 1, 2);
      Right_Leg.setRotationPoint(1F, 23.02667F, -1F);
      Right_Leg.setTextureSize(64, 32);
      Right_Leg.mirror = true;
      setRotation(Right_Leg, 0F, 0F, 0F);
      Left_Leg = new ModelRenderer(this, 8, 11);
      Left_Leg.addBox(-1F, 0F, -2F, 1, 1, 2);
      Left_Leg.setRotationPoint(-1F, 23F, -1F);
      Left_Leg.setTextureSize(64, 32);
      Left_Leg.mirror = true;
      setRotation(Left_Leg, 0F, 0F, 0F);
      Right_Arm = new ModelRenderer(this, 2, 15);
      Right_Arm.addBox(-0.5F, -0.5F, 0F, 1, 1, 1);
      Right_Arm.setRotationPoint(2F, 19F, -1F);
      Right_Arm.setTextureSize(64, 32);
      Right_Arm.mirror = true;
      setRotation(Right_Arm, 0F, 1.570796F, 0F);
      Left_Arm = new ModelRenderer(this, 7, 15);
      Left_Arm.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
      Left_Arm.setRotationPoint(-2F, 19F, 0F);
      Left_Arm.setTextureSize(64, 32);
      Left_Arm.mirror = true;
      setRotation(Left_Arm, 0F, 1.570796F, 0F);
      Antena_1_Long = new ModelRenderer(this, 47, 0);
      Antena_1_Long.addBox(-0.5F, -2F, -0.5F, 1, 1, 1);
      Antena_1_Long.setRotationPoint(1F, 14F, -1.5F);
      Antena_1_Long.setTextureSize(64, 32);
      Antena_1_Long.mirror = true;
      setRotation(Antena_1_Long, 0F, 0F, 0F);
      Antena_2_Long = new ModelRenderer(this, 53, 0);
      Antena_2_Long.addBox(-0.5F, -2F, -0.5F, 1, 1, 1);
      Antena_2_Long.setRotationPoint(-1F, 14F, -1.5F);
      Antena_2_Long.setTextureSize(64, 32);
      Antena_2_Long.mirror = true;
      setRotation(Antena_2_Long, 0F, 0F, 0F);
      Antena_1_Short = new ModelRenderer(this, 1, 18);
      Antena_1_Short.addBox(0F, -1F, -0.5F, 1, 2, 1);
      Antena_1_Short.setRotationPoint(1F, 11.8F, -1F);
      Antena_1_Short.setTextureSize(64, 32);
      Antena_1_Short.mirror = true;
      setRotation(Antena_1_Short, 0F, 0F, 0F);
      Antena_2_Short = new ModelRenderer(this, 6, 18);
      Antena_2_Short.addBox(-1F, -1F, -0.5F, 1, 2, 1);
      Antena_2_Short.setRotationPoint(-1F, 11.8F, -1F);
      Antena_2_Short.setTextureSize(64, 32);
      Antena_2_Short.mirror = true;
      setRotation(Antena_2_Short, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    Head.render(f5);
    Tailmain.render(f5);
    Tail_Sub.render(f5);
    Right_Leg.render(f5);
    Left_Leg.render(f5);
    Right_Arm.render(f5);
    Left_Arm.render(f5);
    Antena_1_Long.render(f5);
    Antena_2_Long.render(f5);
    Antena_1_Short.render(f5);
    Antena_2_Short.render(f5);
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
