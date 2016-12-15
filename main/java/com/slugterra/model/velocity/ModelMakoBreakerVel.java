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
    
    //protoform
    ModelRenderer Head2;
    ModelRenderer Body2;
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
      
      //protoform
      Head2 = new ModelRenderer(this, 16, 0);
      Head2.addBox(-2.5F, -5F, -2.5F, 5, 5, 5);
      Head2.setRotationPoint(0F, 18F, 0F);
      Head2.setTextureSize(64, 32);
      Head2.mirror = true;
      setRotation(Head2, 0F, 0F, 0F);
      Body2 = new ModelRenderer(this, 0, 0);
      Body2.addBox(-2F, 0F, -2F, 4, 6, 4);
      Body2.setRotationPoint(0F, 18F, 0F);
      Body2.setTextureSize(64, 32);
      Body2.mirror = true;
      setRotation(Body2, 0F, 0F, 0F);
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
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5, boolean isProtoform)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    if (isProtoform){
    	Head2.render(f5);
        Body2.render(f5);
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
    else{
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
