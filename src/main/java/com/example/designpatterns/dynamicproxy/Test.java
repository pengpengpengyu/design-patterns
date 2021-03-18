package com.example.designpatterns.dynamicproxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/18 9:39
 */
@Slf4j
public class Test {

    public static void main(String[] args) {
        FooService fooService = new FooServiceImpl();
        ProxyUtil proxyUtil = new ProxyUtil(fooService);
        FooService o = (FooService) Proxy.newProxyInstance(fooService.getClass().getClassLoader(), fooService.getClass().getInterfaces(), proxyUtil);

        o.test1();
        Map<String, Object> map = o.test2("a", "1");
        map.forEach((k, v) -> log.info("key===={}\nvalue==={}", k, v));
    }
}
