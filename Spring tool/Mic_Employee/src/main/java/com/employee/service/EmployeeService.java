package com.employee.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
 
import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;
 
 
@Service 
@EnableAutoConfiguration
public class EmployeeService {
    @Autowired
    EmployeeRepository AssessmentRepository;
 

    @Autowired
    RestTemplate restTemplate;
 
    @SuppressWarnings("rawtypes")
    @Autowired
    private CircuitBreakerFactory circuitBreakerFactory;
 

    public Employee addAssessment(Employee assessment) {
        return AssessmentRepository.save(assessment);
    }
 

    public List<Employee> getAllAssessments(){
        return AssessmentRepository.findAll();
    }
 

    @SuppressWarnings("unchecked")
    public List<Employee> getAssessment() {

        RestTemplate restTemplate=new RestTemplate();
 
        String url="https://api.youtube.com/v1/reviews.json/";
 

        CircuitBreaker circuitBreaker = circuitBreakerFactory.create("GetAssessmentCircuitBreaker");
        return (List<Employee>) circuitBreaker.run(() -> restTemplate.getForObject(url, List.class), 
                throwable -> getDefaultAssessments());
 
    }
 
    private List<Employee> getDefaultAssessments() {
        List<Employee> deftAssessment=new ArrayList<Employee>();
         String assDate = null;
        deftAssessment.add(new Employee("Hari","C#",assDate,"Technical"));
        deftAssessment.add(new Employee("Haritha","C#",assDate,"Technical"));
        return deftAssessment;
    }
 
 
}
