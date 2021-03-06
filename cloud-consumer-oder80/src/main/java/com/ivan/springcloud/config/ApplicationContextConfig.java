package com.ivan.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: Ivan
 * @Date: 2020/3/23 17:18
 * @Description:
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced//负载均衡,默认轮询,使用自定义的负载均衡算法,注释掉自带的
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
