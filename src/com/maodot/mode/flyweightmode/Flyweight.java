package com.maodot.mode.flyweightmode;

/**
 * 所有具体享元类的超类或接口, 通过该接口, Flyweight可以接受并作用于外部状态:
 * @author maodot
 */
public interface Flyweight {
    /**
     * 接收外部状态（围棋位置信息）
     * @param location
     */
    void operation(Location location);
}
