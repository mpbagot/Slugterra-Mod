package com.slugterra.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSlickSilver extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape12;
    ModelRenderer Shape2;
    ModelRenderer Shape22;
    ModelRenderer Shape3;
    ModelRenderer Shape32;
    ModelRenderer Shape23;
  
  public ModelSlickSilver()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(-2.5F, 0F, -2F, 5, 2, 4);
      Shape1.setRotationPoint(0F, 22F, 0F);
      Shape1.setTextureSize(64, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape12 = new ModelRenderer(this, 0, 8);
      Shape12.addBox(-2.5F, -3F, -2F, 5, 4, 4);
      Shape12.setRotationPoint(0F, 21F, 0F);
      Shape12.setTextureSize(64, 64);
      Shape12.mirror = true;
      setRotation(Shape12, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 19, 0);
      Shape2.addBox(0F, -0.5F, -0.5F, 1, 1, 1);
      Shape2.setRotationPoint(2F, 23F, 0F);
      Shape2.setTextureSize(64, 64);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape22 = new ModelRenderer(this, 19, 0);
      Shape22.addBox(-1F, -0.5F, -0.5F, 1, 1, 1);
      Shape22.setRotationPoint(-2F, 23F, 0F);
      Shape22.setTextureSize(64, 64);
      Shape22.mirror = true;
      setRotation(Shape22, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 27, 0);
      Shape3.addBox(-0.5F, 0F, -2F, 1, 1, 2);
      Shape3.setRotationPoint(-2F, 23F, -1F);
      Shape3.setTextureSize(64, 64);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape32 = new ModelRenderer(this, 27, 0);
      Shape32.addBox(-0.5F, 0F, -2F, 1, 1, 2);
      Shape32.setRotationPoint(2F, 23F, -1F);
      Shape32.setTextureSize(64, 64);
      Shape32.mirror = true;
      setRotation(Shape32, 0F, 0F, 0F);
      Shape23 = new ModelRenderer(this, 19, 0);
      Shape23.addBox(-0.5F, -0.5F, 0F, 1, 1, 1);
      Shape23.setRotationPoint(0F, 23F, 1.5F);
      Shape23.setTextureSize(64, 64);
      Shape23.mirror = true;
      setRotation(Shape23, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape12.render(f5);
    Shape2.render(f5);
    Shape22.render(f5);
    Shape3.render(f5);
    Shape32.render(f5);
    Shape23.render(f5);
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
