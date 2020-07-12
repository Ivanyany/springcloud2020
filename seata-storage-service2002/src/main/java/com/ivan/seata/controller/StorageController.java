package com.ivan.seata.controller;

import com.ivan.seata.service.StorageService;
import com.ivan.springcloud.entity.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ivan
 * @date 2020/7/12 17:39
 * @Description: 扣减库存controller
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    /**
     * @author Ivan
     * @date 2020/7/12 17:44
     * @Description: 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }
}
