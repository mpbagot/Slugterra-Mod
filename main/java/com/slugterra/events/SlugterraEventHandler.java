package com.slugterra.events;

import com.slugterra.capabilities.BlasterProvider;
import com.slugterra.capabilities.IBlaster;
import com.slugterra.capabilities.SlugInventoryProvider;
import com.slugterra.entity.slingers.AllySlinger;
import com.slugterra.entity.slingers.EnemySlinger;
import com.slugterra.item.BlasterBase;
import com.slugterra.lib.Strings;
import com.slugterra.world.WorldGeneratorTheDrop;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.registry.IForgeRegistry;

public class SlugterraEventHandler {

	public static String playername;
	public static String text;
	
	public static final ResourceLocation BLASTER_CAP = new ResourceLocation(Strings.MODID, "blaster");
	public static final ResourceLocation INV_CAP = new ResourceLocation(Strings.MODID, "slug_inventory");
	
	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> e) {
		IForgeRegistry<SoundEvent> registry = e.getRegistry();
		registry.register(SlugterraSoundEvents.blasterShot);
		registry.register(SlugterraSoundEvents.shortReload);
		registry.register(SlugterraSoundEvents.slugFormshift);
	}
	
	@SubscribeEvent
	public void attachItemCapability(AttachCapabilitiesEvent.Item e) {
		if (!(e.getItemStack().getItem() instanceof BlasterBase)) return;
		
		e.addCapability(BLASTER_CAP, new BlasterProvider());
	}

	@SubscribeEvent
	public void attachEntityCapability(AttachCapabilitiesEvent<Entity> e) {
		if (!(e.getObject() instanceof EntityPlayer || e.getObject() instanceof EnemySlinger || e.getObject() instanceof AllySlinger)) return;
		
		e.addCapability(INV_CAP, new SlugInventoryProvider());
	}

	@SubscribeEvent
	public void updateUntilFire(LivingUpdateEvent event)
	{
		if (!(event.getEntity() instanceof EntityPlayer)) return;
		
		ItemStack toolRight = ((EntityPlayer) event.getEntity()).getHeldItemMainhand();
		ItemStack toolLeft = ((EntityPlayer) event.getEntity()).getHeldItemOffhand();

		if (toolRight.getItem() instanceof BlasterBase) {
			IBlaster props = toolRight.getCapability(BlasterProvider.BLASTER_CAP, null);
			props.updateTimetoFire();
		}
		
		if (toolLeft.getItem() instanceof BlasterBase) {
			IBlaster props = toolLeft.getCapability(BlasterProvider.BLASTER_CAP, null);
			props.updateTimetoFire();
		}
	}

	@SubscribeEvent
	public void onPlayerLogin(PlayerLoggedInEvent event){

		if (WorldGeneratorTheDrop.genmess != null){
			text = WorldGeneratorTheDrop.genmess;
		}
		else {
			text = "[ERROR] The Drop failed to generate correctly.";
		}
		event.player.sendMessage(new TextComponentString(text));
	}
}
