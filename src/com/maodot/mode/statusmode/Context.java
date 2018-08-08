package com.maodot.mode.statusmode;

/**
 * 定义客户感兴趣的接口
 * 维护一个ConcreteState子类实例 -当前状态.
 * @author maodot
 */
public class Context {
    private State current;

    public Context(State current) {
        this.current = current;
    }

    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }
    public void request(){
        if(current != null){
            current.handle(this);
        }
    }
}
