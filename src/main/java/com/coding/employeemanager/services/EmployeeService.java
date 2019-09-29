package com.coding.employeemanager.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


import com.coding.employeemanager.models.Employee;
import com.coding.employeemanager.repositories.EmployeeRepository;

@Service

public class EmployeeService {

	private final EmployeeRepository employeeRepository;
		
		public EmployeeService (EmployeeRepository employeeRepository) {
			this.employeeRepository = employeeRepository;
		}
		
		public List<Employee> allEmployees() {
			return employeeRepository.findAll();
		}
		
		public Employee createEmployee(Employee employee) {
			return employeeRepository.save(employee);
		}

		public Employee findEmployee(Long id) {
			Optional<Employee> e = employeeRepository.findById(id);
	    	
	    	if(e.isPresent()) {
	            return e.get();
	    	}
	    	else {
	    	    return null;
	    	}
		}
	}
	

