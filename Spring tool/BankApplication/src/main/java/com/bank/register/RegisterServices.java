package com.bank.register;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 

@Service
public class RegisterServices {

    @Autowired
    RegisterRepo registorRepo;
 
    public void registerEmplOrAdmin(String type, String name, String password) {

         if (type.equalsIgnoreCase("user") || type.equalsIgnoreCase("admin")) {

             Register reg = new Register();

            reg.setUserType(type);
            reg.setUserName(name);
            reg.setPassword(password);

            registorRepo.save(reg);

        }    
    }
 
    public List<Register> findAll() {        
        return registorRepo.findAll();

    }
 
    public boolean checkAdmin(String type, String name, String password) {
        boolean isPresent = false;

        Register reg = new Register();

        reg.setUserType(type);
        reg.setUserName(name);
        reg.setPassword(password);

        String Name =reg.getUserName();
        String Type =reg.getUserType();
        String Pass = reg.getPassword();

        List<Register> list=registorRepo.findAll();

        for (Register r : list) {

            if (r.getUserName().equals(Name) && r.getPassword().equals(Pass)
                    && r.getUserType().equalsIgnoreCase("Admin")) {
                isPresent = true;
                return isPresent;

            }    
    }
        return isPresent;

}

    public boolean checkUser(String type, String name, String password) {
          boolean isPresent = false;

        Register reg = new Register();

        reg.setUserType(type);
        reg.setUserName(name);
        reg.setPassword(password);

        String  Name=reg.getUserName();
        String Type=reg.getUserType();
        String Pass= reg.getPassword();

        List<Register> list=registorRepo.findAll();

        for (Register r : list) {

            if (r.getUserName().equals(Name) && r.getPassword().equals(Pass)
                    && r.getUserType().equalsIgnoreCase("User")) {
                isPresent = true;
                return isPresent;

            }    
    }
        return isPresent;

}
}
 
