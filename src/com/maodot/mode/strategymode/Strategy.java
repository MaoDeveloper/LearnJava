package com.maodot.mode.strategymode;

/**
 * <h4>Strategy</h4>
 * <p>抽象策略: 定义算法族中所有算法的公共接口, Context使用这个接口来调用ConcreteStrategy(具体实现类)定义的算法:</p>
 * @author maodot
 */
public interface Strategy {
    /**
     * 根据收到的金额返回对应策略的实收金额
     * @param money     原收金额
     * @return          实收金额
     */
    double acceptCash(double money);
}
