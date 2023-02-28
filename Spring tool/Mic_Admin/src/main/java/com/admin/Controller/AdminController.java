package com.admin.Controller;

import org.springframework.web.servlet.ModelAndView;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.admin.service.AdminService;
 
 
@Controller
@EnableAutoConfiguration
public class AdminController {
 
    @Autowired
    AdminService AdminService;
 
    

    @GetMapping("/admin")
    String Home(){
        return "admin";
    }

    @GetMapping("/getAllRegistration")
    @ResponseBody
    public ModelAndView allRegistrations() {
        return AdminService.getAllRegistrations();
    }

    @GetMapping("/getRegistration")
    @ResponseBody
    public ModelAndView defRegistrations() {
        return AdminService.getRegistrations();
    }
}


