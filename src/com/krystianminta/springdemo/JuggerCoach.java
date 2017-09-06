package com.krystianminta.springdemo;

public class JuggerCoach implements Coach {

	private FortuneService fortuneService;
	
	public JuggerCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swing a sword for 300 times!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
