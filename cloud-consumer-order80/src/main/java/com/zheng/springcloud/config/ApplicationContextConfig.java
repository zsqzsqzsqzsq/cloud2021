package com.zheng.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    @Bean
    //@LoadBalanced //开启负载均衡
    //使用自定义的负载均衡算法
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
