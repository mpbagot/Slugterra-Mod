package com.slugterra.model.blasters;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPrimeBlaster extends ModelBase
{
	
	public static boolean[] upgrades;
	public static boolean reloading;
	
  //fields
    ModelRenderer Barrel1;
    ModelRenderer Base;
    ModelRenderer Barrel2;
    ModelRenderer Barrel3;
    ModelRenderer Barrel4;
    ModelRenderer Barrel5;
    ModelRenderer Barrel6;
    ModelRenderer Ammo_Feed;
    ModelRenderer Barrel7;
    ModelRenderer Barrel8;
    ModelRenderer CoreFrame1;
    ModelRenderer CoreFrame2;
    ModelRenderer CoreFrame5;
    ModelRenderer CoreFrame3;
    ModelRenderer CoreFrame7;
    ModelRenderer CoreFrame6;
    ModelRenderer CoreFrame4;
    ModelRenderer CoreFrame8;
    ModelRenderer XtraPart1;
    ModelRenderer XtraPart2;
    ModelRenderer XtraPart3;
    ModelRenderer Handle;
  
  public ModelPrimeBlaster()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Barrel1 = new ModelRenderer(this, 19, 0);
      Barrel1.addBox(0F, 0F, 0F, 3, 1, 1);
      Barrel1.setRotationPoint(-1F, 8F, -11F);
      Barrel1.setTextureSize(64, 32);
      Barrel1.mirror = true;
      setRotation(Barrel1, 0F, 0F, 0F);
      Base = new ModelRenderer(this, 0, 0);
      Base.addBox(0F, 0F, 0F, 3, 5, 6);
      Base.setRotationPoint(-1F, 8F, -5F);
      Base.setTextureSize(64, 32);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      Barrel2 = new ModelRenderer(this, 19, 9);
      Barrel2.addBox(0F, 0F, 0F, 3, 1, 1);
      Barrel2.setRotationPoint(-1F, 12F, -11F);
      Barrel2.setTextureSize(64, 32);
      Barrel2.mirror = true;
      setRotation(Barrel2, 0F, 0F, 0F);
      Barrel3 = new ModelRenderer(this, 0, 12);
      Barrel3.addBox(0F, 0F, 0F, 1, 1, 5);
      Barrel3.setRotationPoint(2F, 12F, -10F);
      Barrel3.setTextureSize(64, 32);
      Barrel3.mirror = true;
      setRotation(Barrel3, 0F, 0F, 0F);
      Barrel4 = new ModelRenderer(this, 0, 19);
      Barrel4.addBox(0F, 0F, 0F, 1, 1, 5);
      Barrel4.setRotationPoint(-2F, 12F, -10F);
      Barrel4.setTextureSize(64, 32);
      Barrel4.mirror = true;
      setRotation(Barrel4, 0F, 0F, 0F);
      Barrel5 = new ModelRenderer(this, 0, 26);
      Barrel5.addBox(0F, 0F, 0F, 1, 1, 5);
      Barrel5.setRotationPoint(-2F, 8F, -10F);
      Barrel5.setTextureSize(64, 32);
      Barrel5.mirror = true;
      setRotation(Barrel5, 0F, 0F, 0F);
      Barrel6 = new ModelRenderer(this, 13, 12);
      Barrel6.addBox(0F, 0F, 0F, 1, 1, 5);
      Barrel6.setRotationPoint(2F, 8F, -10F);
      Barrel6.setTextureSize(64, 32);
      Barrel6.mirror = true;
      setRotation(Barrel6, 0F, 0F, 0F);
      Ammo_Feed = new ModelRenderer(this, 19, 3);
      Ammo_Feed.addBox(0F, 0F, 0F, 1, 1, 4);
      Ammo_Feed.setRotationPoint(0F, 10F, -9F);
      Ammo_Feed.setTextureSize(64, 32);
      Ammo_Feed.mirror = true;
      setRotation(Ammo_Feed, 0F, 0F, 0F);
      Barrel7 = new ModelRenderer(this, 29, 0);
      Barrel7.addBox(0F, 0F, 0F, 3, 1, 5);
      Barrel7.setRotationPoint(-1F, 7F, -10F);
      Barrel7.setTextureSize(64, 32);
      Barrel7.mirror = true;
      setRotation(Barrel7, 0F, 0F, 0F);
      Barrel8 = new ModelRenderer(this, 29, 7);
      Barrel8.addBox(0F, 0F, 0F, 3, 1, 5);
      Barrel8.setRotationPoint(-1F, 13F, -10F);
      Barrel8.setTextureSize(64, 32);
      Barrel8.mirror = true;
      setRotation(Barrel8, 0F, 0F, 0F);
      CoreFrame1 = new ModelRenderer(this, 13, 25);
      CoreFrame1.addBox(0F, 0F, 0F, 1, 3, 1);
      CoreFrame1.setRotationPoint(2F, 9F, -5F);
      CoreFrame1.setTextureSize(64, 32);
      CoreFrame1.mirror = true;
      setRotation(CoreFrame1, 0F, 0F, 0F);
      CoreFrame2 = new ModelRenderer(this, 29, 14);
      CoreFrame2.addBox(0F, 0F, 0F, 1, 1, 3);
      CoreFrame2.setRotationPoint(2F, 8F, -4F);
      CoreFrame2.setTextureSize(64, 32);
      CoreFrame2.mirror = true;
      setRotation(CoreFrame2, 0F, 0F, 0F);
      CoreFrame5 = new ModelRenderer(this, 13, 25);
      CoreFrame5.addBox(0F, 0F, 0F, 1, 3, 1);
      CoreFrame5.setRotationPoint(-2F, 9F, -5F);
      CoreFrame5.setTextureSize(64, 32);
      CoreFrame5.mirror = true;
      setRotation(CoreFrame5, 0F, 0F, 0F);
      CoreFrame3 = new ModelRenderer(this, 13, 25);
      CoreFrame3.addBox(0F, 0F, 0F, 1, 3, 1);
      CoreFrame3.setRotationPoint(2F, 9F, -1F);
      CoreFrame3.setTextureSize(64, 32);
      CoreFrame3.mirror = true;
      setRotation(CoreFrame3, 0F, 0F, 0F);
      CoreFrame7 = new ModelRenderer(this, 13, 25);
      CoreFrame7.addBox(0F, 0F, 0F, 1, 3, 1);
      CoreFrame7.setRotationPoint(-2F, 9F, -1F);
      CoreFrame7.setTextureSize(64, 32);
      CoreFrame7.mirror = true;
      setRotation(CoreFrame7, 0F, 0F, 0F);
      CoreFrame6 = new ModelRenderer(this, 29, 14);
      CoreFrame6.addBox(0F, 0F, 0F, 1, 1, 3);
      CoreFrame6.setRotationPoint(-2F, 8F, -4F);
      CoreFrame6.setTextureSize(64, 32);
      CoreFrame6.mirror = true;
      setRotation(CoreFrame6, 0F, 0F, 0F);
      CoreFrame4 = new ModelRenderer(this, 29, 14);
      CoreFrame4.addBox(0F, 0F, 0F, 1, 1, 3);
      CoreFrame4.setRotationPoint(2F, 12F, -4F);
      CoreFrame4.setTextureSize(64, 32);
      CoreFrame4.mirror = true;
      setRotation(CoreFrame4, 0F, 0F, 0F);
      CoreFrame8 = new ModelRenderer(this, 29, 14);
      CoreFrame8.addBox(0F, 0F, 0F, 1, 1, 3);
      CoreFrame8.setRotationPoint(-2F, 12F, -4F);
      CoreFrame8.setTextureSize(64, 32);
      CoreFrame8.mirror = true;
      setRotation(CoreFrame8, 0F, 0F, 0F);
      XtraPart1 = new ModelRenderer(this, 46, 0);
      XtraPart1.addBox(0F, 0F, 0F, 3, 1, 5);
      XtraPart1.setRotationPoint(-1F, 7F, -1F);
      XtraPart1.setTextureSize(64, 32);
      XtraPart1.mirror = true;
      setRotation(XtraPart1, 0F, 0F, 0F);
      XtraPart2 = new ModelRenderer(this, 46, 7);
      XtraPart2.addBox(0F, 0F, 0F, 3, 1, 2);
      XtraPart2.setRotationPoint(-1F, 8F, 1F);
      XtraPart2.setTextureSize(64, 32);
      XtraPart2.mirror = true;
      setRotation(XtraPart2, 0F, 0F, 0F);
      XtraPart3 = new ModelRenderer(this, 46, 11);
      XtraPart3.addBox(0F, 0F, 0F, 3, 1, 1);
      XtraPart3.setRotationPoint(-1F, 9F, 1F);
      XtraPart3.setTextureSize(64, 32);
      XtraPart3.mirror = true;
      setRotation(XtraPart3, 0F, 0F, 0F);
      Handle = new ModelRenderer(this, 19, 23);
      Handle.addBox(0F, 0F, 0F, 3, 6, 2);
      Handle.setRotationPoint(-1F, 13F, -1F);
      Handle.setTextureSize(64, 32);
      Handle.mirror = true;
      setRotation(Handle, 0.5402259F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5, boolean reloading)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    this.reloading = reloading;
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Barrel1.render(f5);
    Base.render(f5);
    Barrel2.render(f5);
    Barrel3.render(f5);
    Barrel4.render(f5);
    Barrel5.render(f5);
    Barrel6.render(f5);
    Ammo_Feed.render(f5);
    Barrel7.render(f5);
    Barrel8.render(f5);
    CoreFrame1.render(f5);
    CoreFrame2.render(f5);
    CoreFrame5.render(f5);
    CoreFrame3.render(f5);
    CoreFrame7.render(f5);
    CoreFrame6.render(f5);
    CoreFrame4.render(f5);
    CoreFrame8.render(f5);
    XtraPart1.render(f5);
    XtraPart2.render(f5);
    XtraPart3.render(f5);
    Handle.render(f5);
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
