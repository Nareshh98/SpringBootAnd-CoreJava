package com.employeeDepartment.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


 
@Entity
public class License {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int licenseId;
    @Temporal(TemporalType.DATE)
    private Date validFrom;
    @Temporal(TemporalType.DATE)
    private Date validTo;
    @OneToOne(mappedBy = "license", cascade = CascadeType.ALL)
    private Person person;
 
    public int getLicenseId() {
        return licenseId;
    }
 
    public void setLicenseId(int licenseId) {
        this.licenseId = licenseId;
    }
 
    public Date getValidFrom() {
        return validFrom;
    }
 
    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }
 
    public Date getValidTo() {
        return validTo;
    }
 
    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }
 
    public Person getPerson() {
        return person;
    }
 
    public void setPerson(Person person) {
        this.person = person;
    }
 
    @Override
    public String toString() {
        return "License [licenseId=" + licenseId + ", validFrom=" + validFrom + ", validTo=" + validTo + "]";
    }
 
}
