package com.example.designpatterns.dynamicproxy;

import java.util.Map;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/18 9:34
 */
public interface FooService {

    void test1();

    Map<String, Object> test2(String key, String value);
}
