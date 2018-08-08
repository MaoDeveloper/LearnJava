package com.maodot.mode.componentmode;

/**
 * Component
 * 1、为组合模式中的对象声明接口, 在适当情况下, 实现所有类共有接口的默认行为.
 * 2、声明一个接口用于访问和管理Component子组件.
 * @author maodot
 */
public abstract class AbstractFileComponent {

    protected String fileName;

    protected AbstractFileComponent(String fileName) {
        this.fileName = fileName;
    }

    protected void printDepth(int depth){
        for (int i = 0; i < depth; i++) {
            System.out.print("--");
        }
    }

    /**
     * 添加组件
     * @param component
     */
    protected abstract void add(AbstractFileComponent component);

    /**
     * 移除组件
     * @param component
     */
    protected abstract void remove(AbstractFileComponent component);

    /**
     * 杀毒操作
     * @param depth
     */
    protected abstract void killVirus(int depth);

}
