package com.personal.test;

public class FizzBuzzGame {
	//private final int pupilCount = 33;
	public void FunGame(){
		for (int i=1;i<=100;i++){
			//divide by 3
			if (i%3 == 0){
				// if can divide by 3 and 5
				if(i%5 == 0){
					printFizzBuzz();
				}else{
					printFizz();
				}
			}else if(i%5 == 0){
				// only can divide by 5
				printBuzz();
			}else{
				// normal numbers
				System.out.println(i);
			}
		}
	}
	
	private void printFizz(){
		System.out.println("Fizz");
	}
	
	private void printBuzz(){
		System.out.println("Buzz");
	}
	
	private void printFizzBuzz(){
		System.out.println("FizzBuzz");
	}

}
