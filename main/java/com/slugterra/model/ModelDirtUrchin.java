package com.slugterra.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDirtUrchin extends ModelBase
{
  //fields
    ModelRenderer MainBody;
    ModelRenderer ExtraBody;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Tail4;
    ModelRenderer Face;
    ModelRenderer TopHead;
    ModelRenderer EyeBrows;
    ModelRenderer horn1;
    ModelRenderer Horn2;
    ModelRenderer Horn3;
    ModelRenderer BackHorn1;
    ModelRenderer BackHorn2;
    ModelRenderer BackHorn3;
    ModelRenderer arms;
  
  public ModelDirtUrchin()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      MainBody = new ModelRenderer(this, 44, 0);
      MainBody.addBox(0F, 0F, 0F, 4, 8, 6);
      MainBody.setRotationPoint(-2F, 16F, -4F);
      MainBody.setTextureSize(64, 32);
      MainBody.mirror = true;
      setRotation(MainBody, 0F, 0F, 0F);
      ExtraBody = new ModelRenderer(this, 0, 0);
      ExtraBody.addBox(0F, 0F, 0F, 6, 13, 4);
      ExtraBody.setRotationPoint(-3F, 11F, -3F);
      ExtraBody.setTextureSize(64, 32);
      ExtraBody.mirror = true;
      setRotation(ExtraBody, 0F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 0, 17);
      Tail1.addBox(0F, 0F, 0F, 6, 1, 3);
      Tail1.setRotationPoint(-3F, 23F, 1F);
      Tail1.setTextureSize(64, 32);
      Tail1.mirror = true;
      setRotation(Tail1, 0F, 0F, 0F);
      Tail2 = new ModelRenderer(this, 32, 6);
      Tail2.addBox(0F, 0F, 0F, 2, 1, 4);
      Tail2.setRotationPoint(-1F, 23F, 3F);
      Tail2.setTextureSize(64, 32);
      Tail2.mirror = true;
      setRotation(Tail2, 0F, 0F, 0F);
      Tail3 = new ModelRenderer(this, 34, 4);
      Tail3.addBox(0F, 0F, 0F, 4, 1, 1);
      Tail3.setRotationPoint(-2F, 23F, 4F);
      Tail3.setTextureSize(64, 32);
      Tail3.mirror = true;
      setRotation(Tail3, 0F, 0F, 0F);
      Tail4 = new ModelRenderer(this, 32, 0);
      Tail4.addBox(0F, 0F, 0F, 4, 2, 2);
      Tail4.setRotationPoint(-2F, 21.5F, 1.5F);
      Tail4.setTextureSize(64, 32);
      Tail4.mirror = true;
      setRotation(Tail4, 0F, 0F, 0F);
      Face = new ModelRenderer(this, 48, 22);
      Face.addBox(0F, 0F, 0F, 4, 6, 4);
      Face.setRotationPoint(-2F, 13F, -4F);
      Face.setTextureSize(64, 32);
      Face.mirror = true;
      setRotation(Face, 0F, 0F, 0F);
      TopHead = new ModelRenderer(this, 52, 18);
      TopHead.addBox(0F, 0F, 0F, 4, 1, 2);
      TopHead.setRotationPoint(-2F, 10F, -2F);
      TopHead.setTextureSize(64, 32);
      TopHead.mirror = true;
      setRotation(TopHead, 0F, 0F, 0F);
      EyeBrows = new ModelRenderer(this, 50, 16);
      EyeBrows.addBox(0F, 0F, 0F, 6, 1, 1);
      EyeBrows.setRotationPoint(-3F, 12F, -4F);
      EyeBrows.setTextureSize(64, 32);
      EyeBrows.mirror = true;
      setRotation(EyeBrows, 0F, 0F, 0F);
      horn1 = new ModelRenderer(this, 0, 0);
      horn1.addBox(0F, 0F, 0F, 1, 3, 1);
      horn1.setRotationPoint(-0.5F, 12F, -3F);
      horn1.setTextureSize(64, 32);
      horn1.mirror = true;
      setRotation(horn1, 3.036873F, 0F, 0F);
      Horn2 = new ModelRenderer(this, 0, 0);
      Horn2.addBox(0F, 0F, 0F, 1, 4, 1);
      Horn2.setRotationPoint(-0.5F, 11F, -1.5F);
      Horn2.setTextureSize(64, 32);
      Horn2.mirror = true;
      setRotation(Horn2, 3.001966F, 0F, 0F);
      Horn3 = new ModelRenderer(this, 0, 0);
      Horn3.addBox(0F, 0F, 0F, 1, 3, 1);
      Horn3.setRotationPoint(-0.5F, 10.5F, 0F);
      Horn3.setTextureSize(64, 32);
      Horn3.mirror = true;
      setRotation(Horn3, 2.96706F, 0F, 0F);
      BackHorn1 = new ModelRenderer(this, 0, 0);
      BackHorn1.addBox(0F, 0F, 0F, 1, 6, 1);
      BackHorn1.setRotationPoint(1F, 12F, -0.3F);
      BackHorn1.setTextureSize(64, 32);
      BackHorn1.mirror = true;
      setRotation(BackHorn1, 0.3839724F, 0F, 0F);
      BackHorn2 = new ModelRenderer(this, 0, 0);
      BackHorn2.addBox(0F, 0F, 0F, 1, 6, 1);
      BackHorn2.setRotationPoint(-2F, 12F, -0.3F);
      BackHorn2.setTextureSize(64, 32);
      BackHorn2.mirror = true;
      setRotation(BackHorn2, 0.3839724F, 0F, 0F);
      BackHorn3 = new ModelRenderer(this, 0, 0);
      BackHorn3.addBox(0F, 0F, 0F, 1, 6, 1);
      BackHorn3.setRotationPoint(-0.5F, 13F, -0.3F);
      BackHorn3.setTextureSize(64, 32);
      BackHorn3.mirror = true;
      setRotation(BackHorn3, 0.4537856F, 0F, 0F);
      arms = new ModelRenderer(this, 42, 14);
      arms.addBox(0F, 0F, 0F, 10, 1, 1);
      arms.setRotationPoint(-5F, 16F, -3F);
      arms.setTextureSize(64, 32);
      arms.mirror = true;
      setRotation(arms, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    MainBody.render(f5);
    ExtraBody.render(f5);
    Tail1.render(f5);
    Tail2.render(f5);
    Tail3.render(f5);
    Tail4.render(f5);
    Face.render(f5);
    TopHead.render(f5);
    EyeBrows.render(f5);
    horn1.render(f5);
    Horn2.render(f5);
    Horn3.render(f5);
    BackHorn1.render(f5);
    BackHorn2.render(f5);
    BackHorn3.render(f5);
    arms.render(f5);
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
