package com.maodot.iterable;

import java.util.LinkedList;

/**
 * 测试自定义列表 （实现Iterator接口）
 * @author maodot
 */
public class Tester {

    public static void main(String[] args) {
        //LinkedList<Integer> list = new LinkedList<>();
        LinkList<Integer> list = new LinkList<>();
        for (int i = 0 ; i < 100 ; i++){
            list.add(i);
        }

        //out
        for (Integer num : list){
            System.out.println(num);
        }

    }

}
