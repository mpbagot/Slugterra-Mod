package com.slugterra.packets;

import com.slugterra.inventory.ContainerSlug;
import com.slugterra.main.MainRegistry;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class OpenGuiPacket implements IMessage
{

	private int id;

	public OpenGuiPacket() { }

	public OpenGuiPacket(int id) {
		this.id = id;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.id = buf.readInt();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(this.id);
	}

	public static class Handler implements IMessageHandler<OpenGuiPacket, IMessage> {

		@Override
		public IMessage onMessage(OpenGuiPacket message, MessageContext ctx) {
			EntityPlayerMP player = ctx.getServerHandler().playerEntity;
			if (player.openContainer instanceof ContainerSlug) {
				player.closeScreen();
				player.closeContainer();
			} else {
				player.openGui(MainRegistry.modInstance, message.id, player.world, (int) player.posX, (int) player.posY, (int) player.posZ);
			}
			return null; // no response in this case
		}
	}
}