package com.slugterra.main;

import com.slugterra.block.TileEntityDropEntity;
import com.slugterra.block.TileEntitySlugContainerEntity;
import com.slugterra.entity.EntityMecha_Wolf;
import com.slugterra.entity.protoform.EntityArmashelt;
import com.slugterra.entity.protoform.EntityBoonDoc;
import com.slugterra.entity.protoform.EntityDirtUrchin;
import com.slugterra.entity.protoform.EntityEnigmo;
import com.slugterra.entity.protoform.EntityFingerling;
import com.slugterra.entity.protoform.EntityFlaringo;
import com.slugterra.entity.protoform.EntityGrenuke;
import com.slugterra.entity.protoform.EntityHexlet;
import com.slugterra.entity.protoform.EntityInfernus;
import com.slugterra.entity.protoform.EntityJellyish;
import com.slugterra.entity.protoform.EntityLariat;
import com.slugterra.entity.protoform.EntityMakoBreaker;
import com.slugterra.entity.protoform.EntityNegashade;
import com.slugterra.entity.protoform.EntityPhosphoro;
import com.slugterra.entity.protoform.EntitySlickSilver;
import com.slugterra.entity.protoform.EntityTazerling;
import com.slugterra.entity.slingers.EnemySlinger;
import com.slugterra.entity.velocity.EntityArmasheltVel;
import com.slugterra.entity.velocity.EntityInfernusVel;
import com.slugterra.entity.velocity.EntityLariatVel;
import com.slugterra.entity.velocity.EntityMakoBreakerVel;
import com.slugterra.entity.velocity.EntityPhosphoroVel;
import com.slugterra.item.SlugterraItems;
import com.slugterra.item.VelocitySlugItem;
import com.slugterra.keys.KeyBindings;
import com.slugterra.model.ModelArmashelt;
import com.slugterra.model.ModelBoonDoc;
import com.slugterra.model.ModelDirtUrchin;
import com.slugterra.model.ModelEnigmo;
import com.slugterra.model.ModelFingerling;
import com.slugterra.model.ModelFlaringo;
import com.slugterra.model.ModelGrenuke;
import com.slugterra.model.ModelHexlet;
import com.slugterra.model.ModelInfernus;
import com.slugterra.model.ModelJellyish;
import com.slugterra.model.ModelLariat;
import com.slugterra.model.ModelMakoBreaker;
import com.slugterra.model.ModelMecha;
import com.slugterra.model.ModelNegashade;
import com.slugterra.model.ModelPhosphoro;
import com.slugterra.model.ModelSlickSilver;
import com.slugterra.model.ModelTazerling;
import com.slugterra.render.RenderMecha_Wolf;
import com.slugterra.render.SlugTubeRender;
import com.slugterra.render.TileEntityDropRenderer;
import com.slugterra.render.TileEntitySlugContainerRenderer;
import com.slugterra.render.blasters.RenderBlaster;
import com.slugterra.render.blasters.RenderJunjieBlaster;
import com.slugterra.render.blasters.RenderPrimeBlasterFemale;
import com.slugterra.render.blasters.RenderPrimeBlasterMale;
import com.slugterra.render.blasters.RenderShinaiBlaster;
import com.slugterra.render.protoform.RenderArmashelt;
import com.slugterra.render.protoform.RenderBoonDoc;
import com.slugterra.render.protoform.RenderDirtUrchin;
import com.slugterra.render.protoform.RenderEnigmo;
import com.slugterra.render.protoform.RenderFingerling;
import com.slugterra.render.protoform.RenderFlaringo;
import com.slugterra.render.protoform.RenderGrenuke;
import com.slugterra.render.protoform.RenderHexlet;
import com.slugterra.render.protoform.RenderInfernus;
import com.slugterra.render.protoform.RenderJellyish;
import com.slugterra.render.protoform.RenderLariat;
import com.slugterra.render.protoform.RenderMakoBreaker;
import com.slugterra.render.protoform.RenderNegashade;
import com.slugterra.render.protoform.RenderPhosphoro;
import com.slugterra.render.protoform.RenderSlickSilver;
import com.slugterra.render.protoform.RenderTazerling;
import com.slugterra.render.slingers.RenderEnemySlinger;
import com.slugterra.render.velocity.RenderArmasheltVel;
import com.slugterra.render.velocity.RenderInfernusVel;
import com.slugterra.render.velocity.RenderLariatVel;
import com.slugterra.render.velocity.RenderMakoBreakerVel;
import com.slugterra.render.velocity.RenderPhosphoroVel;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends ServerProxy{

	public void registerRenderThings(){
		
		//special item renderers
		MinecraftForgeClient.registerItemRenderer(SlugterraItems.defenderBlaster, (IItemRenderer)new RenderBlaster());
		MinecraftForgeClient.registerItemRenderer(SlugterraItems.slugtubeItem, (IItemRenderer)new SlugTubeRender());
		MinecraftForgeClient.registerItemRenderer(SlugterraItems.shinaiblaster, (IItemRenderer)new RenderShinaiBlaster());
		MinecraftForgeClient.registerItemRenderer(SlugterraItems.junjieBlaster, (IItemRenderer)new RenderJunjieBlaster());
		MinecraftForgeClient.registerItemRenderer(SlugterraItems.primeBlasterFemale, (IItemRenderer)new RenderPrimeBlasterFemale());
		MinecraftForgeClient.registerItemRenderer(SlugterraItems.primeBlasterMale, (IItemRenderer)new RenderPrimeBlasterMale());
		
		//entity render
		RenderingRegistry.registerEntityRenderingHandler(EntityInfernus.class, new RenderInfernus(new ModelInfernus(), 1));
		RenderingRegistry.registerEntityRenderingHandler(EntityLariat.class, new RenderLariat(new ModelLariat(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityNegashade.class, new RenderNegashade(new ModelNegashade(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityJellyish.class, new RenderJellyish(new ModelJellyish(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPhosphoro.class, new RenderPhosphoro(new ModelPhosphoro(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityMakoBreaker.class, new RenderMakoBreaker(new ModelMakoBreaker(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityFingerling.class, new RenderFingerling(new ModelFingerling(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityArmashelt.class, new RenderArmashelt(new ModelArmashelt(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityDirtUrchin.class, new RenderDirtUrchin(new ModelDirtUrchin(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenuke.class, new RenderGrenuke(new ModelGrenuke(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTazerling.class, new RenderTazerling(new ModelTazerling(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityHexlet.class, new RenderHexlet(new ModelHexlet(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityFlaringo.class, new RenderFlaringo(new ModelFlaringo(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityBoonDoc.class, new RenderBoonDoc(new ModelBoonDoc(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntitySlickSilver.class, new RenderSlickSilver(new ModelSlickSilver(), 1));
		RenderingRegistry.registerEntityRenderingHandler(EntityEnigmo.class, new RenderEnigmo(new ModelEnigmo(), 0));
		
		//velocity render
		RenderingRegistry.registerEntityRenderingHandler(EntityInfernusVel.class, new RenderInfernusVel(VelocitySlugItem.infernusVel));
		RenderingRegistry.registerEntityRenderingHandler(EntityPhosphoroVel.class, new RenderPhosphoroVel(VelocitySlugItem.phosphoroVel));
		RenderingRegistry.registerEntityRenderingHandler(EntityLariatVel.class, new RenderLariatVel(VelocitySlugItem.lariatVel));
		RenderingRegistry.registerEntityRenderingHandler(EntityMakoBreakerVel.class, new RenderMakoBreakerVel(VelocitySlugItem.makobreakerVel));
		RenderingRegistry.registerEntityRenderingHandler(EntityArmasheltVel.class, new RenderArmasheltVel(VelocitySlugItem.armasheltVel));
		
		//keybinding initialisation
		KeyBindings.init();
		
		//TileEntity render
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDropEntity.class, new TileEntityDropRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySlugContainerEntity.class, new TileEntitySlugContainerRenderer());
		
		//slinger render
		RenderingRegistry.registerEntityRenderingHandler(EnemySlinger.class, new RenderEnemySlinger(new ModelBiped(), 0));

		//misc entity render
		RenderingRegistry.registerEntityRenderingHandler(EntityMecha_Wolf.class, new RenderMecha_Wolf(new ModelMecha(), 2));
	}
	
	@Override
	public void generateBlasterPuff(Entity entity){
		double motionx = entity.worldObj.rand.nextGaussian()*0.2D;
		double motiony = entity.worldObj.rand.nextGaussian()*0.2D;
		double motionz = entity.worldObj.rand.nextGaussian()*0.2D;
		for (int i = 0;i < 5;i++){
			entity.worldObj.spawnParticle("bubble", entity.posX, entity.posY, entity.posZ, motionx, motiony, motionz);
		}
	}
	@Override
	public void spawnElementalParticles(World world, EntityFX particle){
		for (int i = 0; i < 5; i++){
			double motionx = world.rand.nextGaussian()*0.2D;
			double motiony = world.rand.nextGaussian()*0.2D;
			double motionz = world.rand.nextGaussian()*0.2D;
	    	particle.setLocationAndAngles(particle.posX, particle.posY, particle.posZ, 0.0F, 0.0F);
	    	world.spawnEntityInWorld(particle);
		}
	}

}
