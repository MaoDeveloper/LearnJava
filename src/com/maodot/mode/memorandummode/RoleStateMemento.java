package com.maodot.mode.memorandummode;

/**
 * Memento-备忘录
 * 角色状态备忘录
 *
 * 负责存储Originator的内部状态(与Originator共同决定存储原发器哪些内部状态);
 * 防止Originator以外对象访问备忘录. Memento实际应该有两个接口:
 *      1、Caretaker 只能看到一个窄接口 -只能将备忘录传递给其他对象.
 *      2、Originator 能够看到一个宽接口, 允许它访问返回先前状态所需的所有数据(C++中可由friend提供支持). 理想的情况是只允许生成本备忘录的那个原发器访问本备忘录的内部状态.
 * @author maodot
 */
public class RoleStateMemento {
    private int vit;
    private int atk;
    private int def;

    private RoleStateMemento() {
    }

    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }
}
