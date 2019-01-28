package com.slugterra.main;

import com.slugterra.entity.EntityMecha;
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
import com.slugterra.entity.protoform.EntityRamstone;
import com.slugterra.entity.protoform.EntitySlickSilver;
import com.slugterra.entity.protoform.EntityTazerling;
import com.slugterra.gui.GuiSlugBeltOverlay;
import com.slugterra.keys.KeyBindings;
import com.slugterra.model.ModelMecha;
import com.slugterra.model.protoform.ModelArmashelt;
import com.slugterra.model.protoform.ModelBoonDoc;
import com.slugterra.model.protoform.ModelDirtUrchin;
import com.slugterra.model.protoform.ModelEnigmo;
import com.slugterra.model.protoform.ModelFingerling;
import com.slugterra.model.protoform.ModelFlaringo;
import com.slugterra.model.protoform.ModelGrenuke;
import com.slugterra.model.protoform.ModelHexlet;
import com.slugterra.model.protoform.ModelInfernus;
import com.slugterra.model.protoform.ModelJellyish;
import com.slugterra.model.protoform.ModelLariat;
import com.slugterra.model.protoform.ModelMakoBreaker;
import com.slugterra.model.protoform.ModelNegashade;
import com.slugterra.model.protoform.ModelPhosphoro;
import com.slugterra.model.protoform.ModelRamstone;
import com.slugterra.model.protoform.ModelSlickSilver;
import com.slugterra.model.protoform.ModelTazerling;
import com.slugterra.model.slingers.ModelSlingerArmour;
import com.slugterra.render.BlockRenderRegistry;
import com.slugterra.render.ItemRenderRegistry;
import com.slugterra.render.MechaRenderFactory;
import com.slugterra.render.SlugRenderFactory;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	private static final ModelSlingerArmour slingerBelt = new ModelSlingerArmour();
	
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		KeyBindings.initialiseBindings();
	}
	
	public void init(FMLInitializationEvent e) {
		super.init(e);
		ItemRenderRegistry.registerItemRenderers(e);
		BlockRenderRegistry.registerBlockRenderers();
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
		MinecraftForge.EVENT_BUS.register(new GuiSlugBeltOverlay(Minecraft.getMinecraft()));
	}
	
	@Override
	public void registerRenderThings(){
//
//		//special item renderers
//		MinecraftForgeClient.registerItemRenderer(SlugterraItems.slugtubeItem, (IItemRenderer)new SlugTubeRender());
//		MinecraftForgeClient.registerItemRenderer(SlugterraItems.primeBlasterFemale, (IItemRenderer)new RenderPrimeBlasterFemale());
//		MinecraftForgeClient.registerItemRenderer(SlugterraItems.primeBlasterMale, (IItemRenderer)new RenderPrimeBlasterMale());

		//entity render
		RenderingRegistry.registerEntityRenderingHandler(EntityInfernus.class, new SlugRenderFactory(new ModelInfernus(), "infernus"));
		RenderingRegistry.registerEntityRenderingHandler(EntityLariat.class, new SlugRenderFactory(new ModelLariat(), "lariat"));
		RenderingRegistry.registerEntityRenderingHandler(EntityNegashade.class, new SlugRenderFactory(new ModelNegashade(), "negashade"));
		RenderingRegistry.registerEntityRenderingHandler(EntityJellyish.class, new SlugRenderFactory(new ModelJellyish(), "jellyish"));
		RenderingRegistry.registerEntityRenderingHandler(EntityPhosphoro.class, new SlugRenderFactory(new ModelPhosphoro(), "phosphoro"));
		RenderingRegistry.registerEntityRenderingHandler(EntityMakoBreaker.class, new SlugRenderFactory(new ModelMakoBreaker(), "makobreaker"));
		RenderingRegistry.registerEntityRenderingHandler(EntityFingerling.class, new SlugRenderFactory(new ModelFingerling(), "fingerling"));
		RenderingRegistry.registerEntityRenderingHandler(EntityArmashelt.class, new SlugRenderFactory(new ModelArmashelt(), "armashelt"));
		RenderingRegistry.registerEntityRenderingHandler(EntityDirtUrchin.class, new SlugRenderFactory(new ModelDirtUrchin(), "dirturchin"));
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenuke.class, new SlugRenderFactory(new ModelGrenuke(), "grenuke"));
		RenderingRegistry.registerEntityRenderingHandler(EntityTazerling.class, new SlugRenderFactory(new ModelTazerling(), "tazerling"));
		RenderingRegistry.registerEntityRenderingHandler(EntityHexlet.class, new SlugRenderFactory(new ModelHexlet(), "hexlet"));
		RenderingRegistry.registerEntityRenderingHandler(EntityFlaringo.class, new SlugRenderFactory(new ModelFlaringo(), "flaringo"));
		RenderingRegistry.registerEntityRenderingHandler(EntityBoonDoc.class, new SlugRenderFactory(new ModelBoonDoc(), "boondoc"));
		RenderingRegistry.registerEntityRenderingHandler(EntitySlickSilver.class, new SlugRenderFactory(new ModelSlickSilver(), "slicksilver"));
		RenderingRegistry.registerEntityRenderingHandler(EntityEnigmo.class, new SlugRenderFactory(new ModelEnigmo(), "enigmo"));
		RenderingRegistry.registerEntityRenderingHandler(EntityRamstone.class, new SlugRenderFactory(new ModelRamstone(), "ramstone"));

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
//		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySlugContainerEntity.class, new TileEntitySlugContainerRenderer());
//		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySlimeRopeEntity.class, new TileEntitySlimeRopeRenderer());
//
//		//slinger render
//		RenderingRegistry.registerEntityRenderingHandler(EnemySlinger.class, new RenderEnemySlinger(new ModelBiped(), 0));
//
//		//misc entity render
		RenderingRegistry.registerEntityRenderingHandler(EntityMecha.class, new MechaRenderFactory(new ModelMecha(), "wolf", 2));
	}

//	@Override
//	public void generateBlasterPuff(Entity entity){
//		double motionx = entity.world.rand.nextGaussian()*0.2D;
//		double motiony = entity.world.rand.nextGaussian()*0.2D;
//		double motionz = entity.world.rand.nextGaussian()*0.2D;
//		for (int i = 0;i < 5;i++){
//			entity.world.spawnParticle("bubble", entity.posX, entity.posY, entity.posZ, motionx, motiony, motionz);
//		}
//	}
	
	public static ModelBiped getArmorModel() {
		return slingerBelt;
	}
}
