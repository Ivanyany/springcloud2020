package com.ivan.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Auther: Ivan
 * @Date: 2020/4/12 13:13
 * @Description: 自定义负载均衡算法
 */
public interface LoadBalancer {

    //获取所有可用的服务
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
