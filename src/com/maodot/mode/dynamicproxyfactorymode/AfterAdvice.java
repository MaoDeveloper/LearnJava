package com.maodot.mode.dynamicproxyfactorymode;

/**
 * 在target的方法执行之后的接口
 * @author maodot
 */
public interface AfterAdvice {
    /**
     * 在target的方法执行之后的方法
     */
    void after();
}
