package com.telusko.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.telusko.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien,Integer>{
	
	List<Alien> findByTech(String tech);
	
	@Query("from Alien where tech=?1 order by aname Asc")
	List<Alien>findByTechOrder(String tech);

}
