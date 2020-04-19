package com.ivan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: Ivan
 * @Date: 2020/4/12 17:58
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker//启动服务降级
public class PaymentHystrixMain8001 {

    public static void main(String[] args){
        SpringApplication.run(PaymentHystrixMain8001.class, args);
    }
}