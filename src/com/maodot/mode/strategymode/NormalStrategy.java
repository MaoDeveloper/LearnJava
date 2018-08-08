package com.maodot.mode.strategymode;

/**
 * 正常收费
 * @author maodot
 */
public class NormalStrategy implements Strategy {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
