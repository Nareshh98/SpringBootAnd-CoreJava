package com.bank.register;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Controller
public class RegisterController {

    @Autowired
    RegisterServices registerService;

    @RequestMapping("/")
    public String hello () {
        return "home";        
    }
    @RequestMapping("/register")
    public String register () {
        return "register";        
    }

    @PostMapping("/AddingToDataBase")
    public String checkAdminOrUser( @ModelAttribute("type") String type,
            @ModelAttribute("name")String name,
            @ModelAttribute("password")String password) {

      registerService.registerEmplOrAdmin(type, name, password);
    return "detials";                    
    }

    @ResponseBody
    @RequestMapping("/findall")
    public List<Register> findAll(){

        return registerService.findAll();        
    }
    @RequestMapping("/log")
    public String log () {
        return "login";        
    }

    @PostMapping("/Login")
    public String login(@ModelAttribute("type") String type,
            @ModelAttribute("name")String name,
            @ModelAttribute("password")String password) {

        boolean a=registerService.checkAdmin(type,name,password);
        boolean b=registerService.checkUser(type, name, password);

        if (a==true) {
            return "Admin";
        }
        else if (b==true) {
            return "User";
        }
        else
        return "loginfailed";

    }


}
