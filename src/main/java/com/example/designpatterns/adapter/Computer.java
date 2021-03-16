package com.example.designpatterns.adapter;

/**
 * 电脑 想上网,连不上网线,需要转换器
 */
public class Computer {

    /**
     * 请求
     *
     * @param adapter
     */
    public void net(Adapter adapter) {
        adapter.handleRequest();
    }
}
