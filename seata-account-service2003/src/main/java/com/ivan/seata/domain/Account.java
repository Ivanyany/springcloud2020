package com.ivan.seata.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Ivan
 * @date 2020/7/12 17:49
 * @Description: 账户实体类
 */
@Data
public class Account {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 总额度
     */
    private BigDecimal total;

    /**
     * 已用额度
     */
    private BigDecimal used;

    /**
     * 剩余额度
     */
    private BigDecimal residue;
}
