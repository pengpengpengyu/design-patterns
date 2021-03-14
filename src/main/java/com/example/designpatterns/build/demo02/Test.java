package com.example.designpatterns.build.demo02;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 11:24
 */
public class Test {

    public static void main(String[] args) {
        // 直接构建，使用产品的默认属性
        Product product = new Worker().getProduct();
        System.out.println(product.toString());

        // 链式编程，动态构建
        Product product1 = new Worker().buildA("全家桶").buildB("雪碧").getProduct();
        System.out.println(product1.toString());
    }
}
