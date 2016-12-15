package com.slugterra.model.velocity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelInfurnusVel2 extends ModelBase
{
  //fields
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Body;
    ModelRenderer Head;
    ModelRenderer Arm1;
    ModelRenderer Arm2;
    ModelRenderer Shape6;
    ModelRenderer Mouth1;
    ModelRenderer Mouth2;
    ModelRenderer Shape7;
    ModelRenderer Tail1;
    ModelRenderer Finger1;
    ModelRenderer Finger2;
    ModelRenderer Finger3;
    ModelRenderer Finger4;
    ModelRenderer Finger5;
    ModelRenderer Finger6;
    ModelRenderer Feeler1;
    ModelRenderer Feeler2;
    ModelRenderer Feeler3;
    ModelRenderer Feeler4;
    ModelRenderer Horn1;
    ModelRenderer Horn2;
  
  public ModelInfurnusVel2()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Tail2 = new ModelRenderer(this, 0, 0);
      Tail2.addBox(0F, 0F, 0F, 1, 2, 1);
      Tail2.setRotationPoint(0F, 7F, 5F);
      Tail2.setTextureSize(64, 32);
      Tail2.mirror = true;
      setRotation(Tail2, 0F, 0F, 0F);
      Tail3 = new ModelRenderer(this, 0, 4);
      Tail3.addBox(0F, 0F, 0F, 3, 3, 2);
      Tail3.setRotationPoint(-1F, 6F, 3F);
      Tail3.setTextureSize(64, 32);
      Tail3.mirror = true;
      setRotation(Tail3, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 16, 0);
      Body.addBox(0F, 0F, 0F, 5, 5, 8);
      Body.setRotationPoint(-2F, 5F, -5F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 13);
      Head.addBox(-2F, -2F, -5F, 5, 4, 4);
      Head.setRotationPoint(0F, 7F, -4F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Arm1 = new ModelRenderer(this, 19, 14);
      Arm1.addBox(0F, 0F, -1F, 4, 3, 2);
      Arm1.setRotationPoint(3F, 5F, -4F);
      Arm1.setTextureSize(64, 32);
      Arm1.mirror = true;
      setRotation(Arm1, 0F, 0F, 0F);
      Arm2 = new ModelRenderer(this, 19, 20);
      Arm2.addBox(-4F, 0F, -1F, 4, 3, 2);
      Arm2.setRotationPoint(-2F, 5F, -4F);
      Arm2.setTextureSize(64, 32);
      Arm2.mirror = true;
      setRotation(Arm2, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 45, 16);
      Shape6.addBox(0F, 0F, 0F, 6, 3, 3);
      Shape6.setRotationPoint(7F, 5F, -5F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Mouth1 = new ModelRenderer(this, 0, 23);
      Mouth1.addBox(-1F, 0F, -2F, 3, 1, 1);
      Mouth1.setRotationPoint(0F, 7F, -8F);
      Mouth1.setTextureSize(64, 32);
      Mouth1.mirror = true;
      setRotation(Mouth1, 0F, 0F, 0F);
      Mouth2 = new ModelRenderer(this, 0, 27);
      Mouth2.addBox(-1F, 0F, -2F, 3, 1, 1);
      Mouth2.setRotationPoint(0F, 8F, -8F);
      Mouth2.setTextureSize(64, 32);
      Mouth2.mirror = true;
      setRotation(Mouth2, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 43, 0);
      Shape7.addBox(-6F, 0F, 0F, 6, 3, 3);
      Shape7.setRotationPoint(-6F, 5F, -5F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 5, 0);
      Tail1.addBox(0F, 0F, 0F, 1, 1, 1);
      Tail1.setRotationPoint(0F, 8F, 6F);
      Tail1.setTextureSize(64, 32);
      Tail1.mirror = true;
      setRotation(Tail1, 0F, 0F, 0F);
      Finger1 = new ModelRenderer(this, 43, 13);
      Finger1.addBox(-3F, 0F, 0F, 3, 1, 1);
      Finger1.setRotationPoint(-12F, 6F, -5F);
      Finger1.setTextureSize(64, 32);
      Finger1.mirror = true;
      setRotation(Finger1, 0F, 0F, 0F);
      Finger2 = new ModelRenderer(this, 43, 7);
      Finger2.addBox(-3F, 0F, 0F, 3, 1, 1);
      Finger2.setRotationPoint(-12F, 6F, -3F);
      Finger2.setTextureSize(64, 32);
      Finger2.mirror = true;
      setRotation(Finger2, 0F, 0F, 0F);
      Finger3 = new ModelRenderer(this, 43, 13);
      Finger3.addBox(0F, 0F, 0F, 3, 1, 1);
      Finger3.setRotationPoint(13F, 6F, -3F);
      Finger3.setTextureSize(64, 32);
      Finger3.mirror = true;
      setRotation(Finger3, 0F, 0F, 0F);
      Finger4 = new ModelRenderer(this, 43, 7);
      Finger4.addBox(0F, 0F, 0F, 3, 1, 1);
      Finger4.setRotationPoint(13F, 6F, -5F);
      Finger4.setTextureSize(64, 32);
      Finger4.mirror = true;
      setRotation(Finger4, 0F, 0F, 0F);
      Finger5 = new ModelRenderer(this, 43, 10);
      Finger5.addBox(0F, 0F, 0F, 5, 1, 1);
      Finger5.setRotationPoint(13F, 6F, -4F);
      Finger5.setTextureSize(64, 32);
      Finger5.mirror = true;
      setRotation(Finger5, 0F, 0F, 0F);
      Finger6 = new ModelRenderer(this, 43, 10);
      Finger6.addBox(0F, 0F, 0F, 5, 1, 1);
      Finger6.setRotationPoint(-17F, 6F, -4F);
      Finger6.setTextureSize(64, 32);
      Finger6.mirror = true;
      setRotation(Finger6, 0F, 0F, 0F);
      Feeler1 = new ModelRenderer(this, 32, 16);
      Feeler1.addBox(0F, 0F, 0F, 5, 1, 1);
      Feeler1.setRotationPoint(3F, 6F, -8F);
      Feeler1.setTextureSize(64, 32);
      Feeler1.mirror = true;
      setRotation(Feeler1, 1.784573F, -1.412787F, -1.003822F);
      Feeler2 = new ModelRenderer(this, 32, 16);
      Feeler2.addBox(0F, 0F, 0F, 5, 1, 1);
      Feeler2.setRotationPoint(-1F, 6F, -8F);
      Feeler2.setTextureSize(64, 32);
      Feeler2.mirror = true;
      setRotation(Feeler2, 1.524323F, -1.59868F, -1.003822F);
      Feeler3 = new ModelRenderer(this, 32, 16);
      Feeler3.addBox(0F, 0F, 0F, 3, 1, 1);
      Feeler3.setRotationPoint(-1F, 6F, -7F);
      Feeler3.setTextureSize(64, 32);
      Feeler3.mirror = true;
      setRotation(Feeler3, 1.673038F, -1.524323F, -0.7435722F);
      Feeler4 = new ModelRenderer(this, 32, 16);
      Feeler4.addBox(0F, 0F, 0F, 3, 1, 1);
      Feeler4.setRotationPoint(3F, 6F, -7F);
      Feeler4.setTextureSize(64, 32);
      Feeler4.mirror = true;
      setRotation(Feeler4, 1.673038F, -1.524323F, -0.7435722F);
      Horn1 = new ModelRenderer(this, 32, 19);
      Horn1.addBox(0F, 0F, 0F, 2, 1, 1);
      Horn1.setRotationPoint(1F, 6F, -8F);
      Horn1.setTextureSize(64, 32);
      Horn1.mirror = true;
      setRotation(Horn1, 3.085825F, -1.59868F, -1.115358F);
      Horn2 = new ModelRenderer(this, 32, 19);
      Horn2.addBox(0F, 0F, 0F, 2, 1, 1);
      Horn2.setRotationPoint(-1F, 6F, -8F);
      Horn2.setTextureSize(64, 32);
      Horn2.mirror = true;
      setRotation(Horn2, -3.141593F, -1.561502F, -1.152537F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Tail2.render(f5);
    Tail3.render(f5);
    Body.render(f5);
    Head.render(f5);
    Arm1.render(f5);
    Arm2.render(f5);
    Shape6.render(f5);
    Mouth1.render(f5);
    Mouth2.render(f5);
    Shape7.render(f5);
    Tail1.render(f5);
    Finger1.render(f5);
    Finger2.render(f5);
    Finger3.render(f5);
    Finger4.render(f5);
    Finger5.render(f5);
    Finger6.render(f5);
    Feeler1.render(f5);
    Feeler2.render(f5);
    Feeler3.render(f5);
    Feeler4.render(f5);
    Horn1.render(f5);
    Horn2.render(f5);
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
