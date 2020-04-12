package com.ivan.springcloud.service;

import com.ivan.springcloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther: Ivan
 * @Date: 2020/4/12 15:40
 * @Description: 提供服务的feign
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping("/payment/get/{id}")
    CommonResult getPayment(@PathVariable("id")Long id);

    /**
     * 演示超时,feign默认等待1秒,若1秒以后得不到请求的结果,就报错
     * @return
     */
    @GetMapping(value = "/payment/feign/timeout")
    String getFeignPayment();
}
