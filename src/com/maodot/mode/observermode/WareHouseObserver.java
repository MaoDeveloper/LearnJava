package com.maodot.mode.observermode;

/**
 * @author maodot
 */
public class WareHouseObserver implements Observer {

    private String orderState;

    @Override
    public void update(Subject subject) {
        orderState = subject.getState();
        System.out.println("库存系统接收到消息 [" + orderState + "], 减少库存");
    }
}
