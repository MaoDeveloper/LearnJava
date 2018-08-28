package com.maodot.mode.event;

import java.util.EventListener;

/**
 * @author maodot
 */
public class StateChangeToOneListener implements EventListener {
    public void handleEvent(MyEvent event) {
        System.out.println("触发状态变为1的事件。。。");
        System.out.println("当前事件源状态为：" + ((MySource)event.getSource()).getFlag());
        System.out.println("。。。。。。。。。。。。。。。。。。。。。。。");
    }

}
