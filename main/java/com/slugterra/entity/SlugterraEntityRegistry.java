package com.slugterra.entity;

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
import com.slugterra.entity.velocity.EntityArmasheltVel;
import com.slugterra.entity.velocity.EntityGrenukeVel;
import com.slugterra.entity.velocity.EntityInfernusVel;
import com.slugterra.entity.velocity.EntityLariatVel;
import com.slugterra.entity.velocity.EntityMakoBreakerVel;
import com.slugterra.entity.velocity.EntityPhosphoroVel;
import com.slugterra.entity.velocity.EntityRamstoneVel;
import com.slugterra.entity.velocity.EntityTazerlingVel;
import com.slugterra.lib.Strings;
import com.slugterra.main.MainRegistry;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class SlugterraEntityRegistry {

	public static int entityID = 0;
	
	public static void mainRegistry() {
		registerEntity();
	}

	public static void registerEntity() {
		createEntity(EntityInfernus.class, "infernus_slug", 0xFF962E, 0xFF0000);
		createEntity(EntityLariat.class, "lariat_slug", 0x73B806, 0x00687D);
		createEntity(EntityJellyish.class, "jellyish_slug", 0xB2BF48, 0x33819C);
		createEntity(EntityNegashade.class, "negashade_slug", 0x0C161E, 0x1293B9);
		createEntity(EntityPhosphoro.class, "phosphoro_slug", 0x8BE4E4, 0x1A4190);
		createEntity(EntityMakoBreaker.class, "mako_breaker_slug", 0xBCAB83, 0x8A211E);
		createEntity(EntityFingerling.class, "fingerling_slug", 0xC0693E, 0xC0A851);
		createEntity(EntityArmashelt.class, "armashelt_slug", 0x00FFFF, 0xFFA407);
		createEntity(EntityDirtUrchin.class, "dirt_urchin_slug", 0x7d7c45, 0xe1ceb3);
		createEntity(EntityGrenuke.class, "grenuke_slug", 0xb2b238, 0x333300);
		createEntity(EntityTazerling.class, "tazerling_slug", 0x0b65f7, 0xe9b641);
		createEntity(EntityFlaringo.class, "flaringo_slug", 0xe47b16, 0xdddcdb);
		createEntity(EntityHexlet.class, "hexlet_slug", 0xe47b16, 0xd9ae97);
		createEntity(EntityBoonDoc.class, "boon_doc_slug", 0x179b66, 0xb9e1aa);
		createEntity(EntitySlickSilver.class, "slick_silver_slug", 0x9dc0d8, 0x1d3b6b);
		createEntity(EntityEnigmo.class, "enigmo_slug", 0x0094ff, 0xFFFFFF);
		createEntity(EntityRamstone.class, "ramstone_slug", 0x800000, 0x00a2e8);

		// misc entity's
		createEntity(EntityMecha.class, "wolf_mecha", 0xD4D5C9, 0xF44C12);
		createVelocityEntity(EntityLightBall.class, "light_ball_entity");

		// velocity slugs
		createVelocityEntity(EntityInfernusVel.class, "velocity_infernus");
		createVelocityEntity(EntityLariatVel.class, "velocity_lariat");
		createVelocityEntity(EntityMakoBreakerVel.class, "velocity_makoBreaker");
		createVelocityEntity(EntityPhosphoroVel.class, "velocity_phosphoro");
		createVelocityEntity(EntityArmasheltVel.class, "velocity_armashelt");
		createVelocityEntity(EntityRamstoneVel.class, "velocity_ramstone");
		createVelocityEntity(EntityTazerlingVel.class, "velocity_tazerling");
		createVelocityEntity(EntityGrenukeVel.class, "velocity_grenuke");
	}

	public static void createEntity(Class<? extends Entity> entityClass, String entityName, int solidColour, int spotColour) {
		ResourceLocation registryName = createVelocityEntity(entityClass, entityName);

		EntityRegistry.registerEgg(registryName, solidColour, spotColour);
	}

	public static ResourceLocation createVelocityEntity(Class<? extends Entity> entityClass, String entityName){
		ResourceLocation registryName = new ResourceLocation(Strings.MODID, entityName);

		EntityRegistry.registerModEntity(registryName, entityClass, entityName, entityID++, MainRegistry.modInstance, 32, 1, true);
		return registryName;
	}
}
