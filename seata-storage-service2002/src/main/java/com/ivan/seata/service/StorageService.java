package com.ivan.seata.service;

/**
 * @author Ivan
 * @date 2020/7/12 17:42
 * @Description: 库存service
 */
public interface StorageService {
    /**
     * @author Ivan
     * @date 2020/7/12 17:54
     * @Description: 扣减库存
     */
    void decrease(Long productId, Integer count);
}
