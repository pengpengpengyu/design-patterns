package com.example.designpatterns.bridge;

/**
 * 电脑: 角色-桥
 */
public abstract class Computer {

    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info() {
        brand.info();
    }
}
