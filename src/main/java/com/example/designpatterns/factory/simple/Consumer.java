package com.example.designpatterns.factory.simple;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 9:37
 */
public class Consumer {

    public static void main(String[] args) {
       /* Car car = CarFactory.getCar("五菱");

        Car tesla = CarFactory.getCar("特斯拉");

        car.name();
        tesla.name();*/

       Car wuling = CarFactory.getWuLing();
       Car tesla = CarFactory.getTesla();
       wuling.name();
       tesla.name();
    }
}
