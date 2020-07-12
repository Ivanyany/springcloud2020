package com.ivan.seata.controller;

import com.ivan.seata.domain.Order;
import com.ivan.seata.service.OrderService;
import com.ivan.springcloud.entity.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Ivan
 * @date 2020/7/12 17:19
 * @Description: 订单controller
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    /**
     * @author Ivan
     * @date 2020/7/12 18:04
     * @Description: 下订单
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
