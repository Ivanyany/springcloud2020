package com.ivan.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Auther: Ivan
 * @Date: 2020/4/10 23:44
 * @Description:
 */
@RestController
@Slf4j
public class OrderController {

    public static final String INVOKE_URL = "http://consul-provider-payment";

    @Resource
    RestTemplate restTemplate;

    @RequestMapping("/consumer/payment/consul")
    public String createPayment(){

        return restTemplate.getForObject(INVOKE_URL + "/payment/consul" , String.class);
    }
}
