package com.maodot.mode.observermode;

/**
 * @author maodot
 */
public class RelationObserver implements Observer {

    private String orderState;

    @Override
    public void update(Subject subject) {
        orderState = subject.getState();
        if (orderState.equals("已付款")) {
            System.out.println("关系系统接收到消息 [" + orderState + "], 当前用户已关注该店铺");
        } else if (orderState.equals("取消订单")) {
            System.out.println("关系系统接收到消息 [" + orderState + "], 当前用户取消关注该店铺");
        }
    }
}
