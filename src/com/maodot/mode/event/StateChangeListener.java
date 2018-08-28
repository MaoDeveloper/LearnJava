package com.maodot.mode.event;

import java.util.EventListener;

/**
 *
 * @author maodot
 */
public class StateChangeListener implements EventListener {
    public void handleEvent(MyEvent event) {
        System.out.println("触发状态改变事件。。。");
        System.out.println("当前事件源状态为：" + event.getUrlState());
        System.out.println("#######################################");
    }
}
