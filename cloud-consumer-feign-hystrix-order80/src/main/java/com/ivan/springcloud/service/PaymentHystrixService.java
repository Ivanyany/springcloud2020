package com.ivan.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther: Ivan
 * @Date: 2020/4/18 15:08
 * @Description:
 */
@Component
@FeignClient(value = "CLOUD-HYSTRIX-PAYMENT", fallback = PaymentFallbackService.class)//定义服务降级兜底的方法
public interface PaymentHystrixService {

    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping(value = "/payment/hystrix/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable("id") Integer id);
}
