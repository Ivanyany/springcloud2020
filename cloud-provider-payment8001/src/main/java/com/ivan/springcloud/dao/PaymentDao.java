package com.ivan.springcloud.dao;

import com.ivan.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: Ivan
 * @Date: 2020/3/23 15:38
 * @Description:
 */
@Mapper
public interface PaymentDao {

    public Integer create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
