package com.slugterra.main;

import com.slugterra.render.ItemRenderRegistry;
import com.slugterra.gui.GuiSlugBeltOverlay;
import com.slugterra.keys.KeyBindings;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		ItemRenderRegistry.registerItemRenderers(e);
		KeyBindings.initialiseBindings();
	}
	
	public void init(FMLInitializationEvent e) {
		super.init(e);
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
		MinecraftForge.EVENT_BUS.register(new GuiSlugBeltOverlay(Minecraft.getMinecraft()));
	}
	
//	public void registerRenderThings(){
//
//		//special item renderers
//		MinecraftForgeClient.registerItemRenderer(SlugterraItems.defenderBlaster, (IItemRenderer)new RenderBlaster());
//		MinecraftForgeClient.registerItemRenderer(SlugterraItems.slugtubeItem, (IItemRenderer)new SlugTubeRender());
//		MinecraftForgeClient.registerItemRenderer(SlugterraItems.shinaiblaster, (IItemRenderer)new RenderShinaiBlaster());
//		MinecraftForgeClient.registerItemRenderer(SlugterraItems.junjieBlaster, (IItemRenderer)new RenderJunjieBlaster());
//		MinecraftForgeClient.registerItemRenderer(SlugterraItems.primeBlasterFemale, (IItemRenderer)new RenderPrimeBlasterFemale());
//		MinecraftForgeClient.registerItemRenderer(SlugterraItems.primeBlasterMale, (IItemRenderer)new RenderPrimeBlasterMale());
//
//		//entity render
//		RenderingRegistry.registerEntityRenderingHandler(EntityInfernus.class, new RenderInfernus(new ModelInfernus(), 1));
//		RenderingRegistry.registerEntityRenderingHandler(EntityLariat.class, new RenderLariat(new ModelLariat(), 1));
//		RenderingRegistry.registerEntityRenderingHandler(EntityNegashade.class, new RenderNegashade(new ModelNegashade(), 1));
//		RenderingRegistry.registerEntityRenderingHandler(EntityJellyish.class, new RenderJellyish(new ModelJellyish(), 1));
//		RenderingRegistry.registerEntityRenderingHandler(EntityPhosphoro.class, new RenderPhosphoro(new ModelPhosphoro(), 1));
//		RenderingRegistry.registerEntityRenderingHandler(EntityMakoBreaker.class, new RenderMakoBreaker(new ModelMakoBreaker(), 1));
//		RenderingRegistry.registerEntityRenderingHandler(EntityFingerling.class, new RenderFingerling(new ModelFingerling(), 1));
//		RenderingRegistry.registerEntityRenderingHandler(EntityArmashelt.class, new RenderArmashelt(new ModelArmashelt(), 1));
//		RenderingRegistry.registerEntityRenderingHandler(EntityDirtUrchin.class, new RenderDirtUrchin(new ModelDirtUrchin(), 1));
//		RenderingRegistry.registerEntityRenderingHandler(EntityGrenuke.class, new RenderGrenuke(new ModelGrenuke(), 1));
//		RenderingRegistry.registerEntityRenderingHandler(EntityTazerling.class, new RenderTazerling(new ModelTazerling(), 1));
//		RenderingRegistry.registerEntityRenderingHandler(EntityHexlet.class, new RenderHexlet(new ModelHexlet(), 1));
//		RenderingRegistry.registerEntityRenderingHandler(EntityFlaringo.class, new RenderFlaringo(new ModelFlaringo(), 1));
//		RenderingRegistry.registerEntityRenderingHandler(EntityBoonDoc.class, new RenderBoonDoc(new ModelBoonDoc(), 1));
//		RenderingRegistry.registerEntityRenderingHandler(EntitySlickSilver.class, new RenderSlickSilver(new ModelSlickSilver(), 1));
//		RenderingRegistry.registerEntityRenderingHandler(EntityEnigmo.class, new RenderEnigmo(new ModelEnigmo(), 1));
//		RenderingRegistry.registerEntityRenderingHandler(EntityRamstone.class, new RenderRamstone(new ModelRamstone(), 1));
//
//		//velocity render
//		RenderingRegistry.registerEntityRenderingHandler(EntityInfernusVel.class, new RenderInfernusVel(VelocitySlugItem.infernusVel));
//		RenderingRegistry.registerEntityRenderingHandler(EntityPhosphoroVel.class, new RenderPhosphoroVel(VelocitySlugItem.phosphoroVel));
//		RenderingRegistry.registerEntityRenderingHandler(EntityLariatVel.class, new RenderLariatVel(VelocitySlugItem.lariatVel));
//		RenderingRegistry.registerEntityRenderingHandler(EntityMakoBreakerVel.class, new RenderMakoBreakerVel(VelocitySlugItem.makobreakerVel));
//		RenderingRegistry.registerEntityRenderingHandler(EntityArmasheltVel.class, new RenderArmasheltVel(VelocitySlugItem.armasheltVel));
//		RenderingRegistry.registerEntityRenderingHandler(EntityRamstoneVel.class, new RenderRamstoneVel(VelocitySlugItem.ramstoneVel));
//		RenderingRegistry.registerEntityRenderingHandler(EntityTazerlingVel.class, new RenderTazerlingVel(VelocitySlugItem.tazerlingVel));
//		RenderingRegistry.registerEntityRenderingHandler(EntityGrenukeVel.class, new RenderGrenukeVel(VelocitySlugItem.grenukeVel));
//
//		//TileEntity render
//		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDropEntity.class, new TileEntityDropRenderer());
//		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySlugContainerEntity.class, new TileEntitySlugContainerRenderer());
//		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySlimeRopeEntity.class, new TileEntitySlimeRopeRenderer());
//
//		//slinger render
//		RenderingRegistry.registerEntityRenderingHandler(EnemySlinger.class, new RenderEnemySlinger(new ModelBiped(), 0));
//
//		//misc entity render
//		RenderingRegistry.registerEntityRenderingHandler(EntityMecha.class, new RenderMecha_Wolf(new ModelMecha(), 2));
//	}
//
//	@Override
//	public void generateBlasterPuff(Entity entity){
//		double motionx = entity.world.rand.nextGaussian()*0.2D;
//		double motiony = entity.world.rand.nextGaussian()*0.2D;
//		double motionz = entity.world.rand.nextGaussian()*0.2D;
//		for (int i = 0;i < 5;i++){
//			entity.world.spawnParticle("bubble", entity.posX, entity.posY, entity.posZ, motionx, motiony, motionz);
//		}
//	}
}
