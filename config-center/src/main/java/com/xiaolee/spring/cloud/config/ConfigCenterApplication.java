package com.xiaolee.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: xiao
 * @date: 2020/4/5
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterApplication.class);
    }
}
