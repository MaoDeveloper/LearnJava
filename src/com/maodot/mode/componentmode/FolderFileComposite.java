package com.maodot.mode.componentmode;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器对象: 定义有分支节点的行为, 用来存储子部件, 实现与子部件有关的操作:
 *  * @author maodot
 */
public class FolderFileComposite extends AbstractFileComponent {

    private List<AbstractFileComponent> components = new ArrayList<>();

    public FolderFileComposite(String fileName) {
        super(fileName);
    }

    @Override
    protected void add(AbstractFileComponent component) {
        components.add(component);
    }

    @Override
    protected void remove(AbstractFileComponent component) {
        components.remove(component);
    }

    @Override
    protected void killVirus(int depth) {
        printDepth(depth);
        System.out.println("目录 [" + fileName + "]杀毒");

        for (AbstractFileComponent component : components) {
            component.killVirus(depth + 2);
        }
    }
}
