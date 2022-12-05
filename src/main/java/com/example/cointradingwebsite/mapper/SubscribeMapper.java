package com.example.cointradingwebsite.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SubscribeMapper {

    public int subscribe(String email);
    public String selectSubscribeByEmail(String email);
}
