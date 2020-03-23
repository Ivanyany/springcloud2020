package com.ivan.service;

import com.ivan.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: Ivan
 * @Date: 2020/3/23 15:48
 * @Description:
 */
public interface PaymentService {

    public Integer create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
