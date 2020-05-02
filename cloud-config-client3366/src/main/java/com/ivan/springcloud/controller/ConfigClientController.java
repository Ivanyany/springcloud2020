package com.ivan.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Ivan
 * @Date: 2020/5/2 21:27
 * @Description:
 */
@RestController
@RefreshScope//配置中心数据修改后自动刷新(注意:配置中心修改数据以后需要手动通知3355,让其拉取最新的数据
//可以在命令行窗口模拟:curl -X POST "http://localhost:3366/actuator/refresh" )
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}

