package com.ivan.seata.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Ivan
 * @date 2020/7/12 17:40
 * @Description: 扣减库存mapper
 */
@Mapper
public interface StorageMapper {

    /**
     * @author Ivan
     * @date 2020/7/12 17:54
     * @Description: 扣减库存
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
