package com.github.hrn.practice.project.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 胡荣娜
 * @date 2019-11-28
 */
@Log4j2
@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    @ResponseBody
    public String index() {
        log.info("打印日志");
        return "你好";
    }
}
