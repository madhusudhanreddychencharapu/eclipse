package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImpl implements EmployeeService {


	//@Autowired
	EmployeeRepositry er;
	
//	EmployeeServiceImpl(EmployeeRepositry er)
//	{
//		this.er=er;
//	}
	
	 @Override
	  public Employee regsiterEmployee(Employee e) {
		
	    return er.save(e);
	  }
	 
	 @Override
	  public List<Employee> getEmployees() {
	    return er.findAll();

	  }
}
