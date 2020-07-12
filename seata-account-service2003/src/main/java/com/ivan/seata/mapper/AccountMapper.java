package com.ivan.seata.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author Ivan
 * @date 2020/7/12 17:48
 * @Description: 账户mapper
 */
@Mapper
public interface AccountMapper {

    /**
     * @author Ivan
     * @date 2020/7/12 17:48
     * @Description: 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
