package com.slugterra.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSlugContainer extends ModelBase
{
  //fields
    ModelRenderer MiddleBit;
    ModelRenderer TopBit;
    ModelRenderer BottomBit;
    ModelRenderer MiddleShaft;
  
  public ModelSlugContainer()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      MiddleBit = new ModelRenderer(this, 0, 14);
      MiddleBit.addBox(-8F, -1F, -8F, 16, 2, 16);
      MiddleBit.setRotationPoint(0F, 0F, 0F);
      MiddleBit.setTextureSize(64, 32);
      MiddleBit.mirror = true;
      setRotation(MiddleBit, 0F, 0F, 0F);
      TopBit = new ModelRenderer(this, 0, 14);
      TopBit.addBox(-8F, -8F, -8F, 16, 2, 16);
      TopBit.setRotationPoint(0F, 0F, 0F);
      TopBit.setTextureSize(64, 32);
      TopBit.mirror = true;
      setRotation(TopBit, 0F, 0F, 0F);
      BottomBit = new ModelRenderer(this, 0, 14);
      BottomBit.addBox(-8F, -1F, -8F, 16, 2, 16);
      BottomBit.setRotationPoint(0F, 7F, 0F);
      BottomBit.setTextureSize(64, 32);
      BottomBit.mirror = true;
      setRotation(BottomBit, 0F, 0F, 0F);
      MiddleShaft = new ModelRenderer(this, 0, 0);
      MiddleShaft.addBox(-2.5F, -8F, -2.5F, 5, 16, 5);
      MiddleShaft.setRotationPoint(0F, 0F, 0F);
      MiddleShaft.setTextureSize(64, 32);
      MiddleShaft.mirror = true;
      setRotation(MiddleShaft, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    MiddleBit.render(f5);
    TopBit.render(f5);
    BottomBit.render(f5);
    MiddleShaft.render(f5);
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
