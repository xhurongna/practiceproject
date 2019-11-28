package com.github.hrn.practice.main;

import com.github.hrn.practice.demo.guava.eventbus.LogEventBus;
import com.google.common.eventbus.EventBus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 胡荣娜
 * @date 2019/3/18
 */
@ComponentScan({"com.github.hrn.practice"})
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public EventBus initEventBus() {
        EventBus eventBus = new EventBus();
        eventBus.register(new LogEventBus());
        return eventBus;
    }

}
