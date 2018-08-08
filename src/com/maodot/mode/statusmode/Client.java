package com.maodot.mode.statusmode;

/**
 * 状态模式
 * 状态模式: 允许一个对象在其内部状态改变时改变其行为, 其对象看起来像是改变了其类.
 * 案例: 问题跟踪(Bug状态流转):
 * 新建(New) -> 打开(Open) -> 解决(Fixed) -> 关闭(Closed) …
 * @author maodot
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context(NewSate.getInstance());

        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
    }

}
