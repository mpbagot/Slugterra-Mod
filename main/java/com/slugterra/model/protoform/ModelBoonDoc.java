package com.slugterra.model.protoform;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBoonDoc extends ModelBase
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
    ModelRenderer Shape1;
    ModelRenderer Shape3;
    ModelRenderer Shape2;
  
  public ModelBoonDoc()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(-2F, 0F, -2F, 4, 6, 3);
      Body.setRotationPoint(0F, 18F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 18, 0);
      Head.addBox(-2.5F, -5F, -2.5F, 5, 5, 4);
      Head.setRotationPoint(0F, 18F, 0F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Tailmain = new ModelRenderer(this, 40, 6);
      Tailmain.addBox(-1.5F, 0F, 0F, 3, 1, 2);
      Tailmain.setRotationPoint(0F, 23F, 1F);
      Tailmain.setTextureSize(64, 32);
      Tailmain.mirror = true;
      setRotation(Tailmain, 0F, 0F, 0F);
      Tail_Sub = new ModelRenderer(this, 40, 0);
      Tail_Sub.addBox(-0.54F, 0F, 1F, 1, 1, 1);
      Tail_Sub.setRotationPoint(0F, 22F, 0F);
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
      Shape1 = new ModelRenderer(this, 15, 21);
      Shape1.addBox(-0.5F, -3F, -0.9533333F, 1, 3, 1);
      Shape1.setRotationPoint(1F, 14F, -0.48F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0.2792527F);
      Shape3 = new ModelRenderer(this, 15, 21);
      Shape3.addBox(-1F, -3F, 0F, 1, 3, 1);
      Shape3.setRotationPoint(-0.5F, 14F, -1.5F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, -0.2792527F);
      Shape2 = new ModelRenderer(this, 16, 11);
      Shape2.addBox(-3F, -2F, 0F, 6, 5, 4);
      Shape2.setRotationPoint(0F, 15F, -2F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
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
    Shape1.render(f5);
    Shape3.render(f5);
    Shape2.render(f5);
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
