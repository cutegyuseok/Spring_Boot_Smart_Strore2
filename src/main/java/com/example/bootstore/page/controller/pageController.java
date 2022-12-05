package com.example.bootstore.page.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class pageController {

    @Autowired
    HttpSession session;

    @GetMapping("/")
    public String index(){
        return "smartStore";
    }

    @GetMapping("/goLogin")
    public String goLogin(){
        return "nonLoginStatus/login";
    }

    @GetMapping("/goSignUp")
    public String goSignUp(){
        return "nonLoginStatus/signUp";
    }
}
