package com.telusko.samsung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Samsung {
	
	@Autowired
	MobileProcessor cpu;
	
	@Autowired
	MobileProcessor cpu1;
	
	
//	public MobileProcessor getCpu() {
//		return cpu;
//	}
//
//
//	public void setCpu(MobileProcessor cpu) {
//		this.cpu = cpu;
//	}


	public void config()
	{
		System.out.println("Octa core, 4gb ram,12 Mp");
		cpu.process();
		cpu1.process();
	}

}
