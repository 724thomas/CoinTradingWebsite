package com.example.cointradingwebsite.controller;


import com.example.cointradingwebsite.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("/signup")
    public String signup(@RequestParam HashMap<String,String>member){
        if (memberService.isDuplicate(member.get("email"))){
            System.out.println("이메일 중복입니다.");
            return "redirect:/goSignup";
        }
        memberService.insertMember(member);
        System.out.println("회원가입 성공");
        return "redirect:/gologin";
    }

    @PostMapping("/login")
    public String login(@RequestParam HashMap<String,String>member, HttpSession session){
        if (memberService.isMember(member.get("email"),member.get("password"))){
            session.setAttribute("email", member.get("email"));
            System.out.println("로그인 성공");
            return "redirect:/";
        }
        System.out.println("로그인 실패");
        return "redirect:/goLogin";
    }


}
