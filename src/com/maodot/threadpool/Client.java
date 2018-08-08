package com.maodot.threadpool;

public class Client {
    private ThreadPoolExecutorTest test = new ThreadPoolExecutorTest();

    public void testProtected(){
        test.testCachedThreadPool();
    }
}
