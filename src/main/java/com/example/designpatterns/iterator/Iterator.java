package com.example.designpatterns.iterator;

/**
 * @author wangpengyu
 * @Description
 * @create 2022-07-14 22:30
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();
}
