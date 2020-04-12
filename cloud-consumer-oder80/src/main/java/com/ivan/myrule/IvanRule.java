package com.ivan.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: Ivan
 * @Date: 2020/4/12 12:43
 * @Description: 自定义的负载均衡策略
 * 注意这个类不能放在@ComponentScan(入口主程序所在的包)能扫描的包或子包下面,所以新建一个包
 */
@Configuration//定义配置类
public class IvanRule {

    @Bean//交给Spring管理，注入进spring容器
    public IRule myRule(){
        return new RandomRule();//更改为随机负载均衡(默认是轮询负载均衡)
    }
}
