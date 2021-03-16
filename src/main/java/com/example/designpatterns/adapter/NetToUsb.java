package com.example.designpatterns.adapter;

/**
 * USB转网口适配器
 */
public class NetToUsb implements Adapter {

    private Reticle reticle;

    public NetToUsb(Reticle reticle) {
        this.reticle = reticle;
    }

    /**
     * 处理请求
     */
    @Override
    public void handleRequest() {
        reticle.request();
    }
}
