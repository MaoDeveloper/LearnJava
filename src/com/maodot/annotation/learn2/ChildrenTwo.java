package com.maodot.annotation.learn2;

import com.maodot.annotation.learn1.People;

@Description(desc = "我是一个在类上面的注解",author = "maodot",age = 23)
public class ChildrenTwo implements People {

    @Description(desc = "我是一个在方法上面的注解",author = "maodot",age = 19)
    @Override
    public void name() {
        System.out.println("name:maodot");
    }

    @Override
    public void gender() {
        System.out.println("gender:man");
    }

    @Override
    public void work() {
        System.out.println("no work");
    }
}
