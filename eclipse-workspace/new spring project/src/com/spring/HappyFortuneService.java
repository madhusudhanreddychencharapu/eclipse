package com.spring;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String getFortune() {
		
		return "today is your lucky day";
	}

}
