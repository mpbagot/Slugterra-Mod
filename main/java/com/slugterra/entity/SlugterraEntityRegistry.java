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
import com.slugterra.entity.protoform.EntitySlickSilver;
import com.slugterra.entity.protoform.EntityTazerling;
import com.slugterra.entity.velocity.EntityArmasheltVel;
import com.slugterra.entity.velocity.EntityInfernusVel;
import com.slugterra.entity.velocity.EntityLariatVel;
import com.slugterra.entity.velocity.EntityMakoBreakerVel;
import com.slugterra.entity.velocity.EntityPhosphoroVel;
import com.slugterra.main.MainRegistry;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;

public class SlugterraEntityRegistry {
	
	public static void mainRegistry(){
		registerEntity();
	}
	
	public static void registerEntity(){
		//create the parent class as uncreatable entity
		//createVelocityEntity(EntitySlug.class, "DefaultSlug");
		createEntity(EntityInfernus.class, "InfernusSlug", 0xFF962E, 0xFF0000);
		createEntity(EntityLariat.class, "LariatSlug", 0x73B806, 0x00687D);
		createEntity(EntityJellyish.class, "JellyishSlug", 0xB2BF48, 0x33819C);
		createEntity(EntityNegashade.class, "NegashadeSlug", 0x0C161E, 0x1293B9);
		createEntity(EntityPhosphoro.class, "PhosphoroSlug", 0x8BE4E4, 0x1A4190);
		createEntity(EntityMakoBreaker.class, "MakoBreakerSlug", 0xBCAB83, 0x8A211E);
		createEntity(EntityFingerling.class, "FingerlingSlug", 0xC0693E, 0xC0A851);
		createEntity(EntityArmashelt.class, "ArmasheltSlug", 0x00FFFF, 0xFFA407);
		createEntity(EntityDirtUrchin.class, "DirtUrchinSlug",0x7d7c45, 0xe1ceb3);
		createEntity(EntityGrenuke.class, "GrenukeSlug", 0xb2b238, 0x333300);
		createEntity(EntityTazerling.class, "TazerlingSlug", 0x0b65f7, 0xe9b641);
		createEntity(EntityFlaringo.class, "FlaringoSlug", 0xe47b16, 0xdddcdb);
		createEntity(EntityHexlet.class, "HexletSlug", 0xe47b16, 0xd9ae97);
		createEntity(EntityBoonDoc.class, "BoonDocSlug", 0x179b66, 0xb9e1aa);
		createEntity(EntitySlickSilver.class, "SlickSilverSlug", 0x9dc0d8, 0x1d3b6b);
		createEntity(EntityEnigmo.class, "EnigmoSlug", 0x0094ff, 0xFFFFFF);
		
		//misc entity's
		createEntity(EntityMecha_Wolf.class, "WolfMecha", 0xD4D5C9, 0xF44C12);
		
		//velocity slugs
		createVelocityEntity(EntityInfernusVel.class, "VelocityInfernus");
		createVelocityEntity(EntityLariatVel.class, "VelocityLariat");
		createVelocityEntity(EntityMakoBreakerVel.class, "VelocityMakoBreaker");
		createVelocityEntity(EntityPhosphoroVel.class, "VelocityPhosphoro");
		createVelocityEntity(EntityArmasheltVel.class, "VelocityArmashelt");
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColour, int spotColour){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, MainRegistry.modInstance, 32, 1, true);
		createEgg(randomId, solidColour, spotColour);
	}

	private static void createEgg(int randomId, int solidColour, int spotColour) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColour, spotColour));
	}
	public static void createVelocityEntity(Class entityClass, String entityName){
		int randomId2 = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId2);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId2, MainRegistry.modInstance, 32, 1, true);
	}
}
