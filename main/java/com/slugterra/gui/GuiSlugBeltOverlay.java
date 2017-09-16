package com.slugterra.gui;

import org.lwjgl.opengl.GL11;

import com.slugterra.capabilities.ExtendedPlayer;
import com.slugterra.lib.Strings;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GuiSlugBeltOverlay extends Gui{

	private Minecraft mc;
	public static int selslot;
	protected static final RenderItem itemRenderer = new RenderItem();

	public GuiSlugBeltOverlay(Minecraft mc){
		super();
		this.mc = mc;
	}

	private ExtendedPlayer props;

	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onRenderExperienceBar(RenderGameOverlayEvent event){
		if(event.isCancelable() || event.getType() != ElementType.HOTBAR){
			return;
		}
		ScaledResolution scaledresolution = new ScaledResolution(this.mc);
		int k = scaledresolution.getScaledWidth();
		int l = scaledresolution.getScaledHeight();
		GL11.glDisable(GL11.GL_LIGHTING);

		//get player properties
		if(props == null){
			props = ExtendedPlayer.get((EntityPlayer)this.mc.player);
			this.selslot = props.invslot;
		}

		for (int i1 = 0; i1 < 6; ++i1)
		{
			int k1 = l / 2 - 87 + i1 * 22;//change last value to push up or down
			this.renderInventorySlot(i1, 6, k1);
		}

		GL11.glEnable(GL11.GL_BLEND);

		//rendering bar
		this.mc.renderEngine.bindTexture(new ResourceLocation(Strings.MODID + ":textures/gui/slughotbar2.png"));
		this.drawTexturedModalRect(2, l/2-90, 0, 0, 24, 133);

		//rendering square thing over hotbar
		this.mc.renderEngine.bindTexture(new ResourceLocation(Strings.MODID + ":textures/gui/hotbarsquare.png"));
		this.drawTexturedModalRect(2, (22 * selslot) + (l/2-92)+1, 0, 0, 26, 26);
	}

	private void renderInventorySlot(int p_73832_1_, int p_73832_2_, int p_73832_3_)
	{
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_BLEND);
		ItemStack itemstack = props.inventory.getStackInSlot(p_73832_1_);

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
