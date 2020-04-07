package com.xiaolee.spring.cloud.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: xiao
 * @date: 2020/4/5
 */
@SpringBootApplication
public class Service1Application {
    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class);
    }
}
