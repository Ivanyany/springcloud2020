package com.ivan.controller;

import com.ivan.entity.CommonResult;
import com.ivan.entity.Payment;
import com.ivan.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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

    @PostMapping("/payment/create")
    public CommonResult createPayment(@RequestBody Payment payment){
        int result = paymentService.create(payment);

        log.info("插入一条信息,结果: " + result);

        if (result > 0){
            return new CommonResult(200,"插入数据库成功", result);
        } else {
            return new CommonResult(500,"插入数据库失败", null);
        }

    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id")Long id){
        Payment payment = paymentService.getPaymentById(id);

        log.info("查询结果: " + payment);

        if (payment != null){
            return new CommonResult(200,"查询成功", payment);
        } else {
            return new CommonResult(500,"没有对应的数据,查询id: " + id, null);
        }

    }

}
