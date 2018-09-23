package com.satya.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.satya.model.Employee;

public interface EmployeeService {
	  public Page<Employee> getAllEmployees(Pageable pageable);
	  public Integer countNoOfEmployees();
	  public String findByName(String employeeName);

}
