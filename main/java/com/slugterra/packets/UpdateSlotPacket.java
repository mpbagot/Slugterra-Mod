package com.slugterra.packets;

import com.slugterra.capabilities.ISlugInv;
import com.slugterra.capabilities.SlugInventoryProvider;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class UpdateSlotPacket implements IMessage
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
	public void toBytes(ByteBuf buffer) {
		// basic Input/Output operations, very much like DataOutputStream
		buffer.writeInt(up);
	}

	@Override
	public void fromBytes(ByteBuf buffer) {
		// basic Input/Output operations, very much like DataInputStream
		up = buffer.readInt();
	}

	public static class Handler implements IMessageHandler<UpdateSlotPacket, IMessage> {

		@Override
		public IMessage onMessage(UpdateSlotPacket message, MessageContext ctx) {
			EntityPlayerMP player = ctx.getServerHandler().playerEntity;
			ISlugInv props = player.getCapability(SlugInventoryProvider.INV_CAP, null);
			if (message.up == 1) {
				props.increaseSlot();
			} else if (message.up == -1) {
				props.decreaseSlot();
			}
			return null; // no response in this case
		}
	}
}