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
import com.slugterra.entity.slingers.AllySlinger;
import com.slugterra.entity.slingers.EnemySlinger;
import com.slugterra.entity.velocity.EntityArmasheltVel;
import com.slugterra.entity.velocity.EntityGrenukeVel;
import com.slugterra.entity.velocity.EntityInfernusVel;
import com.slugterra.entity.velocity.EntityLariatVel;
import com.slugterra.entity.velocity.EntityMakoBreakerVel;
import com.slugterra.entity.velocity.EntityPhosphoroVel;
import com.slugterra.entity.velocity.EntityRamstoneVel;
import com.slugterra.entity.velocity.EntityTazerlingVel;
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
import com.slugterra.model.velocity.ModelArmasheltVel;
import com.slugterra.model.velocity.ModelGrenukeVel;
import com.slugterra.model.velocity.ModelInfernusVel;
import com.slugterra.model.velocity.ModelLariatVel;
import com.slugterra.model.velocity.ModelMakoBreakerVel;
import com.slugterra.model.velocity.ModelPhosphoroVel;
import com.slugterra.model.velocity.ModelRamstoneVel;
import com.slugterra.model.velocity.ModelTazerlingVel;
import com.slugterra.render.BlockRenderRegistry;
import com.slugterra.render.ItemRenderRegistry;
import com.slugterra.render.factory.MechaRenderFactory;
import com.slugterra.render.factory.SlingerRenderFactory;
import com.slugterra.render.factory.SlugRenderFactory;
import com.slugterra.render.factory.SlugVelRenderFactory;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	
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
		RenderingRegistry.registerEntityRenderingHandler(EntityInfernusVel.class,
				new SlugVelRenderFactory(new ModelInfernusVel(), new ModelInfernus(), "infernus"));
		RenderingRegistry.registerEntityRenderingHandler(EntityPhosphoroVel.class,
				new SlugVelRenderFactory(new ModelPhosphoroVel(), new ModelPhosphoro(), "phosphoro"));
		RenderingRegistry.registerEntityRenderingHandler(EntityLariatVel.class,
				new SlugVelRenderFactory(new ModelLariatVel(), new ModelLariat(), "lariat"));
		RenderingRegistry.registerEntityRenderingHandler(EntityMakoBreakerVel.class,
				new SlugVelRenderFactory(new ModelMakoBreakerVel(), new ModelMakoBreaker(), "makobreaker"));
		RenderingRegistry.registerEntityRenderingHandler(EntityArmasheltVel.class,
				new SlugVelRenderFactory(new ModelArmasheltVel(), new ModelArmashelt(), "armashelt"));
		RenderingRegistry.registerEntityRenderingHandler(EntityRamstoneVel.class,
				new SlugVelRenderFactory(new ModelRamstoneVel(), new ModelRamstone(), "ramstone"));
		RenderingRegistry.registerEntityRenderingHandler(EntityTazerlingVel.class,
				new SlugVelRenderFactory(new ModelTazerlingVel(), new ModelTazerling(), "tazerling"));
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenukeVel.class,
				new SlugVelRenderFactory(new ModelGrenukeVel(), new ModelGrenuke(), "grenuke"));

		//slinger render
		RenderingRegistry.registerEntityRenderingHandler(EnemySlinger.class,
				new SlingerRenderFactory(0));
		RenderingRegistry.registerEntityRenderingHandler(AllySlinger.class,
				new SlingerRenderFactory(1));

		//misc entity render
		RenderingRegistry.registerEntityRenderingHandler(EntityMecha.class, new MechaRenderFactory(new ModelMecha(), "wolf", 1.2f));
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
		return new ModelSlingerArmour();
	}
}
