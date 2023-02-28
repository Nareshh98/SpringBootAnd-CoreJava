package com.bank.Admin;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import jakarta.transaction.Transactional;

@Service
public class AdminService {

    @Autowired 
    AdminRepo adminRepo;

    public void AddingCustomerDetials(String customer_Id,long account_Number,String account_Type,double amount,
            String cardNumber,String fullName,String fatherName,String dob,String gender,
            String permanent_Address,String present_Address,String pan_Number,String mobile,String landLine_Number) {

        AdminTable add = new AdminTable();

        add.setCustomer_Id(customer_Id);
        add.setAccount_Number(account_Number);
        add.setAccount_Type(account_Type);
        add.setAmount(amount);
        add.setCard_Number(landLine_Number);
        add.setFullName(fullName);
        add.setFatherName(fatherName);
        add.setDob(dob);
        add.setGender(gender);
        add.setPermanent_Address(permanent_Address);
        add.setPresent_Address(present_Address);
        add.setPan_Number(pan_Number);
        add.setMobile(mobile);
        add.setLandLine_Number(landLine_Number);

        adminRepo.save(add);

    }
    public Optional<AdminTable> findById(long account_Number) {

        return adminRepo.findById(account_Number);
    }

    @Transactional
    public FundTransfer transferFund(FundTransfer fundTransfer) throws Exception {
        long fromAcctNUm = fundTransfer.getFromAccount().getAccount_Number();
        long toAcctNum = fundTransfer.getToAccount().getAccount_Number();

        double amtToTrasfer = fundTransfer.getAmount();

        Optional<AdminTable> fromAccounts =adminRepo.findById(fromAcctNUm);
        AdminTable fromAccount = fromAccounts.get();

        Optional<AdminTable> toAccounts = adminRepo.findById(toAcctNum);
        AdminTable toAccount = toAccounts.get();

        if(amtToTrasfer > fromAccount.getAmount()) {
            throw new Exception("Balance in Account " + fromAcctNUm + " is insufficient");
        } else if(amtToTrasfer < 0) {
            throw new Exception("Amount to be transferred should not be negative");
        } else if(fromAccount.getAccount_Number() == toAccount.getAccount_Number()) {
            throw new Exception("From Account and to Account cannot be same");
        }

        fromAccount.setAmount(fromAccount.getAmount() - amtToTrasfer);
        toAccount.setAmount(toAccount.getAmount() + amtToTrasfer);

        AdminTable updatedFromAccount = adminRepo.save(fromAccount);
        AdminTable updatedToAccount = adminRepo.save(toAccount);

        FundTransfer updatedValues = new FundTransfer();
        updatedValues.setFromAccount(updatedFromAccount);
        updatedValues.setToAccount(updatedToAccount);
        updatedValues.setAmount(amtToTrasfer);

        return updatedValues;
    }

  

    public String DeleteAccount(Long account_Number) throws Exception {
        Optional<AdminTable> accounts = adminRepo.findById(account_Number);
        AdminTable deleteAccount = accounts.get();

        if(deleteAccount==null) {
            throw new Exception("Account with id-->"+ account_Number +" not found.");
        }
        adminRepo.deleteById(account_Number);

      return "deleted";
    }

    public List<AdminTable> getAccounts() {
       return  adminRepo.findAll();

    }
	public AdminTable UpdateAccountDetials(Long account_Number, AdminTable adminTable) throws Exception {
		Optional<AdminTable> accounts = adminRepo.findById(account_Number);
		AdminTable updateAccount = accounts.get();

        if(updateAccount == null) {
            throw new Exception("Account with id-->"+ account_Number +" not found.");
        }
       
        AdminTable updatedAccount = adminRepo.save(updateAccount);
        return updatedAccount;
		
	}
   
    
}