package com.maodot.mode.eventspring;

import org.springframework.context.ApplicationEvent;

/**
 * 事件：吃饭的事件
 * @author maodot
 */
public class MealEvent extends ApplicationEvent {

    private MealEnum mealEnum;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MealEvent(Object source , MealEnum mealEnum) {
        super(source);
        this.mealEnum = mealEnum;
    }

    public MealEnum getMealEnum(){
        return mealEnum;
    }
}
