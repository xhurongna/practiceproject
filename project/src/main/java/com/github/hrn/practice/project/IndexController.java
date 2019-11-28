package com.github.hrn.practice.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 胡荣娜
 * @date 2019-11-28
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    @ResponseBody
    public String index() {
        return "你好";
    }
}
