package com.admin.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.admin.model.Assessment;
 

@Service
@EnableAutoConfiguration
public class AdminService {
 
    @Autowired
    DiscoveryClient discoveryClient;
 
    @Autowired
    RestTemplate restTemplate;
 
    @Autowired
    private CircuitBreakerFactory circuitBreakerFactory;
 
    //use below 2 lines while using Spring Cloud Load Balancer
    @Autowired
    private LoadBalancerClient loadBalancerClient;
 
    @Value("${pivotal.employeeservice.name}")
    protected String EmployeeService;            //String EmployeeService=Employee-Service;
 

    //showing all assessment registrations 
    @SuppressWarnings("unchecked")
    public ModelAndView getAllRegistrations() {
        ModelAndView mv = new ModelAndView();
 
        List<ServiceInstance> instance = discoveryClient.getInstances(EmployeeService);
        URI uri = instance.get(0).getUri();
        String url = uri.toString()+"/getAssessment";

        //https://localhost:8091/getAssessment

        List<Assessment> assessment = restTemplate.getForObject(url, List.class);
        mv.addObject("registerations", assessment);
        mv.setViewName("AllRegistrations");
 
        return mv;
    }
 

    //showing  assessment registrations while using circuit Breaker
    @SuppressWarnings("unchecked")
    public ModelAndView getRegistrations() {
        ModelAndView mv = new ModelAndView();
 

        ServiceInstance instance=loadBalancerClient.choose(EmployeeService);
        URI uri=instance.getUri();

        URI uri1=URI.create(String.format("http://%s:%s",instance.getHost(),instance.getPort()));

    /*    List<ServiceInstance> instance = discoveryClient.getInstances(EmployeeService);
        URI uri = instance.get(0).getUri();
        String url = uri.toString()+"/getAssessment"; */

        String url = uri.toString()+"/getdefAssessment"+"jjj";
        CircuitBreaker circuitBreaker = circuitBreakerFactory.create("GetReviewCircuitBreaker");
        List<Assessment> assessment=circuitBreaker.run(() -> restTemplate.getForObject(url, List.class),
                throwable -> getDefRegistrations());
 
        System.out.println("details of registrations:"+assessment.toString());
        mv.addObject("registerations", assessment);
        mv.setViewName("AllRegistrations");
 
        return mv;
    }
 
    private List<Assessment> getDefRegistrations() {
 
        List<Assessment> list=new ArrayList<>();
        String assDate = null;
        list.add(new Assessment("Hari","Java",assDate,"Technical"));
        list.add( new Assessment("Haritha","C#",assDate,"Technical"));
        return list;
    }
}
