package com.basics;

import org.springframework.stereotype.Component;

@Component("somename")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkoutString() {
		return "Practice the Spring Core";
	}

}
