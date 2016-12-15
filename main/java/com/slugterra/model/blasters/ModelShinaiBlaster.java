package com.slugterra.model.blasters;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelShinaiBlaster extends ModelBase
{
  //fields
    ModelRenderer shaftofstick;
    ModelRenderer topbase;
    ModelRenderer toplowermiddle;
    ModelRenderer toplowerbase;
    ModelRenderer topmiddle;
    ModelRenderer toptop;
    ModelRenderer bottomtoptop;
    ModelRenderer bottomtop;
    ModelRenderer Bottomuppermiddle;
    ModelRenderer bottommiddle;
    ModelRenderer bottombottom;
  
  public ModelShinaiBlaster()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      shaftofstick = new ModelRenderer(this, 0, 0);
      shaftofstick.addBox(0F, 0F, 0F, 1, 17, 1);
      shaftofstick.setRotationPoint(0F, 0F, 0F);
      shaftofstick.setTextureSize(64, 32);
      shaftofstick.mirror = true;
      setRotation(shaftofstick, 0F, 0F, 0F);
      topbase = new ModelRenderer(this, 0, 18);
      topbase.addBox(0F, 0F, 0F, 1, 2, 3);
      topbase.setRotationPoint(0F, 2F, -1F);
      topbase.setTextureSize(64, 32);
      topbase.mirror = true;
      setRotation(topbase, 0F, 0F, 0F);
      toplowermiddle = new ModelRenderer(this, 0, 23);
      toplowermiddle.addBox(0F, 0F, 0F, 1, 2, 3);
      toplowermiddle.setRotationPoint(-1F, 1F, -1F);
      toplowermiddle.setTextureSize(64, 32);
      toplowermiddle.mirror = true;
      setRotation(toplowermiddle, 0F, 0F, 0F);
      toplowerbase = new ModelRenderer(this, 0, 28);
      toplowerbase.addBox(0F, 0F, 0F, 1, 2, 1);
      toplowerbase.setRotationPoint(1F, 2F, 0F);
      toplowerbase.setTextureSize(64, 32);
      toplowerbase.mirror = true;
      setRotation(toplowerbase, 0F, 0F, 0F);
      topmiddle = new ModelRenderer(this, 8, 26);
      topmiddle.addBox(0F, 0F, 0F, 1, 3, 3);
      topmiddle.setRotationPoint(-2F, -1F, -1F);
      topmiddle.setTextureSize(64, 32);
      topmiddle.mirror = true;
      setRotation(topmiddle, 0F, 0F, 0F);
      toptop = new ModelRenderer(this, 8, 21);
      toptop.addBox(0F, 0F, 0F, 1, 2, 3);
      toptop.setRotationPoint(-1F, -3F, -1F);
      toptop.setTextureSize(64, 32);
      toptop.mirror = true;
      setRotation(toptop, 0F, 0F, 0F);
      bottomtoptop = new ModelRenderer(this, 4, 15);
      bottomtoptop.addBox(0F, 0F, 0F, 1, 2, 1);
      bottomtoptop.setRotationPoint(-1F, 13F, 0F);
      bottomtoptop.setTextureSize(64, 32);
      bottomtoptop.mirror = true;
      setRotation(bottomtoptop, 0F, 0F, 0F);
      bottomtop = new ModelRenderer(this, 8, 16);
      bottomtop.addBox(0F, 0F, 0F, 1, 2, 3);
      bottomtop.setRotationPoint(0F, 13F, -1F);
      bottomtop.setTextureSize(64, 32);
      bottomtop.mirror = true;
      setRotation(bottomtop, 0F, 0F, 0F);
      Bottomuppermiddle = new ModelRenderer(this, 8, 11);
      Bottomuppermiddle.addBox(0F, 0F, 0F, 1, 2, 3);
      Bottomuppermiddle.setRotationPoint(1F, 14F, -1F);
      Bottomuppermiddle.setTextureSize(64, 32);
      Bottomuppermiddle.mirror = true;
      setRotation(Bottomuppermiddle, 0F, 0F, 0F);
      bottommiddle = new ModelRenderer(this, 8, 5);
      bottommiddle.addBox(0F, 0F, 0F, 1, 3, 3);
      bottommiddle.setRotationPoint(2F, 15F, -1F);
      bottommiddle.setTextureSize(64, 32);
      bottommiddle.mirror = true;
      setRotation(bottommiddle, 0F, 0F, 0F);
      bottombottom = new ModelRenderer(this, 8, 0);
      bottombottom.addBox(0F, 0F, 0F, 1, 2, 3);
      bottombottom.setRotationPoint(1F, 18F, -1F);
      bottombottom.setTextureSize(64, 32);
      bottombottom.mirror = true;
      setRotation(bottombottom, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    shaftofstick.render(f5);
    topbase.render(f5);
    toplowermiddle.render(f5);
    toplowerbase.render(f5);
    topmiddle.render(f5);
    toptop.render(f5);
    bottomtoptop.render(f5);
    bottomtop.render(f5);
    Bottomuppermiddle.render(f5);
    bottommiddle.render(f5);
    bottombottom.render(f5);
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
