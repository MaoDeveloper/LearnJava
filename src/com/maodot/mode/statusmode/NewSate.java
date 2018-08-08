package com.maodot.mode.statusmode;

/**
 * 新建
 * @author maodot
 */
public class NewSate implements State {

    private static final NewSate instance = new NewSate();

    public static State getInstance(){
        return instance;
    }

    @Override
    public void handle(Context context) {
        if(this == context.getCurrent()){
            //本状态下的核心业务代码
            System.out.println("测试：发现新BUG，开发同学赶紧处理一下");
            context.setCurrent(OpenSate.getInstance());
        }
    }
}
