package com.github.hrn.practice.project.guava.eventbus;

import com.google.common.eventbus.Subscribe;
import lombok.extern.log4j.Log4j2;

/**
 * @author 胡荣娜
 * @date 2019-05-14
 */
@Log4j2
public class LogEventBus {
    @Subscribe
    public void handleAllEvent(Object event) {
        log.info("EventBus - " + event);
    }
}
