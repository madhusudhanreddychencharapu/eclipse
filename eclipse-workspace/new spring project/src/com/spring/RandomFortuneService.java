package com.spring;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	String[] data= {"water","biryani","Nothing","givereverse1000","gold 10g","siver 10g","givereverse100"};
	private Random myrandom=new Random();
	@Override
	public String getFortune() {
		
		int index=myrandom.nextInt(data.length);
		return data[index];
	}

}
