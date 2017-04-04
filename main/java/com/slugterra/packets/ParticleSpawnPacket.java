package com.slugterra.packets;

import com.slugterra.main.ServerProxy;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;

public class ParticleSpawnPacket implements IMessage {

	private String text;
	private double x;
	private double y;
	private double z;

	public ParticleSpawnPacket() { }

	public ParticleSpawnPacket(double x, double y, double z, String text) {
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
		text = ByteBufUtils.readUTF8String(buf); // this class is very useful in general for writing more complex objects
	}

	@Override
	public void toBytes(ByteBuf buf) {
		ByteBufUtils.writeUTF8String(buf, text);
		byte[] pos = {(byte) x, (byte)y, (byte)z};
		buf.writeBytes(pos);
	}

	public static class Handler implements IMessageHandler<ParticleSpawnPacket, IMessage> {

		@Override
		public IMessage onMessage(ParticleSpawnPacket message, MessageContext ctx) {
			double x = message.x;
			double y = message.y;
			double z = message.z;
			ServerProxy.postParticles(x, y, z, message.text);
			return null; // no response in this case
		}
	}
}