package com.slugterra.entity.slingers;

import com.slugterra.main.MainRegistry;

import net.minecraft.entity.EntityList;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntitySlingers {
	
	public static void mainRegistry(){
		registerSlingers();
	}
	
	/**
	 * Registration for new Slingers.
	 */
	public static void registerSlingers(){
			createEntity(AllySlinger.class, "AllySlinger", 0xD85C1E, 0x4BAED7);
			createEntity(EnemySlinger.class, "EnemySlinger", 0x191313, 0xD6141A);
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

}

