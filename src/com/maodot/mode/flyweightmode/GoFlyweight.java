package com.maodot.mode.flyweightmode;

/**
 * ConcreteFlyweight：
 * 实现Flyweight接口, 并为内部状态增加存储空间:
 * @author maoodt
 */
public class GoFlyweight implements Flyweight {

    private String color;
    private String radius;
    private String material;

    public GoFlyweight(String color, String radius, String material) {
        this.color = color;
        this.radius = radius;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public String getRadius() {
        return radius;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void operation(Location location) {
        System.out.println("[" + color + "]棋 [" + material + "]材质 半径[" + radius + "]CM 落在" + location);
    }
}
