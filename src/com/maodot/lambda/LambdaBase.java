package com.maodot.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * 简单的lambda示例
 * @author maodot
 */
public class LambdaBase {

    public static void main(String[] args) {
        new LambdaBase().test1();
    }

    public void test1(){
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        strings.add("f");
        strings.add("g");
        strings.add("h");

        System.out.println("==================参数有括号方式 ::===================");
        strings.forEach((s)-> System.out.println(s));
        System.out.println("==================参数无括号方式 ::===================");
        strings.forEach(s-> System.out.println(s));
        System.out.println("==================双冒号方式 ::===================");
        strings.forEach(System.out::println);
    }
}
