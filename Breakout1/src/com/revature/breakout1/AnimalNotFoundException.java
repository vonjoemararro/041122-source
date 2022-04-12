package com.revature.breakout1;

public class AnimalNotFoundException extends Exception{

	public AnimalNotFoundException() {
		// TODO Auto-generated constructor stub

	}
	
	AnimalNotFoundException(String msg){
		super(msg);
		System.out.println("super");
	}
	
//	public AnimalNotFoundException(String message) {
//		super();
//	}
	public void displayAnimal() {
		System.out.println("at Exception Class");
	}

}
