package com.maodot.mode.dynamicproxymode;

import java.lang.reflect.Proxy;

/**
 * 实现代理1 , 无工厂模式
 * @author maodot
 */
public class Client1 {
    public static void main(String[] args) {
        Star star = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},new ProxyHandle(new RealStar()));
        star.dance();
        star.sing();
    }
}

