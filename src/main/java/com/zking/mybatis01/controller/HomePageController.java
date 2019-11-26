package com.zking.mybatis01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * @create 2019-11-1414:57
 */
@Controller
public class HomePageController {

    /*@RequestMapping("/")
    public String goHome() {
        return "redirect:/user/login";
    }*/

    @RequestMapping("/")
    public String goHome() {
        return "login";
    }

}
