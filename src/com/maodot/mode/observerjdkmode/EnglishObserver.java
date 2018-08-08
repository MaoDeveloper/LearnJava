package com.maodot.mode.observerjdkmode;

import java.util.Observable;
import java.util.Observer;

/**
 * 来自英国的观察者
 * @author maodot
 */
public class EnglishObserver implements Observer {

    private final String CHARACTER_CHINESE_HELLO = "你好";
    private final String CHARACTER_CHINESE_WHERE_ARE_YOU_FROM = "你来自哪里？";

    private String say;

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("拉模式: " + o);

        if (arg == null) {
            return;
        }
        say = (String) arg;
        System.out.println("推模式: 英文翻译系统接收到消息 [" + say + "], 说出["+transfer()+"]");
    }

    private String transfer() {
        if(say != null){
            if(CHARACTER_CHINESE_HELLO.equals(say)){
                return "hello";
            }else if (CHARACTER_CHINESE_WHERE_ARE_YOU_FROM.equals(say)){
                return "I'm from England";
            }
        }
        return null;
    }
}
