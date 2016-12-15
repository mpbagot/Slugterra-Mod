package com.slugterra.model.velocity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPhosphoroVel extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer mouth;
    ModelRenderer face;
    ModelRenderer antennabot;
    ModelRenderer antennamid;
    ModelRenderer antennatop;
    ModelRenderer bottailr;
    ModelRenderer toptailr;
    ModelRenderer bottaill;
    ModelRenderer toptaill;
    
    //protoform
    ModelRenderer Head;
    ModelRenderer Body2;
    ModelRenderer Right_arm;
    ModelRenderer Left_arm;
    ModelRenderer Right_leg;
    ModelRenderer Left_leg;
    ModelRenderer Right_antenna;
    ModelRenderer Left_antenna;
    ModelRenderer Tail_1;
    ModelRenderer Tail2;
    ModelRenderer Shape1;
  
  public ModelPhosphoroVel()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, 38, 0);
      Body.addBox(0F, 0F, 0F, 3, 4, 5);
      Body.setRotationPoint(0F, -1F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      mouth = new ModelRenderer(this, 0, 15);
      mouth.addBox(0F, 0F, 0F, 3, 2, 4);
      mouth.setRotationPoint(0F, 1F, -3F);
      mouth.setTextureSize(64, 32);
      mouth.mirror = true;
      setRotation(mouth, 0.1487144F, 0F, 0F);
      face = new ModelRenderer(this, 23, 0);
      face.addBox(0F, 0F, 0F, 2, 2, 2);
      face.setRotationPoint(0.5F, -0.6F, -2F);
      face.setTextureSize(64, 32);
      face.mirror = true;
      setRotation(face, 0F, 0F, 0F);
      antennabot = new ModelRenderer(this, 30, 19);
      antennabot.addBox(0F, 0F, 0F, 1, 2, 1);
      antennabot.setRotationPoint(1F, -2F, -2F);
      antennabot.setTextureSize(64, 32);
      antennabot.mirror = true;
      setRotation(antennabot, 0.3717861F, 0F, 0F);
      antennamid = new ModelRenderer(this, 11, 0);
      antennamid.addBox(0F, 0F, 0F, 1, 1, 2);
      antennamid.setRotationPoint(1F, -3F, -3F);
      antennamid.setTextureSize(64, 32);
      antennamid.mirror = true;
      setRotation(antennamid, -0.3346075F, 0F, 0F);
      antennatop = new ModelRenderer(this, 10, 25);
      antennatop.addBox(0F, 0F, 0F, 1, 2, 1);
      antennatop.setRotationPoint(1F, -3F, -4F);
      antennatop.setTextureSize(64, 32);
      antennatop.mirror = true;
      setRotation(antennatop, 0F, 0F, 0F);
      bottailr = new ModelRenderer(this, 35, 25);
      bottailr.addBox(0F, 0F, 0F, 1, 1, 4);
      bottailr.setRotationPoint(0F, 2F, 5F);
      bottailr.setTextureSize(64, 32);
      bottailr.mirror = true;
      setRotation(bottailr, 0F, 0F, 0F);
      toptailr = new ModelRenderer(this, 19, 9);
      toptailr.addBox(0F, 0F, 0F, 1, 1, 4);
      toptailr.setRotationPoint(0F, -1F, 5F);
      toptailr.setTextureSize(64, 32);
      toptailr.mirror = true;
      setRotation(toptailr, 0F, 0F, 0F);
      bottaill = new ModelRenderer(this, 20, 26);
      bottaill.addBox(0F, 0F, 0F, 1, 1, 4);
      bottaill.setRotationPoint(2F, 2F, 5F);
      bottaill.setTextureSize(64, 32);
      bottaill.mirror = true;
      setRotation(bottaill, 0F, 0F, 0F);
      toptaill = new ModelRenderer(this, 52, 12);
      toptaill.addBox(0F, 0F, 0F, 1, 1, 4);
      toptaill.setRotationPoint(2F, -1F, 5F);
      toptaill.setTextureSize(64, 32);
      toptaill.mirror = true;
      setRotation(toptaill, 0F, 0F, 0F);
      
      //protoform parts
      Head = new ModelRenderer(this, 16, 0);
      Head.addBox(-2.5F, -5F, -2.5F, 5, 5, 5);
      Head.setRotationPoint(0F, 18F, 0F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Body2 = new ModelRenderer(this, 0, 0);
      Body2.addBox(-2F, 0F, -2F, 4, 6, 4);
      Body2.setRotationPoint(0F, 18F, 0F);
      Body2.setTextureSize(64, 32);
      Body2.mirror = true;
      setRotation(Body2, 0F, 0F, 0F);
      Right_arm = new ModelRenderer(this, 0, 10);
      Right_arm.addBox(-0.5F, -0.5F, 0F, 1, 1, 1);
      Right_arm.setRotationPoint(2F, 20F, -1F);
      Right_arm.setTextureSize(64, 32);
      Right_arm.mirror = true;
      setRotation(Right_arm, 0F, 1.570796F, 0F);
      Left_arm = new ModelRenderer(this, 0, 10);
      Left_arm.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
      Left_arm.setRotationPoint(-2F, 20F, -1F);
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
      Tail_1 = new ModelRenderer(this, 36, 4);
      Tail_1.addBox(-3F, 0F, -2F, 3, 1, 4);
      Tail_1.setRotationPoint(0F, 23F, 2F);
      Tail_1.setTextureSize(64, 32);
      Tail_1.mirror = true;
      setRotation(Tail_1, 0F, 1.570796F, 0F);
      Tail2 = new ModelRenderer(this, 40, 0);
      Tail2.addBox(0F, 0F, -1.466667F, 2, 1, 3);
      Tail2.setRotationPoint(0F, 22F, 2F);
      Tail2.setTextureSize(64, 32);
      Tail2.mirror = true;
      setRotation(Tail2, 0F, 4.712389F, 0.0174533F);
      Shape1 = new ModelRenderer(this, 14, 10);
      Shape1.addBox(0F, 0F, 0F, 6, 3, 5);
      Shape1.setRotationPoint(-3F, 14F, -2F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
  
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5, boolean isProtoform)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    if (isProtoform){
    	Head.render(f5);
        Body2.render(f5);
        Right_arm.render(f5);
        Left_arm.render(f5);
        Right_leg.render(f5);
        Left_leg.render(f5);
        Right_antenna.render(f5);
        Left_antenna.render(f5);
        Tail_1.render(f5);
        Tail2.render(f5);
        Shape1.render(f5);
    }
    else{
    	Body.render(f5);
    	mouth.render(f5);
    	face.render(f5);
    	antennabot.render(f5);
    	antennamid.render(f5);
    	antennatop.render(f5);
    	bottailr.render(f5);
    	toptailr.render(f5);
    	bottaill.render(f5);
    	toptaill.render(f5);
    }
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
