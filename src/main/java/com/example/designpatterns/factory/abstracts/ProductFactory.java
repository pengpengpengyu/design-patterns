package com.example.designpatterns.factory.abstracts;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 10:05
 * @desc 产品工厂
 */
public interface ProductFactory {

    PhoneProduct getPhone();

    RouterProduct getRouter();
}
