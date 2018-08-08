package com.maodot.mode.flyweightmode;

/**
 * 享元模式可以极大减少内存中对象的数量:
 * 相同/相似对象只保留一份, 节约资源, 提高性能. 且将外部状态剥离, 使外部状态相对独立, 不影响内部状态.
 * 但相比原先的设计, 增加了实现复杂度, 且读取外部状态使得运行时间变长(时间换空间).
 *
 *  场景
 *  1、 如果一个应用使用了大量对象从而造成很大的存储开销时;
 *  2、如果对象的有大量外部状态, 且剥离外部状态就可用相对较少的共享对象取代很多实例时;
 *          ‘池’化资源, 如: 线程池、数据库连接池.
 * String类设计.
 * @author maodot
 */
public class Client {

    public static void main(String[] args) {

        //黑棋、白棋
        GoFlyweight black = FlyweightFactory.getGoFlyweight("黑色");
        GoFlyweight white = FlyweightFactory.getGoFlyweight("白色");

        //黑棋第一步、白棋第二步、轮流下棋
        Location step1 = new Location(1,2);
        black.operation(step1);
        Location step2 = new Location(4,2);
        white.operation(step2);
        Location step3 = new Location(2,3);
        black.operation(step3);
        Location step4 = new Location(5,1);
        white.operation(step4);
    }

}
