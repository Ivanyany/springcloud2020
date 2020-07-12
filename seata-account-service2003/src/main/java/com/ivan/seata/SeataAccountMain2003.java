package com.ivan.seata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Ivan
 * @date 2020/7/12 17:52
 * @Description: 账户服务主启动类
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class SeataAccountMain2003 {

    public static void main(String[] args) {
        SpringApplication.run(SeataAccountMain2003.class, args);
    }
}
