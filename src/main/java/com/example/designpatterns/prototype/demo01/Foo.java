package com.example.designpatterns.prototype.demo01;

import java.io.Serializable;
import java.util.Date;

/**
 * 浅拷贝
 */
public class Foo implements Serializable, Cloneable {

    private String name;

    private Date createTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Foo() {
    }

    public Foo(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
