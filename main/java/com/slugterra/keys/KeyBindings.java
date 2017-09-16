package com.slugterra.keys;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class KeyBindings {

    public static KeyBinding sluginvup;
    public static KeyBinding sluginvdown;
    public static KeyBinding opensluginv;

    public static void initialiseBindings() {
    	opensluginv = new KeyBinding("key.opensluginv", Keyboard.KEY_M, "key.categories.eggies");
    	sluginvup = new KeyBinding("key.sluginvup", Keyboard.KEY_UP, "key.categories.eggies");
    	sluginvdown = new KeyBinding("key.sluginvdown", Keyboard.KEY_DOWN, "key.categories.eggies");
    	
        ClientRegistry.registerKeyBinding(sluginvup);
        ClientRegistry.registerKeyBinding(sluginvdown);
        ClientRegistry.registerKeyBinding(opensluginv);
    }

}