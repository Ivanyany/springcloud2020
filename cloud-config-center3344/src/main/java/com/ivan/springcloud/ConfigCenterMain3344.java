package com.ivan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Auther: Ivan
 * @Date: 2020/4/19 18:04
 * @Description:
 */
@SpringBootApplication
@EnableConfigServer//配置中心数据修改后通知配置中心3344,那么挂在上面的3355和3366可以自动获得通知(使用bus消息总线)
//可以在命令行窗口模拟:curl -X POST "http://localhost:3344/actuator/bus-refresh" )
//若只想通知3355,则:curl -X POST "http://localhost:3344/actuator/bus-refresh/config-client:3355"
public class ConfigCenterMain3344 {

    public static void main(String[] args){
        SpringApplication.run(ConfigCenterMain3344.class, args);
    }
}
