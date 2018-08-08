package com.maodot.mode.memorandummode;

/**
 * 备忘录模式
 * 案例: 游戏进度保存
 * 在攻击Boss前, 将当前游戏进度保存, 万一失败还可从保存点重新开始.
 * @author maodot
 */
public class Client {

    public static void main(String[] args) {
        RoleStateCaretaker caretaker = new RoleStateCaretaker();

        GameRoleOriginator roleOriginator = new GameRoleOriginator(100,30,30);
        System.out.println("角色初始化-->"+roleOriginator.toString());
        //保存初始化状态
        caretaker.save(roleOriginator.state());
        //战斗
        System.out.println("fight with BOSS..");
        roleOriginator.fight();
        //保存第一次战斗之后的状态
        caretaker.save(roleOriginator.state());
        //保存第二次战斗之后的状态
        roleOriginator.fight();
        System.out.println("after fight -->"+roleOriginator.toString());
        roleOriginator.recovery(caretaker.checkout());
        System.out.println("after recovery two-->"+roleOriginator.toString());
        roleOriginator.recovery(caretaker.checkout());
        System.out.println("after recovery-- one>"+roleOriginator.toString());
    }
}
