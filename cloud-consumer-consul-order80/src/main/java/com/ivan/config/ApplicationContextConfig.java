package com.ivan.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: Ivan
 * @Date: 2020/4/10 23:43
 * @Description:
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced//负载均衡,默认轮询
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
