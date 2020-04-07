package com.xiaolee.spring.cloud.feign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: xiao
 * @date: 2020/4/5
 */
@FeignClient(value = "hello-spring-cloud-service1", fallback = FallbackService.class)
public interface Service {
    @RequestMapping(value = "/service1/test", method = RequestMethod.GET)
    String test();
}
