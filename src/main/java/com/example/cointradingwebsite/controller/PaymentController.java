package com.example.cointradingwebsite.controller;

import com.example.cointradingwebsite.dto.PaymentDTO;
import com.example.cointradingwebsite.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/point")
    public String point(@ModelAttribute PaymentDTO paymentDTO, HttpSession session){
        paymentDTO.setEmail(String.valueOf(session.getAttribute("email")));
        System.out.println(paymentDTO.getEmail() + " 님의 결제가 완료되었습니다.");
        System.out.println(paymentDTO.getAmount() + " 포인트가 충전되었습니다.");
        System.out.println(paymentDTO.getUid() + " 결제번호입니다.");
        paymentService.insertIntoPayment(paymentDTO);
//        [amount, uid]
//        [5000, imp_426246486332]
        return "redirect:/";
    }
}
