package com.xiaolee.spring.cloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: xiao
 * @date: 2020/4/5
 */
@Service
public class DemoService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallbackTest")
    public String test() {
        return restTemplate.getForObject("http://HELLO-SPRING-CLOUD-SERVICE1/service1/test", String.class);
    }

    public String fallbackTest() {
        return "熔断器 fallback 返回值，服务异常...";
    }
}
