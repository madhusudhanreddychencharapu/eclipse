package com.madhu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madhu.demo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
