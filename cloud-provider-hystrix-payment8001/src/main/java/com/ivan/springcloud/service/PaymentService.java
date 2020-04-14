package com.ivan.springcloud.service;

import org.springframework.stereotype.Service;

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
    public String paymentInfo_Timeout(Integer id){
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: " + Thread.currentThread().getName() + ", paymentInfo_Timeout, id: " + id + ", 耗时(秒): " + timeNumber;
    }
}
