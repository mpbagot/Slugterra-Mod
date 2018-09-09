package com.slugterra.model.protoform;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelArmashelt extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Foot1;
    ModelRenderer Foot2;
    ModelRenderer Tail1;
    ModelRenderer Arm1;
    ModelRenderer Arm2;
    ModelRenderer Chest1;
    ModelRenderer Shell1;
    ModelRenderer Shell2;
    ModelRenderer Shell3;
    ModelRenderer Head;
    ModelRenderer Shell4;
    ModelRenderer Feeler1;
    ModelRenderer Feeler2;
  
  public ModelArmashelt()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 4, 6, 4);
      Body.setRotationPoint(-1F, 18F, -3F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Foot1 = new ModelRenderer(this, 17, 0);
      Foot1.addBox(0F, 0F, 0F, 1, 1, 1);
      Foot1.setRotationPoint(2F, 23F, -4F);
      Foot1.setTextureSize(64, 32);
      Foot1.mirror = true;
      setRotation(Foot1, 0F, 0F, 0F);
      Foot2 = new ModelRenderer(this, 22, 0);
      Foot2.addBox(0F, 0F, 0F, 1, 1, 1);
      Foot2.setRotationPoint(-1F, 23F, -4F);
      Foot2.setTextureSize(64, 32);
      Foot2.mirror = true;
      setRotation(Foot2, 0F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 19, 3);
      Tail1.addBox(0F, 0F, 0F, 2, 1, 1);
      Tail1.setRotationPoint(0F, 23F, 1F);
      Tail1.setTextureSize(64, 32);
      Tail1.mirror = true;
      setRotation(Tail1, 0F, 0F, 0F);
      Arm1 = new ModelRenderer(this, 27, 0);
      Arm1.addBox(-1F, 0F, 0F, 1, 2, 1);
      Arm1.setRotationPoint(-1F, 19F, -3F);
      Arm1.setTextureSize(64, 32);
      Arm1.mirror = true;
      setRotation(Arm1, 0F, 0F, 0F);
      Arm2 = new ModelRenderer(this, 32, 0);
      Arm2.addBox(0F, 0F, 0F, 1, 2, 1);
      Arm2.setRotationPoint(3F, 19F, -3F);
      Arm2.setTextureSize(64, 32);
      Arm2.mirror = true;
      setRotation(Arm2, 0F, 0F, 0F);
      Chest1 = new ModelRenderer(this, 37, 0);
      Chest1.addBox(0F, 0F, 0F, 2, 3, 1);
      Chest1.setRotationPoint(0F, 19F, -4F);
      Chest1.setTextureSize(64, 32);
      Chest1.mirror = true;
      setRotation(Chest1, 0F, 0F, 0F);
      Shell1 = new ModelRenderer(this, 0, 21);
      Shell1.addBox(0F, 0F, 0F, 6, 1, 2);
      Shell1.setRotationPoint(-2F, 14F, -5F);
      Shell1.setTextureSize(64, 32);
      Shell1.mirror = true;
      setRotation(Shell1, 0F, 0F, 0F);
      Shell2 = new ModelRenderer(this, 0, 24);
      Shell2.addBox(0F, 0F, 0F, 6, 4, 1);
      Shell2.setRotationPoint(-2F, 14F, 1F);
      Shell2.setTextureSize(64, 32);
      Shell2.mirror = true;
      setRotation(Shell2, 0F, 0F, 0F);
      Shell3 = new ModelRenderer(this, 0, 14);
      Shell3.addBox(0F, 0F, 0F, 6, 2, 4);
      Shell3.setRotationPoint(-2F, 13F, -3F);
      Shell3.setTextureSize(64, 32);
      Shell3.mirror = true;
      setRotation(Shell3, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 23, 8);
      Head.addBox(0F, 0F, 0F, 6, 3, 5);
      Head.setRotationPoint(-2F, 15F, -4F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Shell4 = new ModelRenderer(this, 16, 24);
      Shell4.addBox(0F, 0F, 0F, 4, 4, 1);
      Shell4.setRotationPoint(-1F, 18F, 1F);
      Shell4.setTextureSize(64, 32);
      Shell4.mirror = true;
      setRotation(Shell4, 0F, 0F, 0F);
      Feeler1 = new ModelRenderer(this, 27, 4);
      Feeler1.addBox(0F, 0F, 0F, 1, 2, 1);
      Feeler1.setRotationPoint(-1F, 11F, -1F);
      Feeler1.setTextureSize(64, 32);
      Feeler1.mirror = true;
      setRotation(Feeler1, 0F, 0F, 0F);
      Feeler2 = new ModelRenderer(this, 32, 4);
      Feeler2.addBox(0F, 0F, 0F, 1, 2, 1);
      Feeler2.setRotationPoint(2F, 11F, -1F);
      Feeler2.setTextureSize(64, 32);
      Feeler2.mirror = true;
      setRotation(Feeler2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    Foot1.render(f5);
    Foot2.render(f5);
    Tail1.render(f5);
    Arm1.render(f5);
    Arm2.render(f5);
    Chest1.render(f5);
    Shell1.render(f5);
    Shell2.render(f5);
    Shell3.render(f5);
    Head.render(f5);
    Shell4.render(f5);
    Feeler1.render(f5);
    Feeler2.render(f5);
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
