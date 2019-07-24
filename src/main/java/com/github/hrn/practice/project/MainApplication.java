package com.github.hrn.practice.project;

import com.github.hrn.practice.project.guava.eventbus.LogEventBus;
import com.google.common.eventbus.EventBus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 胡荣娜
 * @date 2019/3/18
 */
@RestController
@SpringBootApplication
public class MainApplication {

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    void index(HttpServletRequest httpServletRequest) throws Exception {
        System.out.println("爬虫调用本方法");
        System.out.println(httpServletRequest);
    }

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
