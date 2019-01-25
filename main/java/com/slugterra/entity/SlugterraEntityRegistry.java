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
	
	public static void registerEntities() {
		createEntityWithEgg(EntityInfernus.class, "infernus_slug", 0xFF962E, 0xFF0000);
		createEntityWithEgg(EntityLariat.class, "lariat_slug", 0x73B806, 0x00687D);
		createEntityWithEgg(EntityJellyish.class, "jellyish_slug", 0xB2BF48, 0x33819C);
		createEntityWithEgg(EntityNegashade.class, "negashade_slug", 0x0C161E, 0x1293B9);
		createEntityWithEgg(EntityPhosphoro.class, "phosphoro_slug", 0x8BE4E4, 0x1A4190);
		createEntityWithEgg(EntityMakoBreaker.class, "mako_breaker_slug", 0xBCAB83, 0x8A211E);
		createEntityWithEgg(EntityFingerling.class, "fingerling_slug", 0xC0693E, 0xC0A851);
		createEntityWithEgg(EntityArmashelt.class, "armashelt_slug", 0x00FFFF, 0xFFA407);
		createEntityWithEgg(EntityDirtUrchin.class, "dirt_urchin_slug", 0x7d7c45, 0xe1ceb3);
		createEntityWithEgg(EntityGrenuke.class, "grenuke_slug", 0xb2b238, 0x333300);
		createEntityWithEgg(EntityTazerling.class, "tazerling_slug", 0x0b65f7, 0xe9b641);
		createEntityWithEgg(EntityFlaringo.class, "flaringo_slug", 0xe47b16, 0xdddcdb);
		createEntityWithEgg(EntityHexlet.class, "hexlet_slug", 0xe47b16, 0xd9ae97);
		createEntityWithEgg(EntityBoonDoc.class, "boon_doc_slug", 0x179b66, 0xb9e1aa);
		createEntityWithEgg(EntitySlickSilver.class, "slick_silver_slug", 0x9dc0d8, 0x1d3b6b);
		createEntityWithEgg(EntityEnigmo.class, "enigmo_slug", 0x0094ff, 0xFFFFFF);
		createEntityWithEgg(EntityRamstone.class, "ramstone_slug", 0x800000, 0x00a2e8);

		// misc entity's
		createEntityWithEgg(EntityMecha.class, "wolf_mecha", 0xD4D5C9, 0xF44C12);
		createEntity(EntityLightBall.class, "light_ball_entity");

		// velocity slugs
		createEntity(EntityInfernusVel.class, "velocity_infernus");
		createEntity(EntityLariatVel.class, "velocity_lariat");
		createEntity(EntityMakoBreakerVel.class, "velocity_makoBreaker");
		createEntity(EntityPhosphoroVel.class, "velocity_phosphoro");
		createEntity(EntityArmasheltVel.class, "velocity_armashelt");
		createEntity(EntityRamstoneVel.class, "velocity_ramstone");
		createEntity(EntityTazerlingVel.class, "velocity_tazerling");
		createEntity(EntityGrenukeVel.class, "velocity_grenuke");
	}

	public static void createEntityWithEgg(Class<? extends Entity> entityClass, String entityName, int solidColour, int spotColour) {
		ResourceLocation registryName = createEntity(entityClass, entityName);

		EntityRegistry.registerEgg(registryName, solidColour, spotColour);
	}

	public static ResourceLocation createEntity(Class<? extends Entity> entityClass, String entityName){
		ResourceLocation registryName = new ResourceLocation(Strings.MODID, entityName);

		EntityRegistry.registerModEntity(registryName, entityClass, entityName, entityID++, MainRegistry.modInstance, 32, 1, true);
		return registryName;
	}
}
