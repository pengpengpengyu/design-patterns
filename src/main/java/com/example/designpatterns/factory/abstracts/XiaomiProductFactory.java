package com.example.designpatterns.factory.abstracts;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 10:07
 */
public class XiaomiProductFactory implements ProductFactory {
    @Override
    public PhoneProduct getPhone() {
        return new XiaomiPhone();
    }

    @Override
    public RouterProduct getRouter() {
        return new XiaomiRouter();
    }
}
