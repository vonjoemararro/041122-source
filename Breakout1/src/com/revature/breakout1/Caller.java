package com.revature.breakout1;

public class Caller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalNotFoundException animalE = new AnimalNotFoundException();
		System.out.println("at Caller class");
		animalE.displayAnimal();
		
	}
	
	public void displayAnimal() throws AnimalNotFoundException{
		
		System.out.println("Method to display");
		
	}

}
