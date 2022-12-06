package com.example.cointradingwebsite.mapper;

import com.example.cointradingwebsite.dto.PaymentDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper {

    public int insertIntoPayment(PaymentDTO paymentDTO);
}
