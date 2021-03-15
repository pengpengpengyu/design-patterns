package com.example.designpatterns.prototype.demo01;


import java.util.Date;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Foo foo = new Foo("foo", date);
        Foo foo1 = (Foo) foo.clone();

        System.out.println("foo-> " + foo.toString());
        System.out.println("foo1-> " + foo1.toString());
        System.out.println("============================");
        date.setTime(1234455);
        foo.setCreateTime(date);
        System.out.println("foo-> " + foo.toString());
        System.out.println("foo1-> " + foo1.toString());
    }
}
