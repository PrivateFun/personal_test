package com.personal.test;

public class FizzBuzzGame {
	//private final int pupilCount = 33;
	public void FunGameStage1(){
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
	
	public void FunGameStage2(){
		for (int i=1;i<=100;i++){
			//divide by 3
			if (i%3 == 0 || isInclude_3(i)){
				// if can divide by 3 and 5
				if(i%5 == 0 || isInclude_5(i)){
					printFizzBuzz();
				}else{
					printFizz();
				}
			}else if(i%5 == 0 || isInclude_5(i)){
				// only can divide by 5
				printBuzz();
			}else{
				// normal numbers
				System.out.println(i);
			}
		}
	}
	
	private boolean isInclude_3(int num){
		if(num == 3){
			return true;
		}
		while(num/10>0){
			if (num%10 == 3){
				return true;
			}else{
				num /= 10;
			}
		}
		return false;
	}
	private boolean isInclude_5(int num){
		if(num == 5){
			return true;
		}
		while(num/10>0){
			if (num%10 == 5){
				return true;
			}else{
				num /= 10;
			}
		}
		return false;
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
