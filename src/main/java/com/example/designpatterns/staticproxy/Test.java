package com.example.designpatterns.staticproxy;

public class Test {

    public static void main(String[] args) {
        FooService fooService = new FooServiceImpl();
        FooService fooProxy = new FooProxy(fooService);
        fooProxy.select();
        fooProxy.update();
        fooProxy.delete();
        fooProxy.add();
    }
}
