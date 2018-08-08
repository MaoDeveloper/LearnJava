package com.maodot.mode.memorandummode;

import java.util.Map;

/**
 * 如果Memento需要保存的是Originator的所有属性,
 * 那么可将Originator的所有属性都存储到一个Map<String, Object>结构中由Caretaker保存,
 * 这样就节省了Memento中间类的开发成本. 甚至还可将Originator序列化为二进制流/字符串存储到持久化设备中(如磁盘、DB、Redis), 节省内存开销, 下面演示将Originator转化为Map<String, Object>存储:
 * @author maodot
 */
public class GameRoleOriginator2 {
    /**
     * 生命值
     */
    private int vit;
    /**
     * 攻击力
     */
    private int atk;
    /**
     * 防御力
     */
    private int def;

    public GameRoleOriginator2(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    /**
     * 模拟战斗
     */
    public void fight(){
        this.vit -= 10;
        this.atk -=  5;
        this.def += 10;
    }

    public Map state(){
        try {
            return BeanUtil.bean2Map(this);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(this.getClass().getSimpleName()+"备忘录保存失败");
        }
    }

    public void recovery(Map memento){
        GameRoleOriginator2 bean;
        try {
            bean = BeanUtil.map2Bean((Map<String, Object>) memento);
        } catch (IllegalAccessException | InstantiationException | NoSuchFieldException e) {
            throw new RuntimeException("状态备忘录解析失败");
        }
        this.setVit(bean.getVit());
        this.setAtk(bean.getAtk());
        this.setDef(bean.getDef());
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    @Override
    public String toString() {
        return "GameRoleOriginator{" +
                "vit=" + vit +
                ", atk=" + atk +
                ", def=" + def +
                '}';
    }
}
