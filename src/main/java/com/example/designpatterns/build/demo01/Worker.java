package com.example.designpatterns.build.demo01;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 11:00
 * 具体创建者：工人
 */
public class Worker extends Builder{

    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    public void buildA() {
        product.setBuildA("地基");
        System.out.println("地基");
    }

    @Override
    public void buildB() {
        product.setBuildB("钢筋水泥");
        System.out.println("钢筋水泥");

    }

    @Override
    public void buildC() {
        product.setBuildC("电线");
        System.out.println("电线");
    }

    @Override
    public void buildD() {
        product.setBuildD("粉刷");
        System.out.println("粉刷");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
