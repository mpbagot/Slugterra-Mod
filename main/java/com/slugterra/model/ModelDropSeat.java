package com.slugterra.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDropSeat extends ModelBase
{
  //fields
    ModelRenderer BaseSeat;
    ModelRenderer handle1;
    ModelRenderer handle2;
  
  public ModelDropSeat()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      BaseSeat = new ModelRenderer(this, 0, 0);
      BaseSeat.addBox(-8F, -4F, -8F, 16, 8, 16);
      BaseSeat.setRotationPoint(0F, 3F, 0F);
      BaseSeat.setTextureSize(64, 64);
      BaseSeat.mirror = true;
      setRotation(BaseSeat, 0F, 0F, 0F);
      handle1 = new ModelRenderer(this, 0, 24);
      handle1.addBox(-1F, -3F, -7F, 3, 6, 14);
      handle1.setRotationPoint(9F, -2F, 0F);
      handle1.setTextureSize(64, 64);
      handle1.mirror = true;
      setRotation(handle1, 0F, 0F, 0F);
      handle2 = new ModelRenderer(this, 0, 24);
      handle2.addBox(-1F, -3F, -7F, 3, 6, 14);
      handle2.setRotationPoint(-10F, -2F, 0F);
      handle2.setTextureSize(64, 64);
      handle2.mirror = true;
      setRotation(handle2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    BaseSeat.render(f5);
    handle1.render(f5);
    handle2.render(f5);
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
