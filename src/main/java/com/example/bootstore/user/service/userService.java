package com.example.bootstore.user.service;

import com.example.bootstore.user.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class userService {

    @Autowired
    userRepository userRepository;

    public boolean signup(HashMap<String,String> signupInfo){
        boolean result = false;
        try{
            if(userRepository.signup(signupInfo)>0){
                result=true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return result;
        }
    }

}
