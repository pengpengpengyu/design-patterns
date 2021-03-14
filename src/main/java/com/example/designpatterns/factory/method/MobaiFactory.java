package com.example.designpatterns.factory.method;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 9:49
 */
public class MobaiFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Mobai();
    }
}
