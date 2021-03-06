package com.nukkitx.protocol.bedrock.v388.serializer;

import com.nukkitx.protocol.bedrock.packet.LabTablePacket;
import com.nukkitx.protocol.bedrock.v388.BedrockUtils;
import com.nukkitx.protocol.serializer.PacketSerializer;
import io.netty.buffer.ByteBuf;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LabTableSerializer_v388 implements PacketSerializer<LabTablePacket> {
    public static final LabTableSerializer_v388 INSTANCE = new LabTableSerializer_v388();


    @Override
    public void serialize(ByteBuf buffer, LabTablePacket packet) {
        buffer.writeByte(packet.getUnknownByte0());
        BedrockUtils.writeVector3i(buffer, packet.getBlockEntityPosition());
        buffer.writeByte(packet.getReactionType());
    }

    @Override
    public void deserialize(ByteBuf buffer, LabTablePacket packet) {
        packet.setUnknownByte0(buffer.readByte());
        packet.setBlockEntityPosition(BedrockUtils.readVector3i(buffer));
        packet.setReactionType(buffer.readByte());
    }
}
