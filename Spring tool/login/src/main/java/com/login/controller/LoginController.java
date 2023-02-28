package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.login.service.LoginService;
 

@Controller
@EnableAutoConfiguration
public class LoginController {
 
    
    @Autowired
    LoginService loginService;


    @GetMapping("/")
    String login(){
        return "index";
    }
 
    @PostMapping("/login")
    public String checkAdminOrEmployee(@ModelAttribute("userId") String userId,
            @ModelAttribute("Password")String Password,
            @ModelAttribute("uLevel")String uLevel) {
        String str=loginService.checkEmplOrAdmin(userId, Password, uLevel);
        return str;
    }



}
