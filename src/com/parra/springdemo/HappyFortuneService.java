package com.parra.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "He who sits on toliet is high on pot";
	}

}
