package com.example.cointradingwebsite.controller;

import com.example.cointradingwebsite.service.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SubscribeController {

    @Autowired
    SubscribeService subscribeService;

    @GetMapping("/subscribe")
    public String subscribe(String email){
        if (subscribeService.isDuplicate(email)){
            System.out.println("이미 구독했습니다.");
            return "redirect:/";
        }
        subscribeService.subscribe(email);
        System.out.println("구독하기 완료");
        return "redirect:/";
    }
}
