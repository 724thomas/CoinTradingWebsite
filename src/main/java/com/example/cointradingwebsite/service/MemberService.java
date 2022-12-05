package com.example.cointradingwebsite.service;


import com.example.cointradingwebsite.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public boolean isDuplicate(String email){
        System.out.println(memberRepository.selectMemberByEmail(email).toString());
        return memberRepository.selectMemberByEmail(email) != null;
    }

    public int insertMember(HashMap<String,String> member){
        return memberRepository.insertMember(member);
    }

    public boolean isMember(String email, String password){
        return memberRepository.findMember(email, password) != null;
    }

}

