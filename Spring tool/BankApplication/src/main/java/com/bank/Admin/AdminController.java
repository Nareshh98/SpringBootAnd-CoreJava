package com.bank.Admin;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminController {

    @Autowired
    AdminService adminService;


    @PostMapping("/CustomerAccount")
    public String checkAdminOrUser( @ModelAttribute("customerId") String customer_Id,
            @ModelAttribute("accType")String account_Type,
            @ModelAttribute("openBal")int amount,
            @ModelAttribute("cardNumber")String cardNumber,
            @ModelAttribute("fullName")String fullName,
            @ModelAttribute("fatherName")String fatherName,
            @ModelAttribute("dob")String dob,
            @ModelAttribute("gender")String gender,
            @ModelAttribute("permanentAdd")String permanent_Address,
            @ModelAttribute("presentAdd")String present_Address,
            @ModelAttribute("pan")String pan_Number,
            @ModelAttribute("mobile")String mobile,
            @ModelAttribute("landLine")String landLine_Number) {


        adminService.AddingCustomerDetials(customer_Id, amount, account_Type, amount, cardNumber, fullName, fatherName, dob, gender, permanent_Address, present_Address, pan_Number, mobile, landLine_Number);

                return "AddingCust";           

    }
    @ResponseBody
    @GetMapping("/customer/{account_Number}") // find by Account number
    public Optional<AdminTable> findById(@PathVariable long account_Number){

        return adminService.findById(account_Number);        
    }
    @ResponseBody
    @PutMapping("/transferFund")
    public FundTransfer transferFund(@RequestBody FundTransfer fundTransfer) throws Exception {
        FundTransfer fundTransferred = adminService.transferFund(fundTransfer);
        return fundTransferred;

    }

    @ResponseBody
    @DeleteMapping("/DeleteAccout/{account_Number}")
    public String DeleteAccount(@PathVariable long account_Number) throws Exception {

       return adminService.DeleteAccount(account_Number);

    }
    @ResponseBody
    @GetMapping("/Allaccounts")                  // find All Accounts
    public List<AdminTable> getAllAccounts() {
        return adminService.getAccounts();
    }
    
    @ResponseBody
    @PutMapping("/updatedAccount/{account_Number}")
    public AdminTable UpdatedAccount(@PathVariable Long account_Number ,@RequestBody AdminTable adminTable) throws Exception{


        return adminService.UpdateAccountDetials(account_Number,adminTable);
    }



    }
 




 



 


