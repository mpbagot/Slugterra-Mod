package com.slugterra.events;

import com.slugterra.entity.EntityMecha;
import com.slugterra.entity.properties.ExtendedPlayer;
import com.slugterra.entity.properties.ExtendedSlingerAlly;
import com.slugterra.entity.properties.ExtendedSlingerEnemy;
import com.slugterra.entity.slingers.AllySlinger;
import com.slugterra.entity.slingers.EnemySlinger;
import com.slugterra.main.MainRegistry;
import com.slugterra.packets.SyncPlayerPropsPacket;
import com.slugterra.world.WorldGeneratorTheDrop;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;

public class SlugterraEventHandler {

	public static String playername;
	public static String text;

	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event)
	{
		if (event.entity instanceof EntityPlayer && ExtendedPlayer.get((EntityPlayer) event.entity) == null){
			ExtendedPlayer.register((EntityPlayer) event.entity);
		}

		if (event.entity instanceof EntityPlayer && event.entity.getExtendedProperties(ExtendedPlayer.EXT_PROP_NAME) == null){
			event.entity.registerExtendedProperties(ExtendedPlayer.EXT_PROP_NAME, new ExtendedPlayer((EntityPlayer) event.entity));
		}
	}

	@SubscribeEvent
	public void livingFall(LivingFallEvent event)
	{
		Entity entity = event.entity;
		if (entity instanceof EntityPlayer && entity.ridingEntity instanceof EntityMecha) {
			event.distance /= 5;
		} else if (entity instanceof EntityMecha) {
			event.distance /= 3;
		}
	}
	
	@SubscribeEvent
	public void applySlingerProperties(EntityConstructing event)
	{
		if (event.entity instanceof EnemySlinger && ExtendedSlingerEnemy.get((EnemySlinger)event.entity) == null){
			ExtendedSlingerEnemy.register((EnemySlinger) event.entity);
		}

		if (event.entity instanceof EnemySlinger && event.entity.getExtendedProperties(ExtendedSlingerEnemy.EXT_PROP_NAME) == null){
			event.entity.registerExtendedProperties(ExtendedSlingerEnemy.EXT_PROP_NAME, new ExtendedSlingerEnemy((EnemySlinger) event.entity));
		}

		if (event.entity instanceof AllySlinger && ExtendedSlingerAlly.get((AllySlinger)event.entity) == null){
			ExtendedSlingerAlly.register((AllySlinger)event.entity);
		}

		if (event.entity instanceof AllySlinger && event.entity.getExtendedProperties(ExtendedSlingerAlly.EXT_PROP_NAME) == null){
			event.entity.registerExtendedProperties(ExtendedSlingerAlly.EXT_PROP_NAME, new ExtendedSlingerAlly((AllySlinger) event.entity));
		}
	}

	@SubscribeEvent
	public void updateUntilFire(LivingUpdateEvent event)
	{
		if (event.entity instanceof EntityPlayer)
		{
			ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer) event.entity);
			props.updateTimetoFire();
		}
		if (event.entity instanceof EnemySlinger){
			ExtendedSlingerEnemy props = ExtendedSlingerEnemy.get((EnemySlinger) event.entity);
			props.updateTimetoFire();
		}
		if (event.entity instanceof AllySlinger){
			ExtendedSlingerAlly props = ExtendedSlingerAlly.get((AllySlinger)event.entity);
			props.updateTimetoFire();
		}
	}

	@SubscribeEvent
	public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event){

		if (WorldGeneratorTheDrop.genmess != null){
			text = WorldGeneratorTheDrop.genmess;
		}
		else {
			text = "You are Stupid, Pack_of_14eggies.";
		}
		event.player.addChatMessage(new ChatComponentText(text));
		MainRegistry.network.sendTo(new SyncPlayerPropsPacket(event.player), (EntityPlayerMP) event.player);
	}
}
