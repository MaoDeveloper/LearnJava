package com.maodot.mode.dynamicproxyfactorymode;

/**
 * 在target之前执行的接口
 * @author maodot
 */
public interface BeforeAdvice {
    /**
     * 在target之前执行的方法
     */
    void before();
}
