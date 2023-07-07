package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
	
	@PostMapping("/registerEmployee")
	  public Employee regsiterEmployee(@RequestBody  Employee emp) {
	    return es.regsiterEmployee(emp);
	  }
	
	@GetMapping("/getEmployees")
	  public List<Employee> getEmployees() {
	    return es.getEmployees();
	  }

}
