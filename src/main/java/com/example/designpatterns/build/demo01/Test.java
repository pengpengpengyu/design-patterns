package com.example.designpatterns.build.demo01;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 11:07
 */
public class Test {

    public static void main(String[] args) {
        // 指挥
        Director director = new Director();

        // 指挥具体的工人完成产品
        Product product = director.build(new Worker());
        System.out.println(product.toString());
    }
}
