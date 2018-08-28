package com.maodot.mode.event;

import java.util.EventListener;
import java.util.HashSet;
import java.util.Set;

/**
 * @author maodot
 */
public class MySource {
    private int flag;
    private Set<EventListener> listeners = new HashSet<>();

    public void addStateChangeListener(StateChangeListener listener){
        listeners.add(listener);
    }

    public void addStateChangeToOneListener(StateChangeToOneListener listener){
        listeners.add(listener);
    }

    public void notifyAllListener(){
        for (EventListener listener : listeners){
            if (listener instanceof StateChangeListener){
                ((StateChangeListener) listener).handleEvent(new MyEvent(this));
            }
            if (listener instanceof StateChangeToOneListener){
                ((StateChangeToOneListener) listener).handleEvent(new MyEvent(this));
            }
        }
    }

    public void changeFlag(){
        flag = (flag == 0) ? 1 : 0;
        notifyAllListener();
    }

    public int getFlag() {
        return flag;
    }
}
