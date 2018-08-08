package com.maodot.mode.observermode;

/**
 * Observer
 * 抽象观察者: 为那些在目标状态发生改变时需获得通知的对象定义一个更新接口.
 * @author maodot
 */
public interface Observer {
    /**
     * 向观察者提供更新的接口
     * @param subject
     */
    void update(Subject subject);
}
