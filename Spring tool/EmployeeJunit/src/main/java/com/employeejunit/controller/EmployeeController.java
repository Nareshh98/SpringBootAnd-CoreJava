package com.employeejunit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeejunit.entity.Employee;
import com.employeejunit.service.EmployeeServices;
 

 
@RestController
 
//@RequestMapping("/test")
public class EmployeeController {
 
    @Autowired
    EmployeeServices employeeServices;

    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {
    return employeeServices.getAllEmployees();
        }


    @GetMapping("/hello")
    public String hello()
    {
        return "Welcome to TestController";
    }

    @GetMapping("/employee/{empid}")
    public Employee getEmployeeById(@PathVariable("empid") int empid)
    {
        return employeeServices.getEmployeeById(empid);
    }

    //creating a delete mapping that deletes a specified employee
    @DeleteMapping("/employee/{empid}")  
    private void deleteEmployee(@PathVariable("empid") int empid)   
    {  
    	employeeServices.delete(empid);  
    }  


    //creating post mapping that post the book detail in the database  
    @PostMapping("/employee")  
    private void saveEmployee(@RequestBody Employee employee)   
    {  
    	employeeServices.saveOrUpdate(employee);


    }    

    //creating put mapping that updates the employee detail   
    @PutMapping("/employee")  
    private Employee update(@RequestBody Employee employee)   
    {  
    	employeeServices.saveOrUpdate(employee);  
    return employee;  
    } 


    //Serach by Band Name 

    @GetMapping("/employee/find/{band}")  
        private List<Employee> getEmployeesByBand(@PathVariable String band)   
        {  
         return    employeeServices.fetchEmployeesByBand(band);
        }

    @GetMapping("/employee/find/{name}/{band}")  
    private List<Employee> getByNameAndBand(@PathVariable String name,@PathVariable String band)   
    {  
     return    employeeServices.fetchNameAndBand(name, band);
    }
    @GetMapping("/employee/find/greatersal/{salary}")  
    private List<Employee> getBygreaterSal(@PathVariable int salary)   
    {  
     return    employeeServices.fetchGreaterSalary(salary);
    }

    @GetMapping("/employee/find/lessersal/{salary}")  
    private List<Employee> getByLessSal(@PathVariable int salary)   
    {  
     return    employeeServices.fetchLesserThanSalary(salary);
    }

    @GetMapping("/employee/jpql/{band}")  
    private List<Employee> getByEmpband(@PathVariable String band)   
    {  
     return    employeeServices.fetchempusingQuery(band);
    }

}
