package com.example.designpatterns.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/18 9:36
 * 动态代理类
 */
public class ProxyUtil implements InvocationHandler {

    private Object target;

    public ProxyUtil(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(String.format("动态代理===执行方法开始，方法名称-%s,参数%s", method.getName(), args));
        Object o = method.invoke(target, args);
        System.out.println(String.format("动态代理===执行方法结束，方法名称-%s", method.getName()));
        return o;
    }
}
