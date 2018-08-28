package com.maodot.mode.event;

/**
 * java 事件机制
 *  一般包含 ObjectEvent 、EventListener 、 Source
 * @author maodot
 */
public class Main {

    public static void main(String[] args) {
        MySource source = new MySource();
        source.addStateChangeListener(new StateChangeListener());
        source.addStateChangeToOneListener(new StateChangeToOneListener());

        source.changeFlag();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        source.changeFlag();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        source.changeFlag();

    }

}
