package com.maodot.mode.dynamicproxymode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理
 * @author maodot
 */
public class ProxyHandle implements InvocationHandler {

    private static final String PROXY_METHOD_NAME = "sing";

    private Star star;

    public ProxyHandle(Star star) {
        this.star = star;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        if (!PROXY_METHOD_NAME.equals(method.getName())) {
            result = method.invoke(star, args);
            return result;
        }
        System.out.println("签约");
        result = method.invoke(star, args);
        System.out.println("收款");
        return result;
    }
}
