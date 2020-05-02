package com.ivan.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @Auther: Ivan
 * @Date: 2020/5/2 23:31
 * @Description:
 */
@Component
//绑定消息中间件
@EnableBinding({Sink.class})//消息接收管道
public class ReceiveMessageListenerController {

    @Value("${server.port}")
    private String serverPort;

    //消息接收方
    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("我是消费者1号=======> 接收到的消息: " + message.getPayload() + "\t port: " + serverPort);
    }
}
