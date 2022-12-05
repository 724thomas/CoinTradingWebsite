package com.example.cointradingwebsite.controller;

import com.example.cointradingwebsite.service.RequestCallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class RequestCallController {

    @Autowired
    RequestCallService requestCallService;

    @PostMapping("/requestCall")
    public String requestCall(@RequestParam HashMap<String,String> requestCall){
        if(requestCallService.isDuplicate(requestCall)){
            System.out.println("이미 요청했습니다.");
            return "redirect:/";
        }
        requestCallService.requestCall(requestCall);
        System.out.println("전화 요청 완료");
        return "redirect:/";
    }
}
