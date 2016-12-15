package com.slugterra.entity.slingers;

import net.minecraft.entity.EntityList;
import mca.api.registries.VillagerRegistryMCA;

import com.slugterra.lib.Strings;
import com.slugterra.main.MainRegistry;

import cpw.mods.fml.common.registry.EntityRegistry;

public class EntitySlingers {
	
	public static void mainRegistry(){
		registerSlingers();
	}
	
	/**
	 * Registration for new Slingers.
	 */
	public static void registerSlingers(){
		
		if (MainRegistry.mcainstalled) {
			
			VillagerRegistryMCA.registerVillagerType(8, "Slinger", "/assets/slugterramod/textures/entity/slingers/allies/", Strings.MODID);
			VillagerRegistryMCA.registerVillagerType(9, "Slinger", "/assets/slugterramod/textures/entity/slingers/enemies/", Strings.MODID);
			
		}
		
		else
		{
			createEntity(AllySlinger.class, "AllySlinger", 0xD85C1E, 0x4BAED7);
			createEntity(EnemySlinger.class, "EnemySlinger", 0x191313, 0xD6141A);
		}
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

