package com.slugterra.model.velocity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPhosphoroVel extends ModelBase
{
  //fields
    ModelRenderer Face;
    ModelRenderer Mouth1;
    ModelRenderer Mouth2;
    ModelRenderer Body;
    ModelRenderer Mouth3;
    ModelRenderer Side1;
    ModelRenderer Side2;
    ModelRenderer Side1a;
    ModelRenderer Side2b;
    ModelRenderer Side2a;
    ModelRenderer Side1b;
    ModelRenderer Fin1a;
    ModelRenderer Fin2a;
    ModelRenderer Fin3a;
    ModelRenderer Fin4a;
    ModelRenderer Fin5a;
    ModelRenderer Fin6a;
    ModelRenderer LightBall1a;
    ModelRenderer LightBall2a;
    ModelRenderer LightBall3a;
    ModelRenderer Fin1b;
    ModelRenderer Fin2b;
    ModelRenderer Fin3b;
    ModelRenderer Fin4b;
    ModelRenderer LightBall1b;
    ModelRenderer LightBall2b;
    ModelRenderer LightBall3b;
    ModelRenderer Fin5b;
    ModelRenderer Fin6b;
    ModelRenderer Fin1c;
    ModelRenderer Side3a;
    ModelRenderer Fin1d;
    ModelRenderer Fin2c;
    ModelRenderer Fin3c;
    ModelRenderer Fin2d;
    ModelRenderer Fin3d;
    ModelRenderer Belly;
    ModelRenderer LightBall3c;
    ModelRenderer LightBall2c;
    ModelRenderer LightBall1c;
    ModelRenderer Fin4c;
    ModelRenderer Fin5c;
    ModelRenderer Fin4d;
    ModelRenderer Fin6c;
    ModelRenderer Fin6d;
    ModelRenderer LightBall2d;
    ModelRenderer LightBall1d;
    ModelRenderer LightBall3d;
    ModelRenderer Side73;
    ModelRenderer Fin1e;
    ModelRenderer Fin2e;
    ModelRenderer Fin3e;
    ModelRenderer LightBall3e;
    ModelRenderer LightBall2e;
    ModelRenderer LightBall1e;
    ModelRenderer Fin6e;
    ModelRenderer Fin5e;
    ModelRenderer Fin1f;
    ModelRenderer Fin2f;
    ModelRenderer Fin3f;
    ModelRenderer Fin47;
    ModelRenderer Fin4e;
    ModelRenderer Fin4f;
    ModelRenderer Fin5f;
    ModelRenderer Fin6f;
    ModelRenderer LightBall3f;
    ModelRenderer LightBall1f;
    ModelRenderer LightBall2f;
  
  public ModelPhosphoroVel()
  {
    textureWidth = 64;
    textureHeight = 128;
    
      Face = new ModelRenderer(this, 0, 0);
      Face.addBox(0F, 0F, 0F, 6, 7, 1);
      Face.setRotationPoint(0F, 0F, 0F);
      Face.setTextureSize(64, 128);
      Face.mirror = true;
      setRotation(Face, 0F, 0F, 0F);
      Mouth1 = new ModelRenderer(this, 0, 9);
      Mouth1.addBox(0F, 0F, 0F, 6, 2, 1);
      Mouth1.setRotationPoint(0F, 4F, -1F);
      Mouth1.setTextureSize(64, 128);
      Mouth1.mirror = true;
      setRotation(Mouth1, 0F, 0F, 0F);
      Mouth2 = new ModelRenderer(this, 0, 9);
      Mouth2.addBox(0F, 0F, 0F, 4, 1, 1);
      Mouth2.setRotationPoint(1F, 6F, -1F);
      Mouth2.setTextureSize(64, 128);
      Mouth2.mirror = true;
      setRotation(Mouth2, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 15, 0);
      Body.addBox(0F, 0F, 0F, 6, 9, 8);
      Body.setRotationPoint(0F, -1F, 1F);
      Body.setTextureSize(64, 128);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Mouth3 = new ModelRenderer(this, 0, 9);
      Mouth3.addBox(0F, 0F, 0F, 4, 1, 1);
      Mouth3.setRotationPoint(1F, 7F, 0F);
      Mouth3.setTextureSize(64, 128);
      Mouth3.mirror = true;
      setRotation(Mouth3, 0F, 0F, 0F);
      Side1 = new ModelRenderer(this, 0, 18);
      Side1.addBox(0F, 0F, 0F, 1, 5, 7);
      Side1.setRotationPoint(-1F, 1F, 1F);
      Side1.setTextureSize(64, 128);
      Side1.mirror = true;
      setRotation(Side1, 0F, 0F, 0F);
      Side2 = new ModelRenderer(this, 0, 18);
      Side2.addBox(0F, 0F, 0F, 1, 5, 7);
      Side2.setRotationPoint(6F, 1F, 1F);
      Side2.setTextureSize(64, 128);
      Side2.mirror = true;
      setRotation(Side2, 0F, 0F, 0F);
      Side1a = new ModelRenderer(this, 0, 18);
      Side1a.addBox(0F, 0F, 0F, 1, 1, 5);
      Side1a.setRotationPoint(-1F, 0F, 2F);
      Side1a.setTextureSize(64, 128);
      Side1a.mirror = true;
      setRotation(Side1a, 0F, 0F, 0F);
      Side2b = new ModelRenderer(this, 0, 18);
      Side2b.addBox(0F, 0F, 0F, 1, 1, 5);
      Side2b.setRotationPoint(6F, 0F, 2F);
      Side2b.setTextureSize(64, 128);
      Side2b.mirror = true;
      setRotation(Side2b, 0F, 0F, 0F);
      Side2a = new ModelRenderer(this, 0, 18);
      Side2a.addBox(0F, 0F, 0F, 1, 1, 5);
      Side2a.setRotationPoint(-1F, 6F, 2F);
      Side2a.setTextureSize(64, 128);
      Side2a.mirror = true;
      setRotation(Side2a, 0F, 0F, 0F);
      Side1b = new ModelRenderer(this, 0, 18);
      Side1b.addBox(0F, 0F, 0F, 1, 1, 5);
      Side1b.setRotationPoint(6F, 6F, 2F);
      Side1b.setTextureSize(64, 128);
      Side1b.mirror = true;
      setRotation(Side1b, 0F, 0F, 0F);
      Fin1a = new ModelRenderer(this, 0, 18);
      Fin1a.addBox(0F, 0F, 0F, 2, 1, 4);
      Fin1a.setRotationPoint(2F, -2F, 2F);
      Fin1a.setTextureSize(64, 128);
      Fin1a.mirror = true;
      setRotation(Fin1a, 0F, 0F, 0F);
      Fin2a = new ModelRenderer(this, 0, 18);
      Fin2a.addBox(0F, 0F, 0F, 4, 1, 2);
      Fin2a.setRotationPoint(1F, -2F, 3F);
      Fin2a.setTextureSize(64, 128);
      Fin2a.mirror = true;
      setRotation(Fin2a, 0F, 0F, 0F);
      Fin3a = new ModelRenderer(this, 0, 18);
      Fin3a.addBox(0F, 0F, 0F, 2, 1, 2);
      Fin3a.setRotationPoint(2F, -3F, 3F);
      Fin3a.setTextureSize(64, 128);
      Fin3a.mirror = true;
      setRotation(Fin3a, 0F, 0F, 0F);
      Fin4a = new ModelRenderer(this, 0, 18);
      Fin4a.addBox(0F, 0F, 0F, 2, 1, 2);
      Fin4a.setRotationPoint(2F, -4F, 2F);
      Fin4a.setTextureSize(64, 128);
      Fin4a.mirror = true;
      setRotation(Fin4a, 0F, 0F, 0F);
      Fin5a = new ModelRenderer(this, 0, 18);
      Fin5a.addBox(0F, 0F, 0F, 2, 1, 2);
      Fin5a.setRotationPoint(2F, -5F, 1F);
      Fin5a.setTextureSize(64, 128);
      Fin5a.mirror = true;
      setRotation(Fin5a, 0F, 0F, 0F);
      Fin6a = new ModelRenderer(this, 0, 44);
      Fin6a.addBox(0F, 0F, 0F, 2, 1, 7);
      Fin6a.setRotationPoint(2F, -6F, -5F);
      Fin6a.setTextureSize(64, 128);
      Fin6a.mirror = true;
      setRotation(Fin6a, 0F, 0F, 0F);
      LightBall1a = new ModelRenderer(this, 19, 18);
      LightBall1a.addBox(0F, 0F, 0F, 2, 4, 2);
      LightBall1a.setRotationPoint(2F, -5F, -6F);
      LightBall1a.setTextureSize(64, 128);
      LightBall1a.mirror = true;
      setRotation(LightBall1a, 0F, 0F, 0F);
      LightBall2a = new ModelRenderer(this, 19, 18);
      LightBall2a.addBox(0F, 0F, 0F, 4, 2, 2);
      LightBall2a.setRotationPoint(1F, -4F, -6F);
      LightBall2a.setTextureSize(64, 128);
      LightBall2a.mirror = true;
      setRotation(LightBall2a, 0F, 0F, 0F);
      LightBall3a = new ModelRenderer(this, 19, 18);
      LightBall3a.addBox(0F, 0F, 0F, 2, 2, 4);
      LightBall3a.setRotationPoint(2F, -4F, -7F);
      LightBall3a.setTextureSize(64, 128);
      LightBall3a.mirror = true;
      setRotation(LightBall3a, 0F, 0F, 0F);
      Fin1b = new ModelRenderer(this, 0, 18);
      Fin1b.addBox(0F, 0F, 0F, 6, 1, 1);
      Fin1b.setRotationPoint(0F, -2F, 7F);
      Fin1b.setTextureSize(64, 128);
      Fin1b.mirror = true;
      setRotation(Fin1b, 0F, 0F, 0F);
      Fin2b = new ModelRenderer(this, 0, 18);
      Fin2b.addBox(0F, 0F, 0F, 6, 1, 3);
      Fin2b.setRotationPoint(0F, -3F, 8F);
      Fin2b.setTextureSize(64, 128);
      Fin2b.mirror = true;
      setRotation(Fin2b, 0F, 0F, 0F);
      Fin3b = new ModelRenderer(this, 0, 18);
      Fin3b.addBox(0F, 0F, 0F, 4, 1, 5);
      Fin3b.setRotationPoint(1F, -4F, 9F);
      Fin3b.setTextureSize(64, 128);
      Fin3b.mirror = true;
      setRotation(Fin3b, 0F, 0F, 0F);
      Fin4b = new ModelRenderer(this, 0, 31);
      Fin4b.addBox(0F, 0F, 0F, 2, 1, 11);
      Fin4b.setRotationPoint(2F, -5F, 10F);
      Fin4b.setTextureSize(64, 128);
      Fin4b.mirror = true;
      setRotation(Fin4b, 0F, 0F, 0F);
      LightBall1b = new ModelRenderer(this, 19, 18);
      LightBall1b.addBox(0F, 0F, 0F, 2, 4, 2);
      LightBall1b.setRotationPoint(2F, -7F, 22F);
      LightBall1b.setTextureSize(64, 128);
      LightBall1b.mirror = true;
      setRotation(LightBall1b, 0F, 0F, 0F);
      LightBall2b = new ModelRenderer(this, 19, 18);
      LightBall2b.addBox(0F, 0F, 0F, 4, 2, 2);
      LightBall2b.setRotationPoint(1F, -6F, 22F);
      LightBall2b.setTextureSize(64, 128);
      LightBall2b.mirror = true;
      setRotation(LightBall2b, 0F, 0F, 0F);
      LightBall3b = new ModelRenderer(this, 19, 18);
      LightBall3b.addBox(0F, 0F, 0F, 2, 2, 4);
      LightBall3b.setRotationPoint(2F, -6F, 21F);
      LightBall3b.setTextureSize(64, 128);
      LightBall3b.mirror = true;
      setRotation(LightBall3b, 0F, 0F, 0F);
      Fin5b = new ModelRenderer(this, 0, 18);
      Fin5b.addBox(0F, 0F, 0F, 2, 1, 1);
      Fin5b.setRotationPoint(2F, -4F, 14F);
      Fin5b.setTextureSize(64, 128);
      Fin5b.mirror = true;
      setRotation(Fin5b, 0F, 0F, 0F);
      Fin6b = new ModelRenderer(this, 0, 18);
      Fin6b.addBox(0F, 0F, 0F, 2, 1, 3);
      Fin6b.setRotationPoint(2F, -3F, 11F);
      Fin6b.setTextureSize(64, 128);
      Fin6b.mirror = true;
      setRotation(Fin6b, 0F, 0F, 0F);
      Fin1c = new ModelRenderer(this, 0, 18);
      Fin1c.addBox(0F, 0F, 0F, 2, 6, 3);
      Fin1c.setRotationPoint(-2F, -2F, 9F);
      Fin1c.setTextureSize(64, 128);
      Fin1c.mirror = true;
      setRotation(Fin1c, 0F, 0F, 0F);
      Side3a = new ModelRenderer(this, 0, 18);
      Side3a.addBox(0F, 0F, 0F, 1, 13, 1);
      Side3a.setRotationPoint(-1F, -2F, 8F);
      Side3a.setTextureSize(64, 128);
      Side3a.mirror = true;
      setRotation(Side3a, 0F, 0F, 0F);
      Fin1d = new ModelRenderer(this, 0, 18);
      Fin1d.addBox(0F, 0F, 0F, 2, 6, 3);
      Fin1d.setRotationPoint(-2F, 5F, 9F);
      Fin1d.setTextureSize(64, 128);
      Fin1d.mirror = true;
      setRotation(Fin1d, 0F, 0F, 0F);
      Fin2c = new ModelRenderer(this, 0, 18);
      Fin2c.addBox(0F, 0F, 0F, 1, 4, 5);
      Fin2c.setRotationPoint(-3F, -1F, 10F);
      Fin2c.setTextureSize(64, 128);
      Fin2c.mirror = true;
      setRotation(Fin2c, 0F, 0F, 0F);
      Fin3c = new ModelRenderer(this, 32, 18);
      Fin3c.addBox(0F, 0F, 0F, 1, 2, 11);
      Fin3c.setRotationPoint(-4F, 0F, 11F);
      Fin3c.setTextureSize(64, 128);
      Fin3c.mirror = true;
      setRotation(Fin3c, 0F, 0F, 0F);
      Fin2d = new ModelRenderer(this, 0, 18);
      Fin2d.addBox(0F, 0F, 0F, 1, 4, 5);
      Fin2d.setRotationPoint(-3F, 6F, 10F);
      Fin2d.setTextureSize(64, 128);
      Fin2d.mirror = true;
      setRotation(Fin2d, 0F, 0F, 0F);
      Fin3d = new ModelRenderer(this, 27, 32);
      Fin3d.addBox(0F, 0F, 0F, 1, 2, 11);
      Fin3d.setRotationPoint(-4F, 7F, 11F);
      Fin3d.setTextureSize(64, 128);
      Fin3d.mirror = true;
      setRotation(Fin3d, 0F, 0F, 0F);
      Belly = new ModelRenderer(this, 41, 46);
      Belly.addBox(0F, 0F, 0F, 4, 1, 7);
      Belly.setRotationPoint(1F, 8F, 1F);
      Belly.setTextureSize(64, 128);
      Belly.mirror = true;
      setRotation(Belly, 0F, 0F, 0F);
      LightBall3c = new ModelRenderer(this, 19, 18);
      LightBall3c.addBox(0F, 0F, 0F, 2, 2, 4);
      LightBall3c.setRotationPoint(-5F, 0F, 22F);
      LightBall3c.setTextureSize(64, 128);
      LightBall3c.mirror = true;
      setRotation(LightBall3c, 0F, 0F, 0F);
      LightBall2c = new ModelRenderer(this, 19, 18);
      LightBall2c.addBox(0F, 0F, 0F, 4, 2, 2);
      LightBall2c.setRotationPoint(-6F, 0F, 23F);
      LightBall2c.setTextureSize(64, 128);
      LightBall2c.mirror = true;
      setRotation(LightBall2c, 0F, 0F, 0F);
      LightBall1c = new ModelRenderer(this, 19, 18);
      LightBall1c.addBox(0F, 0F, 0F, 2, 4, 2);
      LightBall1c.setRotationPoint(-5F, -1F, 23F);
      LightBall1c.setTextureSize(64, 128);
      LightBall1c.mirror = true;
      setRotation(LightBall1c, 0F, 0F, 0F);
      Fin4c = new ModelRenderer(this, 0, 18);
      Fin4c.addBox(0F, 0F, 0F, 1, 4, 2);
      Fin4c.setRotationPoint(0F, 6F, 9F);
      Fin4c.setTextureSize(64, 128);
      Fin4c.mirror = true;
      setRotation(Fin4c, 0F, 0F, 0F);
      Fin5c = new ModelRenderer(this, 0, 18);
      Fin5c.addBox(0F, 0F, 0F, 1, 2, 1);
      Fin5c.setRotationPoint(-3F, 0F, 15F);
      Fin5c.setTextureSize(64, 128);
      Fin5c.mirror = true;
      setRotation(Fin5c, 0F, 0F, 0F);
      Fin4d = new ModelRenderer(this, 0, 18);
      Fin4d.addBox(0F, 0F, 0F, 1, 2, 1);
      Fin4d.setRotationPoint(-3F, 7F, 15F);
      Fin4d.setTextureSize(64, 128);
      Fin4d.mirror = true;
      setRotation(Fin4d, 0F, 0F, 0F);
      Fin6c = new ModelRenderer(this, 0, 18);
      Fin6c.addBox(0F, 0F, 0F, 1, 2, 3);
      Fin6c.setRotationPoint(-2F, 0F, 12F);
      Fin6c.setTextureSize(64, 128);
      Fin6c.mirror = true;
      setRotation(Fin6c, 0F, 0F, 0F);
      Fin6d = new ModelRenderer(this, 0, 18);
      Fin6d.addBox(0F, 0F, 0F, 1, 2, 3);
      Fin6d.setRotationPoint(-2F, 7F, 12F);
      Fin6d.setTextureSize(64, 128);
      Fin6d.mirror = true;
      setRotation(Fin6d, 0F, 0F, 0F);
      LightBall2d = new ModelRenderer(this, 19, 18);
      LightBall2d.addBox(0F, 0F, 0F, 4, 2, 2);
      LightBall2d.setRotationPoint(-6F, 7F, 23F);
      LightBall2d.setTextureSize(64, 128);
      LightBall2d.mirror = true;
      setRotation(LightBall2d, 0F, 0F, 0F);
      LightBall1d = new ModelRenderer(this, 19, 18);
      LightBall1d.addBox(0F, 0F, 0F, 2, 4, 2);
      LightBall1d.setRotationPoint(-5F, 6F, 23F);
      LightBall1d.setTextureSize(64, 128);
      LightBall1d.mirror = true;
      setRotation(LightBall1d, 0F, 0F, 0F);
      LightBall3d = new ModelRenderer(this, 19, 18);
      LightBall3d.addBox(0F, 0F, 0F, 2, 2, 4);
      LightBall3d.setRotationPoint(-5F, 7F, 22F);
      LightBall3d.setTextureSize(64, 128);
      LightBall3d.mirror = true;
      setRotation(LightBall3d, 0F, 0F, 0F);
      Side73 = new ModelRenderer(this, 0, 18);
      Side73.addBox(0F, 0F, 0F, 1, 13, 1);
      Side73.setRotationPoint(6F, -2F, 8F);
      Side73.setTextureSize(64, 128);
      Side73.mirror = true;
      setRotation(Side73, 0F, 0F, 0F);
      Fin1e = new ModelRenderer(this, 0, 18);
      Fin1e.addBox(0F, 0F, 0F, 2, 6, 3);
      Fin1e.setRotationPoint(6F, -2F, 9F);
      Fin1e.setTextureSize(64, 128);
      Fin1e.mirror = true;
      setRotation(Fin1e, 0F, 0F, 0F);
      Fin2e = new ModelRenderer(this, 0, 18);
      Fin2e.addBox(0F, 0F, 0F, 1, 4, 5);
      Fin2e.setRotationPoint(8F, -1F, 10F);
      Fin2e.setTextureSize(64, 128);
      Fin2e.mirror = true;
      setRotation(Fin2e, 0F, 0F, 0F);
      Fin3e = new ModelRenderer(this, 32, 55);
      Fin3e.addBox(0F, 0F, 0F, 1, 2, 11);
      Fin3e.setRotationPoint(9F, 0F, 11F);
      Fin3e.setTextureSize(64, 128);
      Fin3e.mirror = true;
      setRotation(Fin3e, 0F, 0F, 0F);
      LightBall3e = new ModelRenderer(this, 19, 18);
      LightBall3e.addBox(0F, 0F, 0F, 2, 2, 4);
      LightBall3e.setRotationPoint(9F, 0F, 22F);
      LightBall3e.setTextureSize(64, 128);
      LightBall3e.mirror = true;
      setRotation(LightBall3e, 0F, 0F, 0F);
      LightBall2e = new ModelRenderer(this, 19, 18);
      LightBall2e.addBox(0F, 0F, 0F, 4, 2, 2);
      LightBall2e.setRotationPoint(8F, 0F, 23F);
      LightBall2e.setTextureSize(64, 128);
      LightBall2e.mirror = true;
      setRotation(LightBall2e, 0F, 0F, 0F);
      LightBall1e = new ModelRenderer(this, 19, 18);
      LightBall1e.addBox(0F, 0F, 0F, 2, 4, 2);
      LightBall1e.setRotationPoint(9F, -1F, 23F);
      LightBall1e.setTextureSize(64, 128);
      LightBall1e.mirror = true;
      setRotation(LightBall1e, 0F, 0F, 0F);
      Fin6e = new ModelRenderer(this, 0, 18);
      Fin6e.addBox(0F, 0F, 0F, 1, 2, 3);
      Fin6e.setRotationPoint(7F, 0F, 12F);
      Fin6e.setTextureSize(64, 128);
      Fin6e.mirror = true;
      setRotation(Fin6e, 0F, 0F, 0F);
      Fin5e = new ModelRenderer(this, 0, 18);
      Fin5e.addBox(0F, 0F, 0F, 1, 2, 1);
      Fin5e.setRotationPoint(8F, 0F, 15F);
      Fin5e.setTextureSize(64, 128);
      Fin5e.mirror = true;
      setRotation(Fin5e, 0F, 0F, 0F);
      Fin1f = new ModelRenderer(this, 0, 18);
      Fin1f.addBox(0F, 0F, 0F, 2, 6, 3);
      Fin1f.setRotationPoint(6F, 5F, 9F);
      Fin1f.setTextureSize(64, 128);
      Fin1f.mirror = true;
      setRotation(Fin1f, 0F, 0F, 0F);
      Fin2f = new ModelRenderer(this, 0, 18);
      Fin2f.addBox(0F, 0F, 0F, 1, 4, 5);
      Fin2f.setRotationPoint(8F, 6F, 10F);
      Fin2f.setTextureSize(64, 128);
      Fin2f.mirror = true;
      setRotation(Fin2f, 0F, 0F, 0F);
      Fin3f = new ModelRenderer(this, 32, 55);
      Fin3f.addBox(0F, 0F, 0F, 1, 2, 11);
      Fin3f.setRotationPoint(9F, 7F, 11F);
      Fin3f.setTextureSize(64, 128);
      Fin3f.mirror = true;
      setRotation(Fin3f, 0F, 0F, 0F);
      Fin47 = new ModelRenderer(this, 0, 18);
      Fin47.addBox(0F, 0F, 0F, 1, 4, 2);
      Fin47.setRotationPoint(0F, -1F, 9F);
      Fin47.setTextureSize(64, 128);
      Fin47.mirror = true;
      setRotation(Fin47, 0F, 0F, 0F);
      Fin4e = new ModelRenderer(this, 0, 18);
      Fin4e.addBox(0F, 0F, 0F, 1, 4, 2);
      Fin4e.setRotationPoint(5F, -1F, 9F);
      Fin4e.setTextureSize(64, 128);
      Fin4e.mirror = true;
      setRotation(Fin4e, 0F, 0F, 0F);
      Fin4f = new ModelRenderer(this, 0, 18);
      Fin4f.addBox(0F, 0F, 0F, 1, 4, 2);
      Fin4f.setRotationPoint(5F, 6F, 9F);
      Fin4f.setTextureSize(64, 128);
      Fin4f.mirror = true;
      setRotation(Fin4f, 0F, 0F, 0F);
      Fin5f = new ModelRenderer(this, 0, 18);
      Fin5f.addBox(0F, 0F, 0F, 1, 2, 1);
      Fin5f.setRotationPoint(8F, 7F, 15F);
      Fin5f.setTextureSize(64, 128);
      Fin5f.mirror = true;
      setRotation(Fin5f, 0F, 0F, 0F);
      Fin6f = new ModelRenderer(this, 0, 18);
      Fin6f.addBox(0F, 0F, 0F, 1, 2, 3);
      Fin6f.setRotationPoint(7F, 7F, 12F);
      Fin6f.setTextureSize(64, 128);
      Fin6f.mirror = true;
      setRotation(Fin6f, 0F, 0F, 0F);
      LightBall3f = new ModelRenderer(this, 19, 18);
      LightBall3f.addBox(0F, 0F, 0F, 2, 2, 4);
      LightBall3f.setRotationPoint(9F, 7F, 22F);
      LightBall3f.setTextureSize(64, 128);
      LightBall3f.mirror = true;
      setRotation(LightBall3f, 0F, 0F, 0F);
      LightBall1f = new ModelRenderer(this, 19, 18);
      LightBall1f.addBox(0F, 0F, 0F, 2, 4, 2);
      LightBall1f.setRotationPoint(9F, 6F, 23F);
      LightBall1f.setTextureSize(64, 128);
      LightBall1f.mirror = true;
      setRotation(LightBall1f, 0F, 0F, 0F);
      LightBall2f = new ModelRenderer(this, 19, 18);
      LightBall2f.addBox(0F, 0F, 0F, 4, 2, 2);
      LightBall2f.setRotationPoint(8F, 7F, 23F);
      LightBall2f.setTextureSize(64, 128);
      LightBall2f.mirror = true;
      setRotation(LightBall2f, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Face.render(f5);
    Mouth1.render(f5);
    Mouth2.render(f5);
    Body.render(f5);
    Mouth3.render(f5);
    Side1.render(f5);
    Side2.render(f5);
    Side1a.render(f5);
    Side2b.render(f5);
    Side2a.render(f5);
    Side1b.render(f5);
    Fin1a.render(f5);
    Fin2a.render(f5);
    Fin3a.render(f5);
    Fin4a.render(f5);
    Fin5a.render(f5);
    Fin6a.render(f5);
    LightBall1a.render(f5);
    LightBall2a.render(f5);
    LightBall3a.render(f5);
    Fin1b.render(f5);
    Fin2b.render(f5);
    Fin3b.render(f5);
    Fin4b.render(f5);
    LightBall1b.render(f5);
    LightBall2b.render(f5);
    LightBall3b.render(f5);
    Fin5b.render(f5);
    Fin6b.render(f5);
    Fin1c.render(f5);
    Side3a.render(f5);
    Fin1d.render(f5);
    Fin2c.render(f5);
    Fin3c.render(f5);
    Fin2d.render(f5);
    Fin3d.render(f5);
    Belly.render(f5);
    LightBall3c.render(f5);
    LightBall2c.render(f5);
    LightBall1c.render(f5);
    Fin4c.render(f5);
    Fin5c.render(f5);
    Fin4d.render(f5);
    Fin6c.render(f5);
    Fin6d.render(f5);
    LightBall2d.render(f5);
    LightBall1d.render(f5);
    LightBall3d.render(f5);
    Side73.render(f5);
    Fin1e.render(f5);
    Fin2e.render(f5);
    Fin3e.render(f5);
    LightBall3e.render(f5);
    LightBall2e.render(f5);
    LightBall1e.render(f5);
    Fin6e.render(f5);
    Fin5e.render(f5);
    Fin1f.render(f5);
    Fin2f.render(f5);
    Fin3f.render(f5);
    Fin47.render(f5);
    Fin4e.render(f5);
    Fin4f.render(f5);
    Fin5f.render(f5);
    Fin6f.render(f5);
    LightBall3f.render(f5);
    LightBall1f.render(f5);
    LightBall2f.render(f5);
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
