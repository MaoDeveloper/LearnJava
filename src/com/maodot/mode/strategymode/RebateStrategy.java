package com.maodot.mode.strategymode;

/**
 * 返利收费
 * @author maodot
 */
public class RebateStrategy implements Strategy {

    private double cashStat;

    private double cashReturn;

    public RebateStrategy(double cashStat, double cashReturn) {
        this.cashStat = cashStat;
        this.cashReturn = cashReturn;
    }

    @Override
    public double acceptCash(double money) {
        if (money > cashStat){
            money -= Math.floor(money / cashStat) * cashReturn;
        }
        return money;
    }
}
