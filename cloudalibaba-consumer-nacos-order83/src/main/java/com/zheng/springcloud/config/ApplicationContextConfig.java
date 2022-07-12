package com.zheng.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: TODO
 * @author: zsq
 * @date: 2022年04月12日 11:56
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced   //赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
