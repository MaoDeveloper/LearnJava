package com.maodot.mode.observermode;

/**
 * 通知方式
 * 以上我们采用的是拉模型实现Subject对Observer通知(传递Subject自身), 在观察者模式中还有一种推模型实现:
 *
 * 拉模型 :
 *  Subject把自身(this)通过update()方法传递给观察者, 观察者只要知道有通知到来即可, 至于什么时候获取什么内容都可自主决定.
 * 推模型 :
 *  Subject主动向观察者推送有关状态的详细信息, 推送的信息通常是目标对象的全部或部分数据. 观察者只能被动接收.
 * 对比
 *  推模型中假定Subject知道观察者需要数据的详细信息, 而拉模型中Subject不需要知道观察者具体需要什么数据(因此把自身传过去, 由观察者取值).因此:
 *
 *  推模型会使观察者对象难以复用;
 *  拉模型下, 由于update()方法参数是Subject本身, 基本上可以适应各种情况的需要.
 * @author maodot
 */
public class OrderSubject extends Subject {

    private String state;

    /**
     * 采用拉模型, 将Subject自身发送给Observer
     */
    @Override
    public void notifyAllObserver() {
        for (Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
        this.notifyAllObserver();
    }
}
