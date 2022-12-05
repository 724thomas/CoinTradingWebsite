package com.example.cointradingwebsite.repository;

import com.example.cointradingwebsite.dto.MemberDTO;
import com.example.cointradingwebsite.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class MemberRepository {

    @Autowired
    MemberMapper memberMapper;

    public MemberDTO selectMemberByEmail(String email){
        System.out.println(email);
        return memberMapper.selectMemberByEmail(email);
    }
    public int insertMember(HashMap<String,String> member){
        return memberMapper.insertMember(member);
    }

    public HashMap<String,String> findMember(String email, String password){
        return memberMapper.findMember(email, password);
    }
}
