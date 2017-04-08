package com.slugterra.packets;

import java.util.Random;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;

public class RendPartPacket implements IMessage {

	private String text;
	private double x;
	private double y;
	private double z;

	public RendPartPacket() { }

	public RendPartPacket(double x, double y, double z, String text) {
		this.text = text;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		byte[] pos = buf.readBytes(buf).array();
		this.x = (double) pos[0];
		this.y = (double) pos[1];
		this.z = (double) pos[2];
		text = ByteBufUtils.readUTF8String(buf);
	}

	@Override
	public void toBytes(ByteBuf buf) {
		ByteBufUtils.writeUTF8String(buf, text);
		byte[] pos = {(byte)x, (byte)y, (byte)z};
		buf.writeBytes(pos);
	}

	public static class Handler implements IMessageHandler<RendPartPacket, IMessage> {

		@Override
		public IMessage onMessage(RendPartPacket message, MessageContext ctx) {
			double r = new Random().nextDouble();
			double r1 = new Random().nextDouble();
			double r2 = new Random().nextDouble();
			Minecraft.getMinecraft().thePlayer.worldObj.spawnParticle(message.text, message.x, message.y, message.z, r, r1, r2);
			return null; // no response in this case
		}
	}
}