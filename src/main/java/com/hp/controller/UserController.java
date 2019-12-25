package com.hp.controller;

import com.hp.jopo.User;
import com.hp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("hello")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("word")
    @ResponseBody
    public String sayhello(){
        System.out.println("haha");
        return "hehe";
    }
    @GetMapping("/{id}")
    @ResponseBody
    public User query(@PathVariable("id") Long id){
        User user = userService.query(id);
        return user;
    }
    @GetMapping("/del/{ids}")
    @ResponseBody
    public String delete(@PathVariable("ids") Long id){
       userService.delete(id);
        return "shanchu";
    }
    @GetMapping("list")
    public String queyuser(Model model){
        List<User> list = userService.queyuser();
            model.addAttribute("and",list);
        return  "xian";
    }
}
