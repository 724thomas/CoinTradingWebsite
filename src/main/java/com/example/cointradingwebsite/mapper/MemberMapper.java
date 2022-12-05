package com.example.cointradingwebsite.mapper;


import com.example.cointradingwebsite.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface MemberMapper {

    public MemberDTO selectMemberByEmail(String email);
    public HashMap<String,String> findMember(String email, String password);
    public int insertMember(HashMap<String,String> member);

}
