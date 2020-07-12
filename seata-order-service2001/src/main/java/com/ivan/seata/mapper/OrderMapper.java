package com.ivan.seata.mapper;

import com.ivan.seata.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Ivan
 * @date 2020/7/11 23:54
 * @Description: 订单mapper
 */
@Mapper
public interface OrderMapper {

    /**
     * 创建订单
     * @param order
     */
    void create(Order order);

    /**
     * 修改订单状态 0 -> 1
     * @param id  订单ID
     * @param userId 用户ID
     * @param status 状态
     */
    void update(@Param("id") Long id, @Param("userId") Long userId, @Param("status") Integer status);
}
