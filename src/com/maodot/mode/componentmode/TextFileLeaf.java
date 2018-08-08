package com.maodot.mode.componentmode;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * 叶子对象: 定义没有有分支节点的行为:
 * @author maodot
 */
public class TextFileLeaf extends AbstractFileComponent {

    public TextFileLeaf(String fileName) {
        super(fileName);
    }

    @Deprecated
    @Override
    protected void add(AbstractFileComponent component) {
        throw new NotImplementedException();
    }

    @Deprecated
    @Override
    protected void remove(AbstractFileComponent component) {
        throw new NotImplementedException();
    }

    @Override
    protected void killVirus(int depth) {
        printDepth(depth);
        System.out.println("文本文件["+fileName+"]杀毒");
    }
}
