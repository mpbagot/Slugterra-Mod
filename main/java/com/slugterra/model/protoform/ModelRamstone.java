package com.slugterra.model.protoform;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRamstone extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Head1;
    ModelRenderer Head2;
    ModelRenderer Head3;
    ModelRenderer Head4;
    ModelRenderer Head5;
    ModelRenderer Head6;
    ModelRenderer Arm1;
    ModelRenderer Arm2;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Feelers1;
    ModelRenderer Feelers2;
    ModelRenderer Feelers3;
    ModelRenderer Feelers4;
    ModelRenderer Feelers5;
    ModelRenderer Feelers6;
  
  public ModelRamstone()
  {
    textureWidth = 64;
    textureHeight = 40;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 5, 8, 4);
      Body.setRotationPoint(-1F, 16F, -2F);
      Body.setTextureSize(64, 40);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Leg1 = new ModelRenderer(this, 0, 15);
      Leg1.addBox(0F, 0F, 0F, 1, 1, 1);
      Leg1.setRotationPoint(-1F, 23F, -3F);
      Leg1.setTextureSize(64, 40);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 5, 15);
      Leg2.addBox(0F, 0F, 0F, 1, 1, 1);
      Leg2.setRotationPoint(3F, 23F, -3F);
      Leg2.setTextureSize(64, 40);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Head1 = new ModelRenderer(this, 19, 0);
      Head1.addBox(0F, 0F, 0F, 7, 6, 5);
      Head1.setRotationPoint(-2F, 10F, -3F);
      Head1.setTextureSize(64, 40);
      Head1.mirror = true;
      setRotation(Head1, 0F, 0F, 0F);
      Head2 = new ModelRenderer(this, 19, 11);
      Head2.addBox(0F, 0F, 0F, 9, 1, 3);
      Head2.setRotationPoint(-3F, 9F, 0F);
      Head2.setTextureSize(64, 40);
      Head2.mirror = true;
      setRotation(Head2, 0F, 0F, 0F);
      Head3 = new ModelRenderer(this, 10, 15);
      Head3.addBox(0F, 0F, 0F, 2, 1, 2);
      Head3.setRotationPoint(-3F, 8F, 2F);
      Head3.setTextureSize(64, 40);
      Head3.mirror = true;
      setRotation(Head3, 0F, 0F, 0F);
      Head4 = new ModelRenderer(this, 10, 15);
      Head4.addBox(0F, 0F, 0F, 2, 1, 2);
      Head4.setRotationPoint(4F, 8F, 2F);
      Head4.setTextureSize(64, 40);
      Head4.mirror = true;
      setRotation(Head4, 0F, 0F, 0F);
      Head5 = new ModelRenderer(this, 10, 15);
      Head5.addBox(0F, 0F, 0F, 1, 1, 2);
      Head5.setRotationPoint(-3F, 7F, 3F);
      Head5.setTextureSize(64, 40);
      Head5.mirror = true;
      setRotation(Head5, 0F, 0F, 0F);
      Head6 = new ModelRenderer(this, 10, 15);
      Head6.addBox(0F, 0F, 0F, 1, 1, 2);
      Head6.setRotationPoint(5F, 7F, 3F);
      Head6.setTextureSize(64, 40);
      Head6.mirror = true;
      setRotation(Head6, 0F, 0F, 0F);
      Arm1 = new ModelRenderer(this, 10, 15);
      Arm1.addBox(0F, 0F, 0F, 1, 3, 1);
      Arm1.setRotationPoint(4F, 17F, -1F);
      Arm1.setTextureSize(64, 40);
      Arm1.mirror = true;
      setRotation(Arm1, 0F, 0F, 0F);
      Arm2 = new ModelRenderer(this, 10, 15);
      Arm2.addBox(0F, 0F, 0F, 1, 3, 1);
      Arm2.setRotationPoint(-2F, 17F, -1F);
      Arm2.setTextureSize(64, 40);
      Arm2.mirror = true;
      setRotation(Arm2, 0F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 10, 15);
      Tail1.addBox(0F, 0F, 0F, 3, 1, 1);
      Tail1.setRotationPoint(0F, 23F, 2F);
      Tail1.setTextureSize(64, 40);
      Tail1.mirror = true;
      setRotation(Tail1, 0F, 0F, 0F);
      Tail2 = new ModelRenderer(this, 10, 15);
      Tail2.addBox(0F, 0F, 0F, 1, 2, 1);
      Tail2.setRotationPoint(1F, 22F, 2F);
      Tail2.setTextureSize(64, 40);
      Tail2.mirror = true;
      setRotation(Tail2, 0F, 0F, 0F);
      Tail3 = new ModelRenderer(this, 10, 15);
      Tail3.addBox(0F, 0F, 0F, 1, 1, 1);
      Tail3.setRotationPoint(1F, 23F, 3F);
      Tail3.setTextureSize(64, 40);
      Tail3.mirror = true;
      setRotation(Tail3, 0F, 0F, 0F);
      Feelers1 = new ModelRenderer(this, 0, 18);
      Feelers1.addBox(0F, 0F, 0F, 1, 2, 1);
      Feelers1.setRotationPoint(0F, 7F, 0F);
      Feelers1.setTextureSize(64, 40);
      Feelers1.mirror = true;
      setRotation(Feelers1, 0F, 0F, 0F);
      Feelers2 = new ModelRenderer(this, 0, 18);
      Feelers2.addBox(0F, 0F, 0F, 1, 2, 1);
      Feelers2.setRotationPoint(0F, 6F, 1F);
      Feelers2.setTextureSize(64, 40);
      Feelers2.mirror = true;
      setRotation(Feelers2, 0F, 0F, 0F);
      Feelers3 = new ModelRenderer(this, 0, 18);
      Feelers3.addBox(0F, 0F, 0F, 1, 2, 1);
      Feelers3.setRotationPoint(2F, 7F, 0F);
      Feelers3.setTextureSize(64, 40);
      Feelers3.mirror = true;
      setRotation(Feelers3, 0F, 0F, 0F);
      Feelers4 = new ModelRenderer(this, 0, 18);
      Feelers4.addBox(0F, 0F, 0F, 1, 2, 1);
      Feelers4.setRotationPoint(2F, 6F, 1F);
      Feelers4.setTextureSize(64, 40);
      Feelers4.mirror = true;
      setRotation(Feelers4, 0F, 0F, 0F);
      Feelers5 = new ModelRenderer(this, 0, 18);
      Feelers5.addBox(0F, 0F, 0F, 1, 1, 1);
      Feelers5.setRotationPoint(0F, 6F, 2F);
      Feelers5.setTextureSize(64, 40);
      Feelers5.mirror = true;
      setRotation(Feelers5, 0F, 0F, 0F);
      Feelers6 = new ModelRenderer(this, 0, 18);
      Feelers6.addBox(0F, 0F, 0F, 1, 1, 1);
      Feelers6.setRotationPoint(2F, 6F, 2F);
      Feelers6.setTextureSize(64, 40);
      Feelers6.mirror = true;
      setRotation(Feelers6, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    Leg1.render(f5);
    Leg2.render(f5);
    Head1.render(f5);
    Head2.render(f5);
    Head3.render(f5);
    Head4.render(f5);
    Head5.render(f5);
    Head6.render(f5);
    Arm1.render(f5);
    Arm2.render(f5);
    Tail1.render(f5);
    Tail2.render(f5);
    Tail3.render(f5);
    Feelers1.render(f5);
    Feelers2.render(f5);
    Feelers3.render(f5);
    Feelers4.render(f5);
    Feelers5.render(f5);
    Feelers6.render(f5);
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
