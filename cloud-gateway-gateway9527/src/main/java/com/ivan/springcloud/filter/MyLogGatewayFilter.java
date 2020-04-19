package com.ivan.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @Auther: Ivan
 * @Date: 2020/4/19 16:05
 * @Description: 自定义过滤去
 */
@Component
@Slf4j
public class MyLogGatewayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("*********come in MyLogGatewayFilter: " + new Date());
        String username = exchange.getRequest().getQueryParams().getFirst("username");
        if (username == null){
            log.info("******用户名为null,非法用户o(╥﹏╥)o");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        //合法用户,传递到下一个
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
