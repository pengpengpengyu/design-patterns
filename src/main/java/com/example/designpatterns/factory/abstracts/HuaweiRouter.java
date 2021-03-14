package com.example.designpatterns.factory.abstracts;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 10:03
 */
public class HuaweiRouter implements RouterProduct {
    @Override
    public void start() {
        System.out.println("华为路由器开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由器关机");
    }

    @Override
    public void openWifi() {
        System.out.println("华为路由器开启wifi");
    }

    @Override
    public void setting() {
        System.out.println("华为路由器设置");
    }
}
