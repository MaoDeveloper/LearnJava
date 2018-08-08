package com.maodot.mode.iteratormode;

import java.util.Iterator;

/**
 * @author maodot
 */
public class Client {
    public static void main(String[] args) {
        MaoAggregate maoAggregate = new MaoAggregate();
        maoAggregate.add("AAAAAAAAA");
        maoAggregate.add("BBBBBBBBB");
        maoAggregate.add("CCCCCCCCC");
        maoAggregate.add("DDDDDDDDD");
        maoAggregate.add("EEEEEEEEE");
        maoAggregate.add("FFFFFFFFF");
        maoAggregate.add("GGGGGGGGG");

        Iterator<String> stringIterator = maoAggregate.iterator();
        /*
        while (stringIterator.hasNext()){
            stringIterator.next();
            stringIterator.remove();
        }
        */

        for (String str : maoAggregate) {
            System.out.println("display:" + str);
        }
        System.out.println("=========================");
        maoAggregate.forEach(s -> System.out.println(s));
    }
}
