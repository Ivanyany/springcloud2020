package com.ivan.seata.controller;

import com.ivan.seata.service.AccountService;
import com.ivan.springcloud.entity.CommonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author Ivan
 * @date 2020/7/12 17:47
 * @Description: 账户controller
 */
@RestController
public class AccountController {

    @Resource
    AccountService accountService;

    /**
     * @author Ivan
     * @date 2020/7/12 18:02
     * @Description: 扣减账户余额
     */
    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
        accountService.decrease(userId,money);
        return new CommonResult(200,"扣减账户余额成功！");
    }
}
