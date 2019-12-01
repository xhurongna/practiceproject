package com.github.hrn.practice.demo.guava.eventbus;

import com.google.common.eventbus.Subscribe;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 胡荣娜
 * @date 2019-05-14
 */
@Slf4j
public class LogEventBus {
    @Subscribe
    public void handleAllEvent(Object event) {
        log.info("EventBus - " + event);
    }
}
