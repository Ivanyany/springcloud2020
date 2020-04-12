package com.ivan.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通用返回类
 * @Auther: Ivan
 * @Date: 2020/3/23 15:34
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    public Integer code;
    public String message;
    public T data;

    public CommonResult(Integer code, String message){
        this(code, message,null);
    }
}
