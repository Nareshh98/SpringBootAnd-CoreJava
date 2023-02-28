package com.admin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Assessment {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String userId;
    private String assessment;
    private String assDate;
    private String type;
 

    public Assessment(String userId, String assessment, String assDate, String type){
        this.userId = userId; 
        this.assessment = assessment;
        this.assDate = assDate;
        this.type = type;
    }
 

    public Assessment() {
        super();
    }
 

    public Assessment(String userId, String assessment, String type) {
        super();
        this.userId = userId;
        this.assessment = assessment;
        this.type = type;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getUserId() {
        return userId;
    }
 
    public void setUserId(String userId) {
        this.userId = userId;
    }
 
    public String getAssessment() {
        return assessment;
    }
 
    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }
 
    public String getAssDate() {
        return assDate;
    }
 
    public void setAssDate(String assDate) {
        this.assDate = assDate;
    }
 
    public String getType() {
        return type;
    }
 
    public void setType(String type) {
        this.type = type;
    }
 
 

}
