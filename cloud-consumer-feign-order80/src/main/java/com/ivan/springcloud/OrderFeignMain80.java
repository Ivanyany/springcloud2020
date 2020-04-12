package com.ivan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: Ivan
 * @Date: 2020/4/12 15:33
 * @Description:
 */
@SpringBootApplication
@EnableFeignClients//表明这是一个Feign客户端
public class OrderFeignMain80 {
    public static void main(String[] args){
        SpringApplication.run(OrderFeignMain80.class, args);
    }
}
