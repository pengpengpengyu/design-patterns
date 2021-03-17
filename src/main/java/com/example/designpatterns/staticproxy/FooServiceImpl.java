package com.example.designpatterns.staticproxy;


public class FooServiceImpl implements FooService {
    @Override
    public void add() {
        System.out.println("新增");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }

    @Override
    public void update() {
        System.out.println("修改");
    }

    @Override
    public void select() {
        System.out.println("查询");
    }
}
