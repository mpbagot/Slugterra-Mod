package com.slugterra.packets;

import com.slugterra.capabilities.ISlugInv;
import com.slugterra.capabilities.SlugInventoryProvider;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SyncPlayerPropsPacket implements IMessage
{
	// Previously, we've been writing each field in our properties one at a time,
	// but that is really annoying, and we've already done it in the save and load
	// NBT methods anyway, so here's a slick way to efficiently send all of your
	// extended data, and no matter how much you add or remove, you'll never have
	// to change the packet / synchronization of your data.

	// this will store our ExtendedPlayer data, allowing us to easily read and write
	private NBTTagCompound data;
	private int slot;

	// The basic, no-argument constructor MUST be included to use the new automated handling
	public SyncPlayerPropsPacket() {}

	// We need to initialize our data, so provide a suitable constructor:
	public SyncPlayerPropsPacket(EntityPlayer player) {
		// create a new tag compound and save the player data into it
		ISlugInv props = player.getCapability(SlugInventoryProvider.INV_CAP, null);
		data = props.saveInventoryToNBT(new NBTTagCompound());
		slot = props.getSlot();
}

	@Override
	public void fromBytes(ByteBuf buf) {
		slot = buf.readInt();
		data = ByteBufUtils.readTag(buf);
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(slot);
		ByteBufUtils.writeTag(buf, data);
	}

	public static class Handler implements IMessageHandler<SyncPlayerPropsPacket, IMessage> {

		@Override
		public IMessage onMessage(SyncPlayerPropsPacket message, MessageContext ctx) {
			// Since this is a client side handler, we can access the singleton Minecraft instance
			EntityPlayerSP player = Minecraft.getMinecraft().player;
			//Load the data back into the player capability
			ISlugInv props = player.getCapability(SlugInventoryProvider.INV_CAP, null);
			props.loadInventory(message.data);
			props.setSlot(message.slot);
			return null; // no response in this case
		}
	}
}