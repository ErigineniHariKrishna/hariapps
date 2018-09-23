package com.satya.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.satya.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Query("select count(e.employeeName) from com.satya.model.Employee e")
	public Integer countNoOfEmployees();
	@Query("select employeeName from com.satya.model.Employee e where e.employeeName=:name")
	public String findByName(String employeeName);

}
