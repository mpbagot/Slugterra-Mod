package com.slugterra.model.protoform;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMakoBreaker extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer Right_arm;
    ModelRenderer Left_arm;
    ModelRenderer Right_leg;
    ModelRenderer Left_leg;
    ModelRenderer Right_antenna;
    ModelRenderer Left_antenna;
    ModelRenderer Tail_1;
    ModelRenderer Tail2;
    ModelRenderer toptopfin;
    ModelRenderer bottomtopfin;
  
  public ModelMakoBreaker()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Head = new ModelRenderer(this, 16, 0);
      Head.addBox(-2.5F, -5F, -2.5F, 5, 5, 5);
      Head.setRotationPoint(0F, 18F, 0F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(-2F, 0F, -2F, 4, 6, 4);
      Body.setRotationPoint(0F, 18F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Right_arm = new ModelRenderer(this, 0, 10);
      Right_arm.addBox(-0.5F, -0.5F, 0F, 1, 1, 1);
      Right_arm.setRotationPoint(2F, 19F, -1F);
      Right_arm.setTextureSize(64, 32);
      Right_arm.mirror = true;
      setRotation(Right_arm, 0F, 1.570796F, 0F);
      Left_arm = new ModelRenderer(this, 0, 10);
      Left_arm.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
      Left_arm.setRotationPoint(-2F, 19F, -1F);
      Left_arm.setTextureSize(64, 32);
      Left_arm.mirror = true;
      setRotation(Left_arm, 0F, 1.570796F, 0F);
      Right_leg = new ModelRenderer(this, 6, 10);
      Right_leg.addBox(0F, 0F, 0F, 2, 1, 1);
      Right_leg.setRotationPoint(1F, 23F, -1F);
      Right_leg.setTextureSize(64, 32);
      Right_leg.mirror = true;
      setRotation(Right_leg, 0F, 1.570796F, 0F);
      Left_leg = new ModelRenderer(this, 6, 10);
      Left_leg.addBox(0F, 0F, -2F, 2, 1, 1);
      Left_leg.setRotationPoint(0F, 23F, -1F);
      Left_leg.setTextureSize(64, 32);
      Left_leg.mirror = true;
      setRotation(Left_leg, 0F, 1.570796F, 0F);
      Right_antenna = new ModelRenderer(this, 36, 0);
      Right_antenna.addBox(-0.5F, -2F, -0.5F, 1, 2, 1);
      Right_antenna.setRotationPoint(-1.5F, 13F, -1F);
      Right_antenna.setTextureSize(64, 32);
      Right_antenna.mirror = true;
      setRotation(Right_antenna, 0F, 0F, 0F);
      Left_antenna = new ModelRenderer(this, 36, 0);
      Left_antenna.addBox(-0.5F, -2F, -0.5F, 1, 2, 1);
      Left_antenna.setRotationPoint(1.5F, 13F, -1F);
      Left_antenna.setTextureSize(64, 32);
      Left_antenna.mirror = true;
      setRotation(Left_antenna, 0F, 0F, 0F);
      Tail_1 = new ModelRenderer(this, 0, 13);
      Tail_1.addBox(-3F, 0F, -2F, 3, 1, 1);
      Tail_1.setRotationPoint(1.5F, 23F, 2F);
      Tail_1.setTextureSize(64, 32);
      Tail_1.mirror = true;
      setRotation(Tail_1, 0F, 1.570796F, 0F);
      Tail2 = new ModelRenderer(this, 40, 0);
      Tail2.addBox(0F, 0F, -1.466667F, 2, 2, 1);
      Tail2.setRotationPoint(-1F, 21F, 2F);
      Tail2.setTextureSize(64, 32);
      Tail2.mirror = true;
      setRotation(Tail2, 0F, 4.712389F, 0.0174533F);
      toptopfin = new ModelRenderer(this, 55, 0);
      toptopfin.addBox(0F, 0F, -0.5F, 2, 2, 1);
      toptopfin.setRotationPoint(0F, 14F, 2F);
      toptopfin.setTextureSize(64, 32);
      toptopfin.mirror = true;
      setRotation(toptopfin, 0F, 4.712389F, 0.0174533F);
      bottomtopfin = new ModelRenderer(this, 47, 0);
      bottomtopfin.addBox(0F, 0F, -0.5F, 3, 1, 1);
      bottomtopfin.setRotationPoint(0F, 16F, 2F);
      bottomtopfin.setTextureSize(64, 32);
      bottomtopfin.mirror = true;
      setRotation(bottomtopfin, 0F, 4.712389F, 0.0174533F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Head.render(f5);
    Body.render(f5);
    Right_arm.render(f5);
    Left_arm.render(f5);
    Right_leg.render(f5);
    Left_leg.render(f5);
    Right_antenna.render(f5);
    Left_antenna.render(f5);
    Tail_1.render(f5);
    Tail2.render(f5);
    toptopfin.render(f5);
    bottomtopfin.render(f5);
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
