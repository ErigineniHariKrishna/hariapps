package com.satya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.satya.dao.EmployeeRepository;
import com.satya.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	     @Autowired
	    private EmployeeRepository rep;
	

	
	 public Page<Employee> getAllEmployees(Pageable pageable) {
		 Page<Employee> page=(Page<Employee>) rep.findAll(pageable) ;
	
		  return  page;
	 }



	@Override
	public Integer countNoOfEmployees() {
	return  rep.countNoOfEmployees();
	}



	@Override
	public String findByName(String employeeName) {
		String names=rep.findByName(employeeName);
		return names;
	}

}
