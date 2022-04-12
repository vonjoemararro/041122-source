package com.revature.ex;

public class MyException {
	
	// this is an example of a custom exception.
	// this is a method that throws a custom exception if the party size > 6.
	static void checkPartySize(int partySize) {
		
		
		if (partySize > 6) {
			
			//this uses throw keyword
			throw new ArithmeticException("No more than 6 pokemon can be in your party at one time");
		}
		else {
			System.out.println("Party size accepted");
		}
	}

}
