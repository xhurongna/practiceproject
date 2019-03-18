package com.github.hrn.practice.project;

import org.springframework.boot.SpringApplication;
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
    String index() {
        return  "hello spring boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
