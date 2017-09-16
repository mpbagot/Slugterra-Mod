package com.slugterra.gui;

import org.lwjgl.opengl.GL11;

import com.slugterra.inventory.SlugRackContainer;
import com.slugterra.lib.Strings;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiSlugRack extends GuiContainer {

	private static final ResourceLocation guiText = new ResourceLocation(Strings.MODID+":textures/gui/slugrack.png");
	private final InventoryPlayer invPlayer;
	private final IInventory slugRack;
	
	public GuiSlugRack(InventoryPlayer invPlayer, IInventory slugInv) {
		super(new SlugRackContainer(invPlayer, slugInv));
		this.invPlayer = invPlayer;
		this.slugRack = slugInv;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY){
		String s = slugRack.getName();
		fontRendererObj.drawString(s, xSize/2-fontRendererObj.getStringWidth(s)/2, 5, 4210752);
		fontRendererObj.drawString("Player Inventory", 8, ySize-94, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
		mc.getTextureManager().bindTexture(guiText);
		int hMargin = (width-xSize)/2;
		int vMargin = (height-ySize)/2;
		drawTexturedModalRect(hMargin, vMargin, 0, 0, xSize, ySize);		
	}

}
