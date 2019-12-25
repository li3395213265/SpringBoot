package com.hp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello")
public class UserController {
    @RequestMapping("word")
    @ResponseBody
    public String sayhello(){
        System.out.println("haha");
        return "hehe";
    }
}
