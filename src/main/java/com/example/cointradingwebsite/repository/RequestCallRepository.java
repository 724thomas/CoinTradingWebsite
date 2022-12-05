package com.example.cointradingwebsite.repository;

import com.example.cointradingwebsite.mapper.RequestCallMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class RequestCallRepository {

    @Autowired
    RequestCallMapper requestCallMapper;

    public int requestCall(HashMap<String,String> requestCall){
        return requestCallMapper.requestCall(requestCall);
    }

    public HashMap<String,String> selectRequestCallByEmail(String email){
        return requestCallMapper.selectRequestCallByEmail(email);
    }
}
