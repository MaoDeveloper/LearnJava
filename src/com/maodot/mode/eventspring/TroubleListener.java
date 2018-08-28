package com.maodot.mode.eventspring;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 监听令人厌烦的事件
 * @author maodot
 */
@Component
public class TroubleListener implements ApplicationListener<TroubleEvent> {
    @Override
    public void onApplicationEvent(TroubleEvent event) {
        System.out.println(">>>>>>>>>>>>>>>>event:" + event);
    }
}
