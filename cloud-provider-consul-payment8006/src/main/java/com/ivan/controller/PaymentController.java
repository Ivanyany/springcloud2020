package com.ivan.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Auther: Ivan
 * @Date: 2020/3/23 15:52
 * @Description:
 */
@RestController
@Slf4j//使用日志
public class PaymentController {

    @Value("${server.port}")
    String serverPort;

    /**
     * 获取本服务提供的服务
     * @return
     */
    @RequestMapping(value = "/payment/consul")
    public String pymentConsul(){
        return "springcloud with consul: " + serverPort + "\t " + UUID.randomUUID().toString();
    }


}
