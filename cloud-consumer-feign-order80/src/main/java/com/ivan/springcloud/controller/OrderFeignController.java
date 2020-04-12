package com.ivan.springcloud.controller;

import com.ivan.springcloud.entity.CommonResult;
import com.ivan.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: Ivan
 * @Date: 2020/4/12 15:45
 * @Description:
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id")Long id){
        return paymentFeignService.getPayment(id);
    }

    /**
     * 演示超时,feign默认等待1秒,若1秒以后得不到请求的结果,就报错
     * @return
     */
    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String getFeignPayment(){
        return paymentFeignService.getFeignPayment();
    }


}
