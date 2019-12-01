package com.github.hrn.practice.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 胡荣娜
 * @date 2019-12-01
 */
@RequestMapping("/index")
@RestController
public class IndexController {

    @ResponseBody
    public String index() {
        return "你好";
    }
}
