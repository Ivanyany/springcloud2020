package com.ivan.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Auther: Ivan
 * @Date: 2020/4/18 18:34
 * @Description:
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fallback -- paymentInfo_OK, o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "-----PaymentFallbackService fallback -- paymentInfo_Timeout, o(╥﹏╥)o";
    }
}
