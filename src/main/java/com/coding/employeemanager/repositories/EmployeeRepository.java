package com.coding.employeemanager.repositories;


import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coding.employeemanager.models.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository <Employee, Long> {
	List <Employee> findAll();
	
}