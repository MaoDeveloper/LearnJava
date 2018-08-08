package com.maodot.mode.statusmode;

/**
 * 某状态的处理接口
 * @author maodot
 */
public interface State {
    /**
     * 处理方法
     * @param context
     */
    void handle(Context context);
}
