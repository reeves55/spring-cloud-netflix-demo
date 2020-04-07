package com.xiaolee.spring.cloud.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xiao
 * @date: 2020/4/5
 */
@RestController
@RequestMapping("/service1")
public class DemoController {
    @Value("${server.port}")
    private int port;

    @GetMapping("/test")
    public String test() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Service1 listen on port: " + port;
    }
}
