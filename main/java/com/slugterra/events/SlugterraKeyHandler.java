package com.slugterra.events;

import org.lwjgl.input.Keyboard;

import com.slugterra.capabilities.ISlugInv;
import com.slugterra.capabilities.SlugInventoryProvider;
import com.slugterra.entity.EntityMecha;
import com.slugterra.gui.GUISlugInventory;
import com.slugterra.item.BlasterBase;
import com.slugterra.item.SlingerArmour;
import com.slugterra.keys.KeyBindings;
import com.slugterra.main.MainRegistry;
import com.slugterra.packets.MechaAnimPacket;
import com.slugterra.packets.OpenGuiPacket;
import com.slugterra.packets.UpdateSlotPacket;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SlugterraKeyHandler {
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onKeyInput(KeyInputEvent event) {
		EntityPlayerSP player = Minecraft.getMinecraft().player;
		ISlugInv props = player.getCapability(SlugInventoryProvider.INV_CAP, null);
		
		if (player.getHeldItemMainhand().getItem() instanceof BlasterBase || player.getHeldItemOffhand().getItem() instanceof BlasterBase ) {
			if(KeyBindings.sluginvup.isPressed()){
				System.out.println("Scrolling up");
				MainRegistry.network.sendToServer(new UpdateSlotPacket(-1));
				props.decreaseSlot();
				player.playSound(SlugterraSoundEvents.shortReload, 1.0F, 1.0F);

			}

			if(KeyBindings.sluginvdown.isPressed()){
				System.out.println("Scrolling down");
				MainRegistry.network.sendToServer(new UpdateSlotPacket(1));
				props.increaseSlot();
				player.playSound(SlugterraSoundEvents.shortReload, 1.0F, 1.0F);

			}
		} else {
			// Pop any keypress events to prevent weird bugs when the above conditions are later met.
			KeyBindings.sluginvdown.isPressed();
			KeyBindings.sluginvup.isPressed();
		}
		
		// Open the slug inventory if the key is pressed, and the player is wearing a slug belt
		if (KeyBindings.opensluginv.isPressed() && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof SlingerArmour) {
				System.out.println("Toggling slug inventory GUI.");
				MainRegistry.network.sendToServer(new OpenGuiPacket(MainRegistry.GUI_SLUG_INV));
		}
		
		boolean jump = Minecraft.getMinecraft().gameSettings.keyBindJump.isPressed();
		if (player != null && jump && player.getRidingEntity() instanceof EntityMecha){
			System.out.println("Sending Packet...");
			MainRegistry.network.sendToServer(new MechaAnimPacket("JUMPING!!!"));
		}
	}
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onGuiKeyInput(GuiScreenEvent.KeyboardInputEvent.Pre event) {
		System.out.println(event.getGui());
		if (event.getGui() instanceof GUISlugInventory && Keyboard.isKeyDown(KeyBindings.opensluginv.getKeyCode())) {
			System.out.println("Toggling slug inventory GUI.");
			MainRegistry.network.sendToServer(new OpenGuiPacket(MainRegistry.GUI_SLUG_INV));
			if (event.isCancelable())
				event.setCanceled(true);
		}
	}
}
