package com.slugterra.events;

import com.slugterra.entity.EntityMecha_Wolf;
import com.slugterra.keys.KeyBindings;
import com.slugterra.lib.Strings;
import com.slugterra.main.MainRegistry;
import com.slugterra.packets.OpenGuiPacket;
import com.slugterra.packets.UpdateSlotPacket;
import com.slugterra.render.blasters.RenderBlaster;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.util.ResourceLocation;

public class SlugterraKeyHandler {

	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		EntityClientPlayerMP player = Minecraft.getMinecraft().thePlayer;
		if(KeyBindings.sluginvup.isPressed()){
			System.out.println("Scrolling up");
			MainRegistry.packetPipeline.sendToServer(new UpdateSlotPacket(0));
			RenderBlaster.reloading = true;
			Minecraft.getMinecraft().getSoundHandler().playSound(PositionedSoundRecord.func_147673_a(new ResourceLocation(Strings.MODID+":blasters.defender.shortreload")));

		}

		if(KeyBindings.sluginvdown.isPressed()){
			System.out.println("Scrolling down");
			MainRegistry.packetPipeline.sendToServer(new UpdateSlotPacket(1));
			RenderBlaster.reloading = true;
			Minecraft.getMinecraft().getSoundHandler().playSound(PositionedSoundRecord.func_147673_a(new ResourceLocation(Strings.MODID+":blasters.defender.shortreload")));

		}
		if(KeyBindings.opensluginv.isPressed()){
			System.out.println("Opening Slug Inventory");
			MainRegistry.packetPipeline.sendToServer(new OpenGuiPacket(MainRegistry.GUI_SLUG_INV));
		}
		boolean sneak = Minecraft.getMinecraft().gameSettings.keyBindJump.isPressed();
		if (sneak){
			EntityMecha_Wolf.senseJump();
		}


	}
}
