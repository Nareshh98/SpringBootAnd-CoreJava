package com.employeeDepartment.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


 

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int departmentId;
    private String departmentName;
    @OneToMany(cascade=CascadeType.ALL,mappedBy="department",fetch=FetchType.LAZY)

    private Set<Employee> employees;

    public Set<Employee> getEmployees() {
        return employees;
    }
 
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
 
    public Department() {


    }
 
    public Department(int departmentId, String departmentName) {
        super();
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }
 
    public int getDepartmentId() {
        return departmentId;
    }
 
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
 
    public String getDepartmentName() {
        return departmentName;
    }
 
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
 
    @Override
    public String toString() {
        return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
    }
 
    


 
}
