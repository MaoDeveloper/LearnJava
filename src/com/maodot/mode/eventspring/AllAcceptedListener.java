package com.maodot.mode.eventspring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 接受全部事件的演员（很负责任啊）
 * @author maodot
 */
@Component
public class AllAcceptedListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("AllAcceptedListener > event:" + event.toString());
    }
}
