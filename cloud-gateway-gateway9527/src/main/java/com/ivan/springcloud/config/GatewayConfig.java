package com.ivan.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: Ivan
 * @Date: 2020/4/19 15:22
 * @Description:
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customeRoutLocator(RouteLocatorBuilder routeLocatorBuilder){

        //构建路由路径
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_ivan",
                r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();

        return routes.build();
    }
}
