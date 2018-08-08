package com.maodot.mode.statusmode;

/**
 * 新建
 * @author maodot
 */
public class FixedSate implements State {

    private static final FixedSate instance = new FixedSate();

    public static State getInstance(){
        return instance;
    }

    @Override
    public void handle(Context context) {
        if(this == context.getCurrent()){
            //本状态下的核心业务代码
            System.out.println("开发：BUG已经修复了，测试同学再测一测");
            context.setCurrent(CloseSate.getInstance());
        }
    }
}
