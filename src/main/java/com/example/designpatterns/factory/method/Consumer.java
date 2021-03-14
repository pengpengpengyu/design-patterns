package com.example.designpatterns.factory.method;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 9:37
 */
public class Consumer {

    public static void main(String[] args) {

       Car wuling = new WuLingFactory().getCar();
       Car tesla = new TeslaFactory().getCar();
       Car mobai = new MobaiFactory().getCar();
       wuling.name();
       tesla.name();
       mobai.name();
    }
}
