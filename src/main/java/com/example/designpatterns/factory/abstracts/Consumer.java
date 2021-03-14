package com.example.designpatterns.factory.abstracts;


/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 9:37
 */
public class Consumer {

    public static void main(String[] args) {

        System.out.println("==========小米产品=========");
        XiaomiProductFactory xiaomiProductFactory = new XiaomiProductFactory();
        PhoneProduct xiaomiPhone = xiaomiProductFactory.getPhone();
        xiaomiPhone.start();
        xiaomiPhone.callUp();
        xiaomiPhone.sendMessage();
        xiaomiPhone.shutdown();
        RouterProduct xiaomiRouter = xiaomiProductFactory.getRouter();
        xiaomiRouter.start();
        xiaomiRouter.setting();
        xiaomiRouter.openWifi();


        System.out.println("==========华为产品==========");
        ProductFactory  huaweiProductFactory = new HuaweiProductFactory();
        PhoneProduct huaweiPhone = huaweiProductFactory.getPhone();
        huaweiPhone.start();
        huaweiPhone.sendMessage();
        huaweiPhone.callUp();
        huaweiPhone.shutdown();

        RouterProduct huaweiRouter = huaweiProductFactory.getRouter();
        huaweiRouter.start();
        huaweiRouter.setting();
        huaweiRouter.openWifi();

    }
}
