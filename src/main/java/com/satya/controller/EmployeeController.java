package com.satya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.satya.model.Employee;
import com.satya.service.EmployeeService;

@RestController 
class EmployeeController {
	    @Autowired
	  private EmployeeService service;
	    @RequestMapping(value="/getall",method=RequestMethod.GET)
	  public ResponseEntity<Page<Employee>> getAllEmployees(Pageable pageable){
		  Page<Employee> page=  (Page<Employee>) service.getAllEmployees(pageable);
		  return new ResponseEntity<Page<Employee>>(page,HttpStatus.OK);
		  
	  }
	    @RequestMapping(value="/getallcount",method=RequestMethod.GET)
	    public ResponseEntity<Integer> getCountEmployees(){
		   Integer i=  service.countNoOfEmployees();
		   System.out.println(i);
		  return new ResponseEntity<Integer>(i,HttpStatus.OK);
	    	
	    }
	    @RequestMapping(value="/getallnames/{name}",method=RequestMethod.GET)
	    public ResponseEntity<String> getNames(@PathVariable String name){
		   String names =  service.findByName(name);
		   System.out.println(names);
		  return new ResponseEntity<String>(names,HttpStatus.OK);
	    	
	    }

}
