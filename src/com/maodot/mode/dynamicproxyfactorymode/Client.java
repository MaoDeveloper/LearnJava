package com.maodot.mode.dynamicproxyfactorymode;

/**
 * 执行动态代理工厂模式
 * @author maodot
 */
public class Client {
    public static void main(String[] args) {

        ProxyFactory factory = new ProxyFactory(new StarBeforeAdvice(),new RealStar(),null);
        Star star = (Star) factory.createProxy();

        star.dance();
        star.sing();

    }

    private static class StarBeforeAdvice implements BeforeAdvice{

        @Override
        public void before() {
            System.out.println("负责签约");
        }
    }

    private class StarAfterAdvice implements AfterAdvice{

        @Override
        public void after() {
            System.out.println("负责收款");
        }
    }
}
