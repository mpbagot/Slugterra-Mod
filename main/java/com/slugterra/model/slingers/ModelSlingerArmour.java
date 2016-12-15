package com.slugterra.model.slingers;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSlingerArmour extends ModelBiped
{
  //fields
    ModelRenderer SlugBelt;
    ModelRenderer slugtube1;
    ModelRenderer slugtube2;
    ModelRenderer slugtube3;
    ModelRenderer slugtube4;
    ModelRenderer slugtube5;
    ModelRenderer slugtube6;
    ModelRenderer belt;
  
  public ModelSlingerArmour()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      SlugBelt = new ModelRenderer(this, 0, 32);
      SlugBelt.addBox(-12F, 2F, -2.5F, 15, 2, 5);
      SlugBelt.setRotationPoint(0F, 0F, 0F);
      SlugBelt.setTextureSize(64, 64);
      SlugBelt.mirror = true;
      setRotation(SlugBelt, 0F, 0F, -0.9712912F);
      slugtube1 = new ModelRenderer(this, 0, 39);
      slugtube1.addBox(-3F, 2F, -3.5F, 1, 2, 1);
      slugtube1.setRotationPoint(0F, 0F, 0F);
      slugtube1.setTextureSize(64, 64);
      slugtube1.mirror = true;
      setRotation(slugtube1, 0F, 0F, -0.9599311F);
      slugtube2 = new ModelRenderer(this, 0, 39);
      slugtube2.addBox(-5F, 2F, -3.5F, 1, 2, 1);
      slugtube2.setRotationPoint(0F, 0F, 0F);
      slugtube2.setTextureSize(64, 64);
      slugtube2.mirror = true;
      setRotation(slugtube2, 0F, 0F, -0.9599311F);
      slugtube3 = new ModelRenderer(this, 0, 39);
      slugtube3.addBox(-7F, 2F, -3.5F, 1, 2, 1);
      slugtube3.setRotationPoint(0F, 0F, 0F);
      slugtube3.setTextureSize(64, 64);
      slugtube3.mirror = true;
      setRotation(slugtube3, 0F, 0F, -0.9599311F);
      slugtube4 = new ModelRenderer(this, 0, 39);
      slugtube4.addBox(-9F, 2F, -3.5F, 1, 2, 1);
      slugtube4.setRotationPoint(0F, 0F, 0F);
      slugtube4.setTextureSize(64, 64);
      slugtube4.mirror = true;
      setRotation(slugtube4, 0F, 0F, -0.9599311F);
      slugtube5 = new ModelRenderer(this, 0, 39);
      slugtube5.addBox(-11F, 2F, -3.5F, 1, 2, 1);
      slugtube5.setRotationPoint(0F, 0F, 0F);
      slugtube5.setTextureSize(64, 64);
      slugtube5.mirror = true;
      setRotation(slugtube5, 0F, 0F, -0.9599311F);
      slugtube6 = new ModelRenderer(this, 0, 39);
      slugtube6.addBox(-1F, 2F, -3.5F, 1, 2, 1);
      slugtube6.setRotationPoint(0F, 0F, 0F);
      slugtube6.setTextureSize(64, 64);
      slugtube6.mirror = true;
      setRotation(slugtube6, 0F, 0F, -0.9599311F);
      belt = new ModelRenderer(this, 0, 42);
      belt.addBox(-4.5F, 11F, -2.5F, 9, 1, 5);
      belt.setRotationPoint(0F, 0F, 0F);
      belt.setTextureSize(64, 64);
      belt.mirror = true;
      setRotation(belt, 0F, 0F, 0F);
      
      this.bipedBody.addChild(SlugBelt);
      this.bipedBody.addChild(slugtube1);
      this.bipedBody.addChild(slugtube2);
      this.bipedBody.addChild(slugtube3);
      this.bipedBody.addChild(slugtube4);
      this.bipedBody.addChild(slugtube5);
      this.bipedBody.addChild(slugtube6);
      this.bipedBody.addChild(belt);

  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    SlugBelt.render(f5);
    slugtube1.render(f5);
    slugtube2.render(f5);
    slugtube3.render(f5);
    slugtube4.render(f5);
    slugtube5.render(f5);
    slugtube6.render(f5);
    belt.render(f5);
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
