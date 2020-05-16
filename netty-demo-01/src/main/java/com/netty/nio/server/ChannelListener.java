package com.netty.nio.server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

public class ChannelListener extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        System.out.println("--------------Socket Init-------------------");
        System.out.println("本地客户端连接到服务，客户端IP: " + socketChannel.localAddress().getHostString());
        System.out.println("连接报告Port: " + socketChannel.localAddress().getPort());
    }
}
