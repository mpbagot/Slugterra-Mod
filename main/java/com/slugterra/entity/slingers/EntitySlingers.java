package com.slugterra.entity.slingers;

import com.slugterra.entity.SlugterraEntityRegistry;
import com.slugterra.lib.Strings;
import com.slugterra.main.MainRegistry;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntitySlingers {
	
	public static void mainRegistry(){
		registerSlingers();
	}
	
	/**
	 * Registration for new Slingers.
	 */
	public static void registerSlingers(){
			createEntity(AllySlinger.class, "ally_slinger", 0xD85C1E, 0x4BAED7);
			createEntity(EnemySlinger.class, "enemy_slinger", 0x191313, 0xD6141A);
	}
	
	public static void createEntity(Class<? extends Entity> entityClass, String entityName, int solidColour, int spotColour) {
		ResourceLocation registryName = new ResourceLocation(Strings.MODID, entityName);

		EntityRegistry.registerModEntity(registryName, entityClass, entityName, SlugterraEntityRegistry.entityID++, MainRegistry.modInstance, 32, 1, false);
		EntityRegistry.registerEgg(registryName, solidColour, spotColour);
	}
}

