package com.slugterra.model.protoform;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEnigmo extends ModelBase
{
  //fields
    ModelRenderer Middle_Part;
    ModelRenderer Derpy_Face;
    ModelRenderer Mouth;
    ModelRenderer Abdomen;
    ModelRenderer Back;
    ModelRenderer Head_Side1;
    ModelRenderer Head_Side2;
    ModelRenderer Back_Side1;
    ModelRenderer BackSide2;
    ModelRenderer Abdomen_Side1;
    ModelRenderer Abdomen_Side2;
    ModelRenderer Foot1;
    ModelRenderer Foot2;
    ModelRenderer Toe1;
    ModelRenderer Teo2;
    ModelRenderer Arm1;
    ModelRenderer Arm2;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Tail4;
    ModelRenderer Tail5;
    ModelRenderer Tail6;
    ModelRenderer Feeler1;
    ModelRenderer Feeler2;
    ModelRenderer Head_Piece1;
    ModelRenderer Head_Piece2;
  
  public ModelEnigmo()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Middle_Part = new ModelRenderer(this, 0, 24);
      Middle_Part.addBox(0F, 0F, 0F, 16, 28, 2);
      Middle_Part.setRotationPoint(-8F, -4F, 0F);
      Middle_Part.setTextureSize(128, 64);
      Middle_Part.mirror = true;
      setRotation(Middle_Part, 0F, 0F, 0F);
      Derpy_Face = new ModelRenderer(this, 0, 0);
      Derpy_Face.addBox(0F, 0F, 0F, 16, 16, 1);
      Derpy_Face.setRotationPoint(-8F, -3F, -1F);
      Derpy_Face.setTextureSize(128, 64);
      Derpy_Face.mirror = true;
      setRotation(Derpy_Face, 0F, 0F, 0F);
      Mouth = new ModelRenderer(this, 0, 19);
      Mouth.addBox(0F, 0F, 0F, 12, 3, 1);
      Mouth.setRotationPoint(-6F, 13F, -1F);
      Mouth.setTextureSize(128, 64);
      Mouth.mirror = true;
      setRotation(Mouth, 0F, 0F, 0F);
      Abdomen = new ModelRenderer(this, 0, 55);
      Abdomen.addBox(0F, 0F, 0F, 16, 8, 1);
      Abdomen.setRotationPoint(-8F, 16F, -1F);
      Abdomen.setTextureSize(128, 64);
      Abdomen.mirror = true;
      setRotation(Abdomen, 0F, 0F, 0F);
      Back = new ModelRenderer(this, 37, 24);
      Back.addBox(0F, 0F, 0F, 14, 27, 1);
      Back.setRotationPoint(-7F, -3F, 2F);
      Back.setTextureSize(128, 64);
      Back.mirror = true;
      setRotation(Back, 0F, 0F, 0F);
      Head_Side1 = new ModelRenderer(this, 35, 0);
      Head_Side1.addBox(0F, 0F, 0F, 1, 16, 2);
      Head_Side1.setRotationPoint(-9F, -3F, 0F);
      Head_Side1.setTextureSize(128, 64);
      Head_Side1.mirror = true;
      setRotation(Head_Side1, 0F, 0F, 0F);
      Head_Side2 = new ModelRenderer(this, 35, 0);
      Head_Side2.addBox(0F, 0F, 0F, 1, 16, 2);
      Head_Side2.setRotationPoint(8F, -3F, 0F);
      Head_Side2.setTextureSize(128, 64);
      Head_Side2.mirror = true;
      setRotation(Head_Side2, 0F, 0F, 0F);
      Back_Side1 = new ModelRenderer(this, 35, 0);
      Back_Side1.addBox(0F, 0F, 0F, 1, 16, 1);
      Back_Side1.setRotationPoint(7F, -3F, 2F);
      Back_Side1.setTextureSize(128, 64);
      Back_Side1.mirror = true;
      setRotation(Back_Side1, 0F, 0F, 0F);
      BackSide2 = new ModelRenderer(this, 35, 0);
      BackSide2.addBox(0F, 0F, 0F, 1, 16, 1);
      BackSide2.setRotationPoint(-8F, -3F, 2F);
      BackSide2.setTextureSize(128, 64);
      BackSide2.mirror = true;
      setRotation(BackSide2, 0F, 0F, 0F);
      Abdomen_Side1 = new ModelRenderer(this, 35, 0);
      Abdomen_Side1.addBox(0F, 0F, 0F, 1, 8, 1);
      Abdomen_Side1.setRotationPoint(7F, 16F, 2F);
      Abdomen_Side1.setTextureSize(128, 64);
      Abdomen_Side1.mirror = true;
      setRotation(Abdomen_Side1, 0F, 0F, 0F);
      Abdomen_Side2 = new ModelRenderer(this, 35, 0);
      Abdomen_Side2.addBox(0F, 0F, 0F, 1, 8, 1);
      Abdomen_Side2.setRotationPoint(-8F, 16F, 2F);
      Abdomen_Side2.setTextureSize(128, 64);
      Abdomen_Side2.mirror = true;
      setRotation(Abdomen_Side2, 0F, 0F, 0F);
      Foot1 = new ModelRenderer(this, 42, 8);
      Foot1.addBox(0F, 0F, 0F, 1, 2, 1);
      Foot1.setRotationPoint(-8F, 22F, -2F);
      Foot1.setTextureSize(128, 64);
      Foot1.mirror = true;
      setRotation(Foot1, 0F, 0F, 0F);
      Foot2 = new ModelRenderer(this, 42, 8);
      Foot2.addBox(0F, 0F, 0F, 1, 2, 1);
      Foot2.setRotationPoint(7F, 22F, -2F);
      Foot2.setTextureSize(128, 64);
      Foot2.mirror = true;
      setRotation(Foot2, 0F, 0F, 0F);
      Toe1 = new ModelRenderer(this, 42, 8);
      Toe1.addBox(0F, 0F, 0F, 1, 1, 1);
      Toe1.setRotationPoint(-8F, 23F, -3F);
      Toe1.setTextureSize(128, 64);
      Toe1.mirror = true;
      setRotation(Toe1, 0F, 0F, 0F);
      Teo2 = new ModelRenderer(this, 42, 8);
      Teo2.addBox(0F, 0F, 0F, 1, 1, 1);
      Teo2.setRotationPoint(7F, 23F, -3F);
      Teo2.setTextureSize(128, 64);
      Teo2.mirror = true;
      setRotation(Teo2, 0F, 0F, 0F);
      Arm1 = new ModelRenderer(this, 42, 0);
      Arm1.addBox(-1F, 0F, 0F, 2, 5, 2);
      Arm1.setRotationPoint(-8F, 16F, 0F);
      Arm1.setTextureSize(128, 64);
      Arm1.mirror = true;
      setRotation(Arm1, 0F, 0F, 0.3601096F);
      Arm2 = new ModelRenderer(this, 47, 8);
      Arm2.addBox(0F, 0F, 0F, 2, 5, 2);
      Arm2.setRotationPoint(7F, 16F, 0F);
      Arm2.setTextureSize(128, 64);
      Arm2.mirror = true;
      setRotation(Arm2, 0F, 0F, -0.3601096F);
      Tail1 = new ModelRenderer(this, 51, 0);
      Tail1.addBox(0F, 0F, 0F, 12, 1, 1);
      Tail1.setRotationPoint(-6F, 23F, 3F);
      Tail1.setTextureSize(128, 64);
      Tail1.mirror = true;
      setRotation(Tail1, 0F, 0F, 0F);
      Tail2 = new ModelRenderer(this, 51, 0);
      Tail2.addBox(0F, 0F, 0F, 10, 1, 1);
      Tail2.setRotationPoint(-5F, 22F, 3F);
      Tail2.setTextureSize(128, 64);
      Tail2.mirror = true;
      setRotation(Tail2, 0F, 0F, 0F);
      Tail3 = new ModelRenderer(this, 51, 0);
      Tail3.addBox(0F, 0F, 0F, 8, 1, 1);
      Tail3.setRotationPoint(-4F, 21F, 3F);
      Tail3.setTextureSize(128, 64);
      Tail3.mirror = true;
      setRotation(Tail3, 0F, 0F, 0F);
      Tail4 = new ModelRenderer(this, 51, 0);
      Tail4.addBox(0F, 0F, 0F, 8, 2, 1);
      Tail4.setRotationPoint(-4F, 22F, 4F);
      Tail4.setTextureSize(128, 64);
      Tail4.mirror = true;
      setRotation(Tail4, 0F, 0F, 0F);
      Tail5 = new ModelRenderer(this, 51, 0);
      Tail5.addBox(0F, 0F, 0F, 6, 1, 1);
      Tail5.setRotationPoint(-3F, 23F, 5F);
      Tail5.setTextureSize(128, 64);
      Tail5.mirror = true;
      setRotation(Tail5, 0F, 0F, 0F);
      Tail6 = new ModelRenderer(this, 51, 0);
      Tail6.addBox(0F, 0F, 0F, 4, 1, 1);
      Tail6.setRotationPoint(-2F, 23F, 6F);
      Tail6.setTextureSize(128, 64);
      Tail6.mirror = true;
      setRotation(Tail6, 0F, 0F, 0F);
      Feeler1 = new ModelRenderer(this, 42, 12);
      Feeler1.addBox(-1F, -7F, 0F, 1, 7, 1);
      Feeler1.setRotationPoint(-3F, -3F, -1F);
      Feeler1.setTextureSize(128, 64);
      Feeler1.mirror = true;
      setRotation(Feeler1, -0.2700822F, 0F, 0F);
      Feeler2 = new ModelRenderer(this, 42, 12);
      Feeler2.addBox(0F, -7F, 0F, 1, 7, 1);
      Feeler2.setRotationPoint(3F, -3F, -1F);
      Feeler2.setTextureSize(128, 64);
      Feeler2.mirror = true;
      setRotation(Feeler2, -0.2700822F, 0F, 0F);
      Head_Piece1 = new ModelRenderer(this, 0, 27);
      Head_Piece1.addBox(-1F, -2F, -1F, 2, 2, 5);
      Head_Piece1.setRotationPoint(-7F, -3F, 1F);
      Head_Piece1.setTextureSize(128, 64);
      Head_Piece1.mirror = true;
      setRotation(Head_Piece1, 0.3435929F, -0.1175878F, -1.562611F);
      Head_Piece2 = new ModelRenderer(this, 0, 27);
      Head_Piece2.addBox(-1F, -2F, 0F, 2, 2, 5);
      Head_Piece2.setRotationPoint(7F, -3F, 0F);
      Head_Piece2.setTextureSize(128, 64);
      Head_Piece2.mirror = true;
      setRotation(Head_Piece2, 0.3435929F, 0.109305F, 1.561528F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Middle_Part.render(f5);
    Derpy_Face.render(f5);
    Mouth.render(f5);
    Abdomen.render(f5);
    Back.render(f5);
    Head_Side1.render(f5);
    Head_Side2.render(f5);
    Back_Side1.render(f5);
    BackSide2.render(f5);
    Abdomen_Side1.render(f5);
    Abdomen_Side2.render(f5);
    Foot1.render(f5);
    Foot2.render(f5);
    Toe1.render(f5);
    Teo2.render(f5);
    Arm1.render(f5);
    Arm2.render(f5);
    Tail1.render(f5);
    Tail2.render(f5);
    Tail3.render(f5);
    Tail4.render(f5);
    Tail5.render(f5);
    Tail6.render(f5);
    Feeler1.render(f5);
    Feeler2.render(f5);
    Head_Piece1.render(f5);
    Head_Piece2.render(f5);   
    
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
