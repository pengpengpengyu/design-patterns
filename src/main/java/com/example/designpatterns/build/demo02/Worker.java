package com.example.designpatterns.build.demo02;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 11:18
 * 具体的建造者
 */
public class Worker extends Builder {

    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    public Builder buildA(String param) {
        product.setBuildA(param);
        return this;
    }

    @Override
    public Builder buildB(String param) {
        product.setBuildB(param);
        return this;
    }

    @Override
    public Builder buildC(String param) {
        product.setBuildC(param);
        return this;
    }

    @Override
    public Builder buildD(String param) {
        product.setBuildD(param);
        return this;
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
