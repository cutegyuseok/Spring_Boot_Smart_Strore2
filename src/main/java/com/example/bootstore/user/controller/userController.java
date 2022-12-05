package com.example.bootstore.user.controller;

import com.example.bootstore.user.DTO.userDTO;
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
            userDTO userDTO = userService.login(loginInfo);
            if (userDTO != null) {
                session.setAttribute("SESSION_INFO", userDTO);
                return "LoginStatus/storeAdminPage";
            } else {
                return "nonLoginStatus/login";
            }
    }

    @PostMapping("/doSignUp")
    public String doSignUp(@RequestParam HashMap<String,String> signupInfo){
        if (session.getAttribute("SESSION_INFO")!=null)return "LoginStatus/storeAdminPage";
        if(userService.signup(signupInfo)){
            return "LoginStatus/storeAdminPage";
        }else {
            return "nonLoginStatus/signUp";
        }
    }
}
