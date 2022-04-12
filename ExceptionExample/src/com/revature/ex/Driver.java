package com.revature.ex;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		//this is an example of try/catch/finally block
		//the try statement execute the block of code for the sake of testing for erors
		try {
			//block of code that we wanna try
			int[] partyPokemon = {1,2,3,4,5,6};
			
			System.out.println(partyPokemon[8]);
		}
		//This is the exception we want to catch
		catch(Exception e) {
			System.out.println("a party can only have 6 pokemon.");
		}
		//the finally statement execute a line of code after the try/catch block
		finally {
			System.out.println("the finally statement has run successfully");
		}
		
		//this is our new scanner for getting user input
		Scanner userObj = new Scanner(System.in);
		//this prompts the user for an input
//		System.out.println("How many pokemon are in your party?");
//		
//		int party = userObj.nextInt();
//		
//		MyException.checkPartySize(party);
		int myInput = 0;
		try {
		System.out.println("who is your favorite pokemon?");
		//String myInput = userObj.nextLine();
		System.out.println("My favorite number is  " + myInput);
		} catch (Exception e) {
			System.out.println("invalid data. please input a number.");
		}
		System.out.println("I like numbers" );
		
	}

}
