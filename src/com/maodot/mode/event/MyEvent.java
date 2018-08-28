package com.maodot.mode.event;

import java.util.EventObject;

/**
 * 事件
 * @author maodot
 */
public class MyEvent extends EventObject {

    private static final long serialVersionUID = 5637271027901698990L;

    private int urlState;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public MyEvent(Object source) {
        super(source);
    }

    public int getUrlState() {
        return urlState;
    }
}
