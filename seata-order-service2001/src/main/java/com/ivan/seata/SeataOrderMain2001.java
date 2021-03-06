package com.ivan.seata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Ivan
 * @date 2020/7/12 17:09
 * @Description:
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class SeataOrderMain2001 {

    public static void main(String[] args) {
        SpringApplication.run(SeataOrderMain2001.class, args);
    }
}
