package com.maodot.mode.strategymode;

/**
 * 策略模式
 * 案例: 商场打折 -策略可以简单分为: 原价购买、满减、返利三种策略:
 * @author maodot
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        System.out.println(context.getResult(10000));

        context.setStrategy(Context.Type.DISCOUNT,0.8);
        System.out.println(context.getResult(10000));

        context.setStrategy(Context.Type.REBATE,100,40);
        System.out.println(context.getResult(10000));
    }
    /*  作用
        1、析取算法: Strategy接口为Context定义了一个可重用的算法/行为, 继承/实现其有助于析取出算法族的公共功能, 且可减少算法与Client间的耦合.
        2、消除条件语句: 避免将不同行为堆砌在一个类中, 将行为封装在独立的Strategy实现中, 可在Client中消除条件语句.
        3、简化单元测试: 每个算法都有自己的类, 可以单独测试.

        场景
        1、当使用一个算法的不同变体, 且这些变体可以实现为一个算法族时;
        2、算法的客户不需要知晓其内部数据, 策略模式可以避免暴露复杂的、与算法相关的数据结构;
        3、一个类定义了多种行为, 且这些行为以多个条件语句形式出现, 可将相关行为各自的Strategy(如: Servlet-api service()方法).
        */
}
