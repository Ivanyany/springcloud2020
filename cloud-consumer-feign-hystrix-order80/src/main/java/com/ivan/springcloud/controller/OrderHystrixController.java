package com.ivan.springcloud.controller;

import com.ivan.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: Ivan
 * @Date: 2020/4/18 15:12
 * @Description:
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")//全局的服务降级兜底方法
public class OrderHystrixController {

    @Resource
    PaymentHystrixService paymentHystrixService;

    @GetMapping(value = "/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentInfo_OK(id);
    }

    //服务降级的兜底方法
//    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")//最多等3秒,否则报错
//    })
    @HystrixCommand//使用全局的兜底方法
    @GetMapping(value = "/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable("id") Integer id){
        int a = 10 / 0;
        return paymentHystrixService.paymentInfo_Timeout(id);
    }
    /**
     * paymentInfo_Timeout服务降级的兜底方法
     * @param id
     * @return
     */
    public String paymentInfo_TimeoutHandler(Integer id){
        return "线程池: " + Thread.currentThread().getName() + ", 8001服务超时或自己运行报错,请稍后再试, id: " + id + ", o(╥﹏╥)o";
    }

    /**
     * 全局的fallback方法,兜底方法
     * @param
     * @return
     */
    public String payment_Global_FallbackMethod(){
        return "这是全局的fallback方法,服务调用出错或自身出错o(╥﹏╥)o";
    }


}
