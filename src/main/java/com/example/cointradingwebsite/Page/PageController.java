package com.example.cointradingwebsite.Page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

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

    @GetMapping("/goPay")
    public String goPay(HttpSession session){
        if (session.getAttribute("email")==null){
            System.out.println("로그인이 필요합니다");
            return "redirect:/goLogin";
        }
        return "pay";
    }
}
