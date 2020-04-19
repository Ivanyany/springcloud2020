package com.ivan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: Ivan
 * @Date: 2020/4/18 15:05
 * @Description:
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix//hystrix服务降级
public class OrderHystrixMain80 {

    public static void main(String[] args){
        SpringApplication.run(OrderHystrixMain80.class, args);
    }
}
