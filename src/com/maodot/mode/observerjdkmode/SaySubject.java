package com.maodot.mode.observerjdkmode;

import java.lang.reflect.Field;
import java.util.Observable;
import java.util.Vector;

/**
 * JDK支持
 *  Java语言自身提供了对观察者模式的支持:
 *  java.util包下提供了Observable类与Observer接口. 下面我们就用Java的支持实现观察者模式的推模型:
 * @author maodot
 */
public class SaySubject extends Observable {

    private String say;

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
        this.setChanged();
        this.notifyObservers(say);
    }

    @Override
    public String toString() {
        String result = "OrderSubject{";
        try {
            Field obs = Observable.class.getDeclaredField("obs");
            obs.setAccessible(true);
            Vector vector = (Vector) obs.get(this);
            result += vector;
        } catch (NoSuchFieldException | IllegalAccessException ignored) {
        }
        return result +
                "say='" + getSay() + '\'' +
                '}';
    }
}
