package com.example.designpatterns.build.demo01;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 11:04
 * 指挥：核心，负责指挥构建一个工程，工程如何构建由他决定
 */
public class Director {

    /**
     * 指挥工人按顺序建房子
     *
     * @param builder
     * @return
     */
    public Product build(Builder builder) {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }
}
