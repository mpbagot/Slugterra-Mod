package com.slugterra.packets;

import com.slugterra.entity.properties.ExtendedPlayer;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public class SyncPlayerPropsPacket implements IMessage {

	private NBTTagCompound data;

	public SyncPlayerPropsPacket() {}

	public SyncPlayerPropsPacket(EntityPlayer player) {
		data = new NBTTagCompound();
		ExtendedPlayer.get(player).saveNBTData(data);
	}

	@Override
	public void toBytes(ByteBuf buffer) {
		// ByteBufUtils provides a convenient method for writing the compound
		ByteBufUtils.writeTag(buffer, data);
	}

	@Override
	public void fromBytes(ByteBuf buffer) {
		// luckily, ByteBufUtils provides an easy way to read the NBT
		data = ByteBufUtils.readTag(buffer);
	}

	public static class Handler implements IMessageHandler<SyncPlayerPropsPacket, IMessage> {

		@Override
		public IMessage onMessage(SyncPlayerPropsPacket message, MessageContext ctx) {
			EntityPlayer player = (EntityPlayer)Minecraft.getMinecraft().thePlayer;
			ExtendedPlayer.get(player).loadNBTData(message.data);
			return null;
		}
	}
}