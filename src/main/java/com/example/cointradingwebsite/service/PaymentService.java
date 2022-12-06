package com.example.cointradingwebsite.service;

import com.example.cointradingwebsite.dto.PaymentDTO;
import com.example.cointradingwebsite.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public int insertIntoPayment(PaymentDTO paymentDTO){
        return paymentRepository.insertIntoPayment(paymentDTO);
    }
}
