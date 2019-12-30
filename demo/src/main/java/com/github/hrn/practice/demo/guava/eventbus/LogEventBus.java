package com.github.hrn.practice.demo.guava.eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * @author 胡荣娜
 * @date 2019-05-14
 */

public class LogEventBus {
    @Subscribe
    public void handleAllEvent(Object event) {
//        log.info("EventBus - " + event);
    }
}
