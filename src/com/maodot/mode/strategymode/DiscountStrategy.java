package com.maodot.mode.strategymode;

/**
 * 打折收费
 * @author maodot
 */
public class DiscountStrategy implements Strategy {

    private double rate;

    public DiscountStrategy(double rate) {
        if (rate > 1.0){
            throw new RuntimeException("折扣力度怎么能超过100%？");
        }
        this.rate = rate;
    }

    @Override
    public double acceptCash(double money) {
        return money * rate;
    }
}
