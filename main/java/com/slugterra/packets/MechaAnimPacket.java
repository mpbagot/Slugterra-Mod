package com.slugterra.packets;

import com.slugterra.entity.EntityMecha;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MechaAnimPacket implements IMessage {

	private String text;

	public MechaAnimPacket() { }

	public MechaAnimPacket(String text) {
		this.text = text;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		text = ByteBufUtils.readUTF8String(buf); // this class is very useful in general for writing more complex objects
	}

	@Override
	public void toBytes(ByteBuf buf) {
		ByteBufUtils.writeUTF8String(buf, text);
	}

	public static class Handler implements IMessageHandler<MechaAnimPacket, IMessage> {

		@Override
		public IMessage onMessage(MechaAnimPacket message, MessageContext ctx) {
			EntityPlayerMP player = ctx.getServerHandler().playerEntity;
			if (player.getRidingEntity() instanceof EntityMecha)
				((EntityMecha)player.getRidingEntity()).senseJump();
			return null; // no response in this case
		}
	}
}