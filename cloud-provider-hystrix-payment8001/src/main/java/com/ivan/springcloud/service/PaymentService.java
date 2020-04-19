package com.ivan.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: Ivan
 * @Date: 2020/4/12 18:01
 * @Description:
 */
@Service
public class PaymentService {

    /**
     * 正常访问
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id){
        return "线程池: " + Thread.currentThread().getName() + ", paymentInfo_OK, id: " + id;
    }

    /**
     * 模拟超时
     * @param id
     * @return
     */
    //服务降级的兜底方法
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")//最多等3秒,否则报错
    })
    public String paymentInfo_Timeout(Integer id){
        int timeNumber = 5;//等5秒模拟超时
//        int a = 10 / 0;//模拟报错
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: " + Thread.currentThread().getName() + ", paymentInfo_Timeout, id: " + id + ", 耗时(秒): ";// + timeNumber;
    }

    /**
     * paymentInfo_Timeout服务降级的兜底方法
     * @param id
     * @return
     */
    public String paymentInfo_TimeoutHandler(Integer id){
        return "线程池: " + Thread.currentThread().getName() + ", 服务超时或运行报错,请稍后再试, id: " + id + ", o(╥﹏╥)o";
    }

    //********************************************服务熔断*********************************************

    //服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),//是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")//失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        if (id < 0){
            throw new RuntimeException("**********id 不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "\t调用成功,流水号为: " + serialNumber;
    }
    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id){
        return "**********id 不能为负数,请稍后再试o(╥﹏╥)o,id为: " + id;
    }
}
