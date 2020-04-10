package com.ivan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: Ivan
 * @Date: 2020/4/10 23:46
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMainConsul80 {

    public static void main(String[] args){
        SpringApplication.run(OrderMainConsul80.class, args);
    }
}
