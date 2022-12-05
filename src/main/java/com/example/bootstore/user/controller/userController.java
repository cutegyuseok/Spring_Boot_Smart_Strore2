package com.example.bootstore.user.controller;

import com.example.bootstore.user.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class userController {

    @Autowired
    HttpSession session;
    @Autowired
    userService userService;

    @PostMapping("/doLogin")
    public String doLogin(@RequestParam HashMap<String,String> loginInfo){
        return null;
    }

    @PostMapping("/doSignUp")
    public String doSignUp(@RequestParam HashMap<String,String> signupInfo){
        if (session.getAttribute("SESSION_ID")!=null)return "LoginStatus/storeAdminPage";
        if(userService.signup(signupInfo)){
            return "LoginStatus/storeAdminPage";
        }else {
            return "nonLoginStatus/signUp";
        }
    }
}
