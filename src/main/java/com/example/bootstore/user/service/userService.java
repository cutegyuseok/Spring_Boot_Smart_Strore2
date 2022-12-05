package com.example.bootstore.user.service;

import com.example.bootstore.user.DTO.userDTO;
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

    public userDTO login(HashMap<String,String> loginInfo){
        System.out.println(loginInfo.toString());
        try {
            String id = loginInfo.get("userID");
            if(loginInfo.get("userPassword").equals(userRepository.login(id).get("PASSWORD"))){
                HashMap<String,String> result = userRepository.login(id);
                return new userDTO(result.get("ID"),result.get("STORE_NAME"),result.get("EMAIL"), result.get("NAME"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


}
