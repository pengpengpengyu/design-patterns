package com.example.designpatterns.staticproxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FooProxy implements FooService {

    private FooService fooService;

    public FooProxy() {
    }

    public FooProxy(FooService fooService) {
        this.fooService = fooService;
    }

    @Override
    public void add() {
        fooService.add();
        log.info("新增日志");
    }

    @Override
    public void delete() {
        fooService.delete();
        log.info("删除日志");
    }

    @Override
    public void update() {
        fooService.update();
        log.info("修改日志");
    }

    @Override
    public void select() {
        fooService.select();
        log.info("查看日志");
    }
}
