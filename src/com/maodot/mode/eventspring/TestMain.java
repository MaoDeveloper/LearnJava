package com.maodot.mode.eventspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * spring的发布者模式（发布者模式是订阅模式的经典实现）
 * 测试成员
 *      MealListener ：MealEvent               演员
 *      TroubleListener ：TroubleEvent         演员
 *      AllAcceptedListener                    演员
 *      MealEnum                               道具
 *      TestMain                             入口
 *      CustomizePublisher                     导演
 * @author maodot
 */
public class TestMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext  = new ClassPathXmlApplicationContext("com/maodot/mode/eventspring/spring-config.xml");
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("==============bean====start=================");
        for (String definitionName : definitionNames) {
            System.out.println("bean----:" + definitionName);
        }
        System.out.println("==============bean====end=================");
        System.out.println();
        final CustomizePublisher customizePublisher = applicationContext.getBean(CustomizePublisher.class);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("开始吃饭：");

                    MealEvent lunchEvent = new MealEvent("A吃午饭了", MealEnum.lunch);
                    MealEvent breakfastEvent = new MealEvent("B吃早饭了", MealEnum.breakfast);
                    MealEvent dinnerEvent = new MealEvent("C吃晚饭了", MealEnum.dinner);
                    customizePublisher.publish(lunchEvent);
                    TimeUnit.SECONDS.sleep(1L);
                    customizePublisher.publish(breakfastEvent);
                    TimeUnit.SECONDS.sleep(1L);
                    customizePublisher.publish(dinnerEvent);
                    TimeUnit.SECONDS.sleep(1L);


                    System.out.println("他们吃完了！");
                    TroubleEvent troubleEvent = new TroubleEvent("哈哈，被放泻药了");
                    customizePublisher.publish(troubleEvent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setName("meal-thread");
        thread.start();

        System.out.println(Thread.currentThread().getName() + " is waiting for ....");
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done!!!!!!!!!!!!");
    }
}
