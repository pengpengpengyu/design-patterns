package com.example.designpatterns.factory.simple;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 9:39
 */
public class CarFactory {

    public static Car getCar(String carType) {
        if ("五菱".equals(carType)) {
            return new WuLing();
        } else if ("特斯拉".equals(carType)) {
            return new Tesla();
        } else {
            return null;
        }
    }

    public static Car getWuLing() {
        return new WuLing();
    }

    public static Car getTesla() {
        return new Tesla();
    }
}
