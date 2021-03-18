package com.example.designpatterns.dynamicproxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/18 9:34
 */
public class FooServiceImpl implements FooService {
    @Override
    public void test1() {
        System.out.println("调用了方法1");
    }

    @Override
    public Map<String, Object> test2(String key, String value) {
        Map<String, Object> map = new HashMap<>();
        map.put(key, value);
        return map;
    }
}
