package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
import com.employee.model.Employee;
import com.employee.service.EmployeeService;
 

@Controller
@EnableAutoConfiguration
public class EmployeeController {
 

    @Autowired
    EmployeeService employeeService;
 
    
    @GetMapping("/assessment")
    public String index(){
        return "index";
    }
 

    @GetMapping("/getTechnical")
    String getTechnicalAssementPage(){
        return "technical";
    }
 
    @GetMapping("/getBehavioural") 
    String getBehaviouralAssementPage(){
        return "behavioural"; 
    }
 
    @PostMapping("/addTechnicalData")
    public String addAssessment(@ModelAttribute("userId") String userId ,
            @ModelAttribute("subject") String subject,
             @ModelAttribute("assDate") String assDate, @ModelAttribute("type") String type) {

        Employee assessment = new Employee(userId, subject, assDate, type);
        Employee savedAssessment = employeeService.addAssessment(assessment);
        if (savedAssessment != null) {
            return "success1";
        }
        else {
            return "fail";
        }
    }
 
    
    @PostMapping("/addBehaviouralData")
    public String addAssessment1(@ModelAttribute("userId") String userId , @ModelAttribute("subject") String subject, @ModelAttribute("assDate") String assDate, @ModelAttribute("type") String type) {


        Employee assessment = new Employee(userId, subject, assDate, type);
        Employee savedAssessment = employeeService.addAssessment(assessment);
        if (savedAssessment != null) {
            return "success1";
        }
        else {
            return "fail";
        }
    }
 
 
    @GetMapping("/getAssessment")
    @ResponseBody
    public List<Employee> getAllRegistrations(){
        return employeeService.getAllAssessments();
    }
 
    
 
    @GetMapping("/getdefAssessment")
    @ResponseBody
    public List<Employee> etRegistrations()
    {

        return employeeService.getAssessment();
    }
 

}

