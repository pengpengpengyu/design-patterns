package com.example.designpatterns.bridge;

/**
 * 笔记本
 */
public class Laptop extends Computer{

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("笔记本");
    }
}
