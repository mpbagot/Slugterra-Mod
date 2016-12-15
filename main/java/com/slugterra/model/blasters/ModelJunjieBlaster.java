package com.slugterra.model.blasters;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelJunjieBlaster extends ModelBase
{
  //fields
    ModelRenderer mainmidbody;
    ModelRenderer mainlbody;
    ModelRenderer mainrbody;
    ModelRenderer frontmidbump;
    ModelRenderer rightbackarm;
    ModelRenderer leftbackarm;
    ModelRenderer lmidarm;
    ModelRenderer lfrontarm;
    ModelRenderer rmidarm;
    ModelRenderer rfrontarm;
    ModelRenderer lpeg;
    ModelRenderer rpeg;
    ModelRenderer backmidbump;
    ModelRenderer armgrip;
  
  public ModelJunjieBlaster()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      mainmidbody = new ModelRenderer(this, 36, 0);
      mainmidbody.addBox(0F, 0F, 0F, 2, 1, 12);
      mainmidbody.setRotationPoint(0F, 5F, -4F);
      mainmidbody.setTextureSize(64, 32);
      mainmidbody.mirror = true;
      setRotation(mainmidbody, 0F, 0F, 0F);
      mainlbody = new ModelRenderer(this, 27, 0);
      mainlbody.addBox(0F, 0F, 0F, 1, 1, 9);
      mainlbody.setRotationPoint(-1F, 5F, -2F);
      mainlbody.setTextureSize(64, 32);
      mainlbody.mirror = true;
      setRotation(mainlbody, 0F, 0F, 0F);
      mainrbody = new ModelRenderer(this, 44, 13);
      mainrbody.addBox(0F, 0F, 0F, 1, 1, 9);
      mainrbody.setRotationPoint(2F, 5F, -2F);
      mainrbody.setTextureSize(64, 32);
      mainrbody.mirror = true;
      setRotation(mainrbody, 0F, 0F, 0F);
      frontmidbump = new ModelRenderer(this, 36, 13);
      frontmidbump.addBox(0F, 0F, 0F, 2, 1, 2);
      frontmidbump.setRotationPoint(0F, 4F, 4F);
      frontmidbump.setTextureSize(64, 32);
      frontmidbump.mirror = true;
      setRotation(frontmidbump, 0F, 0F, 0F);
      rightbackarm = new ModelRenderer(this, 0, 26);
      rightbackarm.addBox(0F, 0F, 0F, 2, 1, 5);
      rightbackarm.setRotationPoint(2F, 5F, 5F);
      rightbackarm.setTextureSize(64, 32);
      rightbackarm.mirror = true;
      setRotation(rightbackarm, 0F, 0F, 0F);
      leftbackarm = new ModelRenderer(this, 0, 20);
      leftbackarm.addBox(0F, 0F, 0F, 2, 1, 5);
      leftbackarm.setRotationPoint(-2F, 5F, 5F);
      leftbackarm.setTextureSize(64, 32);
      leftbackarm.mirror = true;
      setRotation(leftbackarm, 0F, 0F, 0F);
      lmidarm = new ModelRenderer(this, 26, 10);
      lmidarm.addBox(0F, 0F, 0F, 1, 1, 4);
      lmidarm.setRotationPoint(-3F, 5F, 8F);
      lmidarm.setTextureSize(64, 32);
      lmidarm.mirror = true;
      setRotation(lmidarm, 0F, 0F, 0F);
      lfrontarm = new ModelRenderer(this, 0, 13);
      lfrontarm.addBox(0F, 0F, 0F, 1, 1, 6);
      lfrontarm.setRotationPoint(-4F, 5F, 10F);
      lfrontarm.setTextureSize(64, 32);
      lfrontarm.mirror = true;
      setRotation(lfrontarm, 0F, 0F, 0F);
      rmidarm = new ModelRenderer(this, 26, 15);
      rmidarm.addBox(0F, 0F, 0F, 1, 1, 4);
      rmidarm.setRotationPoint(4F, 5F, 8F);
      rmidarm.setTextureSize(64, 32);
      rmidarm.mirror = true;
      setRotation(rmidarm, 0F, 0F, 0F);
      rfrontarm = new ModelRenderer(this, 50, 23);
      rfrontarm.addBox(0F, 0F, 0F, 1, 1, 6);
      rfrontarm.setRotationPoint(5F, 5F, 10F);
      rfrontarm.setTextureSize(64, 32);
      rfrontarm.mirror = true;
      setRotation(rfrontarm, 0F, 0F, 0F);
      lpeg = new ModelRenderer(this, 20, 0);
      lpeg.addBox(0F, 0F, 0F, 1, 1, 2);
      lpeg.setRotationPoint(-1F, 5F, 10F);
      lpeg.setTextureSize(64, 32);
      lpeg.mirror = true;
      setRotation(lpeg, 0F, 0F, 0F);
      rpeg = new ModelRenderer(this, 19, 6);
      rpeg.addBox(0F, 0F, 0F, 1, 1, 3);
      rpeg.setRotationPoint(2F, 5F, 9F);
      rpeg.setTextureSize(64, 32);
      rpeg.mirror = true;
      setRotation(rpeg, 0F, 0F, 0F);
      backmidbump = new ModelRenderer(this, 36, 16);
      backmidbump.addBox(0F, 0F, 0F, 2, 1, 2);
      backmidbump.setRotationPoint(0F, 4F, 0F);
      backmidbump.setTextureSize(64, 32);
      backmidbump.mirror = true;
      setRotation(backmidbump, 0F, 0F, 0F);
      armgrip = new ModelRenderer(this, 19, 22);
      armgrip.addBox(0F, 0F, 0F, 6, 1, 4);
      armgrip.setRotationPoint(-2F, 6F, 0F);
      armgrip.setTextureSize(64, 32);
      armgrip.mirror = true;
      setRotation(armgrip, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    mainmidbody.render(f5);
    mainlbody.render(f5);
    mainrbody.render(f5);
    frontmidbump.render(f5);
    rightbackarm.render(f5);
    leftbackarm.render(f5);
    lmidarm.render(f5);
    lfrontarm.render(f5);
    rmidarm.render(f5);
    rfrontarm.render(f5);
    lpeg.render(f5);
    rpeg.render(f5);
    backmidbump.render(f5);
    armgrip.render(f5);
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
