package com.slugterra.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRope extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
  
  public ModelRope()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(-2F, 0F, -2F, 4, 16, 4);
      Shape1.setRotationPoint(0F, 0F, 0F);
      Shape1.setTextureSize(32, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 4, 0);
      Shape3.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape3.setRotationPoint(-3F, 4F, 0F);
      Shape3.setTextureSize(32, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 4, 0);
      Shape4.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape4.setRotationPoint(1F, 11F, -3F);
      Shape4.setTextureSize(32, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 4, 0);
      Shape5.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape5.setRotationPoint(1F, 1F, 1F);
      Shape5.setTextureSize(32, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 4, 0);
      Shape6.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape6.setRotationPoint(-1F, 12F, 1F);
      Shape6.setTextureSize(32, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
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
