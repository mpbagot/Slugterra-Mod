package com.slugterra.gui;

import org.lwjgl.opengl.GL11;

import com.slugterra.inventory.ContainerSlug;
import com.slugterra.inventory.InventorySlug;
import com.slugterra.item.slugs.ItemSlug;
import com.slugterra.lib.Strings;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class GUISlugInventory extends GuiContainer
{
	ItemSlug slug1;

	/** x size of the inventory window in pixels. Defined as float, passed as int */
	private float xSize_lo;

	/** y size of the inventory window in pixels. Defined as float, passed as int. */
	private float ySize_lo;

	/** Normally I use '(ModInfo.MOD_ID, "textures/...")', but it can be done this way as well */
	private static final ResourceLocation iconLocation = new ResourceLocation(Strings.MODID, "textures/gui/sluginventorynew.png");

	/** Could use IInventory type to be more generic, but this way will save an import... */
	private final InventorySlug inventory;

	public GUISlugInventory(EntityPlayer entityPlayer, InventoryPlayer inventoryPlayer, InventorySlug inventoryCustom)
	{
		super(new ContainerSlug(entityPlayer, inventoryPlayer, inventoryCustom));

		this.inventory = inventoryCustom;
	}

	/**
	 * Draws the screen and all the components in it.
	 */
	@Override
	public void drawScreen(int par1, int par2, float par3)
	{
		super.drawScreen(par1, par2, par3);
		this.xSize_lo = (float)par1;
		this.ySize_lo = (float)par2;
	}

	/**
	 * Draw the foreground layer for the GuiContainer (everything in front of the items)
	 */
	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		// Load the healths for the slugs in the slug belt inventory
		int[] healths = {0, 0, 0, 0, 0, 0};
		for (int a = 0; a < 6; ++a) {
			ItemStack slot = this.inventory.getStackInSlot(a);
			if (slot != ItemStack.EMPTY) {
				ItemSlug slug = (ItemSlug) slot.getItem();
				if (slug != null) {
					if (a == 0)
						slug1 = slug;
					healths[a] = (int)(slug.health * 2.4f);
				}
			}
		}

		// Bind the health bar image to the render engine, then draw the health bars (which will use the bound texture)
		this.mc.renderEngine.bindTexture(new ResourceLocation(Strings.MODID, "textures/gui/slughealthbar2.png"));
		//TODO Fix the darkening of the health bars
		this.drawTexturedModalRect(10, 124, 0, 0, healths[0], 3);
		if (slug1 != null)
			this.fontRendererObj.drawString(slug1.name, 9, 94, 4210752);

		this.drawTexturedModalRect(111, 15, 0, 3, healths[1], 3);

		this.drawTexturedModalRect(111, 41, 0, 6, healths[2], 3);

		this.drawTexturedModalRect(111, 63, 0, 9, healths[3], 3);

		this.drawTexturedModalRect(111, 88, 0, 12, healths[4], 3);

		this.drawTexturedModalRect(111, 111, 0, 15, healths[5], 3);

		// Lastly, draw the inventory name and "Hotbar"
		String s = this.inventory.hasCustomName() ? this.inventory.getName() : I18n.format(this.inventory.getName());
		this.fontRendererObj.drawString(s, this.xSize - this.fontRendererObj.getStringWidth(s) - 100, 132, 4210752);
		this.fontRendererObj.drawString(I18n.format("Hotbar"), 120, this.ySize - 37, 4210752);
	}

	/**
	 * Draw the background layer for the GuiContainer (everything behind the items)
	 */
	@Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(iconLocation);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
		drawPlayerModel(k + 51, l + 75, 30, (float)(k + 51) - this.xSize_lo, (float)(l + 75 - 50) - this.ySize_lo, this.mc.player);
	}

	/**
	 * This renders the player model in standard inventory position;
	 * copied straight from vanilla code but with renamed method parameters
	 */
	public static void drawPlayerModel(int x, int y, int scale, float mouseX, float mouseY, EntityLivingBase ent) {
		GlStateManager.enableColorMaterial();
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)x, (float)y, 50.0F);
        GlStateManager.scale((float)(-scale), (float)scale, (float)scale);
        GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
        float f = ent.renderYawOffset;
        float f1 = ent.rotationYaw;
        float f2 = ent.rotationPitch;
        float f3 = ent.prevRotationYawHead;
        float f4 = ent.rotationYawHead;
        GlStateManager.rotate(135.0F, 0.0F, 1.0F, 0.0F);
        RenderHelper.enableStandardItemLighting();
        GlStateManager.rotate(-135.0F, 0.0F, 1.0F, 0.0F);
        GlStateManager.rotate(-((float)Math.atan((double)(mouseY / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
        ent.renderYawOffset = (float)Math.atan((double)(mouseX / 40.0F)) * 20.0F;
        ent.rotationYaw = (float)Math.atan((double)(mouseX / 40.0F)) * 40.0F;
        ent.rotationPitch = -((float)Math.atan((double)(mouseY / 40.0F))) * 20.0F;
        ent.rotationYawHead = ent.rotationYaw;
        ent.prevRotationYawHead = ent.rotationYaw;
        GlStateManager.translate(0.0F, 0.0F, 0.0F);
        RenderManager rendermanager = Minecraft.getMinecraft().getRenderManager();
        rendermanager.setPlayerViewY(180.0F);
        rendermanager.setRenderShadow(false);
        rendermanager.doRenderEntity(ent, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F, false);
        rendermanager.setRenderShadow(true);
        ent.renderYawOffset = f;
        ent.rotationYaw = f1;
        ent.rotationPitch = f2;
        ent.prevRotationYawHead = f3;
        ent.rotationYawHead = f4;
        GlStateManager.popMatrix();
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableRescaleNormal();
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.disableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
   	}
}