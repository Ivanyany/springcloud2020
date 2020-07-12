package com.ivan.seata.domain;

import lombok.Data;

/**
 * @author Ivan
 * @date 2020/7/12 17:42
 * @Description: 库存实体类
 */
@Data
public class Storage {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
