package com.maodot.mode.flyweightmode;

import java.util.HashMap;
import java.util.Map;

/**
 * FlyweightFactory
 * 享元工厂,用来创建并管理Flyweight对象,作用是确保合理地共享Flyweight, 当用户请求一个Flyweight时, FlyweightFactory提供一个共享实例:
 * @author maodot
 */
public class FlyweightFactory {
    private static Map<String,GoFlyweight> map = new HashMap<>();

    public static GoFlyweight getGoFlyweight(String color){
        GoFlyweight goFlyweight = map.get(color);
        if (goFlyweight == null) {
            goFlyweight = new GoFlyweight(color,"1.1","大理石");
            map.put(color,goFlyweight);
        }
        return goFlyweight;
    }
}
