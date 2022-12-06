package com.example.cointradingwebsite.repository;

import com.example.cointradingwebsite.dto.PaymentDTO;
import com.example.cointradingwebsite.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {

    @Autowired
    PaymentMapper paymentMapper;

    public int insertIntoPayment(PaymentDTO paymentDTO){
        return paymentMapper.insertIntoPayment(paymentDTO);
    }
}
