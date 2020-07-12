package com.ivan.seata.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Ivan
 * @date 2020/7/11 23:54
 * @Description: 订单实体类
 */
@Data
public class Order {

    private Long id;

    private Long userId;

    private Integer count;

    private Long productId;

    private BigDecimal money;

    /**
     * 订单状态0- 创建， 1-完成
     */
    private Integer status;
}
