package com.xiaolee.spring.cloud.ribbon.controller;

import com.xiaolee.spring.cloud.ribbon.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xiao
 * @date: 2020/4/5
 */
@RestController
@RequestMapping("/consumer1")
public class DemoController {
    @Value("${server.port}")
    private int port;

    @Autowired
    private DemoService demoService;

    @GetMapping("/test")
    public String test() {
        return "response from consumer1:" + port + " " + demoService.test();
    }
}
