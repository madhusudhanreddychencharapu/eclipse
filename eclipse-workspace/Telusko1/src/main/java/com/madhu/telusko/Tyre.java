package com.madhu.telusko;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
public class Tyre {
	
	private String brand;
	
	public Tyre(String brand)
	{
		this.brand=brand;
	}
	
	public Tyre()
	{
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Its working";
	}

}
