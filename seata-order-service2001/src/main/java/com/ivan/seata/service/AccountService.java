package com.ivan.seata.service;

import com.ivan.springcloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author Ivan
 * @date 2020/7/12 17:07
 * @Description: 账户service
 */
@FeignClient("seata-account-service")
public interface AccountService {

    /**
     * @author Ivan
     * @date 2020/7/12 17:26
     * @Description: 账户余额扣减
     */
    @PostMapping("/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId,
                          @RequestParam("money") BigDecimal money );

}
