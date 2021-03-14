package com.example.designpatterns.factory.abstracts;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 10:00
 */
public class XiaomiPhone implements PhoneProduct {
    @Override
    public void start() {
        System.out.println("小米开机！");
    }

    @Override
    public void shutdown() {
        System.out.println("小米关机！");
    }

    @Override
    public void callUp() {
        System.out.println("小米打电话！");
    }

    @Override
    public void sendMessage() {
        System.out.println("小米发短信！");
    }
}
