package com.example.cointradingwebsite.repository;

import com.example.cointradingwebsite.mapper.SubscribeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SubscribeRepository {

    @Autowired
    SubscribeMapper subscribeMapper;

    public int subscribe(String email){
        return subscribeMapper.subscribe(email);
    }

    public String selectSubscribeByEmail(String email){
        return subscribeMapper.selectSubscribeByEmail(email);
    }
}
