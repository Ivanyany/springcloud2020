package com.ivan.springcloud.controller;

import com.ivan.springcloud.entity.CommonResult;
import com.ivan.springcloud.entity.Payment;
import com.ivan.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: Ivan
 * @Date: 2020/3/23 15:52
 * @Description:
 */
@RestController
@Slf4j//使用日志
public class PaymentController {

    @Resource
    PaymentService paymentService;

    @Value("${server.port}")
    String serverPort;

    @PostMapping("/payment/create")
    public CommonResult createPayment(@RequestBody Payment payment){
        int result = paymentService.create(payment);

        log.info("插入一条信息,结果: " + result);

        if (result > 0){
            return new CommonResult(200,"插入数据库成功,serverPort:" + serverPort, result);
        } else {
            return new CommonResult(500,"插入数据库失败", null);
        }

    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id")Long id){
        Payment payment = paymentService.getPaymentById(id);

        log.info("查询结果: " + payment);

        if (payment != null){
            return new CommonResult(200,"查询成功,serverPort:" + serverPort, payment);
        } else {
            return new CommonResult(500,"没有对应的数据,查询id: " + id, null);
        }

    }

    /**
     * 演示负载均衡
     * @return
     */
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }

    /**
     * 演示超时,feign默认等待1秒,若1秒以后得不到请求的结果,就报错
     * @return
     */
    @GetMapping(value = "/payment/feign/timeout")
    public String getFeignPayment(){
        //休眠3秒,演示报错
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }

}
