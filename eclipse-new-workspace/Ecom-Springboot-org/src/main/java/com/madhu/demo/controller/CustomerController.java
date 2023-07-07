package com.madhu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhu.demo.model.Customer;
import com.madhu.demo.service.CustomerServiceImpl;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	
	@PostMapping("/add")
	public String addCustomer(@RequestBody Customer cust)
	{
		System.out.println("I am entered into the controller");
		System.out.println(cust);
		customerServiceImpl.addCustomer(cust);
		return "It is running";
		
	}
	@RequestMapping("/home")
	public String home()
	{
		return "I  am running";
	}

}
