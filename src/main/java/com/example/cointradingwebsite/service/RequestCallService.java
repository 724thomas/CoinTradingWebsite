package com.example.cointradingwebsite.service;

import com.example.cointradingwebsite.mapper.RequestCallMapper;
import com.example.cointradingwebsite.repository.RequestCallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class RequestCallService {

    @Autowired
    RequestCallRepository requestCallRepository;

    public int requestCall(HashMap<String,String> requestCall){
        return requestCallRepository.requestCall(requestCall);
    }

    public boolean isDuplicate(HashMap<String,String> requestCall){
        return requestCallRepository.selectRequestCallByEmail(requestCall.get("email"))!=null;
    }
}
