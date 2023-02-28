package com.login.service;

import java.util.HashMap;
import java.util.Map;
 
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
 

@Service
@EnableAutoConfiguration
public class LoginService {

    final String EMPLOYEE="emp";
    final String ADMIN="admin";

    public String checkEmplOrAdmin(String userId,String Password,String uLevel) {

        //Employees
        Map<String,String> EmpMap=new HashMap<>();
        EmpMap.put("Reshma","Reshma@123");         
        EmpMap.put("Sumanth","Sumanth@123");
        EmpMap.put("Naresh", "Naresh@123");

        //Admin
        Map<String,String> AdminMap=new HashMap<>();
        AdminMap.put("Babu","Babu@123");
        AdminMap.put("Hari","hari@123");


    if(EMPLOYEE.equalsIgnoreCase(uLevel)) {
       if(EmpMap.containsKey(userId)) {
          if(EmpMap.get(userId).equalsIgnoreCase(Password)) {     
                //  Reshma = Reshma@123

                    return "employee";    
                }
            }
        }
        else if(ADMIN.equalsIgnoreCase(uLevel)) {
            if(AdminMap.containsKey(userId)) {     
                if(AdminMap.get(userId).equalsIgnoreCase(Password)) {

                //    Babu =Babu@123
                    return "admin";
                }
            }
        }
        return "loginFail";
    }

}

