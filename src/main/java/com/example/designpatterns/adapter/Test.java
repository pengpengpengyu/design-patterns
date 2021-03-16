package com.example.designpatterns.adapter;

public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Reticle reticle = new Reticle();
        Adapter adapter = new NetToUsb(reticle);
        computer.net(adapter);

    }
}
