package com.maodot.mode.statusmode;

/**
 * 新建
 * @author maodot
 */
public class CloseSate implements State {

    private static final CloseSate instance = new CloseSate();

    public static State getInstance(){
        return instance;
    }

    @Override
    public void handle(Context context) {
        if(this == context.getCurrent()){
            //本状态下的核心业务代码
            System.out.println("测试：ok，测了没问题，可以关闭BUG了");
            context.setCurrent(null);
        }
    }
}
