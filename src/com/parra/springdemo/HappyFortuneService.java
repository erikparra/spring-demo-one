package com.parra.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private String[] fortuneArray = {"He who sits on toliet is high on pot",
	                                           	"Today is your day!",
	                                           	"Today is NOT your day!",
	                                           	"You will accomplish your goals"};
	@Override
	public String getFortune() {
		Random rand = new Random();
		int index = rand.nextInt(fortuneArray.length);
		return fortuneArray[index];
	}

}
