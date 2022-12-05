package com.example.bootstore.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface userMapper {

    public int signup(HashMap<String,String> signupInfo);
    public HashMap<String,String> login(String id);

}
