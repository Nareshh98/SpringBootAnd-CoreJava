package com.employeejunit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeejunit.entity.Employee;
import com.employeejunit.repository.EmployeeRepository;

@Service
public class EmployeeServices {
	@Autowired
	EmployeeRepository employeerepository;

	public List<Employee> getAllEmployees() {

		List<Employee> employees = new ArrayList<Employee>();
		employeerepository.findAll().forEach(employees1 -> employees.add(employees1));

		return employees;
	}

	public Employee getEmployeeById(int id) {
		return employeerepository.findById(id).get();
	}

//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Employee employee) {
		employeerepository.save(employee);
	}

//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id) {
		employeerepository.deleteById(id);
	}

//updating a record  
	public void update(Employee employee, int employeeid) {
		employeerepository.save(employee);
	}

	public List<Employee> fetchEmployeesByBand(String band) {
		// return employeerepository.findByEmpband(band);
		return employeerepository.getByEmpband(band);
	}

	public List<Employee> fetchNameAndBand(String name, String band) {

		return employeerepository.findByEmpnameAndEmpband(name, band);
		// return employeerepository.findByEmpnameOrEmpband(name, band);
	}

	public List<Employee> fetchGreaterSalary(int sal) {

		return employeerepository.findByEmpsalGreaterThan(sal);

	}

	public List<Employee> fetchLesserThanSalary(int sal) {

		return employeerepository.findByEmpsalLessThanEqual(sal);

	}

	public List<Employee> fetchempusingQuery(String band) {

		return employeerepository.findByEmpband(band);
		// return employeerepository.findByEmpnameOrEmpband(name, band);
	}

}
