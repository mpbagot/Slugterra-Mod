package com.slugterra.packets;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;

import com.slugterra.entity.properties.ExtendedPlayer;
import com.slugterra.gui.GuiSlugBeltOverlay;

public class UpdateSlotPacket extends AbstractPacket
{
	private int up;

	// The basic, no-argument constructor MUST be included to use the new automated handling
	public UpdateSlotPacket() {}

	// if there are any class fields, be sure to provide a constructor that allows
	// for them to be initialized, and use that constructor when sending the packet
	public UpdateSlotPacket(int up) {
		this.up = up;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
		// basic Input/Output operations, very much like DataOutputStream
		buffer.writeInt(up);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
		// basic Input/Output operations, very much like DataInputStream
		up = buffer.readInt();
	}

	@Override
	public void handleClientSide(EntityPlayer player)
	{
		ExtendedPlayer props = ExtendedPlayer.get(player);

		if (up == 1)
		{
			props.increaseSlot();
			GuiSlugBeltOverlay.selslot += 1;
		}

		else if (up == 0)
		{
			props.decreaseSlot();
			GuiSlugBeltOverlay.selslot -= 1;
		}
	}

	@Override
	public void handleServerSide(EntityPlayer player) 
	{
		ExtendedPlayer props = ExtendedPlayer.get(player);

		if (up == 1)
		{
			props.increaseSlot();
			GuiSlugBeltOverlay.selslot = props.invslot;
		}

		else if (up == 0)
		{
			props.decreaseSlot();
			GuiSlugBeltOverlay.selslot = props.invslot;
		}
	}
}