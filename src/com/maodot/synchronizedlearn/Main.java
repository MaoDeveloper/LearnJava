package com.maodot.synchronizedlearn;

import com.maodot.threadpool.ThreadPoolExecutorTest;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner1(),"t1");
        Thread t2 = new Thread(new Runner2(),"t2");
        t1.start();
        t2.start();

    }
}
