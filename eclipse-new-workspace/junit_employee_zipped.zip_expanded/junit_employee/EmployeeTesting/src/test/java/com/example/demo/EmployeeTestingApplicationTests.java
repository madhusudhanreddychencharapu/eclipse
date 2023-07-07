package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class EmployeeTestingApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Mock
	EmployeeRepositry er;
	//=Mockito.mock(EmployeeRepositry.class);
	//EmployeeServiceImpl esi=new EmployeeServiceImpl(er);
	
	@InjectMocks
	EmployeeServiceImpl esi;

	 List<Employee> employees = new ArrayList<>();
	 
	 


	@Test
	void checkGetEmpl()
	{
		when(er.findAll()).thenReturn(employees);
		List<Employee> emps=esi.getEmployees();
		assertEquals(0,emps.size());
	}
	
	

}
