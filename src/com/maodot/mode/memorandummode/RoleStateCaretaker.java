package com.maodot.mode.memorandummode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Caretaker-负责人
 *
 * 1、负责保存好备忘录Memento;
 * 2、不能对备忘录内容进行操作或检查.
 * @author maoodot
 */
public class RoleStateCaretaker {
    private Deque<RoleStateMemento> stack = new LinkedList<>();

    public void save(RoleStateMemento roleStateMemento){
        stack.push(roleStateMemento);
    }

    public RoleStateMemento checkout(){
        return stack.pop();
    }
}
