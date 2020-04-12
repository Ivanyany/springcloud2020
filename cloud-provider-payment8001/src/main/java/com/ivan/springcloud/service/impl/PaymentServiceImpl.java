package com.ivan.springcloud.service.impl;

import com.ivan.springcloud.dao.PaymentDao;
import com.ivan.springcloud.entity.Payment;
import com.ivan.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther: Ivan
 * @Date: 2020/3/23 15:49
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    //@Autowired
    @Resource//与@Autowired等价
    PaymentDao paymentDao;


    @Override
    public Integer create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
