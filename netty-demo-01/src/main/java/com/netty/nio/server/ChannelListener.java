package com.netty.nio.server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

public class ChannelListener extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        System.out.println("--------------Socket Init-------------------");
        System.out.println("���ؿͻ������ӵ����񣬿ͻ���IP: " + socketChannel.localAddress().getHostString());
        System.out.println("���ӱ���Port: " + socketChannel.localAddress().getPort());
    }
}
