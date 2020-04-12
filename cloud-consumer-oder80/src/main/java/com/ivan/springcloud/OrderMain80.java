package com.ivan.springcloud;

import com.ivan.myrule.IvanRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Auther: Ivan
 * @Date: 2020/3/23 17:12
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
//使用自定义的负载均衡策略,不加这个配置注解自定义的负载均衡策略不会生效
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = IvanRule.class)
public class OrderMain80 {

    public static void main(String[] args){
        SpringApplication.run(OrderMain80.class, args);
    }
}
