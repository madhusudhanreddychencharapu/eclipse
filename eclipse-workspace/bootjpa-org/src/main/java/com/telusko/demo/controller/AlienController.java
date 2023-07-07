package com.telusko.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.demo.dao.AlienRepo;
import com.telusko.demo.model.Alien;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
//	@RequestMapping("/addAlien")
//	public String addAlien(Alien alien)
//	{
//		repo.save(alien);
//		return "home.jsp";
//	}
	
	@PostMapping("/alien")
	public Alien addAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
//	@RequestMapping("/getAlien")
//	public ModelAndView getAlien(@RequestParam int aid)
//	{
//		System.out.println("The ID is "+aid);
//		ModelAndView mv=new ModelAndView("showAlien.jsp");
//		
//		Alien alien=repo.findById(aid).orElse(new Alien());
//		
//		System.out.println("The name is "+alien.getAname()+","+"tech is "+alien.getTech());
//		
//		System.out.println(repo.findByTech("java"));
//		
//		mv.addObject(alien);
//		return mv
//	}
	
	@GetMapping("/alien/{aid}")
	@ResponseBody
	public Optional<Alien> getAliens(@PathVariable("aid") int aid)
	{
		return repo.findById(aid);
	}
	
	@GetMapping("/aliens")
	@ResponseBody
	public List<Alien> getAliens()
	{
		return (List<Alien>) repo.findAll();
	}

}
