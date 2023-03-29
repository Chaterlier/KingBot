package com.kingbot.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: backend
 * @description:
 * @author: chatelier
 * @create: 2023/3/29 21:36
 */
@Controller
@RequestMapping("/pk/")
public class IndexController {

    @GetMapping("index/")
    public String index() {
        return "pk/index.html";
    }
}
