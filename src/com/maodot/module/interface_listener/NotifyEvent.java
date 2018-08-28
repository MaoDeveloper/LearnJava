package com.maodot.module.interface_listener;

import org.springframework.context.ApplicationEvent;

/**
 * 发生异常的通知事件
 * @author maodot
 */
public class NotifyEvent extends ApplicationEvent {


    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public NotifyEvent(Object source) {
        super(source);
    }
}
