package com.parra.springdemo;

public class PingpongCoach implements Coach {

	private FortuneService fortuneService;
	
	public PingpongCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 44 minutes practicing on table.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}