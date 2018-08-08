package com.maodot.mode.statusmode;

/**
 * 新建
 * @author maodot
 */
public class OpenSate implements State {

    private static final OpenSate instance = new OpenSate();

    public static State getInstance(){
        return instance;
    }

    @Override
    public void handle(Context context) {
        if(this == context.getCurrent()){
            //本状态下的核心业务代码
            System.out.println("开发：好的，看见了，让我看看先！");
            context.setCurrent(FixedSate.getInstance());
        }
    }
}
