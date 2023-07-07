package com.madhu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhu.demo.model.Customer;
import com.madhu.demo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl  implements CustomerService{

	
	@Autowired
	private CustomerRepository custRepository;
	
	@Override
	public void addCustomer(Customer cust) {
		
		custRepository.save(cust);
	}

}
