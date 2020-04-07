package com.xiaolee.spring.cloud.feign.rpc;

import org.springframework.stereotype.Component;

/**
 * @author: xiao
 * @date: 2020/4/5
 */
@Component
public class FallbackService implements Service{
    @Override
    public String test() {
        return "Feign 熔断器返回值，依赖服务暂时不可用...";
    }
}
