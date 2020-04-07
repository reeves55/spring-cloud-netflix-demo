package com.xiaolee.spring.cloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author: xiao
 * @date: 2020/4/5
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class RibbonConsumer {
    public static void main(String[] args) {
        SpringApplication.run(RibbonConsumer.class);
    }
}
