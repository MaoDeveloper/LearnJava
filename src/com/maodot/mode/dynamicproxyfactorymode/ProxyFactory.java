package com.maodot.mode.dynamicproxyfactorymode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工厂
 * @author maodot
 */
public class ProxyFactory {
    private BeforeAdvice beforeAdvice;
    private Object target;
    private AfterAdvice afterAdvice;

    public ProxyFactory(BeforeAdvice beforeAdvice, Object target, AfterAdvice afterAdvice) {
        this.beforeAdvice = beforeAdvice;
        this.target = target;
        this.afterAdvice = afterAdvice;
    }

    private InvocationHandler handler = new InvocationHandler() {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object resullt = null;
            if (beforeAdvice != null) {
                beforeAdvice.before();
            }
            if (target != null) {
                resullt = method.invoke(target,args);
            }
            if (afterAdvice != null) {
                afterAdvice.after();
            }
            return resullt;
        }
    };

    public Object createProxy(){
        return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),target.getClass().getInterfaces(),handler);
    }
}
