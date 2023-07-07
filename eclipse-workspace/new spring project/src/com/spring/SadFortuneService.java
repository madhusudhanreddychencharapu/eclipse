package com.spring;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "I am in the sadFortuneService";
	}

	

}
