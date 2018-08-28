package com.maodot.mode.eventspring;

import org.springframework.context.ApplicationEvent;

/**
 * 令人厌烦的事件
 * @author maoodot
 */
public class TroubleEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public TroubleEvent(Object source) {
        super(source);
    }
}
