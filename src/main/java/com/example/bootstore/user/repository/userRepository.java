package com.example.bootstore.user.repository;

import com.example.bootstore.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class userRepository {

    @Autowired
    userMapper userMapper;

    public int signup(HashMap<String,String> signupInfo){
        return userMapper.signup(signupInfo);
    }

}
