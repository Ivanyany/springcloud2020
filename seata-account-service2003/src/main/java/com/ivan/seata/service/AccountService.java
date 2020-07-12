package com.ivan.seata.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author Ivan
 * @date 2020/7/12 17:47
 * @Description: 账户service
 */
public interface AccountService {

    /**
     * @author Ivan
     * @date 2020/7/12 18:02
     * @Description: 扣减账户余额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
