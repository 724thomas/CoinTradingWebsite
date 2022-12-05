package com.example.cointradingwebsite.service;

import com.example.cointradingwebsite.repository.SubscribeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscribeService {

    @Autowired
    SubscribeRepository subscribeRepository;

    public int subscribe(String email){
        return subscribeRepository.subscribe(email);
    }

    public boolean isDuplicate(String email){
        return subscribeRepository.selectSubscribeByEmail(email)!=null;
    }
}
