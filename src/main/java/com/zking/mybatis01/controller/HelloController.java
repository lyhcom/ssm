package com.zking.mybatis01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * @create 2019-11-1320:56
 */
@Controller
@RequestMapping("demo")
public class HelloController {

    @RequestMapping("hello")
    public String hello(String name) {
        System.out.println("hello spring mvc controller ... " + name);
        return "redirect:/demo/toA";
    }

    @RequestMapping("toA")
    public String toA() {
        return "a";
    }

}
