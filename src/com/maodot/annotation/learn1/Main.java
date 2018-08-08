package com.maodot.annotation.learn1;

/**
 * 元注解测试
 * @author maodot
 */
public class Main {

    public static void main(String[] args) {
        People people = new Children();
        people.name();
        people.gender();
        people.work();

        //下面似乎不能证明什么，记住不要使用过时的方法，防止未来迭代出问题
        TestDeprecated testDeprecated = new TestDeprecated();
        testDeprecated.test();
    }
}
