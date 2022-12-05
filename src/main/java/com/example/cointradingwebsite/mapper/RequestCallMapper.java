package com.example.cointradingwebsite.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface RequestCallMapper {

    public int requestCall(HashMap<String,String> requestCall);

    public HashMap<String,String> selectRequestCallByEmail(String email);
}
