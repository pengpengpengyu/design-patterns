package com.example.designpatterns.bridge;

public class Lenovo implements Brand {
    @Override
    public void info() {
        System.out.print("联想,");
    }
}
