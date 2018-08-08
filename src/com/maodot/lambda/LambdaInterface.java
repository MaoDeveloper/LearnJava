package com.maodot.lambda;

/**
 * 使用lambda实现接口
 * @author maodot
 */
public class LambdaInterface {

    /**
     * 1、
     */
    public void one(){
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

}
