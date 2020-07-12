package com.ivan.seata.service;

import com.ivan.seata.domain.Order;

/**
 * @author Ivan
 * @date 2020/7/12 17:07
 * @Description: 订单的service
 */
public interface OrderService {
    /**
     * @author Ivan
     * @date 下订单 18:14
     * @Description: 
     */
    void create(Order order);
}
