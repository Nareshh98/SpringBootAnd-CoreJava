package com.bank.register;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "Register")
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_type", length = 20, nullable = false)
    private String userType;

    @Column(name = "user_name", length = 20, nullable = false)
    private String userName;

    @Column(name = "password", length = 15, nullable = false)
    private String password;
 
    public Register() {
        super();
    }
 
    public Register(int userId, String userType, String userName, String password) {
        super();
        this.userId = userId;
        this.userType = userType;
        this.userName = userName;
        this.password = password;
    }
 
    public Register(String userType, String userName, String password) {
        this.userType = userType;
        this.userName = userName;
        this.password = password;

    }
 
    public int getUserId() {
        return userId;
    }
 
    public void setUserId(int userId) {
        this.userId = userId;
    }
 
    public String getUserType() {
        return userType;
    }
 
    public void setUserType(String userType) {
        this.userType = userType;
    }
 
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    @Override
    public String toString() {
        return "Login [userId=" + userId + ", userType=" + userType + ", userName=" + userName + ", password="
                + password + "]";
    }
 
}



