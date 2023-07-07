package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.init.ScriptException;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.jdbc.Sql;

import jakarta.transaction.Transactional;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
@Sql({"/my_script.sql"})

public class SqlScriptsTesting {
	
	@Autowired
	private JdbcTemplate jdbcTemp;
	
	@BeforeEach
    public void setUp() throws Exception {
        // Code to set up test data or resources
//		Resource testScript = new ClassPathResource("my_script.sql");
//        ScriptUtils.executeSqlScript(jdbcTemp.getDataSource().getConnection(), testScript);
			
    }
    
    
    
	
	@Test
	//@Transactional
	//@Rollback(false)
	public void fetchRows1() throws ScriptException, SQLException {
		
        
		
		
		List<Map<String, Object>> employees = jdbcTemp.queryForList("SELECT * FROM ws.emp_test");
		assertEquals(3, employees.size());
	}

}
