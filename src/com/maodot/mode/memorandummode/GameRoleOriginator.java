package com.maodot.mode.memorandummode;

/**
 * Originator-原发器
 *  1、负责创建一个备忘录Memento, 用以记录当前时刻它的内部状态(决定Memento存储哪些内部状态 -不一定是全部属性);
 *  2、可使用备忘录恢复内部状态.
 *
 *  游戏角色, 原发器
 * @author maodot
 */
public class GameRoleOriginator {
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

    public GameRoleOriginator(int vit, int atk, int def) {
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

    public RoleStateMemento state(){
        return new RoleStateMemento(vit , atk , def);
    }

    public void recovery(RoleStateMemento roleStateMemento){
        this.setVit(roleStateMemento.getVit());
        this.setAtk(roleStateMemento.getAtk());
        this.setDef(roleStateMemento.getDef());
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
