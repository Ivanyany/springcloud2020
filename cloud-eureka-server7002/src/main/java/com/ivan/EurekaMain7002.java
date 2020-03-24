package com.ivan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: Ivan
 * @Date: 2020/3/23 19:02
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {

    public static void main(String[] args){
        SpringApplication.run(EurekaMain7002.class, args);
    }
}
