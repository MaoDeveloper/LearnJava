package com.maodot.annotation.learn1;

public class Children implements People {
    @Override
    public void name() {
        System.out.println("我是小孩子");
    }

    @Override
    public void gender() {
        System.out.println("我今年5岁了");
    }

    @Override
    public void work() {
        System.out.println("我的工作是指挥老爸");
    }
}
