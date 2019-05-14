package com.github.hrn.practice.project;

import org.springframework.boot.SpringApplication;
import com.github.hrn.practice.project.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 胡荣娜
 * @date 2019/3/18
 */
@RestController
@SpringBootApplication
public class MainApplication {

    @RequestMapping(value = "/index")
    String index(HttpServletRequest httpServletRequest) throws Exception {
        return IpAddressUtil.getClientIpAddress(httpServletRequest);
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
