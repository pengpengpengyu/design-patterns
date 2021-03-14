package com.example.designpatterns.build.demo02;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 11:13
 * 创建者
 */
public abstract class Builder {

    // 汉堡
    public abstract Builder buildA(String param);

    // 可乐
    public abstract Builder buildB(String param);

    // 薯条
    public abstract Builder buildC(String param);

    // 甜品
    public abstract Builder buildD(String param);

    public abstract Product getProduct();
}
