package com.example.onlineshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping({"","/"})
    public String index(){
        return "index";

    }
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    @RequestMapping("/login-error")
    public String loginError(Model model){
        model.addAttribute("/login-error", true);
        return "login";
    }

}
