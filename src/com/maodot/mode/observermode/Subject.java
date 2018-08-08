package com.maodot.mode.observermode;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject
 * 目标/主题/抽象 [通知者]:
 *  1、Subject知道它所有的观察者, 可以有任意多个观察者监听同一个目标(将观察者保存在一个聚集中);
 *  2、提供注册/删除观察者的接口.
 * @author maodot
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    /**
     * 通知所有观察者
     */
    public abstract void notifyAllObserver();

    /**
     * 获得基本状态
     * @return
     */
    public abstract String getState();

    /**
     * 设置基本状态
     * @param state
     */
    public abstract void setState(String state);
}
