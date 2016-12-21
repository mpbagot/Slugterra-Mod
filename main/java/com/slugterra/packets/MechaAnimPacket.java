package com.slugterra.packets;

import com.slugterra.entity.EntityMecha;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;

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
			((EntityMecha)player.ridingEntity).senseJump();
			System.out.println(String.format("Received %s from %s", message.text, ctx.getServerHandler().playerEntity.getDisplayName()));
			return null; // no response in this case
		}
	}
}