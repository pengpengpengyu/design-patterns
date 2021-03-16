package com.example.designpatterns.bridge;

public class Test {

    public static void main(String[] args) {
        Computer computer = new Desktop(new Lenovo());
        computer.info();

        Computer lenovoLaptop = new Laptop(new Lenovo());
        lenovoLaptop.info();

        System.out.println("---------------------苹果-----------------------");
        Computer appleDesktop = new Desktop(new Apple());
        Computer appleLaptop = new Laptop(new Apple());
        appleDesktop.info();
        appleLaptop.info();
    }
}
