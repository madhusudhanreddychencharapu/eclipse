package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class EmployeeUrlTest {
	
	@Mock
	EmployeeRepositry er;
	//=Mockito.mock(EmployeeRepositry.class);
	//EmployeeServiceImpl esi=new EmployeeServiceImpl(er);
	
	@InjectMocks
	EmployeeServiceImpl esi;

	 List<Employee> employees = new ArrayList<>();
	 Employee e1=new Employee();
	
	 
	@Test
	void checkGetEmpl()
	{
		e1.setEmployee_id(6);
		e1.setEmployee_name("rosh");
		e1.setEmployee_city("hyd");
		employees.add(e1);
		when(er.findAll()).thenReturn(employees);
		List<Employee> emps=esi.getEmployees();
		assertEquals(1,emps.size());
	}
	
	

}
