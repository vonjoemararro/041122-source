package com.revature.app;

public class Driver {
	
	public static void main(String[] args) {
		
		//array of ten numbers
		int[] listOfNumbers = new int[10];
		//
		
		listOfNumbers[0] = 15;
		
		for  (int iteration = 0; iteration < listOfNumbers.length; ++iteration) {
			listOfNumbers[iteration] = iteration;
		}
		
		
		for (int element : listOfNumbers) {
			
			Driver.doubleValueAndPrint(element, element);
			
		}
	}
	

	
	public static void doubleValueAndPrint(int value, int multiplier) {
		System.out.println(value * multiplier);
	}
	
	public static void doubleValueAndPrint(int value) {
		System.out.println(value * 2);
	}
	
	

}
