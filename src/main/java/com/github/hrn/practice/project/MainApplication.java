package com.github.hrn.practice.project;

import com.github.hrn.practice.project.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private AppConfig appConfig;

    @RequestMapping(value = "/index")
    String index() {
        return  "spring boot 读取文件顺序 " + appConfig.getConfigPath();
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
