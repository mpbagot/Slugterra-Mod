package com.slugterra.packets;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;

import com.slugterra.inventory.ContainerSlug;
import com.slugterra.main.MainRegistry;

public class OpenGuiPacket extends AbstractPacket
{
	// this will store the id of the gui to open
	private int id;

	// The basic, no-argument constructor MUST be included to use the new automated handling
	public OpenGuiPacket() {}

	// if there are any class fields, be sure to provide a constructor that allows
	// for them to be initialized, and use that constructor when sending the packet
	public OpenGuiPacket(int id) {
		this.id = id;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
		// basic Input/Output operations, very much like DataOutputStream
		buffer.writeInt(id);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
		// basic Input/Output operations, very much like DataInputStream
		id = buffer.readInt();
	}

	@Override
	public void handleClientSide(EntityPlayer player) {
		// for opening a GUI, we don't need to do anything here
		if(player.openContainer instanceof ContainerSlug){
			player.closeScreen();
		}
		
		else
		{
		player.openGui(MainRegistry.modInstance, id, player.worldObj, (int) player.posX, (int) player.posY, (int) player.posZ);
		}
	}

	@Override
	public void handleServerSide(EntityPlayer player) {
		// because we sent the gui's id with the packet, we can handle all cases with one line:
		player.openGui(MainRegistry.modInstance, id, player.worldObj, (int) player.posX, (int) player.posY, (int) player.posZ);
	}
}