package com.ivan.seata.service;

import com.ivan.springcloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Ivan
 * @date 2020/7/12 17:08
 * @Description: 仓储service
 */
@FeignClient("seata-storage-service")
public interface StorageService {

    /**
     * @author Ivan
     * @date 2020/7/12 17:26
     * @Description: 存储扣减
     */
    @PostMapping("/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId,
                          @RequestParam("count") Integer count);
}
