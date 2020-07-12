package com.ivan.seata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Ivan
 * @date 2020/7/12 17:53
 * @Description: 存储服务主启动类
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class SeataStorageMain2002 {

    public static void main(String[] args) {
        SpringApplication.run(SeataStorageMain2002.class, args);
    }
}
