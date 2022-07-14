package com.example.designpatterns.iterator;

/**
 * @author wangpengyu
 * @Description
 * @create 2022-07-14 22:29
 */
public interface Aggregate<T> {

    Iterator<T> iterator();
}
