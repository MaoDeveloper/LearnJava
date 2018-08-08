package com.maodot.mode.strategymode;

/**
 * 上下文:
 *  维护一个Strategy对象的引用;
 *  定义一个接口让Strategy访问它的数据;
 * @author maodot
 */
public class Context {

    private Strategy strategy;

    public Context() {
        //默认
        strategy = new NormalStrategy();
    }

    public void setStrategy(Type type , double... args){
        strategy = null;
        if(type == Type.NORMAL){
            strategy = new NormalStrategy();
        }else if(type == Type.DISCOUNT){
            strategy = new DiscountStrategy(args[0]);
        }else if(type == Type.REBATE){
            strategy = new RebateStrategy(args[0] , args[1]);
        }
    }

    public double getResult(double money){
        return strategy.acceptCash(money);
    }

    public enum Type{
        //原价结算
        NORMAL(0,"正常结算"),
        //打折结算
        DISCOUNT(1,"打折结算"),
        //返利结算
        REBATE(2,"返利结算");

        private int code;
        private String desc;

        Type(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }
    }
}
