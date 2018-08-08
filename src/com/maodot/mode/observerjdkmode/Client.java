package com.maodot.mode.observerjdkmode;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者模式：来自不同国家的人说出自己国家的语言说出制定的语言
 * @author maodot
 */
public class Client {
    public static void main(String[] args) {
        //说主题
        Observable observable = new SaySubject();

        //有哪些国家的人
        Observer england = new EnglishObserver();
        Observer japanese = new JapaneseObserver();
        Observer thai = new ThaiObserver();

        //谁加入了主题？
        observable.addObserver(england);
        observable.addObserver(japanese);
        observable.addObserver(thai);

        //主题发布了“你好”
        ((SaySubject) observable).setSay("你好");
    }
}
