package com.example.designpatterns.factory.abstracts;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 9:58
 */
public interface RouterProduct {

    void start();

    void shutdown();

    void openWifi();

    void setting();
}
