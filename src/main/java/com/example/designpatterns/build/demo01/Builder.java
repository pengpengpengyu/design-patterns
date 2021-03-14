package com.example.designpatterns.build.demo01;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 10:52
 * 抽象建造者
 */
public abstract class Builder {

    // 建地基
    public abstract void buildA();

    // 铺钢筋水泥
    public abstract void buildB();

    // 铺电线
    public abstract void buildC();

    // 粉刷
    public abstract void buildD();


    public abstract Product getProduct();


}
