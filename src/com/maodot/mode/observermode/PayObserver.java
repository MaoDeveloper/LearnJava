package com.maodot.mode.observermode;

/**
 * @author maodot
 */
public class PayObserver implements Observer {

    private String orderState;

    @Override
    public void update(Subject subject) {
        orderState = subject.getState();
        System.out.println("支付系统接收到消息 [" + orderState + "], 正在收钱");
    }
}
