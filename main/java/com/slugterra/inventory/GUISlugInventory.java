package com.slugterra.inventory;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.slugterra.item.slugs.ItemSlug;
import com.slugterra.lib.Strings;

import net.minecraft.client.gui.inventory.GuiContainer;
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
	private static final ResourceLocation iconLocation = new ResourceLocation("slugterramod:textures/gui/sluginventorynew.png");

	/** Could use IInventory type to be more generic, but this way will save an import... */
	private final InventorySlug inventory;
	private final EntityPlayer player;

	public GUISlugInventory(EntityPlayer player, InventoryPlayer inventoryPlayer, InventorySlug inventoryCustom)
	{
		super(new ContainerSlug(player, inventoryPlayer, inventoryCustom));

		this.inventory = inventoryCustom;
		this.player = player;
		// if you need the player for something later on, store it in a local variable here as well
	}

	/**
	 * Draws the screen and all the components in it.
	 */
	public void drawScreen(int par1, int par2, float par3)
	{
		super.drawScreen(par1, par2, par3);
		this.xSize_lo = (float)par1;
		this.ySize_lo = (float)par2;
	}

	/**
	 * Draw the foreground layer for the GuiContainer (everything in front of the items)
	 */
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		int[] healths = {0,0,0,0,0,0};
		for (int a=0; a< 6;++a){
			ItemStack slot = this.inventory.getStackInSlot(a);
			if (slot != null){
				ItemSlug slug = (ItemSlug) slot.getItem();
				if (slug != null){
					if (a == 0)
						slug1 = slug;
					healths[a] = (int)(slug.health*2.4f);
				}
			}
		}

		this.mc.getTextureManager().bindTexture(new ResourceLocation(Strings.MODID + ":textures/gui/slughealthbar2.png"));

		this.drawTexturedModalRect(10, 124, 0, 0, healths[0], 3);
		this.fontRendererObj.drawString(slug1.name, 9, 94, 4210752);

		this.drawTexturedModalRect(111, 15, 0, 0, healths[1], 3);

		this.drawTexturedModalRect(111, 41, 0, 0, healths[2], 3);

		this.drawTexturedModalRect(111, 63, 0, 0, healths[3], 3);

		this.drawTexturedModalRect(111, 88, 0, 0, healths[4], 3);

		this.drawTexturedModalRect(111, 111, 0, 0, healths[5], 3);

		String s = this.inventory.hasCustomInventoryName() ? this.inventory.getInventoryName() : I18n.format(this.inventory.getInventoryName());
		this.fontRendererObj.drawString(s, this.xSize - this.fontRendererObj.getStringWidth(s) - 100, 132, 4210752);
		this.fontRendererObj.drawString(I18n.format("Hotbar"), 120, this.ySize - 37, 4210752);
	}

	/**
	 * Draw the background layer for the GuiContainer (everything behind the items)
	 */
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(iconLocation);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
		int i1;
		drawPlayerModel(k + 51, l + 75, 30, (float)(k + 51) - this.xSize_lo, (float)(l + 75 - 50) - this.ySize_lo, this.mc.thePlayer);
	}

	/**
	 * This renders the player model in standard inventory position;
	 * copied straight from vanilla code but with renamed method parameters
	 */
	public static void drawPlayerModel(int x, int y, int scale, float yaw, float pitch, EntityLivingBase entity) {
		GL11.glEnable(GL11.GL_COLOR_MATERIAL);
		GL11.glPushMatrix();
		GL11.glTranslatef(x, y, 50.0F);
		GL11.glScalef(-scale, scale, scale);
		GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
		float f2 = entity.renderYawOffset;
		float f3 = entity.rotationYaw;
		float f4 = entity.rotationPitch;
		float f5 = entity.prevRotationYawHead;
		float f6 = entity.rotationYawHead;
		GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
		RenderHelper.enableStandardItemLighting();
		GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(-((float) Math.atan(pitch / 40.0F)) * 20.0F, 1.0F, 0.0F, 0.0F);
		entity.renderYawOffset = (float) Math.atan(yaw / 40.0F) * 20.0F;
		entity.rotationYaw = (float) Math.atan(yaw / 40.0F) * 40.0F;
		entity.rotationPitch = -((float) Math.atan(pitch / 40.0F)) * 20.0F;
		entity.rotationYawHead = entity.rotationYaw;
		entity.prevRotationYawHead = entity.rotationYaw;
		GL11.glTranslatef(0.0F, entity.yOffset, 0.0F);
		RenderManager.instance.playerViewY = 180.0F;
		RenderManager.instance.renderEntityWithPosYaw(entity, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
		entity.renderYawOffset = f2;
		entity.rotationYaw = f3;
		entity.rotationPitch = f4;
		entity.prevRotationYawHead = f5;
		entity.rotationYawHead = f6;
		GL11.glPopMatrix();
		RenderHelper.disableStandardItemLighting();
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
	}
}