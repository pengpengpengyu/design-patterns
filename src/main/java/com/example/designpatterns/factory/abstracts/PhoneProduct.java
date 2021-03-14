package com.example.designpatterns.factory.abstracts;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 9:54
 */
public interface PhoneProduct {

    void start();

    void shutdown();

    void callUp();

    void sendMessage();
}
