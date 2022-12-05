package com.example.cointradingwebsite.controller;

import com.example.cointradingwebsite.dto.PaymentDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class PaymentController {

    @GetMapping("/point")
    public String point(@RequestParam HashMap<String,Object> payment){
//        [amount, uid]
//        [5000, imp_426246486332]

        return "redirect:/";
    }
}
