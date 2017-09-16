package com.slugterra.events;

import com.slugterra.lib.Strings;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class SlugterraSoundEvents {
	
	public static SoundEvent shortReload = new SoundEvent(new ResourceLocation(Strings.MODID, "blasters.defender.shortreload"));
	public static SoundEvent blasterShot = new SoundEvent(new ResourceLocation(Strings.MODID, "blasters.defender.shoot"));
	public static SoundEvent slugFormshift = new SoundEvent(new ResourceLocation(Strings.MODID, "slugs.allSlugs.formshift"));
}
