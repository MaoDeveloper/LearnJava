package com.maodot.mode.eventspring;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * 导演负责分发事件
 * @author maodot
 */
@Component
public class CustomizePublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publish(MealEvent event){
        applicationEventPublisher.publishEvent(event);
    }

    public void publish(TroubleEvent event){
        applicationEventPublisher.publishEvent(event);
    }
}
