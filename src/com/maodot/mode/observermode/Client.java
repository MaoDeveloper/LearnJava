package com.maodot.mode.observermode;

/**
 * 以电商系统下单:
 * 用户购买某件商品下一个订单, 需要: 通知库存系统减少库存、通知商家系统发货、通知支付系统收钱、甚至还会通知关系中心使当前用户关注该商家.
 * @author maodot
 */
public class Client {

    public static void main(String[] args) {
        //主题
        Subject subject = new OrderSubject();

        //观察者
        Observer wareHouseObserver = new WareHouseObserver();
        Observer payObserver = new PayObserver();
        Observer relationObserver = new RelationObserver();

        //关注--[注册]
        subject.attach(wareHouseObserver);
        subject.attach(payObserver);
        subject.attach(relationObserver);

        subject.setState("已付款");
        System.out.println("---------------------------");

        //付钱、发货完成
        subject.detach(payObserver);
        subject.detach(wareHouseObserver);

        subject.setState("取消订单");
    }
}
