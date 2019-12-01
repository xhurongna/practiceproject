package com.github.hrn.practice.project.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 胡荣娜
 * @date 2019-12-01
 */
@Log4j2
@RequestMapping("/index")
@RestController
public class IndexController {

    @ResponseBody
    @RequestMapping(value = "/**")
    public String index() {
        log.info("打印日志成功啦");
        return "你好";
    }
}
