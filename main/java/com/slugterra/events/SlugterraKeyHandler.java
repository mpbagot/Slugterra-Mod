package com.slugterra.events;

import com.slugterra.capabilities.ISlugInv;
import com.slugterra.capabilities.SlugInventoryProvider;
import com.slugterra.entity.EntityMecha;
import com.slugterra.item.SlingerArmour;
import com.slugterra.keys.KeyBindings;
import com.slugterra.main.MainRegistry;
import com.slugterra.packets.MechaAnimPacket;
import com.slugterra.packets.OpenGuiPacket;
import com.slugterra.packets.UpdateSlotPacket;
import com.slugterra.render.blasters.RenderBlaster;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class SlugterraKeyHandler {

	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		EntityPlayerSP player = Minecraft.getMinecraft().player;
		ISlugInv props = player.getCapability(SlugInventoryProvider.INV_CAP, null);

		System.out.println(props.getSlot());
		
		if(KeyBindings.sluginvup.isPressed()){
			System.out.println("Scrolling up");
			MainRegistry.network.sendToServer(new UpdateSlotPacket(-1));
			props.decreaseSlot();
			//TODO remove this static variable
			RenderBlaster.reloading = true;
			player.playSound(SlugterraSoundEvents.shortReload, 1.0F, 1.0F);

		}

		if(KeyBindings.sluginvdown.isPressed()){
			System.out.println("Scrolling down");
			MainRegistry.network.sendToServer(new UpdateSlotPacket(1));
			props.increaseSlot();
			//TODO as above
			RenderBlaster.reloading = true;
			player.playSound(SlugterraSoundEvents.shortReload, 1.0F, 1.0F);

		}
		
		// Open the slug inventory if the key is pressed, and the player is wearing a slug belt
		if(KeyBindings.opensluginv.isPressed() && player != null && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof SlingerArmour){
			System.out.println("Opening Slug Inventory");
			MainRegistry.network.sendToServer(new OpenGuiPacket(MainRegistry.GUI_SLUG_INV));
		}
		
		boolean jump = Minecraft.getMinecraft().gameSettings.keyBindJump.isPressed();
		if (player != null && jump && player.getRidingEntity() instanceof EntityMecha){
			System.out.println("Sending Packet...");
			MainRegistry.network.sendToServer(new MechaAnimPacket("JUMPING!!!"));
		}


	}
}
