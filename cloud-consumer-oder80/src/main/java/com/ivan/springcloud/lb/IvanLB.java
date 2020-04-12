package com.ivan.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Auther: Ivan
 * @Date: 2020/4/12 13:15
 * @Description: 自定义负载均衡算法的实现类
 */
@Component
public class IvanLB implements LoadBalancer {

    //原子类,存储当前提供服务的索引index
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    //获取下一个提供服务的索引index
    public final int getAndIncrement(){
        int current;
        int next;
        do {
            //获取当前值
            current = this.atomicInteger.get();
            //获取下一个值 Integer.MAX_VALUE 2147483647
            next = current >= 2147483647 ? 0 : current + 1;


        } while (!this.atomicInteger.compareAndSet(current, next));

        System.out.println("******第几次访问,当前访问的次数next: " + next + "******");
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {

        //获取提供服务的索引index
        int index = getAndIncrement() % serviceInstances.size();
        //返回提供服务的实例
        return serviceInstances.get(index);
    }
}
