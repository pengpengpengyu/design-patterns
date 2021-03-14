package com.example.designpatterns.factory.abstracts;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 10:01
 */
public class HuaweiPhone implements PhoneProduct {

    @Override
    public void start() {
        System.out.println("华为开机！");
    }

    @Override
    public void shutdown() {
        System.out.println("华为关机！");
    }

    @Override
    public void callUp() {
        System.out.println("华为打电话！");
    }

    @Override
    public void sendMessage() {
        System.out.println("华为发短信！");
    }
}
