package com.bank.Admin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class AdminTable {


    

	String customer_Id;
    @Id
    @Column(name = "account_Number", length = 20, nullable = false)    
    long account_Number;

    @Column(name = "account_Type", length = 20, nullable = false)
    String account_Type;

    @Column(name = "amount", length = 20, nullable = false)
    double amount;

    String card_Number;
    @Column(name = "fullName", length = 20, nullable = false)
    String fullName;
    String fatherName;
    String dob;
    String gender;
    String permanent_Address;
    String present_Address;
    @Column(name = "pan_Number", length = 20, nullable = false)
    String pan_Number;

    @Column(name = "mobile", length = 20, nullable = false)
    String mobile;
    String landLine_Number;
	public String getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(String customer_Id) {
		this.customer_Id = customer_Id;
	}
	public long getAccount_Number() {
		return account_Number;
	}
	public void setAccount_Number(long account_Number) {
		this.account_Number = account_Number;
	}
	public String getAccount_Type() {
		return account_Type;
	}
	public void setAccount_Type(String account_Type) {
		this.account_Type = account_Type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCard_Number() {
		return card_Number;
	}
	public void setCard_Number(String card_Number) {
		this.card_Number = card_Number;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPermanent_Address() {
		return permanent_Address;
	}
	public void setPermanent_Address(String permanent_Address) {
		this.permanent_Address = permanent_Address;
	}
	public String getPresent_Address() {
		return present_Address;
	}
	public void setPresent_Address(String present_Address) {
		this.present_Address = present_Address;
	}
	public String getPan_Number() {
		return pan_Number;
	}
	public void setPan_Number(String pan_Number) {
		this.pan_Number = pan_Number;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getLandLine_Number() {
		return landLine_Number;
	}
	public void setLandLine_Number(String landLine_Number) {
		this.landLine_Number = landLine_Number;
	}




}
