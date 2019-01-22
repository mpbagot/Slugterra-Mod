package com.slugterra.gui;

import org.lwjgl.opengl.GL11;

import com.slugterra.capabilities.ISlugInv;
import com.slugterra.capabilities.SlugInventoryProvider;
import com.slugterra.item.SlingerArmour;
import com.slugterra.lib.Strings;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GuiSlugBeltOverlay extends Gui{

	private Minecraft mc;
	public static int selslot;
	protected RenderItem itemRenderer;
	private ISlugInv props;
	
	public GuiSlugBeltOverlay(Minecraft mc){
		super();
		this.mc = mc;
		this.itemRenderer = mc.getRenderItem();
//		this.props = mc.player.getCapability(SlugInventoryProvider.INV_CAP, null);
	}

	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onRenderExperienceBar(RenderGameOverlayEvent event){
		if(event.isCancelable() || event.getType() != ElementType.HOTBAR){
			return;
		} else if (!(this.mc.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof SlingerArmour)) {
			// If the player isn't using a slinger belt, disable the bar
			return;
		}
		ScaledResolution scaledresolution = new ScaledResolution(this.mc);
//		int k = scaledresolution.getScaledWidth();
		int l = scaledresolution.getScaledHeight();
		GL11.glDisable(GL11.GL_LIGHTING);

		//get player properties
		props = ((EntityPlayer)this.mc.player).getCapability(SlugInventoryProvider.INV_CAP, null);

		//rendering bar
		this.mc.renderEngine.bindTexture(new ResourceLocation(Strings.MODID, "textures/gui/slughotbar2.png"));
		this.drawTexturedModalRect(2, l/2-90, 0, 0, 24, 133);
		
		for (int i1 = 0; i1 < 6; ++i1)
		{
			int k1 = l / 2 - 86 + i1 * 22;//change last value to push up or down
			this.renderInventorySlot(i1, 6, k1);
		}

		GL11.glEnable(GL11.GL_BLEND);

		//rendering square thing over hotbar
		this.mc.renderEngine.bindTexture(new ResourceLocation(Strings.MODID, "textures/gui/hotbarsquare.png"));
		this.drawTexturedModalRect(2, (22 * props.getSlot()) + (l/2-92)+1, 0, 0, 26, 26);
	}

	private void renderInventorySlot(int p_73832_1_, int p_73832_2_, int p_73832_3_)
	{
		ItemStack itemstack = props.getInventory().getStackInSlot(p_73832_1_);

		if (itemstack != null)
		{
			float f1 = (float)itemstack.getAnimationsToGo();

			if (f1 > 0.0F)
			{
				GL11.glPushMatrix();
				float f2 = 1.0F + f1 / 5.0F;
				GL11.glTranslatef((float)(p_73832_2_ + 8), (float)(p_73832_3_ + 12), 0.0F);
				GL11.glScalef(1.0F / f2, (f2 + 1.0F) / 2.0F, 1.0F);
				GL11.glTranslatef((float)(-(p_73832_2_ + 8)), (float)(-(p_73832_3_ + 12)), 0.0F);
			}

			itemRenderer.renderItemAndEffectIntoGUI(itemstack, p_73832_2_, p_73832_3_);

			if (f1 > 0.0F)
			{
				GL11.glPopMatrix();
			}

			itemRenderer.renderItemOverlayIntoGUI(this.mc.fontRendererObj, itemstack, p_73832_2_, p_73832_3_, null);
		}
	}

}
