package com.personal.test;

import org.junit.Test;

public class FizzBuzzGameTest {

	@Test
	public void test() {
		FizzBuzzGame fbg = new FizzBuzzGame();
		fbg.FunGameStage1();
		System.out.println("----------------------");
		fbg.FunGameStage2();
	}

}
