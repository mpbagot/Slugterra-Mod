package com.slugterra.model.protoform;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFingerling extends ModelBase
{
  //fields
    ModelRenderer midtail;
    ModelRenderer sidetail;
    ModelRenderer body;
    ModelRenderer head;
    ModelRenderer arm;
  
  public ModelFingerling()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      midtail = new ModelRenderer(this, 18, 0);
      midtail.addBox(0F, 0F, 0F, 2, 1, 3);
      midtail.setRotationPoint(-1F, 23F, 1F);
      midtail.setTextureSize(64, 32);
      midtail.mirror = true;
      setRotation(midtail, 0F, 0F, 0F);
      sidetail = new ModelRenderer(this, 18, 4);
      sidetail.addBox(0F, 0F, 0F, 4, 1, 3);
      sidetail.setRotationPoint(-2F, 23F, 0F);
      sidetail.setTextureSize(64, 32);
      sidetail.mirror = true;
      setRotation(sidetail, 0F, 0F, 0F);
      body = new ModelRenderer(this, 32, 0);
      body.addBox(0F, 0F, 0F, 2, 5, 2);
      body.setRotationPoint(-1F, 19F, -1F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(0F, 0F, 0F, 5, 5, 4);
      head.setRotationPoint(-2.5F, 14F, -2F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      arm = new ModelRenderer(this, 0, 9);
      arm.addBox(0F, 0F, 0F, 4, 1, 1);
      arm.setRotationPoint(-2F, 21F, 0F);
      arm.setTextureSize(64, 32);
      arm.mirror = true;
      setRotation(arm, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    midtail.render(f5);
    sidetail.render(f5);
    body.render(f5);
    head.render(f5);
    arm.render(f5);
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
