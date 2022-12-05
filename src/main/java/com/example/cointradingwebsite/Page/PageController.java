package com.example.cointradingwebsite.Page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/goSignup")
    public String goSignup(){
        return "signup";
    }

    @GetMapping("/goLogin")
    public String goLogin(){
        return "login";
    }
}
