package com.krystianminta.springdemo;

public class BaseballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minut on batting practice";
	}
}
