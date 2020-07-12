package com.ivan.seata.service.impl;

import com.ivan.seata.mapper.StorageMapper;
import com.ivan.seata.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Ivan
 * @date 2020/7/12 17:43
 * @Description:
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {


    @Resource
    private StorageMapper storageMapper;

    /**
     * @author Ivan
     * @date 2020/7/12 17:44
     * @Description: 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------->storage-service中扣减库存开始");
        storageMapper.decrease(productId,count);
        log.info("------->storage-service中扣减库存结束");
    }
}
