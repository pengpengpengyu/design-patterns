package com.example.designpatterns.factory.abstracts;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 10:09
 */
public class HuaweiProductFactory implements ProductFactory {
    @Override
    public PhoneProduct getPhone() {
        return new HuaweiPhone();
    }

    @Override
    public RouterProduct getRouter() {
        return new HuaweiRouter();
    }
}
